import java.util.Scanner;

public class Quiz {
	void start() {
		Questions q1 = new Questions("What is the default value of float variable?", "0.0d", "0.0f", "0", "not defined", new Answer("0.0f"));
		Questions q2 = new Questions("Which of those doesn't have an index based structure?", "List", "Set", "Map", "Array", new Answer("Set"));
		Questions q3 = new Questions("java.util.Collections is a:", "Class", "Interface", "Object", "None of the above", new Answer("Class"));
		Questions q4 = new Questions("Methods such as reverse, shuffle are offered in:", "Object", "Collection", "Collections", "Apache Commons Collections", new Answer("Collections"));
		Questions q5 = new Questions("Which of those allows duplicate elements?", "Set", "List", "HashMap", "None of the above", new Answer("List"));
		
		Questions questionArr[] = {q1, q2, q3, q4, q5};
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;
		
		for(Questions q: questionArr) {
			System.out.println(q.getQuestion());
			System.out.println("A. "+q.getOption1());
			System.out.println("B. "+q.getOption2());
			System.out.println("C. "+q.getOption3());
			System.out.println("D. "+q.getOption4());
			System.out.println("\nEnter an option");
			
			Scanner sc = new Scanner(System.in);
			char option = sc.next().charAt(0);
			String answer = "";
			
			switch(option) {
			
			case 'A':
				answer = q.getOption1();
				break;
			
			case 'B':
				answer = q.getOption2();
				break;
				
			case 'C':
				answer = q.getOption3();
				break;
				
			case 'D':
				answer = q.getOption4();
				break;
			
			default:break;
			
			}
			
			if(answer.equals(q.answer.getAnswer())) {
				System.out.println("Correct answer");
				countCorrect++;
			}
			else {
				System.out.println("Wrong Answer");
				countWrong++;
			}
			System.out.println("\n*********\n");
			countTotal++;
		}
		ResultInterf result = new Result(countTotal, countCorrect, countWrong);
		result.showResult();
	}
}
