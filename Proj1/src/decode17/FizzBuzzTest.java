package decode17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fizzbuzz;

	@BeforeEach
	public void 前準備() {
		// 前準備
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void _1を渡したら文字列1を返す() throws Exception {
		// 実行
		// 検証
		assertEquals("1", fizzbuzz.convert(1));
	}

	@Test
	public void _2を渡したら文字列2を返す() throws Exception {
		assertEquals("2", fizzbuzz.convert(2));
	}

	@Test
	public void _3を渡したら文字列Fizzを返す() throws Exception {
		assertEquals("Fizz", fizzbuzz.convert(3));
	}

	@Test
	public void _5を渡したら文字列Buzzを返す() throws Exception {
		assertEquals("Buzz", fizzbuzz.convert(5));
	}

}
