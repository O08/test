package chartl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excell {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File("E://c.xls"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WritableWorkbook workbook = Workbook.createWorkbook(os);
	        //�����µ�һҳ
	        WritableSheet sheet = workbook.createSheet("First Sheet",0);
	        //����Ҫ��ʾ������,����һ����Ԫ�񣬵�һ������Ϊ�����꣬�ڶ�������Ϊ�����꣬����������Ϊ����
	        Label xuexiao = new Label(0,0,"ѧУ");
	        sheet.addCell(xuexiao);
	        Label zhuanye = new Label(1,0,"רҵ");
	        sheet.addCell(zhuanye);
	        Label jingzhengli = new Label(2,0,"רҵ������");
	        sheet.addCell(jingzhengli);
	        
	        Label qinghua = new Label(0,1,"�廪��ѧ");
	        sheet.addCell(qinghua);
	        Label jisuanji = new Label(1,1,"�����רҵ");
	        sheet.addCell(jisuanji);
	        Label gao = new Label(2,1,"��");
	        sheet.addCell(gao);
	        
	        Label beida = new Label(0,2,"������ѧ");
	        sheet.addCell(beida);
	        Label falv = new Label(1,2,"����רҵ");
	        sheet.addCell(falv);
	        Label zhong = new Label(2,2,"��");
	        sheet.addCell(zhong);
	        
	        Label ligong = new Label(0,3,"��������ѧ");
	        sheet.addCell(ligong);
	        Label hangkong = new Label(1,3,"����רҵ");
	        sheet.addCell(hangkong);
	        Label di = new Label(2,3,"��");
	        sheet.addCell(di);
	        
	        //�Ѵ���������д�뵽������У����ر������
	        workbook.write();
	        workbook.close();
	        os.close();

	}

}
