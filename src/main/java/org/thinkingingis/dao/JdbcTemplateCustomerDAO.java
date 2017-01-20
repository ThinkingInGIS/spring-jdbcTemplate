package org.thinkingingis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.thinkingingis.model.Customer;

public class JdbcTemplateCustomerDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public int CountRowNumber(){
		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from customer", Integer.class);
		return rowCount;
	}
	
	public Customer findCustomerById(int id){
		String sql = "select * from customer where cust_id = ?";
		Customer customer = this.jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Customer>(){
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();
				//customer.setId(rs.getInt(arg0));
				
				return null;
			}
			
		});
		return null;
	}

}
