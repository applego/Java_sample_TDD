package decode17;

public class FizzBuzz {

	public String convert(int num) {
		if( num % 3 ==0) {
			return "Fizz";
		}
		if( num % 5 == 0) {
			return "Buzz";
		}

//		return "1";// 仮実装（テストコードのテスト）
		return String.valueOf(num);
	}

}
