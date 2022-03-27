package cn.sxx.daily.service;

import cn.sxx.daily.bean.Daily;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DailyServiceImplTest {
    @Autowired
    private IDailyService dailyService;

    @Test
    public void saveTest() {
        Daily daily = new Daily();
        daily.setUid("sxx");
        daily.setRecordDate(LocalDate.now());

        daily.setDeepSquat(90);
        dailyService.save(daily);
    }


    @Test
    public void findOneTest() {
        Daily daily = dailyService.findOne("2022-03-26");
        System.out.println(daily);
    }

}
