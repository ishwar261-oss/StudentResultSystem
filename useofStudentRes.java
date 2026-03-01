import java.util.*;

class StudentRes 
{
    String name, SENO;
    int rno;
    int M1, M2, M3, M4, M5;
    String SN1, SN2, SN3, SN4, SN5;
    String GSN1, GSN2, GSN3, GSN4, GSN5;
    String RSN1, RSN2, RSN3, RSN4, RSN5;
    int total;
    double per, cgpa;
    String Result, Grade;
    static String Sem;

    StudentRes(String n, String seno, int r, int m1, int m2, int m3, int m4, int m5,
                String sn1, String sn2, String sn3, String sn4, String sn5) {

        name = n;
        SENO = seno;
        rno = r;
        M1 = m1; M2 = m2; M3 = m3; M4 = m4; M5 = m5;
        SN1 = sn1; SN2 = sn2; SN3 = sn3; SN4 = sn4; SN5 = sn5;

        GSN1 = CalculateGrade(M1); RSN1 = CalculateRes(M1);
        GSN2 = CalculateGrade(M2); RSN2 = CalculateRes(M2);
        GSN3 = CalculateGrade(M3); RSN3 = CalculateRes(M3);
        GSN4 = CalculateGrade(M4); RSN4 = CalculateRes(M4);
        GSN5 = CalculateGrade(M5); RSN5 = CalculateRes(M5);

        total = M1 + M2 + M3 + M4 + M5;
        per = total / 5.0;
        cgpa = per / 10.0;

        if (RSN1.equals(" Reappear ") || RSN2.equals(" Reappear ") || 
            RSN3.equals(" Reappear ") || RSN4.equals(" Reappear ") || RSN5.equals(" Reappear "))
            Result = "REAPPEAR";
        else
            Result = "PASS";

        if (per > 75) Grade = "O++";
        else if (per > 65) Grade = "A++";
        else if (per > 55) Grade = "B++";
        else if (per > 45) Grade = "C++";
        else if (per > 35) Grade = "D++";
        else Grade = "NA";
    }

    public void header1() 
	{
        System.out.println("\n ------------------------- STUDENT RESULT ------------------------- \n");
        System.out.println("\n          Shiv Chhatrapati Shikshan Sanstha's");
        System.out.println("     RAJARSHI SHSHU MAHAVIDYALAYA, LATUR (AUTONOMOUS)\n");
    }

    static void header1_0() 
	{
        System.out.println("\n PROGRAMME : BSc.CS                     SEMESTER : " + Sem);
        System.out.println(" ---------------------------------------------------------------------- \n");
    }

    public void header2()
	 {
        System.out.println(" NAME OF STUDENT : " + name);
        System.out.println(" SEAT NO : " + SENO);
        System.out.println(" ROLL NO : " + rno);
        System.out.println(" ---------------------------------------------------------------------- ");
    }

    public void header3() 
	{
        System.out.printf("%-25s %-10s %-10s %-10s\n", "SUBJECT", "MARK", "GRADE", "RESULT");
        System.out.printf("%-25s %-10d %-10s %-10s\n", SN1, M1, GSN1, RSN1);
        System.out.printf("%-25s %-10d %-10s %-10s\n", SN2, M2, GSN2, RSN2);
        System.out.printf("%-25s %-10d %-10s %-10s\n", SN3, M3, GSN3, RSN3);
        System.out.printf("%-25s %-10d %-10s %-10s\n", SN4, M4, GSN4, RSN4);
        System.out.printf("%-25s %-10d %-10s %-10s\n", SN5, M5, GSN5, RSN5);
		System.out.println(" ---------------------------------------------------------------------- \n");
    }

    public void header4() 
	{
        System.out.println("\nTOTAL MARKS OUT OF 500 : " + total);
        System.out.println("TOTAL PERCENTAGE : " + per);
        System.out.println("OVERALL RESULT : " + Result);
        System.out.println("CGPA : " + cgpa);
        System.out.println("GRADE : " + Grade);
    }

    private String CalculateGrade(int mark) 
	{
        if (mark > 75) return " O++ ";
        else if (mark > 65) return " A++ ";
        else if (mark > 55) return " B++ ";
        else if (mark > 45) return " C++ ";
        else if (mark > 35) return " D++ ";
        else return " NA ";
    }

    private String CalculateRes(int mark)
    {
        return (mark > 35) ? " Pass " : " Reappear ";
    }
}

class useofStudentRes 
{
    public static void main(String args[]) {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("\n -------------------------- DATA ENTRY ------------------------------ ");
        System.out.print(" \nEnter Student Name : ");
        String name = obj1.nextLine();
        System.out.print("Enter Seat Number : ");
        String SENO = obj1.nextLine();
        System.out.print("Enter Roll Number : ");
        int rno = obj1.nextInt();
        obj1.nextLine();

        System.out.print("Enter Subject 1 : ");
        String SN1 = obj1.nextLine();
        System.out.print("Enter Marks : ");
        int M1 = obj1.nextInt();
        obj1.nextLine();

        System.out.print("Enter Subject 2 : ");
        String SN2 = obj1.nextLine();
        System.out.print("Enter Marks : ");
        int M2 = obj1.nextInt();
        obj1.nextLine();

        System.out.print("Enter Subject 3 : ");
        String SN3 = obj1.nextLine();
        System.out.print("Enter Marks : ");
        int M3 = obj1.nextInt();
        obj1.nextLine();

        System.out.print("Enter Subject 4 : ");
        String SN4 = obj1.nextLine();
        System.out.print("Enter Marks : ");
        int M4 = obj1.nextInt();
        obj1.nextLine();

        System.out.print("Enter Subject 5 : ");
        String SN5 = obj1.nextLine();
        System.out.print("Enter Marks : ");
        int M5 = obj1.nextInt();

        StudentRes obj2 = new StudentRes(name, SENO, rno, M1, M2, M3, M4, M5, SN1, SN2, SN3, SN4, SN5);
        obj2.header1();
        StudentRes.Sem = "Second";
        StudentRes.header1_0();
        obj2.header2();
        obj2.header3();
        obj2.header4();
    }

}
