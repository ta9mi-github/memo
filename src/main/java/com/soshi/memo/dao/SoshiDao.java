package com.soshi.memo.dao;

import com.soshi.memo.dto.SoshiDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class SoshiDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public SoshiDto selectAll() throws DataAccessException {
        
        String sql = "select * from test";
 
        RowMapper<SoshiDto> rowMapper = new BeanPropertyRowMapper<SoshiDto>(SoshiDto.class);
        SoshiDto soshi = jdbcTemplate.queryForObject(sql, rowMapper);
 
        return soshi;
    }
}
