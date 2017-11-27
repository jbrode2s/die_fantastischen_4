import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

import org.junit.Before;


public class KassenautomatabelTest {
Parkschein p1,p2,p3;
	@Before
	public void setUp() throws Exception {
        Calendar calnow = new GregorianCalendar();
        calnow.set( 2017, Calendar.NOVEMBER, 24, 15, 30, 0 ); 
        
        //https://www.java-blog-buch.de/d-differenz-zweier-daten-jdk-11/
        
		p1=new Parkschein(); 
		p1.kennzeichen="SU JH 2345";
		p1.zuletztBezahlt=Null;
		p1.einfahrtInParkhaus="24-11-2017 14:00:00"
				
		p2=new Parkschein(); 
		p2.kennzeichen="SU JH 8978";
		p2.zuletztBezahlt=Null;
		p2.einfahrtInParkhaus="24-11-2017 14:00:00"
				
		p2=new Parkschein(); 
		p2.kennzeichen="SU JH 4645";
		p2.zuletztBezahlt=Null;
		p2.einfahrtInParkhaus="24-11-2017 14:00:00"
	}
/* Preisliiste
 * 0.5h=1€
 * 1h=2€
 * 8h+(Tageskarte) */
	@Test
	public void test() {
		fail("Noch nicht implementiert");
	}
	@Test
	public void test_p1_() {
		assertTrue(simple_example.isWellSorted(new String[] { "A", "B", "C", "D" }));
	}
}
