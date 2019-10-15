package config.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.BlankDisc;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration// VideoSystemJavaConfigTest에서 명시해줬지만 패키지명으로 경로가 바뀔수가 있기 떄문에 일단 써줌
public class DVDConfig {
	@Bean
	public Avengers avengers() {//public DigitalVideoDisc 대신 Avengers를 넣어도 무방하지만 @Bean은 빠지면 안됨
		return new Avengers();
	}
	
	@Bean("avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avengers Infinity War");
		blankDisc.setStudio("Marvel");
		blankDisc.setActors(Arrays.asList("로다주","크리스 에반스","경진 fans", "경진바라기", "정경진"));
		return blankDisc;
	}
}
