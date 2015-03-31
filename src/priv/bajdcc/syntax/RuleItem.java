package priv.bajdcc.syntax;

import java.util.HashSet;

import priv.bajdcc.syntax.exp.RuleExp;
import priv.bajdcc.syntax.exp.TokenExp;

/**
 * 文法规则部件（文法推导式）
 *
 * @author bajdcc
 */
public class RuleItem {

	/**
	 * 规则表达式
	 */
	public ISyntaxComponent m_Expression = null;

	/**
	 * First集合（终结符）
	 */
	public HashSet<TokenExp> m_arrFirstSetTokens = new HashSet<TokenExp>();

	/**
	 * First集合（非终结符）
	 */
	public HashSet<RuleExp> m_arrFirstSetRules = new HashSet<RuleExp>();

	/**
	 * 父结点指针
	 */
	public Rule m_Parent = null;

	/**
	 * 是否有效
	 */
	public boolean m_bEnable = true;

	public RuleItem(ISyntaxComponent exp, Rule parent) {
		m_Expression = exp;
		m_Parent = parent;
	}
}