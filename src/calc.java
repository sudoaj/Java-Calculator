import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class calc extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					calc frame = new calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 575);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Lucida Grande", Font.PLAIN, 38));
		textPane.setBounds(0, 0, 459, 120);
		panel.add(textPane);

		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
			}
		});
		btnNewButton.setBounds(-3, 142, 117, 69);
		panel.add(btnNewButton);

		JButton button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();

				int len = tempText.length();

				char chart = tempText.charAt(0);

				if (chart == '-' || chart == ' ') {

					textPane.setText(tempText);
				} else if (chart == ' ') {
					textPane.setText("-" + tempText);
				} else {
					textPane.setText("-" + tempText);
				}

			}
		});
		button.setBounds(112, 142, 117, 69);
		panel.add(button);

		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "%");
			}
		});
		button_1.setBounds(228, 142, 117, 69);
		panel.add(button_1);

		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "/");
			}
		});
		button_2.setIcon(new ImageIcon("/Users/aj/Desktop/Screen Shot 2018-12-09 at 9.57.17 AM.png"));
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(255, 165, 0));
		button_2.setBounds(342, 142, 111, 69);
		panel.add(button_2);

		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "7");
			}
		});
		button_3.setBounds(-6, 216, 117, 69);
		panel.add(button_3);

		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "8");
			}
		});
		button_4.setBounds(109, 216, 117, 69);
		panel.add(button_4);

		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "9");
			}
		});
		button_5.setBounds(225, 216, 117, 69);
		panel.add(button_5);

		JButton button_6 = new JButton("x");
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "*");
			}
		});
		button_6.setIcon(new ImageIcon("/Users/aj/Desktop/Screen Shot 2018-12-09 at 9.57.25 AM.png"));
		button_6.setBounds(339, 216, 114, 69);
		panel.add(button_6);

		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "4");
			}
		});
		button_7.setBounds(-3, 292, 117, 69);
		panel.add(button_7);

		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "5");
			}
		});
		button_8.setBounds(112, 292, 117, 69);
		panel.add(button_8);

		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "6");
			}
		});
		button_9.setBounds(228, 292, 117, 69);
		panel.add(button_9);

		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "-");
			}
		});
		button_10.setIcon(new ImageIcon("/Users/aj/Desktop/Screen Shot 2018-12-09 at 9.57.46 AM.png"));
		button_10.setBounds(342, 292, 111, 69);
		panel.add(button_10);

		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "1");
			}
		});
		button_11.setBounds(-3, 373, 117, 69);
		panel.add(button_11);

		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "2");
			}
		});
		button_12.setBounds(112, 373, 117, 69);
		panel.add(button_12);

		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "3");
			}
		});
		button_13.setBounds(228, 373, 117, 69);
		panel.add(button_13);

		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "+");
			}
		});
		button_14.setIcon(new ImageIcon("/Users/aj/Desktop/Screen Shot 2018-12-09 at 9.57.53 AM.png"));
		button_14.setBounds(342, 373, 111, 69);
		panel.add(button_14);

		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + "0");
			}
		});
		button_15.setBackground(Color.ORANGE);
		button_15.setBounds(0, 454, 229, 69);
		panel.add(button_15);

		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = textPane.getText();
				textPane.setText(tempText + ".");
			}
		});
		button_16.setBounds(228, 454, 117, 69);
		panel.add(button_16);

		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculator toUse = new calculator();
				textPane.setText(toUse.calculate(textPane.getText()));

			}
		});
		button_17.setIcon(new ImageIcon("/Users/aj/Desktop/Screen Shot 2018-12-09 at 9.58.00 AM.png"));
		button_17.setBounds(342, 454, 111, 69);
		panel.add(button_17);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 128, 440, 12);
		panel.add(separator);
	}
}

