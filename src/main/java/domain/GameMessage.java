package domain;

public class GameMessage {

    // enum으로 안내 문구 설정
    enum GuideText {
        GAME_START_MESSAGE("숫자 야구 게임을 시작합니다."),
        INPUT_NUMBER_MESSAGE("숫자를 입력해 주세요 : "),
        GAME_SUCCESS_MESSAGE("3개의 숫자를 모두 맞히셨습니다!\n게임 종료"),
        GAME_RESTART_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        private final String getGuideText;

        GuideText(String guideText) {
            getGuideText = guideText;
        }
    }

    private static String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static String INPUT_NUMBER_MESSAGE = "숫자를 입력해 주세요 : ";
    private static String GAME_SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다!\n게임 종료";
    private static String GAME_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public static void gameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void inputNumberMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE);
    }

    public static void gameSuccessMessage() {
        System.out.println(GAME_SUCCESS_MESSAGE);
    }

    public static void restartGameMessage() {
        System.out.println(GAME_RESTART_MESSAGE);
    }

}