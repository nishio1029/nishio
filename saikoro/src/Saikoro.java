
public class Saikoro {

	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("ようこそ、" + name + "さん");
		System.out.println("ルールを知っていますか?");
		System.out.println("知ってる：１\n"
				+ "知らない：２\n"
				+ "を、にゅうりょくしてください。");
		int help = new java.util.Scanner(System.in).nextInt();
		switch (help) {
		case 2://知らない場合
			System.out.println("このゲームは自分と相手がさいころを振り\n"
					+ "大きいか小さいか当てるゲームです");
		case 1://知ってる場合
			int zibunn = new java.util.Random().nextInt(6) + 1;
			int aite = new java.util.Random().nextInt(6) + 1;
			System.out.println("それではスタートです。\n"
					+ "あなたの目は" + zibunn + "です");
			System.out.println("予想してください。あなたの方が大きいと思ったら:1\n"
					+ "あなたの方が小さいと思ったら:2を押してください");
			int yosou = new java.util.Scanner(System.in).nextInt();
			System.out.println("相手の方は" + aite + "でした");
			if (zibunn > aite) {//勝ち場合
				switch (yosou) {
				case 1:
					System.out.println("あなたの勝ちです");
					break;
				case 2:
					System.out.println("あなたの負けです");
					break;
				default:
					System.out.println("入力異常、終了します");
				}
			} else if (zibunn < aite) {//負け場合
				switch (yosou) {
				case 1:
					System.out.println("あなたの負けです");
					break;
				case 2:
					System.out.println("あなたの勝ちです");
					break;
				default:
					System.out.println("入力異常、終了します");
				}//else if
			} else {//勝ち場合
				switch (yosou) {
				case 1:
				case 2:
					System.out.println("引き分けです");
					break;
				default:
					System.out.println("入力異常、終了します");
				}//switch else
			} //else
		}//switch help
	}
}