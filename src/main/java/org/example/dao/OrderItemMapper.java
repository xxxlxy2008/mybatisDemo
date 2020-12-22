package org.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.example.domain.OrderItem;
import org.example.domain.Product;

/**
 * Created on 2020-10-29
 */
public interface OrderItemMapper {
    // 根据id查询OrderItem对象
    OrderItem find(long id);
    // 查询指定的订单中的全部OrderItem
    List<OrderItem> findByOrderId(long orderId);
    // 保存一个OrderItem信息
    long save(@Param("orderItem")OrderItem orderItem,
              @Param("orderId") long orderId);
}