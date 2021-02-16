# 중앙 HTA 2005기 - 2조(yogiyo) 파이널 프로젝트

## images, css, js, vue 등 정적 외부 파일을 부를 때 소스 접근 위치 설정

예) css 파일을 불러올 때  

	<link rel="stylesheet" href="/static/resource/css/{css 파일명}" />


예) javascript 파일을 불러올 때  
	
	<script type="text/javascript" href="/static/resource/javascript/{javascript 파일명} />

<br/>

## taglib(jstl)을 불러올 때  
  
예) /WEB-INF/views의 home.jsp에서 불러올 때  

	<%@ include file = "../common/taglib.jsp" %>

