sealed class Expr {
    class Const(val namber:Double):Expr()
    class Sum(val e1:Expr,val e2:Expr):Expr()
    object NotANumber:Expr()
}