package com.viniciusaugusto.santanderbackend.mapper;

import com.viniciusaugusto.santanderbackend.model.DTO.StockDTO;
import com.viniciusaugusto.santanderbackend.model.Stock;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock active) {
        StockDTO dto = new StockDTO();
        dto.setId(active.getId());
        dto.setName(active.getName());
        dto.setPrice(active.getPrice());
        dto.setVariation(active.getVariation());
        dto.setDate(active.getDate());
        return dto;
    }

    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }
}
