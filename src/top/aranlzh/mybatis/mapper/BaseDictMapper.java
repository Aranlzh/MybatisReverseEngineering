package top.aranlzh.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aranlzh.mybatis.po.BaseDict;
import top.aranlzh.mybatis.po.BaseDictExample;

public interface BaseDictMapper {
    long countByExample(BaseDictExample example);

    int deleteByExample(BaseDictExample example);

    int insert(BaseDict record);

    int insertSelective(BaseDict record);

    List<BaseDict> selectByExample(BaseDictExample example);

    int updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    int updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);
}