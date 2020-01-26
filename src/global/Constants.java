package global;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.CLogin;

public class Constants {
	public static enum EMainFrame {
		serialVersionUID("1"),
		Title("������û");

		private String value;
		private EMainFrame(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}

	public static enum EPersonaliInfoPanel {
		serialVersionUID("1"),
		lninsaPrefix("ȯ���մϴ�! "),lbinsaPostfix("��, �������б� ������û ���α׷��Դϴ�."),
		btninfo("��������"), btnback("������û"), btnlogout("�α׾ƿ�"), btnfinish("����"), 
		btnfinishClicked("������ ������ ���� �� ���ּ���");

		private String value;
		private EPersonaliInfoPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}

	public static enum ELoginDialog {
		serialVersionUID("1"),
		width("300"),height("230"), title("�������б� ������û ���α׷�"), 
		nameLabel(" ���̵�    "), nameTextSize("15"),
		passwordLabel("��й�ȣ "), passwordTextSize("15"), 
		cancelButton("Cancel"), okButton("OK"),
		findIDPW("��, �α����� �����ʽ��ϱ�?");

		
		private String value;
		private ELoginDialog(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	
	
	public static enum EErrorDialog {
		serialVersionUID("1"),
		title("����"),
		message("�߸��Է�����.");
		
		private String value;
		private EErrorDialog(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EDirectoryPanel {
		serialVersionUID("1"),
		rootfileName("root");
		
		private String value;
		private EDirectoryPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EuserPersonalPane {
		serialVersionUID("1"),
		fixedName("�̸�"),
		fixedCollegeNum("�й�"),
		fixedPersonNum("�ֹι�ȣ"),
		fixedPersonNumLine("-"),
		fixedEMail("�̸���"),
		fixedPhone1("����ó1"),
		fixedPhone2("����ó2");
		
		private String value;
		private EuserPersonalPane(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	public static enum EuserPicPane {
		serialVersionUID("1"),
		profileDefaultPic("graphic\\\\Myongji_UI\\\\5_3.gif"),
		fixedPhone2("����ó2  ");
		
		private String value;
		private EuserPicPane(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	
	public static enum EFindDialog {
		serialVersionUID("1"),
		title("�������б� ������û ���α׷�");
		
		private String value;
		private EFindDialog(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EBasictopPanel {
		serialVersionUID("1"),
		headerLabel("���̵�/��й�ȣ ã��"),
		rePanelBtn("�ٽþ���"),
		backToFindPanelBtn("���ư���");
		
		private String value;
		private EBasictopPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	
	
	public static enum EFindCenterPanel {
		serialVersionUID("1"),
		fixedIDexplain("���̵�ã��"),
		fixedPWexplain("��й�ȣã��"),
		fixedName("�̸�        "),
		fixedPersonNum("�ֹι�ȣ"),
		fixedPersonNumLine("-"),
		fixedEMail("�̸���    "),
		fixedID("���̵�    "),
		searchIDBtn(" ���̵� ��ȸ "),
		searchPWBtn("��й�ȣ ��ȸ"),
		nameTextSize("15"),
		IDTextSize("15"),
		PersonNum1stTextSize("6"),
		PersonNum2ndTextSize("7"),
		EmailTextSize("15"),
		FaileFindingtitle(""),
		FailedFindingMessage( "������ ã�ƺ������� \n�����͸� ã�����߾�� �Ф�"),
		successedFindingIDMessage1("�� ���� ã�ҽ��ϴ�!\n"),
		successedFindingIDMessage2("����� ID��"),
		successedFindingIDMessage3("�Դϴ�."),
		successedFindingIDtitle("���̵� ã��"),
		successedFindingPWMessage("���ο� ��й�ȣ�� �Է����ּ���"),
		successedFindingPWtitle("���ο� ��й�ȣ ����"),
		successedChangingPW("��й�ȣ�� ����Ǿ����ϴ�. �α����� �õ����ּ���.")
		;
		
		private String value;
		private EFindCenterPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EFindBottomPanel {
		serialVersionUID("1"),
		myongjiMinIcon("graphic\\\\Myongji_ui\\\\8_10.gif")
		;
		
		private String value;
		private EFindBottomPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum ELecturePanel {
		serialVersionUID("1"),
		id("���¹�ȣ"),
		name("���¸�"),
		professor("������"),
		time("�ð�"),
		credit("����");
		
		private String value;
		private ELecturePanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	public static enum EBasketPanel {
		serialVersionUID("1"),
		id("���¹�ȣ"),
		name("���¸�"),
		professor("������"),
		time("�ð�"),
		credit("����");

		
		private String value;
		private EBasketPanel(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}
	}
	
	public static enum EMenuPane {
		serialVersionUID("1"),
		changeUserInfo("ȸ������"),
		changePW("��й�ȣ ����"),
		systemoption("�ý��� ����");

		private String value;
		private EMenuPane(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}
	public static enum EMDetailPersonalInfo {
		serialVersionUID("1"),
		studentDetail("data\\studentdetail");

		private String value;
		private EMDetailPersonalInfo(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}
	public static enum EMDirectory {
		serialVersionUID("1"),
		fileAdr("data\\");

		private String value;
		private EMDirectory(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}
	public static enum EMLogin {
		serialVersionUID("1"),
		loginfileAdr("login"),
		copy("Copy");

		private String value;
		private EMLogin(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}
	public static enum EMPersonalInfo {
		serialVersionUID("1"),
		studentfileAdr("student"),
		copy("Copy");

		private String value;
		private EMPersonalInfo(String value) {this.value = value;	}
		public String getString() {return this.value;}
		public int getInt() {return Integer.parseInt(this.value);}

	}
}
