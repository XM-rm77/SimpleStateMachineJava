import java.util.Scanner;

public class Toaster 
{
   
    public enum State
	{
		S0, S1, S2, S3, S4, S5, S6, S7;
	}
    
    public static void main(String args[])
	{

		// set initial state
		State currentState = State.S0;

        Scanner input = new Scanner(System.in);


        while (true)
            {
            	// write current state on the screen
                            // used only for debugging
            	// System.out.println("the current state is " + currentState);

            	// read input
            	System.out.print("your input: ");
            	String currentInput = input.nextLine();

            	// take the transition
            	switch (currentState)
            	{
            		case S0:
            			switch (currentInput)
            			{
            				case "push":
            					System.out.println("Output: on");
            					currentState = State.S1;
            					break;
                            case "inc":
            					System.out.println("");
            					currentState = State.S6;
            					break;
                            case "defrost":
            					System.out.println("");
            					currentState = State.S2;
            					break;
            			}
            		break;

            		case S1:

            			switch (currentInput)
            			{
            				case "stop":
            					System.out.println("Output: off");
            					currentState = State.S0;
            					break;
                            case "time":
            					System.out.println("OutputL off");
            					currentState = State.S0;
            					break;
                            case "inc":
            					System.out.println("");
            					currentState = State.S7;
            					break;
                        }
            		break;

            		case S2:

            			switch (currentInput)
            			{
                            case "defrost":
                                System.out.println("");
                                currentState = State.S0;
                                break;
                            case "inc":
                                System.out.println("");
                                currentState = State.S4;
                                break;
                            case "push":
                                System.out.println("Output: On");
                                currentState = State.S3;
                                break;
            			}
                    break;
                    case S3:

            			switch (currentInput)
            			{
                            case "stop":
                                System.out.println("Output: Off");
                                currentState = State.S0;
                                break;
                            case "time_d":
                                System.out.println("");
                                currentState = State.S1;
                                break;
                            case "inc":
                                System.out.println("");
                                currentState = State.S5;
                                break;
            			}
                    break;
                    case S4:

            			switch (currentInput)
            			{
                            case "dec":
                                System.out.println("");
                                currentState = State.S2;
                                break;
                            case "push":
                                System.out.println("Output: On");
                                currentState = State.S5;
                                break;
                            case "defrost":
                                System.out.println("");
                                currentState = State.S6;
                                break;
            			}
                    break;
                    case S5:

            			switch (currentInput)
            			{
                            case "dec":
                                System.out.println("");
                                currentState = State.S3;
                                break;
                            case "time_d":
                                System.out.println("");
                                currentState = State.S7;
                                break;
                            case "stop":
                                System.out.println("Output: Off");
                                currentState = State.S6;
                                break;
            			}
                    break;
                    case S6:

            			switch (currentInput)
            			{
                            case "dec":
                                System.out.println("");
                                currentState = State.S0;
                                break;
                            case "defrost":
                                System.out.println("");
                                currentState = State.S4;
                                break;
                            case "push":
                                System.out.println("Output: On");
                                currentState = State.S7;
                                break;
            			}
                    break;
                    case S7:

            			switch (currentInput)
            			{
                            case "stop":
                                System.out.println("Output: Off");
                                currentState = State.S6;
                                break;
                            case "time":
                                System.out.println("Output: Off");
                                currentState = State.S6;
                                break;
                            case "dec":
                                System.out.println("");
                                currentState = State.S1;
                                break;
            			}
                    break;
                    default:
                    break;
            			
            }
        }
    }
}
