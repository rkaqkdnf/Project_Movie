package model;

public class MemberDto {
	String id; // ȸ�����̵�
	String pwd; // ȸ�� ��й�ȣ
	String name; // ȸ�� �̸�
	String email; // ȸ�� �̸���
	String fGenre1; // ��ȣ�帣1
	String fGenre2; // ��ȣ�帣2
	int point; // ���� ����Ʈ
	int auth; //
	
	public MemberDto(String id, String pwd, String name, String email, String fGenre1, String fGenre2, int point, int auth) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.fGenre1 = fGenre1;
		this.fGenre2 = fGenre2;
		this.point = point;
		this.auth = auth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfGenre1() {
		return fGenre1;
	}

	public void setfGenre1(String fGenre1) {
		this.fGenre1 = fGenre1;
	}

	public String getfGenre2() {
		return fGenre2;
	}

	public void setfGenre2(String fGenre2) {
		this.fGenre2 = fGenre2;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
