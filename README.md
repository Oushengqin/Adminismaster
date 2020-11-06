计191欧升琴2019311459

接口程序实验

实验目的

(1)掌握Java中抽象类和抽象方法的定义； 
(2)掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
(3)了解异常的使用方法，并在程序中根据输入情况做异常处理

实验内容

1.先创建三个类：Student类,Teacher类，Gradustudent类，使用关键字interface来定义接口Student,Teacher.

2.在GraduateStudnt中，使用关键字implements用逗号隔开实现上述多个接口。

3.定义多个整型变量，学费，每月工资；定义字符串，姓名性别，年龄，院系，返回tuition,pay.

4.用this关键字传递它们的值；用public String toString()返回该对象的字符串表示，输出信息。

5.用catch捕捉接口异常处理。

6.用if语句判断收入，并接着算出纳税额，用scanner实现运行时输入。

核心代码

（1）用关键字interface来定义接口Student,Teacher，并输入有关信息：
public class GraduStudent implements Student,Teacher {
String name; 
String sexual; 
int age;   
String departments;
int tuition;
int pay;
（2）用scanner实现运行时输入：Scanner console=new Scanner(System.in); 
（3）用if语句判断年收入并计算纳税额：
 if((g.getpay()*12-g.getpaytuitionfees())<=35000){
			    		 t =((g.getpay()*12-g.getpaytuitionfees()))*n1-s1;
			    	 
			    	     System.out.println(g+"  年应纳税额："+t);
			    	     }
			         if((g.getpay()*12-g.getpaytuitionfees())>=35000&&(g.getpay()*12-g.getpaytuitionfees())<=24000){
			        	 t =((g.getpay()*12-g.getpaytuitionfees()))*n2-s2;
			         
				         System.out.println(g+"  年应纳税额："+t);
			             }
                 System.out.println("输入数据错误！");
   （4）用catch捕捉接口异常处理
   try {
				 System.out.println("请输入你的姓名:");
			     .................................
           .................................
			        	 System.out.println("输入数据错误！");
			        	 }
			       i++;
			}
系统运行截图:



编程感想:
    这次实验中，学到了，为了实现多继承，Java提供接口，并使用该方法，接口只包含抽象方法，不用new运算符产生对象，感受到接口带来的便利。
还会使用catch捕捉接口异常处理，实现当程序运行结果出错时，改变参数使运行出程序中的结果。
                 
