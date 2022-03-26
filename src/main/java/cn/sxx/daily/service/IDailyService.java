package cn.sxx.daily.service;

import cn.sxx.daily.bean.Daily;

import java.time.LocalDate;

/**
 * @author song
 */
public interface IDailyService {
    /**
     * 保存日课
     *
     * @param daily
     */
    void save(Daily daily);

    /**
     * 查询日课
     *
     * @param date
     * @return
     */
    Daily findOne(LocalDate date);

}
