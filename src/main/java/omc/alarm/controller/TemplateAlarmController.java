package omc.alarm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Создает шаблон вывода информации о сигнализации:
 * Настраивает необходимые для вывода поля.
 * Настраивает частоту проверок.
 * Настраивает необходимый уровень строгости сигнализации.
 * Указывает необходимость отправки сообщения о срабатывании сигнализации на email
 * Срабатывает при нажатии кнопки "новый шаблон" в пользовательском интерфейсе
 */

@RestController
@RequestMapping("добавить шаблон")
public class TemplateAlarmController {
}
