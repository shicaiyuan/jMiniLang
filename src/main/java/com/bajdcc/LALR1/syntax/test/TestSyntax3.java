package com.bajdcc.LALR1.syntax.test;

import com.bajdcc.LALR1.syntax.Syntax;
import com.bajdcc.LALR1.syntax.handler.SyntaxException;
import com.bajdcc.util.lexer.error.RegexException;
import com.bajdcc.util.lexer.token.TokenType;

@SuppressWarnings("unused")
public class TestSyntax3 {

	public static void main(String[] args) {
		try {
			//Scanner scanner = new Scanner(System.in);
			Syntax syntax = new Syntax();
			syntax.addTerminal("a", TokenType.ID, "a");
			syntax.addTerminal("c", TokenType.ID, "c");
			syntax.addTerminal("d", TokenType.ID, "d");
			syntax.addNonTerminal("S");
			syntax.addNonTerminal("A");
			syntax.addErrorHandler("sample", null);
			syntax.infer("S -> @c A @d");
			syntax.infer("A -> @a");
			syntax.infer("A -> A @a");
			syntax.initialize("S");
			System.out.println(syntax.toString());
			System.out.println(syntax.getNgaString());
			System.out.println(syntax.getNpaString());
			//scanner.close();
		} catch (RegexException e) {
			System.err.println(e.getPosition() + "," + e.getMessage());
			e.printStackTrace();
		} catch (SyntaxException e) {
			System.err.println(e.getPosition() + "," + e.getMessage() + " " + e.getInfo());
			e.printStackTrace();
		}
	}
}
