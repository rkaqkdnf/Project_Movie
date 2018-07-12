package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import model.MovieDto;

public class MovieDao implements MovieDaoImpl {

	@Override
	public double getGradePoint(String title, int point) { // 평점 구하는 함수

		String sql = " SELECT GRADE_POINT,GRADE_COUNT FROM MOVIE WHERE TITLE =? ";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		Double avgGradePoint = 0.0;
		int GRADE_COUNT = 0;

		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			rs = psmt.executeQuery();
			if (rs.next()) {
				avgGradePoint = rs.getDouble(1);
				GRADE_COUNT = rs.getInt(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}

		avgGradePoint = (avgGradePoint + point) / GRADE_COUNT + 1;

		return avgGradePoint;
	}

	@Override // 영화 디테일뷰 평점 기입 함수
	public void updateGradePoint(String title, double gradepoint) {

		String sql = " UPDATE MOVIE SET GRADE_POINT = ? ";

		Connection conn = null;
		PreparedStatement psmt = null;
		
		
		try {
			conn = DBConnection.makeConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setDouble(1, gradepoint);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
	}

	

}
