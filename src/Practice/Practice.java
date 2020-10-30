package Practice;

public class Practice {

	public static void main(String[] args) {
		//For these numbers, print:The sum,The average,The largest,The smallest
		//448 823 950 553 450 720 307 348 425 543 265 283 830 585 816
		int[] numbrs = {448, 823, 950, 553, 450, 720, 307, 348, 425, 543, 265, 283, 830, 585, 816};
		var sum = 0;
		var count = 0;
		var avg = 1;
		var largest = 0;
		var smallest = 1000;
		for(var num : numbrs) {
			sum += num;
			count++;
			if (num > largest) {
				largest = num;
			}
			if (num < smallest) {
				smallest = num;
			}
		}
		avg = sum/count;
		System.out.println("Sum is " + sum);//this is interpolated string in C#
		System.out.println("Average is " + avg);
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);
	}

}
