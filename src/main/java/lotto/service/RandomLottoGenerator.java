package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomLottoGenerator {
    public List<Integer> createRandomLottoNumber() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
