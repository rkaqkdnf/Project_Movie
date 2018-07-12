package model;



public class BbsDto {
	private int seq; // �Խñ� ���� ��ȣ
	private String movieTitle; // ��ȭ ����
	private String title; // �Խñ� ����
	private String content; // �Խñ� ����
	private String id; // �ۼ��� ���̵�
	private int recommend; // ��õ��
	private int readcount; // ��ȸ��
	private String wdate; // �ۼ���
	private int del; // ���� ���� 0 == �����ȵ� , 1 == ������

	public BbsDto(int seq, String movieTitle, String title, String content, String id, int recommend, int readcount,
			String wdate, int del) {
		super();
		this.seq = seq;
		this.movieTitle = movieTitle;
		this.title = title;
		this.content = content;
		this.id = id;
		this.recommend = recommend;
		this.readcount = readcount;
		this.wdate = wdate;
		this.del = del;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	
	
	
}
