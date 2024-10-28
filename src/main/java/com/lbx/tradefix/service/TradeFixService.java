package com.lbx.tradefix.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lbx.tradefix.dao.TradeFixDao;
import com.lbx.tradefix.vo.FixDataVo;
import com.lbx.tradefix.vo.query.FixDataQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuY
 * @date 2024/10/25
 **/
@Service
public class TradeFixService {
    @Autowired
    private TradeFixDao tradeFixDao;

    @DS("fix")
    public List<FixDataVo> getTradeFixList(FixDataQuery map){
        return tradeFixDao.findByCondition(map);
    }

    @DS("fix")
    public int update(FixDataVo map){
        return tradeFixDao.update(map);
    }
}