import java.io.Reader;
import symbols.*;

/**
 * Parse simple binary expressions with parantheses
 * 
 * @author NN
 * @version 2008-xx-yy
 */
public class Parser {
    private SymbolReader symbolReader;
    
    public Parser( Reader inStream ) {
        symbolReader = new SymbolReader(inStream);
    }
    
    public Expression parse() throws SyntaxError {
        return parseExpression(symbolReader.readNextSymbol());
    }
        
    // ...
}
