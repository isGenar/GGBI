package com.gg.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gg.springbootinit.model.entity.Chart;
import com.gg.springbootinit.service.ChartService;
import com.gg.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author huawei
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-01-12 20:46:27
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




