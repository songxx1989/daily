package cn.sxx.daily.service.impl;

import cn.sxx.daily.bean.Daily;
import cn.sxx.daily.dao.DailyRepository;
import cn.sxx.daily.service.IDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author song
 */
@Service
public class DailyServiceImpl implements IDailyService {
    @Autowired
    private DailyRepository dailyRepository;

    /**
     * 保存日课
     *
     * @param daily
     */
    @Override
    public void save(Daily daily) {
        dailyRepository.save(daily);
    }

    /**
     * 查询日课
     *
     * @param date
     * @return
     */
    @Override
    public Daily findOne(String date) {
        LocalDate recordDate = LocalDate.parse(date);
        Daily daily = dailyRepository.findFirstByRecordDate(recordDate);
        if (daily == null) {
            daily = new Daily();
            daily.setRecordDate(recordDate);
        }
        return daily;
    }
}
