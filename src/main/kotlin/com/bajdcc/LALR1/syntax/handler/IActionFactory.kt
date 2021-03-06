package com.bajdcc.LALR1.syntax.handler

/**
 * 【语义分析】语义动作工厂接口
 *
 * @author bajdcc
 */
interface IActionFactory {

    /**
     * 调用指定过程
     *
     * @param name 过程名称
     */
    operator fun invoke(name: String)
}
