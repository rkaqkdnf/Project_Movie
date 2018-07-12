package model;

public class MovieDto {
	
	String movieTitle; // ��ȭ �̸�
	String director; // ����
	String actor1; // ���
	String actor2;
	String actor3;
	String actor4;
	String synop; // �ó�ý� // ������ ���丮
	int movieGPoint; // ����
	String movieGenre1; // ��ȭ �ش� �帣
	String movieGenre2; // ��ȭ �ش� �帣
	
	public MovieDto(String movieTitle, String director, String actor1, String actor2, String actor3, String actor4,
			String synop, int movieGPoint, String movieGenre1, String movieGenre2) {
		super();
		this.movieTitle = movieTitle;
		this.director = director;
		this.actor1 = actor1;
		this.actor2 = actor2;
		this.actor3 = actor3;
		this.actor4 = actor4;
		this.synop = synop;
		this.movieGPoint = movieGPoint;
		this.movieGenre1 = movieGenre1;
		this.movieGenre2 = movieGenre2;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor1() {
		return actor1;
	}

	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}

	public String getActor2() {
		return actor2;
	}

	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}

	public String getActor3() {
		return actor3;
	}

	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}

	public String getActor4() {
		return actor4;
	}

	public void setActor4(String actor4) {
		this.actor4 = actor4;
	}

	public String getSynop() {
		return synop;
	}

	public void setSynop(String synop) {
		this.synop = synop;
	}

	public int getMovieGPoint() {
		return movieGPoint;
	}

	public void setMovieGPoint(int movieGPoint) {
		this.movieGPoint = movieGPoint;
	}

	public String getMovieGenre1() {
		return movieGenre1;
	}

	public void setMovieGenre1(String movieGenre1) {
		this.movieGenre1 = movieGenre1;
	}

	public String getMovieGenre2() {
		return movieGenre2;
	}

	public void setMovieGenre2(String movieGenre2) {
		this.movieGenre2 = movieGenre2;
	}
	
		
	
}
