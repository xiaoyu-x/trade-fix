package com.lbx.tradefix.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author LiuY
 * @date 2024/10/25
 **/
@Data
public class SAPInfo {
    private Long id;
    private String pkid;
    private String deptid;
    private String goodsid;
    private Date billdate;
    private Date dateupload;
    private String pbseqid;
    private String posbillno;
    private Double total;
    private Integer fgtyp;
    private Integer billtypeid;
    private Long line;
}
