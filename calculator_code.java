package application2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {      
	
	// Setting up layouts
	private Pane pane;
	
	private Stage gameStage=new Stage();
	
	private BorderPane calcMain = new BorderPane();
		private BorderPane calcTop = new BorderPane();
			private HBox calcTopTop = new HBox();
			private ScrollPane calcTopMidH = new ScrollPane();
				private VBox historyPane = new VBox();
			private ScrollPane calcTopMidA = new ScrollPane();
				private VBox appPane = new VBox();
			private ScrollPane calcTopMidUC = new ScrollPane();
				private VBox ucPane = new VBox();
			private HBox calcTopMidNC = new HBox();
		private VBox calcMid = new VBox();
		private BorderPane calcBot = new BorderPane();
			private BorderPane calcBotLeft = new BorderPane();
			private BorderPane calcBotMid = new BorderPane();
				private int buttonWidth=100;
				private VBox gridLeft0 = new VBox();
				private VBox gridLeft1 = new VBox();
				private VBox gridLeft2 = new VBox();
				private VBox gridLeft3 = new VBox();
				private VBox gridLeft4 = new VBox();
	
	// UI Text
	private TextField input1 = new TextField();
	private TextField inputOperator = new TextField();
	private TextField input2 = new TextField();
	private TextField output = new TextField();
	private TextField selectedTextField = input1;
	private Text operand1 = new Text("Operand 1:");
	private Text operator = new Text("Operator:");
	private Text operand2 = new Text("Operand 2:");
	private Text result = new Text("Result:");
	
				
      // Buttons
	  Button btHistory = new Button("History");
	  Button btApps = new Button("Other Apps");
	  	Button btInvaders = new Button("Space Invaders");
	  Button btUC = new Button("Unit Conversions");
	  	Button btftm = new Button("FeetToMetre");
	  	Button btltcm3 = new Button("LitreToCmCube");
	  	Button btitf = new Button("InchToFeet");
	  	Button btmtkm = new Button("MetreToKm");
	  	Button btltg = new Button("LitreToGallon");
	  	Button btltm3 = new Button("LitreToMetreCube");
	  Button btNC = new Button("Number System Conversions");
	  	Button btBtD = new Button("BinToDec");
	  	Button btDtB = new Button("DecToBin");
	  	Button btOtD = new Button("OctToDec");
	  	Button btDtO = new Button("DecToOct");
	  	Button btHtD = new Button("HexToDec");
	  	Button btDtH = new Button("DecToHex");
    
      Button btClear = new Button("CLR");
      Button btDelete = new Button("Del");
      Button btEqual = new Button("=");
      Button btResult = new Button("=>");
      
      Button btSin = new Button("sin()");
      Button btCos = new Button("cos()");
      Button btTan = new Button("tan()");
      Button btRad = new Button("Rad");
      Button btDeg = new Button("Deg");
      Button btLog = new Button("log10()");
      Button btLn = new Button("ln()");
      
      Button btPlus = new Button("+");
      Button btMinus = new Button("-");
      Button btMulti = new Button("*");
      Button btDivide = new Button("/");
     
      Button btFactorial = new Button("!");
      Button btExponent = new Button("^");
      Button btRoot = new Button("sqrt()");
      
      Button bt0 = new Button("0");
      Button bt1 = new Button("1");
      Button bt2 = new Button("2");
      Button bt3 = new Button("3");
      Button bt4 = new Button("4");
      Button bt5 = new Button("5");
      Button bt6 = new Button("6");
      Button bt7 = new Button("7");
      Button bt8 = new Button("8");
      Button bt9 = new Button("9");

      Button btDot = new Button(".");
      Button btPi = new Button("π");
      Button btEuler = new Button("e");
      
      Font keys = new Font(30);
	
	public void CalcDisplay()
	{
	}
	
	public void start(Stage primaryStage) {
		
		pane=calcMain;
		
		calcMain.setPadding(new Insets(20,20,20,20));
		
		gridLeft0.setPrefWidth(buttonWidth);
		gridLeft1.setPrefWidth(buttonWidth);
		gridLeft2.setPrefWidth(buttonWidth);
		gridLeft3.setPrefWidth(buttonWidth);
		gridLeft0.setPrefHeight(buttonWidth*6);
		gridLeft1.setPrefHeight(buttonWidth*6);
		gridLeft2.setPrefHeight(buttonWidth*6);
		gridLeft3.setPrefHeight(buttonWidth*6);
		
		
	       btClear.setPrefSize(buttonWidth, buttonWidth);
	       btClear.setFont(keys);
	       btDelete.setPrefSize(buttonWidth, buttonWidth);
	       btDelete.setFont(keys);
	       btEqual.setPrefSize(buttonWidth, buttonWidth);
	       btEqual.setFont(keys);
	       btResult.setPrefSize(30, 30);
	       btResult.setRotate(270);

	       btSin.setPrefSize(buttonWidth, buttonWidth);
	       btSin.setFont(new Font(20));
	       btCos.setPrefSize(buttonWidth, buttonWidth);
	       btCos.setFont(new Font(20));
	       btTan.setPrefSize(buttonWidth, buttonWidth);
	       btTan.setFont(new Font(20));
	       btDeg.setPrefSize(buttonWidth, buttonWidth);
	       btDeg.setFont(new Font(20));
	       btRad.setPrefSize(buttonWidth, buttonWidth);
	       btRad.setFont(new Font(20));
	       btLog.setPrefSize(buttonWidth, buttonWidth);
	       btLog.setFont(new Font(20));
	       btLn.setPrefSize(buttonWidth, buttonWidth);
	       btLn.setFont(new Font(20));
	       
	       btPlus.setPrefSize(buttonWidth, buttonWidth);
	       btPlus.setFont(keys);
	       btMinus.setPrefSize(buttonWidth, buttonWidth);
	       btMinus.setFont(keys);
	       btMulti.setPrefSize(buttonWidth, buttonWidth);
	       btMulti.setFont(keys);
	       btDivide.setPrefSize(buttonWidth, buttonWidth);
	       btDivide.setFont(keys);
	     
	       btFactorial.setPrefSize(buttonWidth, buttonWidth);
	       btFactorial.setFont(keys);
	       btExponent.setPrefSize(buttonWidth, buttonWidth);
	       btExponent.setFont(keys);
	       btRoot.setPrefSize(buttonWidth, buttonWidth);
	       btRoot.setFont(new Font(20));
	      
	       bt0.setPrefSize(buttonWidth, buttonWidth);
	       bt0.setFont(keys);
	       bt1.setPrefSize(buttonWidth, buttonWidth);
	       bt1.setFont(keys);
	       bt2.setPrefSize(buttonWidth, buttonWidth);
	       bt2.setFont(keys);
	       bt3.setPrefSize(buttonWidth, buttonWidth);
	       bt3.setFont(keys);
	       bt4.setPrefSize(buttonWidth, buttonWidth);
	       bt4.setFont(keys);
	       bt5.setPrefSize(buttonWidth, buttonWidth);
	       bt5.setFont(keys);
	       bt6.setPrefSize(buttonWidth, buttonWidth);
	       bt6.setFont(keys);
	       bt7.setPrefSize(buttonWidth, buttonWidth);
	       bt7.setFont(keys);
	       bt8.setPrefSize(buttonWidth, buttonWidth);
	       bt8.setFont(keys);
	       bt9.setPrefSize(buttonWidth, buttonWidth);
	       bt9.setFont(keys);

	       btDot.setPrefSize(buttonWidth, buttonWidth);
	       btDot.setFont(keys);
	       btPi.setPrefSize(buttonWidth, buttonWidth);
	       btPi.setFont(keys);
	       btEuler.setPrefSize(buttonWidth, buttonWidth);
	       btEuler.setFont(keys);
		
	       
      output.setEditable(false);
      
      //Image img1=new Image("https://ibb.co/WD9qZmh");
      Image img1=new Image("file:img1.png");
      Background bg1 = new Background(new BackgroundImage(img1,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,false,true)));
      
      calcMain.setTop(calcTop); 
      	  calcTop.setTop(calcTopTop);
      		calcTopTop.getChildren().addAll(btHistory,btApps,btUC,btNC);
      	  calcTop.setCenter(calcTopMidH);
      	  	calcTopMidH.setContent(historyPane);
      	  		calcTopMidH.setPannable(true);
      	  		calcTopMidH.setPadding(new Insets(10,10,10,10));
      	  		calcTopMidH.setMaxSize(600, 150);
      	  	calcTopMidA.setContent(appPane);
  	  			calcTopMidA.setPadding(new Insets(10,10,10,10));
      	  		appPane.getChildren().add(btInvaders);
      	  	calcTopMidNC.getChildren().addAll(btBtD,btDtB,btOtD,btDtO,btHtD,btDtH);
  	  			calcTopMidNC.setPadding(new Insets(10,10,10,10));
  	  		calcTopMidUC.setContent(ucPane);
  	  			calcTopMidUC.setPannable(true);
  	  	  		calcTopMidUC.setPadding(new Insets(10,10,10,10));
      	  		calcTopMidUC.setMaxSize(600, 150);
  	  			ucPane.getChildren().addAll(btftm,btltcm3,btitf,btmtkm,btltg,btltm3);
      		
      calcMain.setCenter(calcMid);
      	  calcMid.getChildren().addAll(operand1,input1,operator,inputOperator,operand2,input2,result,output,btResult);
      	  	operand2.setVisible(false);
      	  	input2.setVisible(false);
      		
      calcMain.setBottom(calcBot);
	      calcBot.setLeft(calcBotLeft);
	      	calcBotLeft.setLeft(gridLeft0);
	      		gridLeft0.getChildren().addAll(btLn,btLog,btSin,btCos,btTan,btRad);
	      	calcBotLeft.setCenter(gridLeft1);
	      		gridLeft1.getChildren().addAll(btPi,btRoot,bt7,bt4,bt1,btDeg);
	      	calcBotLeft.setRight(gridLeft2);
	      		gridLeft2.getChildren().addAll(btEuler,btExponent,bt8,bt5,bt2,bt0);
	      calcBot.setCenter(calcBotMid);
	      	calcBotMid.setLeft(gridLeft3);
	      		gridLeft3.getChildren().addAll(btClear,btFactorial,bt9,bt6,bt3,btDot);
		    calcBotMid.setCenter(gridLeft4);
		    	gridLeft4.getChildren().addAll(btDelete,btDivide,btMulti,btMinus,btPlus,btEqual);
      	//setting bg
      pane.setBackground(bg1);
      
      // Register event handlers for buttons
      btHistory.setOnAction(e -> {
    	  calcTop.setCenter(calcTopMidH);
      });
      btApps.setOnAction(e -> {
    	  calcTop.setCenter(calcTopMidA);
      });
	      btInvaders.setOnAction(e->{
	    	  SpaceInvadersApp invaders = new SpaceInvadersApp();
	    	  try {
				invaders.launchApp(gameStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	      });
	  btUC.setOnAction(e->{
		  calcTop.setCenter(calcTopMidUC);
	  });
	  	  btftm.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("FeetToMetre");
	  	  });
	  	  btltcm3.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("LitreToCmCube");
	  	  });
	  	  btitf.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("InchToFeet");
	  	  });
	  	  btmtkm.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("MetreToKm");
	  	  });
	  	  btltg.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("LitreToGallon");
	  	  });
	  	  btltm3.setOnAction(e->{
	  		 unaryOp();
	    	 inputOperator.setText("LitreToMetreCube");
	  	  });
      btNC.setOnAction(e->{
    	  calcTop.setCenter(calcTopMidNC);
      });
	      btBtD.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("BinToDec");
	      });
	      btDtB.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("DecToBin");
	      });
	      btOtD.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("OctToDec");
	      });
	      btDtO.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("DecToOct");
	      });
	      btHtD.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("HexToDec");
	      });
	      btDtH.setOnAction(e->{
	    	 unaryOp();
	    	 inputOperator.setText("DecToHex");
	      });
	      
      btClear.setOnAction(e -> {
    	  input1.setText("");
    	  input2.setText("");
    	  inputOperator.setText("");
    	  output.setText("");
      });
      btDelete.setOnAction(e -> {
    	  String s=selectedTextField.getText();
    	  selectedTextField.setText(s.substring(0, s.length()-1));
      });
      btEqual.setOnAction(e -> {
    	  handleUserInput();
    	  selectedTextField=input1;
      });
      btResult.setOnAction(e->{
    	  input1.setText(output.getText());
    	  selectedTextField=input1;
      });

      btSin.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("sin()");
      });
      btCos.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("cos()");
      });
      btTan.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("tan()");
      });
      btDeg.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("toDegrees");
      });
      btRad.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("toRadians");
      });
      btLog.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("log10()");
      });
      btLn.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("ln()");
      });
      
      btPlus.setOnAction(e -> {
    	  binaryOp();
    	  inputOperator.setText("+");
      });
      btMinus.setOnAction(e -> {
    	  if(selectedTextField.getText()=="")
    		  selectedTextField.setText("-");
    	  else {
    		  binaryOp();
    		  inputOperator.setText("-");
    	  }
      });
      btMulti.setOnAction(e -> {
    	  binaryOp();
    	  inputOperator.setText("*");
      });
      btDivide.setOnAction(e -> {
    	  binaryOp();
    	  inputOperator.setText("/");
      });

      btFactorial.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("!");
      });
      btExponent.setOnAction(e -> {
    	  binaryOp();
    	  inputOperator.setText("^");
      });
      btRoot.setOnAction(e -> {
    	  unaryOp();
    	  inputOperator.setText("sqrt()");
      });

      bt0.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'0');
      });
      bt1.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'1');
      });
      bt2.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'2');
      });
      bt3.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'3');
      });
      bt4.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'4');
      });
      bt5.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'5');
      });
      bt6.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'6');
      });
      bt7.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'7');
      });
      bt8.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'8');
      });
      bt9.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'9');
      });
      
      btDot.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'.');
      });
      btPi.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'π');
      });
      btEuler.setOnAction(e -> {
    	  selectedTextField.setText(selectedTextField.getText()+'e');
      });
      

      input1.setOnMouseClicked(e -> {
    	  selectedTextField=input1;
      });
      input2.setOnMouseClicked(e -> {
    	  selectedTextField=input2;
      });

      Scene scene = new Scene(pane,600,1000);
      primaryStage.setTitle("Mulit-Purpose Calculator");
      primaryStage.setScene(scene);
      primaryStage.setResizable(true);
      primaryStage.show();
      
   }
	
	public double convertToDouble(final String str) throws NumberFormatException {
        int indexOfDecimal = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                if (indexOfDecimal != -1) {
                    throw new NumberFormatException("Invalid number format: " + str);
                }
                indexOfDecimal = i;
            } else if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                if (i != 0 || (i == 1 && str.charAt(0) == '-')) {
                    throw new NumberFormatException("Invalid number format: " + str);
                }
            }
        }

        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format: " + str);
        }
    }
	
	private void handleUserInput() {
        try {
        		double num1;
        		double num2=0;
        		if(input1.getText().charAt(0)=='π') {
        			num1=3.141592653589793;
        		}
        		else if(input1.getText().charAt(0)=='e') {
        			num1=2.718281828459045;
        		}
        		else {
                num1 = convertToDouble(input1.getText());
        		}
        		if(input2.getText()=="π") {
        			num2=3.141592653589793;
        		}
        		else if(input2.getText()=="e") {
        			num2=2.718281828459045;
        		}
        		else {
        		try {
                num2 = convertToDouble(input2.getText());
        		}
        		catch(Exception e) {
        			
        		}
        		}


                String result = "0";
                String histResult = "0";
                String op = inputOperator.getText();
                
                switch (inputOperator.getText()) {
                	case "":
                		result = num1+"";
                		break;
                    case "+":
                        result = (num1+num2)+"";
                        break;
                    case "-":
                        result = (num1-num2)+"";
                        break;
                    case "*":
                        result = (num1*num2)+"";
                        break;
                    case "/":
                    	if(num2==0)
                    		result="UNDEFINED";
                    	else
                    		result = (num1/num2)+"";
                        break;

                    case "sqrt()":
                        result = Math.sqrt(num1)+"";
                        break;
                    case "^":
                        result = Math.pow(num1,num2)+"";
                        break;
                    case "!":
                    	int fact=1;
                    	for(int i=2;i<=num1;i++)
                    		fact*=i;
                    	result = fact+"";
                        break;
                        
                    case "sin()":
                        result = Math.sin(num1)+"";
                        break;
                    case "cos()":
                        result = Math.cos(num1)+"";
                        break;
                    case "tan()":
                        result = Math.tan(num1)+"";
                        break;
                    case "log10()":
                        result = Math.log10(num1)+"";
                        break;
                    case "ln()":
                        result = Math.log(num1)+"";
                        break;
                    case "toDegrees":
                        result = Math.toDegrees(num1)+"";
                        break;
                    case "toRadians":
                        result = Math.toRadians(num1)+"";
                        break;
                    case "BinToDec":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "DecToBin":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "OctToDec":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "DecToOct":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "HexToDec":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "DecToHex":
                    	result=NumberConversion.operate(op, input1.getText());
                    	break;
                    case "FeetToMetre":
                    	result=UnitConversion.feetmetre(num1)+"";
                    	break;
                    case "LitreToCmCube":
                    	result=UnitConversion.litrecm3(num1)+"";
                    	break;
                    case "InchToFeet":
                    	result=UnitConversion.inchfeet(num1)+"";
                    	break;
                    case "MetreToKm":
                    	result=UnitConversion.metrekm(num1)+"";
                    	break;
                    case "LitreToGallon":
                    	result=UnitConversion.litregallon(num1)+"";
                    	break;
                    case "LitreToMetreCube":
                    	result=UnitConversion.litrem3(num1)+"";
                    	break;
                    default:
                        System.out.println("Invalid operator");
                        break;
                }
                

                switch (inputOperator.getText()) {
                case "sqrt()":
                case "log10()":
                case "ln()":
                case "sin()":
                case "cos()":
                case "tan()":
                case "toDegrees":
                case "toRadians": 
                case "BinToDec":
                case "DecToBin":
                case "OctToDec":
                case "DecToOct":
                case "HexToDec":
                case "DecToHex":
                case "FeetToMetre":
                case "LitreToCmCube":
                case "InchToFeet":
                case "MetreToKm":
                case "LitreToGallon":
                case "LitreToMetreCube":
                	int i=0;
                	for(i=0;(i<op.length())&&(op.charAt(i)!='(');i++);
                	histResult = (op.substring(0, i)+'('+num1+')'+" = "+result);
                	break;
                case "!":
                	histResult = num1+"!"+" = "+result;
                	break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                	histResult = num1+op+num2+" = "+result;
                	break;
                	
                }
                output.setText(result);
                TextField tf = new TextField(histResult);
                tf.setPrefWidth(540);
                tf.setEditable(false);
                historyPane.getChildren().add(tf);
                
        } 
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid calculation done: " + e.getMessage());
        }
		
	}

	private void unaryOp()
	{
  	  	operand2.setVisible(false);
  	  	input2.setVisible(false);
  	  	selectedTextField=input1;
  	  	
		System.out.println("Unary");
	}
	
	private void binaryOp()
	{
		if(!operand2.isVisible()) {
			operand2.setVisible(true);
			input2.setVisible(true);
			input2.setText("0");
		}
		selectedTextField=input2;
		
		System.out.println("Binary");
	}

   public static void main(String[] args) {
      launch(args);
   }
}
