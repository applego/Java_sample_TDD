package decode17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void _1を渡したら文字列1を返す() throws Exception {
		// 前準備
		FizzBuzz fizzbuzz = new FizzBuzz();
		// 実行
		// 検証
		assertEquals("1", fizzbuzz.convert(1));
	}

}
