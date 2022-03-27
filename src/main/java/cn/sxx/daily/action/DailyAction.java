package cn.sxx.daily.action;

import cn.sxx.daily.bean.Daily;
import cn.sxx.daily.bean.Result;
import cn.sxx.daily.service.IDailyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author song
 */
@RestController
@RequestMapping("/api")
public class DailyAction {
    private final IDailyService dailyService;

    public DailyAction(IDailyService dailyService) {
        this.dailyService = dailyService;
    }

    @PostMapping("/day")
    public Result save(Daily daily) {
        dailyService.save(daily);
        return Result.success(null);
    }

    @GetMapping("/day")
    public Result save(String date) {
        Daily daily = dailyService.findOne(date);
        return Result.success(daily);
    }
}
