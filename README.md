# CreateLottoNumber

# H02 -  로또 번호 만들기
1부터 45사이의 임의의 숫자를 6개 만들어 로또 번호를 완성하라. 단, 6개의 번호 중에 중복되는 번호가 없도록 해야 한다. 출력한 후에 사용자에게 "Do you want to generate more lotto numbers? (Y/N) "를 물어보고 N을 입력할 때까지 계속해서 반복하라.

변수는 다음과 같이 사용하라.

int lotto[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트

int count; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)

String onemore; // 반복여부를 입력하는 문자 (Y/N)

int i; // 반복문을 위한 변수

실행 예시
```
The generated lotto numbers are 33 31 18 12 45 22 
Do you want to generate more lotto numbers? (Y/N) > Y
The generated lotto numbers are 15 30 33 10 22 19 
Do you want to generate more lotto numbers? (Y/N) > Y
The generated lotto numbers are 32 40 12 31 28 26 
Do you want to generate more lotto numbers? (Y/N) > N
```