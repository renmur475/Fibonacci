public class App {
    public static void main(String[] args) throws Exception {
        int input = Integer.parseInt(args[0]); //Take command line arguement
		if(input < 0)
		{
			System.out.println("Must be a positive number");
			return;
		}
		calculate(input);
}


public static void calculate(int n)
{
	//Initial numbers
	int num1 = 0;
	int num2 = 1;

	for(int i = 0; i < n; i++)
	{
		int num3 = num1 + num2; //Add previous 2 numbers together
		num1 = num2; //Switch places
		num2 = num3;
	}
	System.out.print(num1);
}

}
