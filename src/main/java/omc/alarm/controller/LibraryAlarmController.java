package omc.alarm.controller;

import omc.alarm.model.entity.Alarm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Контроллер для отображения библиотеки сигнализаций
 */
@RestController
@RequestMapping("библиотека")
public class LibraryAlarmController {

   List<Alarm>  getAlarm(){
        List<Alarm> alarmList = new ArrayList<>();
        return alarmList;
    }
}
