
public class E02StringMethod3 {

public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드3");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";

		/*
		11] lastIndexOf() : 사용법은 indexOf()와 동일하짐나 문자열의
			뒤에서부터 찾는것이 다른점이다.
		 */
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J")); 
		//앞쪽에 있는 a의 인덱스 : 12
		System.out.println("indexOf:"+ str1.indexOf("a")); 
		//뒷쪽에 있는 a의 인덱스 : 14
		System.out.println("lastIndexOf:"+ str1.lastIndexOf("a")); 
		
		/*
		12] replace : 특정 문자여을 찾아서 지정된 문자열로 변경한다.
			만약 찾는 문자열이 없다면 변경만 되지않을뿐 에러가 발생하진
			않는다.
		 */
		System.out.println("### 12 ###"); 
		System.out.println("J를 G로 변경하기");
		System.out.println(str1.replace("J", "G")); 
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java", "Korea"));

		/*
		13] split()  : 문자열을 국분자를 통해 분리해서 String타입의
			배열로 반환한다. 해당 구붅가ㅏ ㅇ벗는 경우에느 크기가 1인
			배열로 반환한다. 
		 */
		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678"; 
		//전화번호를 -(하이픈)으로 분리하여 큭기ㅏ 3인 배열로 반환한다.
		String[] phoneArr = phoneNumber.split("-");
		//배열의 크기만큼 반복하여 분리된 문자열을 출력한다. 
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}
		
		/* 구분자로 사용한 문자열이 없는 경우 문자열 전체가 통째로
		반환되어 배열의 크기는 1이된다. */
		phoneArr = phoneNumber.split("%");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}
		
		/*
		14] substring() : 시작인덱스와 마지막인덱스 사이의 문자열을
			잘라서 반환한다.
			방법1 : 인덱스를 하나만 사용 => 이경우 인덱스부터 문자열의
				끝까지 잘라낸다.
			방법2 : 시작인덱스, 종료인덱스를 사용 => 인덱스에 해당하는
				부분만 잘라서 반환한다.
		 */
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
	}
		
		



}
