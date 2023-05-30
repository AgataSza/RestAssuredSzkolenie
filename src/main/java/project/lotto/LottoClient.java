package project.lotto;

import io.restassured.response.ValidatableResponse;
import project.Requests;

public class LottoClient extends Requests {

    public ValidatableResponse ostatniWynik(GameType gameType){
        return get("https://www.lotto.pl/api/lotteries/draw-results/last-results-per-game?gameType=" + gameType.getType());
    }

}
