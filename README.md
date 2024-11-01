# java-lotto-precourse

### 로또 번호를 발행한다

- [ ]  로또 구입 금액을 입력받는다
    - 1000원 단위로 입력받는다.
    - 1000으로 나누어 떨어지지 않는 경우 예외처리한다.
- [ ]  당첨 번호를 입력받는다.
    - 숫자 범위는 1~45
    - 번호는 쉼표(,)를 기준으로 구분한다.
    - 당첨 번호 추첨 시 중복되지 않는 숫자 6개를 입력받는다.
- [ ]  보너스 번호를 입력받는다.
    - 보너스 번호 1개를 입력받는다
    - 당첨 번호와 중복되지 않게 한다.
- [ ]  로또 구입 금액만큼 구입 금액에 해당하는 만큼 로또를 발행한다.
    - 1 ~ 45까지 중복되지 않는 숫자를 발행한다.
    - 로또 번호는 오름차순으로 정렬하여 보여준다.

```java
8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]
```

### 당첨 번호와 발행 번호를 비교한다.

- 1등: 6개 번호 일치 / 2,000,000,000원
- 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
- 3등: 5개 번호 일치 / 1,500,000원
- 4등: 4개 번호 일치 / 50,000원
- 5등: 3개 번호 일치 / 5,000원

- [ ]  당첨 내역을 계산해서 출력한다.

```java
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
```

- [ ]  수익률을 계산하고 출력한다.
    - 수익률은 소수점둘째 자리에서 반올림한다.

```java
총 수익률은 62.5%입니다.
```

- [ ]  사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

```java
[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.
```

- [ ]  `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.