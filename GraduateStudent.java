package Administration;

public class GraduateStudent implements Student,Teacher {
	 String name; //姓名
	 String sexual; //性别
	 int age;   //年龄
	 String departments;//院系
	 int tuition;//学费
	 int pay;//每月工资
	
	public void setFee(int a1){     
		tuition=a1;   
		 }    
	public int getFee(){      
		 return tuition;  
		 }   
	 public void setPay(int a){    
		 pay=a;  
		 }     
	 public int getPay()  {     
		 return pay;  
		 }
	 GraduateStudent(String d,String c,int e,String f,int h,int i){     
			 this.name=c;    
			 this.sexual=d;  
			 this.age=e;
			 this.departments=f;
			 this.tuition=h;
			 this.pay=i;
			 }
		public String toString() {
			return "姓名："+name+"  性别："+sexual+"  年龄："+age+"  院系："+departments+"  学费："+tuition+"  每月工资："+pay;
		}
	 }



