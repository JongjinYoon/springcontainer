package config.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import kr.co.itcen.springcontainer.videosystem.DVDPlayer;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration// VideoSystemJavaConfigTest에서 명시해줬지만 패키지명으로 경로가 바뀔수가 있기 떄문에 일단 써줌
@Import(DVDConfig.class) // Import여러개 가능 @Import({DVDConfig.class, , ,})
public class DVDPlayerConfig {
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {//DVDConfig에서 @Bean이 2개가 있다면 어떤걸 받아야 할지 몰라서
		// failed to load Application 에러가 뜸 (컨테이너가 생성이 되지 않았다는 에러임)
		return new DVDPlayer(dvd);
	}
}
