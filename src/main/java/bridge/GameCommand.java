package bridge;

public enum GameCommand {

    RETRY("R"),
    QUIT("Q");

    private static final String errorMessage = "재시도 여부는 R 또는 Q로 입력해주세요.";

    private String command;

    GameCommand(String command) {
        this.command = command;
    }
}