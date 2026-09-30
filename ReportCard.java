public class ReportCard{
public static void main(String[] args){

header();
identifier("Name:Ada");
averages(80.0);
grades("Grade:A");
results("Result:Passed");

header2();
identifier2("Name:Chidi");
averages2(61.0);
grades2("Grade:B");
result2("Results:Passed");

header3();
identifier3("Name:Tunde");
averages3(45.0);
grades3("Grade:F");
result3("Failed");

header4();
}
public static void header(){
  System.out.println("======REPORT CARD======");
  }
  
public static void identifier(String name){
 System.out.println(name);
 }
 
public static void averages(double average){
 System.out.println("Average:" + average);
 }
 
public static void grades(String grade){
System.out.println(grade);
}

public static void results(String result){
System.out.println(result);
}


public static void header2(){
  System.out.println("======REPORT CARD======");
  }
  
public static void identifier2(String name){
 System.out.println(name);
 }
 
public static void averages2(double average){
 System.out.println("Average:" + average);
 }
 
public static void grades2(String grade){
System.out.println(grade);
}

public static void result2(String result){
System.out.println(result);
}

public static void header3(){
  System.out.println("======REPORT CARD======");
  }
  
public static void identifier3(String name){
 System.out.println(name);
 }
 
public static void averages3(double average){
 System.out.println("Average:" + average);
 }
 
public static void grades3(String grade){
System.out.println(grade);
}

public static void result3(String result){
System.out.println(result);
}
public static void header4(){
System.out.println("==========================");

  }
  }
