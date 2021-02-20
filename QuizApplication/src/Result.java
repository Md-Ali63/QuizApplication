
public class Result implements ResultInterf {
	int totalQuestions;
	int correctAnswers;
	int wrongAnswers;
	
	public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
		super();
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
	}
	
	public void showResult() {
		System.out.println("Your Result: ");
		System.out.println("Total Questions: "+totalQuestions);
		System.out.println("Correct Answers: "+correctAnswers);
		System.out.println("Wrong Answers:   "+wrongAnswers);
		System.out.println("Percentage:      "+showPercentage(correctAnswers, totalQuestions));
		System.out.println("Overall Performance: "+showPerformance(showPercentage(totalQuestions, correctAnswers)));
	}
	
	public double showPercentage(int correctAnswers, int totalQuestions) {
		return ((double)correctAnswers/totalQuestions)*100;
	}
	
	public String showPerformance(double percentage) {
		String performance = "";
		if(percentage > 60) {
			performance = "Good";
		}
		else if(percentage < 40) {
			performance = "Poor";
		}
		else {
			performance = "Average";
		}
		return performance;
	}
	
}
