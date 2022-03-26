package cn.sxx.daily.dao;

import cn.sxx.daily.bean.Daily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * @author song
 */
@Repository
public interface DailyRepository extends JpaRepository<Daily, String> {
    /**
     * 查询
     *
     * @param recordDate
     * @return
     */
    Daily findFirstByRecordDate(LocalDate recordDate);
}
