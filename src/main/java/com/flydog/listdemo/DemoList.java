package com.flydog.listdemo;

/**
 * 列表接口，定义列表的一些方法。
 * 列表的元素是int类型的。@TODO 把所有原理都搞清后，再改成泛型的
 *
 * @author CaoWeidong
 * @date 2020/7/19
 */
public interface DemoList {
    /**
     * 向列表中添加一个元素
     *
     * @param element 需添加的元素
     */
    void insert(int element);

    /**
     * 在 列表的@index 处插入@ element
     * @param element 需插入的元素
     * @param index 插入元素的索引
     */
    void insert(int element, int index);

    /**
     * 从列表删除一个元素
     *
     * @param element 需删除的元素
     * @return 删除成功返回 true
     */
    boolean delete(int element);

    /**
     * 查找队列中是否包含元素
     *
     * @param element 需查找的元素
     * @return 如果包含返回 true
     */
    boolean isContent(int element);

    /**
     * 队列中元素的个数
     *
     * @return 队列中元素的个数
     */
    int size();

    /**
     * 判断队列是否为空
     *
     * @return 如果为空则返回 true
     */
    boolean isEmpty();

    /**
     * 用 @count 个随机元素填充队列
     *
     * @param count 随机元素的个数
     */
    void fill(int count);

    /**
     * 格式化输出所有元素
     *
     * @return 格式化输出
     */
    String displayAll();

}
