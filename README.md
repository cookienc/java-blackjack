# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰
- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

# 기능요구사항

## Model
- [x] 덱을 생성할 때 겹치지 않는 카드 52장을 가지고 있어야 한다.
- [x] 랜덤으로 카드를 가져온다.
- [x] A는 1또는 11로 계산할 수 있다.
  - [x] A를 11로 취급했는데, 새 카드를 뽑아서 21이 넘으면 A를 1로 취급한다.
- [x] King, Queen, Jack은 각각 10으로 계산한다.
- [x] 결과가 플레이어의 카드를 가지고 있어야 한다.

## View
### IN
- [x] 게임에 참여하는 플레이어의 이름을 입력받는다. 
- [x] 첫번째 턴에는 플레이어에게 카드 두 개를 나눠준다.
  - [x] 플레이가 원하면 카드를 나눠준다.

### OUT
- [x] 처음 나눠준 카드의 결과를 보여준다.
- [x] 중간 게임 결과를 출력한다.
- [ ] 최종 게임 결과를 출력한다.
  - [x] 최종 카드 결과와 점수를 반환한다
  - [ ] 승패를 반환한다.

## Controller
- [x] 딜러는 처음에 받은 2장의 합계가 16이하이면 1장의 카드를 추가로 받아야한다.
  - [x] 17 이상이면 추가로 받을 수 없다.