class calculator {
	public static String calculate(String toCalc) {
		// Created a Stack - ADT
		Stack<Character> myStack = new Stack<Character>();
		ArrayList<Character> myArray = new ArrayList<Character>();

		// Boolean statements
		boolean lastOperator = false;
		boolean lastOpenParen = false;
		boolean lastClosedParen = false;
		boolean lastInt = false;
		boolean prevToken = false; // if prev token was an operand

		// Scanner for user input

		// User infix input

		String infixString = toCalc;
		char infix[] = infixString.toCharArray();

		// Error Message - No operator between operands
		if (infix[infix.length - 1] == '/' || infix[infix.length - 1] == '*' || infix[infix.length - 1] == '%'
				|| infix[infix.length - 1] == '+' || infix[infix.length - 1] == '-') {
			System.out.println("Error in expression! No operator between operands.\n"
					+ "Also last token must be an operand or closed parenthesis.");
			System.exit(-1);
		}

		// Error Message - No operands or open parenthesis before operator
		if (infix[0] == '/' || infix[0] == '*' || infix[0] == '%' || infix[0] == '+' || infix[0] == '-') {
			System.out.println("Error in expression! First token must be an" + " operand or open paranthesis.");
			System.exit(-1);
		}

		// infixString = infixString;
		for (int i = 0; i < infixString.length(); i++) {
			if (infix[i] == ' ') {
				continue;
			}
			infix[i] = infixString.charAt(i);
			switch (infix[i]) {

			// INTEGERS
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
				if (lastClosedParen) {
					System.out.println(
							"Error in expression! An integer cannot directly" + " follow a closed parenthesis.");
					System.exit(-1);
				}
//               if(lastInt){
//                   System.out.println("Error in expression! An integer cannot directly"
//                           + " follow another integer.");
//                   System.exit(-1);
//               }
				lastOperator = false;
				lastOpenParen = false;
				lastClosedParen = false;
				lastInt = true;
				myArray.add(infix[i]);
				break;

			// SPACES
			case ' ':
				continue;

			// UNARY OPERATORS & BINARY OPERATORS
			case '+':
			case '/':
			case '%':
				if (lastOperator) {
					System.out
							.println("Error in expression! An operator cannot" + " directly follow another operator.");
					System.exit(-1);
				}
				if (lastOpenParen) {
					System.out.println(
							"Error in expression! An operator cannot" + " directly follow an open parenthesis.");
					System.exit(-1);
				}
				lastOperator = true;
				lastOpenParen = false;
				lastClosedParen = false;
				lastInt = false;

				while (!myStack.isEmpty() && myStack.peek() != '('
						&& precedence(infix[i]) <= precedence(myStack.peek())) {
					myArray.add(myStack.pop());
				}
				myStack.push(infix[i]);
				break;

			case '*':
//                              if (lastOpenParen){
//                                  System.out.println("Error in expression! An operator cannot"
//                                       + " directly follow an open parenthesis.");
//                                  System.exit(-1);
//                              }
//                              lastOperator = true;
//                              lastOpenParen = false;
//                              lastClosedParen = false;
//                              lastInt = false;
				try {
					while (!myStack.isEmpty() && myStack.peek() != '('
							&& precedence(infix[i]) <= precedence(myStack.peek())) {
						myArray.add(myStack.pop());
					}
					myStack.push('*');
					break;
				} catch (EmptyStackException e) {
					System.out.println("Error in expresion! The * operator cannot be preceded by a * operator.");
					System.exit(-1);
				}
//                              while(myStack.peek() != '*'){
//                                  myArray.add('*');
//                              }
//                              myStack.push('*');
//                              break;
//                          } catch(EmptyStackException e){
//                              System.out.println("Error in expresion! The * operator cannot be preceded by a * operator.");
//                              System.exit(-1);
//                          }

			case '-':
				while (!myStack.isEmpty() && myStack.peek() != '('
						&& precedence(infix[i]) <= precedence(myStack.peek())) {
					myArray.add(myStack.pop());
				}
				myStack.push('-');
				break;

			// PARENTHESIS
			case '(':
				myStack.push(infix[i]);
				lastOperator = false;
				lastOpenParen = true;
				lastClosedParen = false;
				lastInt = false;
				break;

			case ')':
				if (lastOperator) {
					System.out.println(
							"Error in expression! A closed parenthesis" + " cannot directly follow an operator.");
					System.exit(-1);
				}
				lastOperator = false;
				lastOpenParen = false;
				lastClosedParen = true;
				lastInt = false;
				try {
					while (myStack.peek() != '(') {
						myArray.add(myStack.pop());
					}
					myStack.pop();
					break;
				} catch (EmptyStackException e) {
					System.out
							.println("Error in expression! No matching left parentheses for" + " a right parentheses.");
					System.exit(-1);
				}

				// NO FLOATING POINT NUMBERS
			case '.':
				System.out.println("Error in expression! Cannot " + "accept floating point numbers.");
				System.exit(-1);

				// QUIT - Q
			case 'q':
			case 'Q':
				System.out.println("Shutting down . . .");
				System.out.println("Goodbye!");
				System.exit(-1);

				// DEFAULT CASE - if not binary, unary, or parentheses - illegal character
			default:
				System.out.println("Illegal character used. Please try again.");
				break;

			} // End Switch
		} // End For-Loop

		while (!myStack.isEmpty()) {
			if (myStack.peek() == '(') {
				System.out.println("Error in expression! No matching right parenthesis for" + " left parentehesis");
				System.exit(-1);
			}
			myArray.add(myStack.pop());
		}
		System.out.print("Converted Expression: ");
		for (int i = 0; i < myArray.size(); i++) {
			System.out.print(myArray.get(i));
		}
		System.out.println();
		return toCalc + "=" + postFixEvaluation(myArray);

	} // End Main

	// PRECONDITION: Takes in a char variable to check for precedence - if - then
	// return 2 else return 1
	// POSTCONDITION: Returns 2 for higher precedence if its a / % or * - Returns 1
	// if anything else
	// Heirarchy of operators
	public static int precedence(char a) {
		if (a == '/' || a == '%' || a == '*') {
			return 2;
		} else
			return 1;
	}

	// PRECONDITION: Takes in an Arraylist of Characters
	// POSTCONDITION: Returns values calculated by each case depending on user input
	// Post fix stack evaluation
	public static int postFixEvaluation(ArrayList<Character> a) {
		Stack<Integer> evaluateStack = new Stack<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (Character.isDigit(a.get(i))) {
				evaluateStack.push(Character.getNumericValue(a.get(i)));
			} else {
				int second = evaluateStack.pop();
				int first = evaluateStack.pop();
				switch (a.get(i)) {
				case '+':
					evaluateStack.push(first + second);
					break;
				case '-':
					evaluateStack.push(first - second);
					break;
				case '*':
					evaluateStack.push(first * second);
					break;
				case '/':
					evaluateStack.push(first / second);
					break;
				case '%':
					evaluateStack.push(first % second);
					break;
				}
			}
		}
		return evaluateStack.pop();
	}

} // End Class
//todo 1. make aure it can accept floating poitn numbers!
//this is just to see how git updates it, lol
//todo 2. check other major errors
