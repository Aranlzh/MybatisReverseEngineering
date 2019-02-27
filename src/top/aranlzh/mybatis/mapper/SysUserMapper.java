package top.aranlzh.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.aranlzh.mybatis.po.SysUser;
import top.aranlzh.mybatis.po.SysUserExample;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);
}