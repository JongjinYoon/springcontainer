package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 *  Explicit(명시적) Configuration - XML Config
 *  
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/videosystem/VideoSystemConfig.xml"})//xml에선 파일의 위치이기 때문에 locations를 쓴 다 .
public class VideoSystemXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog(); // 콘솔 출력
	
	@Autowired
	Avengers dvd1;
	
	@Autowired
	@Qualifier("ironman")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")
	DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirector'sEdition")
	DigitalVideoDisc dvd7;
	
	@Autowired
	@Qualifier("avengersTriplePack")
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("avengersExpansionPack")
	DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("player1")
	private DVDPlayer player1;
	
	@Autowired
	@Qualifier("player2")
	private DVDPlayer player2;
	
	@Autowired
	@Qualifier("player3")
	private DVDPlayer player3;
	
	@Autowired
	@Qualifier("player4")
	private DVDPlayer player4;
	
	@Autowired
	@Qualifier("player5")
	private DVDPlayer player5;
	
	@Test
	public void testDVD1Null() {
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDVD3Null() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=Avengers Infinity War, studio=Marvel, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD4Null() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=Avengers Endgame, studio=Marvel, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));	
	}
	
	@Test
	public void testDVD5Null() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=Avengers Age Of Ultron, studio=Marvel, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	
	}
		
	@Test
	public void testDVD6Null() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Captain America, studio=Marvel, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD7Null() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director's Edition, studio=Marvel, actors=[경진, 바라기, 이지은씨]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD8Null() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack, studio=Marvel, actors=[경진바라기, 이지은씨, 응원합니다]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9Null() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=Marvel, actors=[경진바라기, 이지은씨, 응원합니다]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPackNull() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
	}
			
	@Test
	public void testPlayer1Null() {
		assertNotNull(player1);
	}
	
	@Test
	public void testPlayer2Null() {
		assertNotNull(player2);
	}
	
	@Test
	public void testPlayer3Null() {
		assertNotNull(player3);
	}
	
	@Test
	public void testPlayer4Null() {
		assertNotNull(player4);
	}
	
	@Test
	public void testPlayer5Null() {
		assertNotNull(player5);
	}
	
	@Test
	public void testPlay1() {
		player1.play();
		//assertEquals("Playing Movie Avengers studio Marvel", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
		assertEquals("Playing Movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("Playing Movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie Marvel's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie Marvel's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie Marvel's Captain America", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
