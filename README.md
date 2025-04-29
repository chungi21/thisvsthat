# 1st Toy Team Project - 이거저거(This VS That)
> 이거저거 (This VS That) 는 사용자들이 다양한 고민을 쉽고 재미있게 해결할 수 있도록 돕는, 올인(All-in) 또는 올아웃(All-out) 방식의 투표 플랫폼입니다.<br>
> 게시판 CRUD 기능을 기반으로 한 첫 번째 팀 프로젝트로, Spring Boot, JPA, JWT를 활용하여 개발하였고, 무한스크롤, JWT 기반 사용자 인증, GitHub 협업을 통해 팀원 간의 효율적인 개발 환경을 구축하였습니다.<br>
> 기획자나 디자이너 없이 전원 개발자 구성으로 진행되었지만, 기획부터 디자인까지 팀원들이 함께 협업하며 전 과정을 직접 주도적으로 완성해낸 프로젝트입니다.<br>
![Image](https://github.com/user-attachments/assets/7e253021-92cf-4317-908f-1db8f72c046b)

## 목차
* [프로젝트 개요](#프로젝트-개요)
* [사용 기술](#사용-기술)
  * [백엔드](#백엔드)
  * [프론트엔드](#프론트엔드)
* [설계](#구조-설계)
  * [DB 설계](#DB-설계)
  * [API 설계](#API-설계)
* [개발내용](#개발내용)
* [실행화면](#실행화면)
* [후기](#후기)

## 프로젝트 개요
* 프로젝트 명 : 이거저거(This VS That)
* 개발 인원 : 6 명
* 개발 기간 : 2025.02.12 ~ 2024.03.12
* 주요 기능 :
  * 사용자 관리
    * 네이버, 카카오, 구글을 활용한 SNS 로그인 기능 구현
    * JWT를 통한 사용자 인증 및 권한 부여 시스템 구축
  * 투표 게시판
    * CRUD 기반의 게시판 기능 구현
    * 웹소켓을 활용한 실시간 채팅 기능
    * 게시글 목록은 무한 스크롤 방식으로 구현하여 사용자 경험 향상
  * 마이페이지
    * 사용자가 투표한 글, 작성한 글, 채팅 참여 중인 게시물을 확인 가능
    * 투표 게시판의 조회 기능을 재활용하여 효율적으로 구성
  * 관리자 페이지
    * 금지 키워드 관리, 신고된 글 검토 및 조치, 회원 차단 기능 제공
    * 플랫폼 운영을 위한 필수 관리 도구 구현
    
## 사용 기술
### 백엔드
* 주요 프레임워크 / 라이브러리
  * JAVA17
  * Springboot 3.3.5
  * JPA(Spring Data JPA)
  * Spring Security
  * OAuth 2.0
  * JWT
 
* Build Tool
  * Gradle
 
* DataBase
  * AWS RDS(MySQL)

### 프론트엔드
* HTML/CSS
* JavaScript
* Thymeleaf

## 구조 설계
### DB 설계
* 사용자 테이블(테이블 명 : USERS) <br>
![Image](https://github.com/user-attachments/assets/2053f25a-7119-41c4-84a1-2a18f7c6f819)<br>
* 게시물 테이블(테이블 명 : POSTS) <br>
![Image](https://github.com/user-attachments/assets/fb2e6875-bbcb-4c38-a8e9-6abc73e72da3)<br>
* 투표 테이블(테이블 명 : VOTES)<br>
![Image](https://github.com/user-attachments/assets/3361a89d-d4cc-4ac8-a21f-5aefc7e47849)<br>
* 채팅방 테이블(테이블 명 : CHAT_ROOMS)<br>
![Image](https://github.com/user-attachments/assets/9a541f39-5248-4e6a-85be-b7ebb1a565ee)<br>
* 채팅 메세지 테이블(테이블 명 : CHAT_LOGS)<br>
![Image](https://github.com/user-attachments/assets/922d266c-7ef9-4bbe-ad38-1ce5b37fb830)<br>
* 스팸 테이블(테이블 명 : SPAM_FILTERS)<br>
![Image](https://github.com/user-attachments/assets/6b9c3766-5b8c-4d60-a98e-4953af006a4e)<br>
* 신고 테이블(테이블 명 : REPORTS)<br>
![Image](https://github.com/user-attachments/assets/2b801814-1d33-4332-83f2-127ee4a6f56d)<br>
* 이미지 테이블(IMGAGES)<br>
![Image](https://github.com/user-attachments/assets/837dc93c-ab23-4a52-bd22-a70353823cf9)<br>

### API 설계
* 로그인 & 회원가입<br>
![Image](https://github.com/user-attachments/assets/c83553f8-535f-4b46-b3fe-4d756dd66e54)<br>
* 메인 페이지(투표 게시물 목록)<br>
![Image](https://github.com/user-attachments/assets/028dc67e-b622-404e-9741-792f8018e3df)<br>
* 투표 게시판(crud) <br>
![Image](https://github.com/user-attachments/assets/39152f92-1f10-4a72-8f23-cacf3caad87c)<br>
* 게시물 투표 & 신고<br>
![Image](https://github.com/user-attachments/assets/065bebde-d2f0-48ca-8493-cbc28436ad7e)<br>
* 실시간 채팅<br>
![Image](https://github.com/user-attachments/assets/124a2bf3-41e3-4a40-96a5-bfd0586702d1)<br>
* 관리자 페이지 - 스팸 필터 관리 <br>
![Image](https://github.com/user-attachments/assets/7ea00e8c-87ee-4a5f-953b-333f32cf1494)<br>
* 관리자 페이지 - 신고된 회원 관리 <br>
![Image](https://github.com/user-attachments/assets/b640eeb5-42be-4353-aa79-a0aa126f5f98)<br>
* 관리자 페이지 -  신고된 글 관리 <br>
![Image](https://github.com/user-attachments/assets/a9e08ada-5f9b-4699-a055-ba931d3fa577)<br>
* 마이 페이지 <br>
![Image](https://github.com/user-attachments/assets/d448b052-6d05-453a-b913-3e64a5929363)<br>

## 개발내용
* Spring Security 회원가입 로그인
* OAuth 2.0 소셜 로그인(구글, 네이버, 카카오)
* JWT
* 게시판 CRUD
* 게시판 목록 무한 스크롤
* 게시판 파일 업로드
* Entity 연관관계 설정
* 게시판 검색처리 구현(JPA, 동적쿼리)
* 웹소켓을 이용한 채팅기

## 실행화면
<details>
<summary>메인페이지(게시판 목록)</summary>
  <br>
  <strong>메인 페이지 </strong>
  <ul>
    <li> 게시글 목록을 출력합니다.</li>
    <li> 카테고리(전체, 고민, 토론, 자유), 정렬 기준(최신순, 인기순), 투표상태(전체, 진행, 종료), 검색어(제목, 해시태그, 내용)에 따라 검색 할 수 있습니다. </li>
    <li> 무한 스크롤 방식으로 게시물이 더 있다면 화면이 맨 밑에 닿으면 추가 게시물을 출력합니다.</li>
  </ul>
 <img src="https://github.com/user-attachments/assets/7e253021-92cf-4317-908f-1db8f72c046b" alt=""> <br>
</details>

<details>
<summary>게시판 관련 화면</summary>
  <br>
  <strong>1. 글 쓰기</strong>
  <ul>
    <li>로그인한 회원만 글 쓰기가 가능합니다.</li>
    <li>이미지 선택 부분에 이미지를 첨부할 수 있으며 이미지를 첨부하지 않을 경우 기본 이미지로 상세페이지, 목록에서 보여지게 됩니다.</li>
    <li>내용에 # 을 붙인 내용은 해시태그로 저장됩니다.</li>
    <li>글 작성이 완료되면 목록 페이지로 이동합니다. </li>
  </ul>
 <img src="https://github.com/user-attachments/assets/ca2bfa38-989d-491c-ab56-8111bb9b8d75" alt="">
  <br>

  <br>
  <strong>2. 글 상세페이지</strong>
  <ul>
    <li>글 작성자에게만 ‘수정’, ‘삭제’ 버튼이 보입니다.</li>
    <li>‘투표하기’, ‘채팅’, ‘신고’ 는 로그인 회원만 가능하며, 로그인하지 않은 회원이 눌렀을 경우 로그인 페이지로 넘어갑니다.</li>
    <li>글 작성시 #를 붙인 글자는 초록색으로 보이며 해시태그가 붙은 글자를 누르면 해당 글자가 내용이 있는 목록들을 보여줍니다.</li>
  </ul>
  <img src="https://github.com/user-attachments/assets/86e63c70-bdf0-4338-a386-0dfb40ec3eed" alt="">
  <br>

  <br>
  <strong>3. 글 수정</strong>
  <ul>
    <li>글 작성자만 수정이 가능하며, 투표자가 있을 경우에는 수정이 불가합니다. </li>
    <li>수정 완료가 되면 상세페이지로 돌아갑니다.</li>
  </ul>
  <img src="https://github.com/user-attachments/assets/0e2ee8d3-fbea-4c83-8525-14a6c0452eb4" alt="">
  <br>

  <br>
  <strong>4. 글 삭제</strong>
  <ul>
    <li>글 작성자만 삭제가 가능하며, 투표자가 있을 경우에는 삭제가 불가합니다. </li>
    <li>삭제가 완료되면 목록(메인 페이지)로 이동합니다.</li>
  </ul>
  <img src="https://github.com/user-attachments/assets/c9230532-b075-4c17-ad96-1ecae865a32d" alt="">
  <br>
  
</details>

<details>
<summary>사용자(회원가입, 로그인) 화면</summary>
  <br>
  <strong>회원가입 및 로그인</strong>
  <ul>
    <li>일반 사이트 회원가입은 없고 소셜 로그인 네이버, 카카오, 구글 로그인만 가능합니다.</li>
    <li>소셜가입 시 추가 정보를 받는 페이지로 넘어갑니다.</li>
  </ul>
 <img src="https://github.com/user-attachments/assets/8699a36d-d4d0-4452-b5a8-0a7e92d12a6b" alt="">
    <br>
   <hr>
 <img src="https://github.com/user-attachments/assets/9eba51a9-414e-4842-befc-afec6bcbf633" alt="">
  <br>
  <hr>
 <img src="https://github.com/user-attachments/assets/3de15afa-6a55-4188-8df3-043b481a63f7" alt="">
  <br>
  <hr>
 <img src="https://github.com/user-attachments/assets/6f3abf02-611e-4d2c-91ff-c4b8dc9acad1" alt="">
  <br>
 <br>
 
</details>

<details>
<summary>마이페이지 관련 화면</summary>
  <br>
  <strong>마이 페이지</strong>
  <ul>
    <li>정보(닉네임) 변경이 가능합니다.</li>
    <li>참여했던 게시활동(투표한 글, 작성한 글, 참여했던 채팅방)을 확인 가능합니다. </li>
  </ul>
 <img src="https://github.com/user-attachments/assets/0cb9ede8-d546-42af-aa39-c16df65e719c" alt="">
  <br>
</details>

<details>
<summary>관리자 관련 화면</summary>
  <br>
  <strong>관리자 화면</strong>
  <ul>
    <li>금지 키워드, 회원 관리, 신고 글 관리를 합니다.</li>
  </ul>
 <img src="https://github.com/user-attachments/assets/f17ca9db-fd39-4ae5-8bfd-5539bbf17414" alt="">
  <br>
</details>

<details>
<summary>채팅 관련 화면</summary>
  <br>
  <strong>1. 채팅 화면</strong>
  <ul>
    <li>게시글 상세페이지에서 오픈채팅방에 입장가능합니다. </li>
    <li>입장한 채팅방 목록들은 마이페이지에서 확인가능합니다.</li>
  </ul>
 <img src="https://github.com/user-attachments/assets/3154c076-676f-4550-b842-7969f2c700b0" alt="">
  <br><hr>
<img src="https://github.com/user-attachments/assets/28d72336-2852-4ef3-8a7e-1a1d7dca1e2f" alt="">
 
</details>



## 후기
* 이번 프로젝트는 처음 진행한 팀 프로젝트로, 기획자나 디자이너 없이 개발을 배우고 있는 팀원들끼리 직접 기획과 디자인을 맡아 진행하였습니다.
* Notion과 Figma 등을 활용해 협업하고 기획을 시각화하려고 노력했으며, 팀 내 규칙도 세우며 체계적으로 진행하고자 했지만,
실제 개발 과정에서는 일부 규칙이 잘 적용되지 않아 수정과 조율이 반복적으로 필요했습니다.
* 여러 명이 함께 개발하다 보니, 기획한 내용이 실제로 구현된 부분과 어떻게 다른지 확인할 수 있었고,
서로의 코드 스타일을 비교해보며 다양한 접근 방식을 배울 수 있었습니다.
* 혼자 개발하는 것과 달리, 팀 프로젝트에서는 GitHub를 활용한 협업 방식, 예를 들어 브랜치 전략, 코드 병합, 작업 분담 등에 대해 배우고 경험할 수 있었습니다.
* 여러 명이 하나의 결과물을 향해 나아가는 협업의 중요성과 실전 감각을 익힐 수 있었던 값진 경험이었습니다.
