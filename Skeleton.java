import java.util.Scanner;
public class Skeleton{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		double[] num=new double[5];
			for(int i=1;i<=5;i++){
			System.out.println("Input the grade of assignment"+i + ": ");
			num[i-1] = scan.nextDouble();
			}
		System.out.println("Input the number of attended labs: ");
		int labs = scan.nextInt();
		System.out.println("Input the midterm grade: ");
		double mid  = scan.nextDouble();

		double sum = 0;
		for(int i=0;i<=4;i++){
		sum+=num[i];
		}

		System.out.println("Assignments(30%)"+(sum/5*0.3));
		System.out.println("Attendance(5%):"+(labs/7*100*0.05));
		System.out.println("Midterm(30%):"+ (mid*0.3));

	}
}