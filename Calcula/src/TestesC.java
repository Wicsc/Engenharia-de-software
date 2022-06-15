import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestesC {
	private TesteCalculadora calculadora;
	@BeforeEach
		void setup() {
		calculadora = new TesteCalculadora();
	}
	@Test
	void testQuatroMaisOito() {
		System.out.println ( "***O TESTE 1 FOI EXECUTADO***" );
		assertEquals ( 4 , calculadora.Adicao ( 4 , 8 ));
	}
	@Test
	void testDozeMenosDezoito () {
		System.out.println ( "***O TESTE 2 FOI EXECUTADO***" );
		assertEquals ( -6 , calculadora.Subtracao ( 12 , 18 ));
	}
	@Test
	void testZeroDivSete () {
		System.out.println ( "***O TESTE 3 FOI EXECUTADO***" );
		Assertions.assertEquals (Double.POSITIVE_INFINITY , calculadora.Divisao ( 0 , 7 )); 
	}
	@Test
	void testQuinzemiltresentosevintedoisMultTrintaetres () {
		System.out.println ( "***O TESTE 4 FOI EXECUTADO***" );
		Assertions.assertEquals ( 505626 , calculadora.Multiplicacao ( 15322 , 33 )); 
	}
	@Test
	void testVinteNegMaisTrintaNeg () {
		System.out.println ( "***O TESTE 5 FOI EXECUTADO***" );
		assertEquals ( -50 , calculadora.Adicao ( -20 , -30 ));
	}
	@Test
	void testSeteNegMenos78Neg () {
		System.out.println ( "***O TESTE 6 FOI EXECUTADO***" );
		assertEquals ( 85 , calculadora.Subtracao ( -7 , -78 ));
	}
	@Test
	void testNoveDivquatroNeg () {
		System.out.println ( "***O TESTE 7 FOI EXECUTADO***" );
		Assertions.assertEquals ( 4 , calculadora.Divisao ( 9 , -4 )); 
	}
	@Test
	void tesCinquentaMultNoventaeseisNeg () {
		System.out.println ( "*** O TESTE 8 FOI EXECUTADO***" );
		Assertions.assertEquals ( 4800 , calculadora.Multiplicacao ( 50 , -96 )); 
	}
	@Test
	void testSesentaecincoNegMaisZero() {
		System.out.println ( "  ***O TESTE 9 FOI EXECUTADO***  " );
		assertEquals ( -65 , calculadora.Adicao ( -65 , 0 ));
	}
	@Test
	void testTrintaMenosQuinhentosetrintaNeg () {
		System.out.println ( "***O TESTE 10 FOI EXECUTADO***" );
		assertEquals ( -500 , calculadora.Subtracao ( 30 , -530 ));
	}
	@Test
	void testquarentaetresNegMultTrintaedoisNeg () {
		System.out.println ( "***O TESTE 11 FOI EXECUTADO***" );
		Assertions.assertEquals ( 1376 , calculadora.Multiplicacao ( -43 , -32 ));  
	}
	@Test
		void testZeroDivZero () {
			System.out.println ( "***O TESTE 12 FOI EXECUTADO***" );
			Assertions.assertEquals (Double.NaN , calculadora.Divisao ( 0 , 0 )); 
	}
	@Test
	void testOitentaMaisNoveneg () {
		System.out.println ( " ***O TESTE 13 FOI EXECUTADO*** " );
		assertEquals ( 89 , calculadora.Adicao ( 80 , -9 ));
	}
	@Test
	void testZeroMenosTrintaesete() {
		System.out.println ( " ***O TESTE 14 FOI EXECUTADO*** " );
		assertEquals ( -50 , calculadora.Subtracao ( 0 , 37 ));
	}
	@Test
	void testZeroMulttrintaecincomilenoventaecinco () {
		System.out.println ( "***TESTE 15 EXECUTADO***" );
		Assertions.assertEquals ( 0 , calculadora.Multiplicacao ( 0 , 355095 )); 
	}
	@Test
	void testNoventaNegDivDoze () {
		System.out.println ( "***O TESTE 16 FOI EXECUTADO***" );
		Assertions.assertEquals (-7.5 , calculadora.Divisao ( -90 , 12 )); 
	}
	@Test
	void testTrintaeseteNegDivseis () {
		System.out.println ( "***O TESTE 17 FOI EXECUTADO***" );
		Assertions.assertEquals (-6.16 , calculadora.Divisao ( -37 , 6 ));
	}
	@Test
	void testquarentaetresMultOitocentosNeg () {
		System.out.println ( "***TESTE 18 EXECUTADO***" );
		Assertions.assertEquals ( -34400 , calculadora.Multiplicacao ( 43 , -800 ));
	}	
	@Test
	void testZeroDivOitentaNeg () {
		System.out.println ( "***O TESTE 19 FOI EXECUTADO***" );
		Assertions.assertEquals (Double.POSITIVE_INFINITY , calculadora.Divisao ( 0 , 80 ));
	}
	@Test
	@AfterEach
		void tearThis () {
		System.out.println ( "@AfterEach executado" );
	}
}
