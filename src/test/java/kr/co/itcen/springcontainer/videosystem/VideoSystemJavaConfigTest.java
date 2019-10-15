package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.DVDPlayerConfig;

/*
 *  Explicit(명시적) Configuration - Java Config
 *  @Bean
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DVDPlayerConfig.class })//패키지이름을 주면 @Configuration이 필요하지만 지금의 경우엔 클래스명을 명시했기 떄문에 필요가 없음 
// @ContextConfiguration에서 applicationContext생성 ->
// DVDPlayer 생성 -> DigitalVideoDisc타입의 Avengers 생성후 DVDPlayer로 DI -> testPlayerNull로 DI
public class VideoSystemJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog(); // 콘솔 출력
		
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
		
	@Test
	public void testPlay() {
		player.play();
		//assertEquals("Playing Movie Avengers studio Marvel", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
		assertEquals("Playing Movie Marvel's Avengers Infinity War", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
