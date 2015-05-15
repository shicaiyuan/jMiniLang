package priv.bajdcc.LALR1.grammar.runtime;

import java.util.List;

/**
 * 【扩展】外部化过程接口
 *
 * @author bajdcc
 */
public interface IRuntimeDebugExec {

	/**
	 * 调用外部化过程
	 * 
	 * @param args 参数表
	 * @param status 状态接口
	 * @return 过程返回值，若没有则返回空
	 * @throws Exception
	 */
	public RuntimeObject ExternalProcCall(List<RuntimeObject> args, IRuntimeStatus status)
			throws Exception;

	/**
	 * 返回参数类型，用于运行时类型检查
	 * 
	 * @return 若无参数则返回空
	 */
	public RuntimeObjectType[] getArgsType();

	/**
	 * 返回过程文档
	 * 
	 * @return 文档
	 */
	public String getDoc();
}
