package oop2cw1java;
import java.util.Scanner;
public class Oop2cw1Java {

    public static void main(String[] args) {
        int mark[]=new int[7];
        int g = 0;
        String grd;
        float sum=0;
        Scanner mongi = new Scanner(System.in);

        System.out.println("Enter Students Name");
        String a = mongi.next();
        System.out.println(a);

        System.out.println("Enter Your First Course Unit");
        String b = mongi.next();
        System.out.println(b);

        System.out.println("Enter Your First Course Unit Marks");
        mark[0]=mongi.nextInt();
        sum=sum+mark[0];
        if(mark[0]>=80 && mark[0]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[0]>=70&&mark[0]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[0]>=60&&mark[0]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[0]>=50&&mark[0]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[0]>40&&mark[0]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println("Enter Your Second Course Unit");
        String d= mongi.next();
        System.out.println(d);
        System.out.println("Enter Your Second Course Unit Marks");
        mark[1]=mongi.nextInt();
        sum=sum+mark[1];
        if(mark[1]>=80 && mark[1]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[1]>=70&&mark[1]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[1]>=60&&mark[1]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[1]>=50&&mark[1]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[1]>40&&mark[1]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println("Enter Your Third Course Unit");
        String f = mongi.next();
        System.out.println(f);
        System.out.println("Enter Your Third Course Unit Marks");
        mark[2]=mongi.nextInt();
        sum=sum+mark[2];
        if(mark[2]>=80 && mark[2]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[2]>=70&&mark[2]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[2]>=60&&mark[2]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[2]>=50&&mark[2]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[2]>40&&mark[2]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println("Enter Your Fourth Course Unit");
        String i = mongi.next();
        System.out.println(i);
        System.out.println("Enter Your Fourth Course Unit Marks");
        mark[3]=mongi.nextInt();
        sum=sum+mark[3];
        if(mark[3]>=80 && mark[3]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[3]>=70&&mark[3]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[3]>=60&&mark[3]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[3]>=50&&mark[3]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[3]>40&&mark[3]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println("Enter Your Fifth Course Unit");
        String k = mongi.next();
        System.out.println(k);
        System.out.println("Enter Your Fifth Course Unit Marks");
        mark[4]=mongi.nextInt();
        sum=sum+mark[4];
        if(mark[4]>=80 && mark[4]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[4]>=70&&mark[4]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[4]>=60&&mark[4]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[4]>=50&&mark[4]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[4]>40&&mark[4]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println("Enter Your Sixth Course Unit");
        String m = mongi.next();
        System.out.println(m);
        System.out.println("Enter Your Sixth Course Unit Marks");
        mark[5]=mongi.nextInt();
        sum=sum+mark[5];
        if(mark[5]>=80 && mark[5]<100){
            grd="A";
            System.out.println("A");
        }
        else if(mark[5]>=70&&mark[5]<80){
            grd="B";
            System.out.println("B");
        }
        else if(mark[5]>=60&&mark[5]<70){
            grd="C";
            System.out.println("C");
        }
        else if(mark[5]>=50&&mark[5]<60){
            grd="D";
            System.out.println("D");
        }
        else if(mark[5]>40&&mark[5]<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }   
        int average = (mark[0]+mark[1]+mark[2]+mark[3]+mark[4]+mark[5])*100/600;
        System.out.println("Student's average and grade: "+average);
        if(average>=80 && average<100){
            grd="A";
            System.out.println("A");
        }
        else if(average>=70&&average<80){
            grd="B";
            System.out.println("B");
        }
        else if(average>=60&&average<70){
            grd="C";
            System.out.println("C");
        }
        else if(average>=50&&average<60){
            grd="D";
            System.out.println("D");
        }
        else if(average>40&&average<50)
        {
            System.out.println("F");
        }
        else{
            System.out.println("invalid");
        }
        float gpa = (average*5)/100;
        System.out.println("student's GPA: "+gpa);
    }  
}