package top.aranlzh.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aranlzh.mybatis.po.Customer;
import top.aranlzh.mybatis.po.CustomerExample;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);
}