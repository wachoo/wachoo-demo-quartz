package com.wachoo.demo.quartz.dao.impl;

import static com.wachoo.demo.quartz.instants.DataSourceInsts.DATASOURCE_MARIADB_1;

import com.wachoo.demo.quartz.dao.IConfigDao;
import com.wachoo.demo.quartz.dao.mapper.quartz.IQuartzConfigMapper;
import com.wachoo.demo.quartz.entity.dbo.QuartzConfigDO;
import com.wachoo.demo.quartz.aspect.annotation.DataSources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @desc:
 * @author: wangchao3
 * @since: JDK1.8
 * @date: 2018/10/26 11:33
 */
@Repository(value = "QuartzConfigMybatisDaoImpl")
public class QuartzConfigMybatisDaoImpl implements IConfigDao {

  @Autowired
  IQuartzConfigMapper configMapper;

  @Override
  public Boolean insert(QuartzConfigDO quartzConfigDO) {
    configMapper.insert(quartzConfigDO);
    return true;
  }

  @Override
  public Boolean update(QuartzConfigDO quartzConfigDO) {
    configMapper.update(quartzConfigDO);
    return true;
  }

  @Override
  public Boolean delete(Long id) {
    configMapper.delete(id);
    return true;
  }

  @Override
  @DataSources(DATASOURCE_MARIADB_1)
  public QuartzConfigDO select(Long id) {
    return configMapper.select(id);
  }

  @Override
  public List<QuartzConfigDO> selectConfig(QuartzConfigDO config) {
    return configMapper.selectConfig(config);
  }

}
