package com.example.iti0302backend.dto;

import com.example.iti0302backend.entity.Order;
import com.example.iti0302backend.entity.Post;
import com.example.iti0302backend.mapper.OrderMapper;
import com.example.iti0302backend.mapper.OrderMapperImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrderDtoTest {

    @Spy
    private OrderMapper orderMapper = new OrderMapperImpl();

    @Test
    void getId_correctId() {
        Order order = new Order();
        order.setId(1);
        OrderDto dto = orderMapper.toDto(order);
        var result = dto.getId();
        assertEquals(1, result);
    }

    @Test
    void getUserId_correctUserId() {
        Order order = new Order();
        OrderDto dto = orderMapper.toDto(order);
        dto.setUserId(1);
        var result = dto.getUserId();
        assertEquals(1, result);
    }

    @Test
    void getPostId_correctPostId() {
        Order order = new Order();
        Post post = Post.builder().id(1).build();
        order.setPost(post);
        OrderDto dto = orderMapper.toDto(order);
        var result = dto.getPostId();
        assertEquals(1, result);
    }

    @Test
    void getDate_correctDate() {
        Order order = new Order();
        Date date = Date.from(Instant.now());
        order.setDate(date);
        OrderDto dto = orderMapper.toDto(order);
        var result = dto.getDate();
        assertEquals(date, result);
    }

    @Test
    void getImageId_correctImageId() {
        Order order = new Order();
        OrderDto dto = orderMapper.toDto(order);
        dto.setImageId(1);
        var result = dto.getImageId();
        assertEquals(1, result);
    }

    @Test
    void getEmail_correctEmail() {
        Order order = new Order();
        OrderDto dto = orderMapper.toDto(order);
        dto.setEmail("a@gmail.com");
        var result = dto.getEmail();
        assertEquals("a@gmail.com", result);
    }
}
