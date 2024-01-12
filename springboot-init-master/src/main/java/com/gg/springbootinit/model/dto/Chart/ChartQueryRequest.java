package com.gg.springbootinit.model.dto.Chart;

import com.gg.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ChartQueryRequest extends PageRequest implements Serializable {
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

    /**
     * 是否删除
     */
    private Integer isDelete;
    private static final long serialVersionUID = 1L;
}