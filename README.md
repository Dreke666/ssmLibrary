# 图书馆管理系统

### 概述
基于Spring + Spring MVC + MyBatis的图书馆管理系统，使用Maven进行包管理。
主要功能包括：图书查询、图书管理、图书编辑、读者管理、图书的借阅与归还以及借还日志记录等。

### 环境配置
#### 开发环境：Windows 10，IntelliJ IDEA 2021.3
#### 运行配置
1. 首先安装Mysql8.0，设置用户名为root，密码为123456，并保证其在运行状态，并执行library.sql文件导入数据。
2. 然后再配置Maven到环境变量中，在源代码目录下运行
```sh
# mvn jetty:run
```
3. 使用浏览器访问http://localhost:8080即可进入系统。

### 概念设计
用户分为两类：读者、图书馆管理员。图书馆管理员可以修改读者信息，修改书目信息，查看所有借还日志等；读者仅可以修改个人信息、借阅或归还书籍和查看自己的借还日志。
<img src="./preview/1.png" style="width: 50%"><img src="./preview/2.png" style="width: 50%;float: right">

#### 数据库E-R图
<img src="./preview/3.png">

### 功能展示
#### 1.	首页登陆
管理者账号：123456/123456
读者账号：10000/123456
<img src="./preview/5.png">

#### 2.	管理员系统
用登陆进入
##### 2.1 图书管理
<img src="./preview/6.png">

##### 2.2 图书详情
<img src="./preview/7.png">

##### 2.3 读者管理
<img src="./preview/8.png">

##### 2.4 借还管理
<img src="./preview/9.png">

#### 3.	读者系统
##### 3.1 查看全部图书
<img src="./preview/10.png">

##### 3.2 个人信息查看，可以修个个人信息
<img src="./preview/11.png">

##### 3.3 个人借阅情况查看
<img src="./preview/12.png">


