package view;

import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CLecture;
import global.Constants.ELecturePanel;
import valueObject.VCLecture;

public class LecturePanel extends JPanel { //�Z����ؾ���. //���õȰ� �� ��������� ���߿� ����Ʈ�ǳڿ��� �̸������� ���µ�
	private static final long serialVersionUID = 1L;
	private LectureList lectureList;
	private CLecture cLecture;
	private Vector<VCLecture> vcLectures;

	public LecturePanel() {
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		
		this.lectureList = new LectureList();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(this.lectureList);
		this.add(scrollPane);

	}

	public void refresh(String fileName) {// ��Ʈ���ϰ� �����������. ��Ʈ�ѷ��� ���⼭ ��������.
		// �г��� �ߤ�������������
		this.cLecture = new CLecture();
		this.vcLectures = cLecture.getData(fileName); // ��̸� �޾ƿ�. ���丮�ϴ� �Ŷ� �Ȱ���.

		this.lectureList.addRows(this.vcLectures);
	}

	public Vector<VCLecture> getSelectedLectures() {
		return this.lectureList.getSelectedLectures(this.vcLectures);
	}

	public void initialize(String id) {
	}

	private class LectureList extends JTable {// �̞g�� �ϸ� ���װ� �ǵ� ����� �ǵ� �Ҽ��ְ��Ϸ���.

		private DefaultTableModel tableModel;
		private VCLecture vcLecture;

		public LectureList() {// ���� ���������
			this.vcLecture = new VCLecture();

			Vector<String> header = new Vector<String>();
			for (int i = 1; i < ELecturePanel.values().length; i++)
				header.add(ELecturePanel.values()[i].getString());

			this.tableModel = new DefaultTableModel(header, 0);
			this.setModel(this.tableModel);


		}

		public void addRows(Vector<VCLecture> vcLectures) {

			this.tableModel.setRowCount(0); // ���̺���� ����.
			Vector<String> rowData;
			for (VCLecture vcLecture : vcLectures) {
				rowData = new Vector<String>();
				rowData.add(vcLecture.getId());
				rowData.add(vcLecture.getName());
				rowData.add(vcLecture.getProfessorName());
				rowData.add(vcLecture.getTime());
				rowData.add(vcLecture.getCredit());

				this.tableModel.addRow(rowData);
			}
			this.getSelectionModel().addSelectionInterval(0, 0);
		}

		public Vector<VCLecture> getSelectedLectures(Vector<VCLecture> vcLectures) {
			Vector<VCLecture> selectedVCLectures = new Vector<VCLecture>();
			for (int i = 0; i < this.getRowCount(); i++) {
				if (this.isRowSelected(i)) {
					selectedVCLectures.add(vcLectures.elementAt(i));
				}
			}
			return selectedVCLectures;
		}


	}
}
