package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import global.Constants.EMDirectory;
import global.Constants.EMPersonalInfo;
import valueObject.VMPersonalInfo;

public class MPersonalInfo { //���Ͽ� �����ؼ� �ҷ����°� �길 �˾�.

	public VMPersonalInfo getPersonalInfo(String id) {
		VMPersonalInfo vEPersonalInfo = new VMPersonalInfo();
		
		try {// ���Ͽ��� ���̵�� ��й�ȣ�� �ҷ��´�.
			File file = new File(EMDirectory.fileAdr.getString()+EMPersonalInfo.studentfileAdr.getString());
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext()){
				vEPersonalInfo.readFromFile(scanner);
				if(vEPersonalInfo.getId().equals(id)) {
					return vEPersonalInfo;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
