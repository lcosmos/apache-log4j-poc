建议安装JDK 1.8u121以下的版本，如JDK 1.8u121以上版本，请参考：https://www.oracle.com/java/technologies/javase/8u121-relnotes.html

1.编辑 src/mian/java/Exploit.java，写入需要执行的命令；

2.在 src/mian/java目录下执行 `javac Exploit.java`

3.将2得到的 Exploit.class 放入任意服务器中（能够提供下载地址就行），本POC中用到了nginx

4.修改 src/mian/java/LDAPRefServer.java 中的 `EXPLOIT_CLASS_URL` 为3中得到的地址

5.安装所需maven依赖

6.运行 LDAPRefServer

7.执行Log4J，即可执行指定代码

修复方案：
1.修改jvm参数 -Dlog4j2.formatMsgNoLookups=true
2.修改配置 在应用classpath下添加log4j2.component.properties配置文件，log4j2.formatMsgNoLookups=true
