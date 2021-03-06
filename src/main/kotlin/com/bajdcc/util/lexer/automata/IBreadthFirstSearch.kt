package com.bajdcc.util.lexer.automata

import com.bajdcc.util.VisitBag

/**
 * BFS宽度优先遍历接口
 *
 * @param <Edge>   边类型
 * @param <Status> 状态类型
 * @author bajdcc
</Status></Edge> */
interface IBreadthFirstSearch<Edge, Status> {
    /**
     * 边测试
     *
     * @param edge 边
     * @return 测试结果
     */
    fun testEdge(edge: Edge): Boolean

    /**
     * 遍历开始
     *
     * @param status 状态
     * @param bag    遍历参数
     */
    fun visitBegin(status: Status, bag: VisitBag)

    /**
     * 遍历结束
     *
     * @param status 状态
     */
    fun visitEnd(status: Status)
}
