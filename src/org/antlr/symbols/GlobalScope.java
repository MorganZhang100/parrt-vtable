package org.antlr.symbols;

public class GlobalScope extends BaseScope {
	public GlobalScope(Scope scope) { super(scope); }
    public String getScopeName() { return "global"; }
}
