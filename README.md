# ๐ง  MEMENTO       ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
```
This is Memento's App Backend  
(Memento's ML Backend : https://github.com/Memento-men4/MEMENTO-Backend-for-Ai)
```
> About Memento > https://github.com/Memento-men4  
> Watch Demo video > https://www.youtube.com/watch?v=7lxRL_99KnQ

### ๐ Architecture Design
<img width="489" alt="แแขแจแแฆแซแแณแแกแแตแแฆแจแแฅ" src="https://user-images.githubusercontent.com/91522259/207849988-2bc60dcf-9f8e-4987-8724-c1ddae513d67.png">  

### ๐ App Backend
Client 1 : React Native App
```
 ๊ธฐ๋ฅ 1 : ์ฌ์ฉ์์ Recording ๋ฐ์ดํฐ(์๊ฐ, ์ฅ์, ๋น์๋ด์ฉ)๋ฅผ DB์ ์ ์ฅํ๊ณ  ์กฐํํ๋ค.
 ๊ธฐ๋ฅ 2 : ์ ์ฅ๋ Recording ๋ฐ์ดํฐ๋ฅผ ํ์ฉํด ML Backend๋ก Daily Quiz ์์ฑ ์์ฒญ์ ๋ณด๋ธ๋ค. ์๋ต๋ฐ์ Daily Quiz๋ฅผ DB์ ์ ์ฅํ๋ค.
 ๊ธฐ๋ฅ 3 : ์ฌ์ฉ์๊ฐ ์ ํํ ๋ ์ง์ ํด๋นํ๋ Recording ๋ฐ์ดํฐ๋ฅผ ๋ฐํํ๋ค.
 ๊ทธ ์ธ : ํ์ ์์ฑ, ๊ฒ์๊ธฐ๋ก ์์ฑ ๋ฐ ์กฐํ, ๊ฐ์  ์์ฑ ๋ฐ ์กฐํ ๋ฑ
```
Client 2 : AI speaker NUGU
```
๊ธฐ๋ฅ : NUGU์์ ํต์ ์ ์งํํ๋ค. NUGU์๊ฒ ํด๋น ๋ ์ง์ Daily Quiz ๋ฐ์ดํฐ๋ฅผ ์ ์กํ๋ค.
```

### ๐ Api Documentation
https://mixolydian-bird-90f.notion.site/16d6b37979ca46029b6f70a95378af6e?v=30cc5aa83b01428b8a2dce91c4e82654  

### ๐ Tech Blog
https://velog.io/@hanueleee/series/HYUSE  

### ๐  Stacks

- ์ฌ์ฉ ๊ธฐ์  : Spring, Spring Boot, JPA
- ๋ฐฐํฌ : AWS EC2, AWS RDS(MySQL)
