<%@ include file="../part/head.jspf" %>


<div class="center-box">
<img src="https://www.fpost.co.kr/board/data/editor/2007/bdef1639d74035b635d125bf620587c6_1594946849_7806.png" alt="" />
</div>

<div class="login-form-box">
<form action="doLogin" class="login-form" onsubmit="loginForm_submit(this); return false;" >
<input type="text" class="login-input-box" placeholder="PhoneNumber,name or User Email"/>
<input type="password" class="login-input-box" placeholder="User Password"/>
<input type="submit" class="submit" value="Go" />
</form>

<div class="join-box"><p>if you wanna Join ?</p> <div class="join-item">Join</div></div>

</div>


<%@ include file="../part/foot.jspf" %>