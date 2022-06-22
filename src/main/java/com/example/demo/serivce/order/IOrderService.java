package com.example.demo.serivce.order;

import com.example.demo.model.Order;
import com.example.demo.serivce.GeneralService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IOrderService extends GeneralService<Order> {

    List<Order> findAllByCreateAtBetween(LocalDateTime from, LocalDateTime to);
    Iterable<Object[]> reportByCreateTime(LocalDate from, LocalDate to);
}
