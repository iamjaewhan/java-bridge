package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 * 제공된 InputView 클래스를 활용해 구현해야 한다.
 * InputView의 패키지는 변경할 수 있다.
 * InputView의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
 * 사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.
 */
public class InputView {

    private static final String bridgeSizeInputRegex = "^[0-9]+$";
    private static final String nextBridgeInputRegex = "^(U|D)$";
    private static final String whetherRetryInputRegex = "^(R|Q)$";
    private static final String readBridgeSizeMessage = "다리의 길이를 입력해주세요.";
    private static final String readMovingMessage = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String readwhetherRetryMessage = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";
    private static final int mininumBridgeLength = 3;
    private static final int maxinumBridgeLength = 20;
    
    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;

    private boolean isValidRange(int number) {
        if (number < mininumBridgeLength || number > maxinumBridgeLength)
            return false;
        return true;
    }

    private int getIntegerMatchWith(String regex) {
        String input = Console.readLine();

        if (!input.matches(regex)) throw new IllegalArgumentException();
        if (!isValidRange(Integer.valueOf(input))) throw new IllegalArgumentException();
        return Integer.valueOf(input);
    }

    private String getStringMatchWith(String regex) {
        String input = Console.readLine();
        if (!input.matches(regex)) throw new IllegalArgumentException();
        return input;
    }
}
