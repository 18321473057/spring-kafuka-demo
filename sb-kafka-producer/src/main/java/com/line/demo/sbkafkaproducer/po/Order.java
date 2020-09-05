package com.line.demo.sbkafkaproducer.po;

import java.util.Date;
import java.util.List;

/**
 * @Author: yangcs
 * @Date: 2020/9/3 13:18
 * @Description:
 */
public class Order {

    private String orderId;
    private Long price;
    private List<Long> itemIds;
    private Integer userId;
    private Date created;
    private Date updated;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public List<Long> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Long> itemIds) {
        this.itemIds = itemIds;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
