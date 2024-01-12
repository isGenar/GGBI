package com.gg.springbootinit.model.dto.Chart;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 */
@Data
public class ChartUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 创建⽤户 id
     */
    private Long userId;

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