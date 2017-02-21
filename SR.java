import java.util.*;
class SR{
int Mathematics=0,English=0,Hindi=0,Science=0,SocialScience=0,TotalMarks=500;
int MarksObtained=0,Percentage=0;
void cal(){
Scanner s=new Scanner(System.in);
System.out.println("enter marks in maths");
Mathematics=s.nextInt();
System.out.println("enter marks in English");
English=s.nextInt();
System.out.println("enter marks in Hindi");
Hindi=s.nextInt();
System.out.println("enter marks in Science");
Science=s.nextInt();
System.out.println("enter marks in SocialScience");
SocialScience=s.nextInt();
MarksObtained = Mathematics+English+Hindi+Science+SocialScience;
System.out.println("Total Marks obtained out of "+TotalMarks + " are = "+MarksObtained);
Percentage= (MarksObtained*100)/100;
System.out.println("Perecentage is = "+Percentage);
}

public static void main(String args[]){
SR src= new SR();
src.cal();
}}