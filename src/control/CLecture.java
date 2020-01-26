package control;

import java.io.IOException;
import java.util.Vector;

import Model.MDirectory;
import Model.MLecture;
import valueObject.VCDirectory;
import valueObject.VCLecture;
import valueObject.VMDirectory;
import valueObject.VMLecture;

public class CLecture {

	private MLecture mLecture;

	public CLecture() {
		this.mLecture = new MLecture();
	}

	public Vector<VCLecture> getData(String fileName) {
		Vector<VMLecture> vmLectures = this.mLecture.getData(fileName);
		Vector<VCLecture> vcLectures = new Vector<VCLecture>();

		for (VMLecture vmLecture : vmLectures) {
			VCLecture vcLecture = new VCLecture();
			vcLecture.setId(vmLecture.getId());
			vcLecture.setName(vmLecture.getName());
			vcLecture.setProfessorName(vmLecture.getProfessorName());
			vcLecture.setTime(vmLecture.getTime());
			vcLecture.setCredit(vmLecture.getCredit());

			vcLectures.add(vcLecture);
		}

		return vcLectures;
	}

	public void setData(String fileName, Vector<VCLecture> vcLectures) throws IOException {
		Vector<VMLecture> vmLectures = new Vector<VMLecture>();

		for (VCLecture vcLecture : vcLectures) {
			VMLecture vmLecture = new VMLecture();
			vmLecture.setId(vcLecture.getId());
			vmLecture.setName(vcLecture.getName());
			vmLecture.setProfessorName(vcLecture.getProfessorName());
			vmLecture.setTime(vcLecture.getTime());
			vmLecture.setCredit(vcLecture.getCredit());

			vmLectures.add(vmLecture);
		}
		this.mLecture.setData(fileName, vmLectures);

	}
}

//�������� ����ü����ְ� ���⼭ ����� ���������־�. �׿ܿ��� ���Ϲ޴°Ͱ� ���õ� �����۾��� �ϱ����ؼ� �갡�ִ°ž�.
//100���� 20���� �������Ϸ��µ� ȭ�鿡�� ���ϴ� �����͸� "����"�ؼ� �ִ� ����
