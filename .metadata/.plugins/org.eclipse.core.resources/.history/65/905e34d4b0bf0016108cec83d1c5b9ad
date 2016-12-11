package cn.edu.usst.zmeng;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2;
		s1=new Student();
		s2=new Student();
		s1.setInfo("赵强","2010038","山西太原");
		s2.setInfo(23.5f,"201089");
		s2.getInfo("山西太原");
	}

}

class Student{
	public String name;  //姓名
	public String studentID;  //学号
	public String mobilphone; //联系电话
	protected String major; //专业
	private float gpa; //平均成绩点数
	
	public void register(){
	}
	//获得平均成绩点数
	public float getgpa(){
		return gpa;
	}
	//修改平均成绩点数
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
		System.out.println("学号 :"+studentID+"\t平均成绩点数："+g);
	}
	public void getInfo(String add){
		System.out.println("学号："+studentID+"\t姓名:"+name+"\t地址："+add);
		
	}
}
