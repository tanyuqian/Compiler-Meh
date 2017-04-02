package FrontEnd.AbstractSyntaxTree.Expression.VariableExpression;

import FrontEnd.AbstractSyntaxTree.Expression.Expression;
import FrontEnd.AbstractSyntaxTree.Type.Type;

/**
 * Created by tan on 4/1/17.
 */
public class FieldExpression extends Expression {
    public String field;
    public Expression expression;

    public FieldExpression(Type type, String field, Expression expression) {
        super(type);
        this.field = field;
        this.expression = expression;
    }
}
