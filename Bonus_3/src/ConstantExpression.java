public class ConstantExpression implements Expression {
    private int value;
    public ConstantExpression( int value) {
        this.value = value;
    }
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public void prettyInfix() {
		// TODO Auto-generated method stub
		System.out.print(getValue());
	}
	@Override
	public void prettyPostfix() {
		// TODO Auto-generated method stub
		System.out.print(getValue()+" ");
	}
	@Override
	public void prettyPrefix() {
		// TODO Auto-generated method stub
		System.out.print(" "+getValue());
	}

    // ...
}
