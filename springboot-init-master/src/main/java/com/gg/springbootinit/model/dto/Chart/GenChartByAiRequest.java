package com.gg.springbootinit.model.dto.Chart;

import java.io.Serializable;
import lombok.Data;

/**
 * 文件上传请求
 *
 */
@Data
public class GenChartByAiRequest implements Serializable {

    /**
     * 表名称
     */
    private String name;

    /**
     * 分析⽬标
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;

    private static final long serialVersionUID = 1L;
}