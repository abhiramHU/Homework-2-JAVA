package grade;
public class grade {
	public static void main(String[] args) {
		float grade1=91.14f;
		float grade2=85.01f;
		float grade3=72;
		float grade4=63;
		float grade5=81.14f;
		float finalgrade=(grade1+grade2+grade3+grade4+grade5)/5;
		int gradecase=0;
		if (finalgrade>=90 && finalgrade<=100)
			gradecase=1;
		else if(finalgrade>=80 && finalgrade<=89.99)
			gradecase=2;
		else if(finalgrade>=70 && finalgrade<=79.99)
			gradecase=3;
		else if(finalgrade<=69.99)
			gradecase=4;
		
		System.out.println(finalgrade);
		System.out.println(gradecase);
		switch(gradecase) {
		case 1: System.out.println("A:Fantastic Job!"); break;
		case 2: System.out.println("B: Good!");break;
		case 3: System.out.println("C: Please try more next time!");break;
		case 4: System.out.println("F: Unfortunately you failed!");break;
		}
		
}
}