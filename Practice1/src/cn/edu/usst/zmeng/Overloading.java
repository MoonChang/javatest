package cn.edu.usst.zmeng;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2;
		s1=new Student();
		s2=new Student();
		s1.setInfo("��ǿ","2010038","ɽ��̫ԭ");
		s2.setInfo(23.5f,"201089");
		s2.getInfo("ɽ��̫ԭ");
	}

}

class Student{
	public String name;  //����
	public String studentID;  //ѧ��
	public String mobilphone; //��ϵ�绰
	protected String major; //רҵ
	private float gpa; //ƽ���ɼ�����
	
	public void register(){
	}
	//���ƽ���ɼ�����
	public float getgpa(){
		return gpa;
	}
	//�޸�ƽ���ɼ�����
	public void setup(){
		gpa=23.5f;
	}
	public void setInfo(String n,String ID){
		name=n;
		studentID=ID;
		
	}
	public void setInfo(String n,String ID,String add){
		name=n;
		studentID=ID;
	}
	public void setInfo(float g,String ID){
		gpa=g;
		studentID=ID;
	}
	public void getInfo(float g){
		System.out.println("ѧ�� :"+studentID+"\tƽ���ɼ�������"+g);
	}
	public void getInfo(String add){
		System.out.println("ѧ�ţ�"+studentID+"\t����:"+name+"\t��ַ��"+add);
		
	}
}
