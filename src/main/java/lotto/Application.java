package lotto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Input input = new Input(new InputValidator());
        Integer amount = input.getAmountWithMessage();
        Lotto winNumberLotto = input.getWinNumberLotto();
        WinLotto winLotto = input.getBonusNumber(winNumberLotto);

        LottoService lottoService = new LottoService(new LottoGenerator(new LottoStrategyRandom()));
        Lottos lottos = lottoService.createLottos(amount);

        List<Rank> ranks = lottos.compareWithWinLotto(winLotto);
    }
}
