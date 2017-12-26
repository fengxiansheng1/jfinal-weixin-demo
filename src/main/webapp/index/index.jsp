<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE = edge" />
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>bbbbbbbb</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.css" />
		<script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container">
			<h2 class="page-header">用户注册</h2>
			<form class="form-horizontal">
				<div class="form-group">
					<label for="username" class="col-md-2 control-label">用户名：</label>
					<div class="col-md-10">
						<input type="text" class="form-control " id="username" placeholder="请输入你的名字">
					</div>
				</div>
				<div class="form-group">
					<label for="userpwd" class="col-md-2 control-label">密码：</label>
					<div class="col-md-10">
						<input type="password" class="form-control" id="userpwd" placeholder="请输入你的密码">
					</div>

				</div>
				<div class="form-group">
					<label for="user_img" class="col-md-2 control-label">上传图片：</label>
					<div class="col-md-10">
						<input type="file" id="user_img">
						<p class="help-block">上传图片的类型 .gif .pang .jpg</p>
					</div>

				</div>
				<div class="form-group">
					<label class="col-md-2 control-label">兴趣爱好：</label>
					<div class="col-md-10">
						<label class="checkbox-inline">
                       <input type="checkbox" name="aihao[]" value="画画"> 画画
                    </label>
						<label class="checkbox-inline">
                       <input type="checkbox" name="aihao[]" value="唱歌"> 唱歌
                    </label>
						<label class="checkbox-inline">
                       <input type="checkbox" name="aihao[]" value="跳舞"> 跳舞
                    </label>
						<label class="checkbox-inline">
                       <input type="checkbox" name="aihao[]" value="跑步"> 跑步
                    </label>
					</div>

				</div>
				<div class="form-group">
					<label class="col-md-2 control-label">学历：</label>
					<div class="col-md-10">
						<label class="radio-inline">
                       <input type="radio" name="xueli[]" value="小学"> 小学
                    </label>
						<label class="radio-inline">
                       <input type="radio" name="xueli[]" value="初中"> 初中
                    </label>
						<label class="radio-inline">
                       <input type="radio" name="xueli[]" value="高中"> 高中
                    </label>
						<label class="radio-inline">
                       <input type="radio" name="xueli[]" value="大学"> 大学
                    </label>
					</div>
				</div>
				<div class="form-group">
					<label for="jianli" class="col-md-2 control-label">个人信息：</label>
					<div class="col-md-10">
						<textarea class="form-control" id="jianli" role="5" placeholder="请输入您的详细信息"></textarea>
					</div>
					
				</div>
				<div class="col-md-10 col-md-offset-2">
					<button type="button" class="btn btn-danger btn-lg">提交表单</button>
				</div>
			</form>

		</div>
	</body>

</html>
<script src="<%=basePath%>js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>js/vconsole.min.js" type="text/javascript" charset="utf-8"></script>