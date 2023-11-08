package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개만 가능합니다.");
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
// TODO: 추가 기능 구현

    @Override
    public String toString() {
        return numbers.toString();
    }
}
