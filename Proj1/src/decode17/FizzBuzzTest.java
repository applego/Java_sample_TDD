package decode17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fizzbuzz;

	@Test
	public void _1を渡したら文字列1を返す() throws Exception {
		fizzbuzz = new FizzBuzz();
		// 実行
		// 検証
		assertEquals("1", fizzbuzz.convert(1));
	}

	@Test
	public void _2を渡したら文字列2を返す() throws Exception {
		// 前準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行
		// 検証
		assertEquals("2", fizzbuzz.convert(2));
	}

	@Test
	public void _3を渡したら文字列Fizzを返す() throws Exception {
		// 前準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行
		// 検証
		assertEquals("Fizz", fizzbuzz.convert(3));
	}

}
