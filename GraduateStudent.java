package Administration;

public class GraduateStudent implements Student,Teacher {
	 String name; //����
	 String sexual; //�Ա�
	 int age;   //����
	 String departments;//Ժϵ
	 int tuition;//ѧ��
	 int pay;//ÿ�¹���
	
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
			return "������"+name+"  �Ա�"+sexual+"  ���䣺"+age+"  Ժϵ��"+departments+"  ѧ�ѣ�"+tuition+"  ÿ�¹��ʣ�"+pay;
		}
	 }



