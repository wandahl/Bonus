import symbols.*;

public class BinaryExpression implements Expression {
    private SymbolTypes op;
    private Expression leftOperand;
    private Expression rightOperand;

    public BinaryExpression( Expression leftOperand, SymbolTypes op, Expression rightOperand ) {
        this.leftOperand = leftOperand;
        this.op = op;
        this.rightOperand = rightOperand;
    }

	@Override
	public int getValue() {
		
		if(op==SymbolTypes.PLUS){
			return leftOperand.getValue() + rightOperand.getValue();
		}
			
		if(op==SymbolTypes.MINUS){
			return leftOperand.getValue() - rightOperand.getValue();
		}
			
		if(op==SymbolTypes.MULT){
			return leftOperand.getValue() * rightOperand.getValue();
		}
			
		if(op==SymbolTypes.DIV){
			if(rightOperand.getValue()==0){
				throw new IllegalArgumentException("Error: Can't divide by zero");
			}else{ 
				return leftOperand.getValue() / rightOperand.getValue();	
			}
		}	

		if(op==SymbolTypes.MOD){
			if(rightOperand.getValue()==0){
				throw new IllegalArgumentException("Error: Can't divide by zero");
			}else{ 
				return leftOperand.getValue() % rightOperand.getValue(); 
			}
		}
		
		if(op==SymbolTypes.EXP){
			return (int) Math.pow(leftOperand.getValue(),rightOperand.getValue());
		}
		
		return 0; 
	}

	@Override
	public void prettyInfix() {
		// TODO Auto-generated method stub
			System.out.print("(");
			leftOperand.prettyInfix();
			System.out.print(op.opChar);
			rightOperand.prettyInfix();
			System.out.print(")");
	}

	@Override
	public void prettyPostfix() {
		// TODO Auto-generated method stub
		System.out.print("(");
		leftOperand.prettyPostfix();
		rightOperand.prettyPostfix();
		System.out.print(op.opChar);
		System.out.print(")");
	}

	@Override
	public void prettyPrefix() {
		// TODO Auto-generated method stub
		System.out.print("(");
		System.out.print(op.opChar);
		leftOperand.prettyPrefix();
		rightOperand.prettyPrefix();
		System.out.print(")");
	}

    // ...
}
