
import java.util.ArrayList;
import java.util.Scanner;

public class Project7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 7 scores");

		//create the Arraylist
		ArrayList<Double> score = new ArrayList<Double>();
		getInputScore(score);

		System.out.println("Enter the degree of difficulty ranges between 1.2 and 3.8");
		Scanner range = new Scanner(System.in);
		double difficulty = range.nextDouble();
		int index = highest(score);
		int lowIndex = lowest(score);
		double sum = sumScore(score, index, lowIndex);
		System.out.println("The sum of scores wihtout min and max scores : " + sum);
		System.out.println("The total diver's score is : " + ((sum * difficulty) * 0.6));

	}
 
	// Get the scores from the user 
	public static void getInputScore(ArrayList<Double> score) {

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {

			double a = input.nextDouble();
			score.add(a);

		}
	}

	//Find the highest score
	public static int highest(ArrayList<Double> score) {
		double high = score.get(0);
		int i = 0;
		int indexHigh = 0;
		for (i = 0; i < 7; i++) {
			if (score.get(i) > high) {

				high = score.get(i);
				indexHigh = i;
			}
		}

		return indexHigh;
	}

	//Find the lowest score
	public static int lowest(ArrayList<Double> score) {
		double low = score.get(0);
		int i = 0;
		int indexLow = 0;
		for (i = 0; i < 7; i++) {
			if (score.get(i) < low) {

				low = score.get(i);
				indexLow = i;
			}
		}

		return indexLow;
	}

	//Calculate the sum of scores by removing the min and max score
	public static double sumScore(ArrayList<Double> score, int indexHigh, int indexLow) {
		int i = 0;
		score.remove(indexHigh);
		score.remove(indexLow);
		double sum = 0;
		for (i = 0; i < score.size(); i++) {
			sum += score.get(i);
		}
		return sum;
	}
}
