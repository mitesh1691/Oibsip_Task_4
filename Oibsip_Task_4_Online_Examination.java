package Oasis;

import java.util.HashMap;
import java.util.Scanner;
public class Oibsip_Task_4_Online_Examination {
    Scanner input=new Scanner(System.in);
    HashMap<String,Integer> data=new HashMap<String,Integer>();

    public void login() {
        data.put("Mitesh",1111);
        data.put("Peter",2222);
        data.put("John",3333);
        data.put("Levi",4444);
        data.put("Mikasa",5555);
        data.put("Jim",6666);
        System.out.println("\n\nWelcome To The Exam!!");
        String userid;
        int pwd;
        System.out.println("Login to continue...");
        System.out.print("Enter Your Username : ");
        userid=input.next();
        System.out.print("Enter Your Password : ");
        pwd=input.nextInt();
        if(data.containsKey(userid) && data.get(userid)==pwd) {
            System.out.println("Login Successful");
            option_menu();
        }
        else {
            System.out.println("Invalid Username Or Password");
            System.out.println("Try again");
            login();
        }
    }
    public void option_menu() {
        int select;
        System.out.println("Enter The Operation You Want To Perform");
        System.out.println("1.Update Profile and Password");
        System.out.println("2.Start the Exam");
        System.out.println("3.Exit");
        select=input.nextInt();
        switch(select) {
            case 1:
                data=update();
                option_menu();
                break;
            case 2:
                exam_que();
                option_menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option Selected!!\n Please Select Again!!");
        }
    }
    public HashMap<String,Integer> update(){
        String upser;
        int upwd;
        System.out.println("Welcome To Profile Update Section");
        System.out.println("Enter Your Username");
        upser=input.next();
        if(data.containsKey(upser)) {
            System.out.println("Enter The New Password");
            upwd = input.nextInt();
            data.replace(upser, upwd);
        }
        else {
            System.out.println("User Doesn't Exist");
        }
        return data;
    }
    public void exam_que() {
        long examtime=System.currentTimeMillis();
        long endtime=examtime+30;
        int answer_count=0;
        int ans,score;
        System.out.println("Start the exam");

        //Question Start From Here

        while(System.currentTimeMillis()<endtime) {
            System.out.println("You have 5 Minutes to Answer 5 Questions");
            System.out.println("Each question carries 10 marks"+" "+"-5 for wrong answer");

            System.out.println("\n\nWho invented Java Programming?");
            System.out.println("1)James Gosling"+"\t"+"2)Bjarne Stroustrup"+"\t"+"3)Guido van Rossum"+"\t"+"4)Dennis Ritchie");
            System.out.println("Enter correct option");
            ans=input.nextInt();
            System.out.println("Answer Saved");
            if(ans==1) {
                answer_count++;
            }

            System.out.println("\n\n Which keyword is used for accessing the features of a package?		");
            System.out.println("\n1) package"+"\t"+"2) import"+"\t"+"3) extends"+"\t"+"4)export");
            System.out.println("Enter correct option");
            ans=input.nextInt();
            System.out.println("Answer Saved");
            if(ans==2) {
                answer_count++;
            }
            System.out.println("\n\nWhich of the following is not a Java features?");
            System.out.println("1)Dyanamic"+"\t"+"2)Architecture Neutral"+"\t"+"3)Use of Pointers"+"\t"+"4)JIT");
            System.out.println("Enter correct option");
            ans=input.nextInt();
            System.out.println("Answer Saved");
            if(ans==2) {
                answer_count++;
            }

            System.out.println("\n\n Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
            System.out.println("1) getClass()"+"\t"+"2) Intern()"+"\t"+"3) getName()"+"\t"+"4) toString()");
            System.out.println("Enter correct option");
            ans=input.nextInt();
            System.out.println("Answer Saved");
            if(ans==4) {
                answer_count++;
            }
            System.out.println("\n\nWhich of the following is a reserved keyword in Java?");
            System.out.println("1) object"+"\t"+"2) strictfp"+"\t"+"3) main"+"\t"+"4) system");
            System.out.println("Enter correct option");
            ans=input.nextInt();
            System.out.println("Answer Saved");
            if(ans==1) {
                answer_count++;
            }
            break;
        }
        System.out.println("You have finished the exam");
        score=answer_count*10-((5-answer_count)*5); //Score Counting
        System.out.println("Your score is..."+" "+score+"/50");
    }

    public static void main (String[] args)
    {
        Oibsip_Task_4_Online_Examination obj =new Oibsip_Task_4_Online_Examination();
        obj.login();
    }
}