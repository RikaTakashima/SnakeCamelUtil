package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void ����������啶����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertEquals(actual,expected);
	}
	@Test
	public void �啶�����珬������() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertEquals(actual,expected);
	}
	@Test
	public void �L�������P�[�X����X�l�[�N�P�[�X��() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertEquals(actual,expected);
	}
	@Test
	public void �X�l�[�N�P�[�X����L�������P�[�X��() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc_def_gh");
		assertEquals(actual,expected);
	}
}
