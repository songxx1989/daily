package cn.sxx.daily.bean;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author song
 */
@Data
@Entity
@Table(name = "d_daily")
public class Daily {
    @Id

    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid")
    private String id;
    @Column(name = "deep_squat")
    private Integer deepSquat = 0;
    @Column(name = "push_up")
    private Integer pushUp = 0;
    @Column(name = "ab_roller")
    private Integer abRoller = 0;
    @Column(name = "bicycle")
    private Integer bicycle = 0;
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "get_up_time")
    private LocalTime getUpTime;
    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "sleep_time")
    private LocalTime sleepTime;
    @Column(name = "uid")
    private String uid = "sxx";
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "record_date")
    private LocalDate recordDate;
}
