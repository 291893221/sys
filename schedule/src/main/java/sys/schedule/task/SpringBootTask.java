package sys.schedule.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class SpringBootTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

	@Scheduled(cron = "0 */1 * * * ?")
	public void logCurrentTime() {
		log.info("SpringBootTask current time:{}", dateFormat.format(new Date()));
	}
}
