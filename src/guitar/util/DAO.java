package guitar.util;

import java.util.List;

import inventory.Guitar;

/**
 * �ӿ�
 * ��Ҫ�Ƕ������ݿ���ز����Ľӿ�
 * ��Ҫ����Guitar����ɾ�Ĳ�
 * @author lzm
 *
 */
public interface DAO {
	
	/**
	 * ����һ���µ�Guitar
	 * @param serialNumber ���к�
	 * @param builder ������
	 * @param model ģ��
	 * @param type ����
	 * @param backWood ����ľ��
	 * @param topWood ����ľ��
	 * @param price �۸�
	 */
	public void addGuitar(String serialNumber, String builder, 
			String model, String type, String backWood, String topWood,	String price);
	
	/**
	 * ɾ�����ݿ��ж�Ӧ��Guirtar��ͨ��serialNunmberɾ��
	 * @param serialNumber ���к�
	 */
	public void delGuitar(String serialNumber);
	
	/**
	 * ͨ������һ��SerialNumber�޸�ĳһ��GuitarGuitar����Ϣ
	 * @param serialNumber ���кţ�������Ϣ����������
	 * @param builder �����ߣ��޸���Ϣ
	 * @param model ģ�ͣ��޸���Ϣ
	 * @param type ���ͣ��޸���Ϣ
	 * @param backWood ����ľ�ʣ��޸���Ϣ
	 * @param topWood ����ľ�ʣ��޸���Ϣ
	 * @param price �۸��޸���Ϣ
	 */
	public void updateGuitar(String serialNumber, String builder, 
			String model, String type, String backWood, String topWood,	String price);
	
	/**
	 * ��ѯGuitar��Ϣ
	 * @return һ��List�б�������ݿ��е�����Guitar
	 */
	public List<Guitar> guitars();
	
	
}
