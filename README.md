# spring-rice

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

[Maven依赖查询地址](https://mvnrepository.com/)

##  1，开发环境 
    Itellij2020.1 jdk8   
    
##  2，安装本地依赖
    方式1步骤：
    A-> 进入当前项目根目录
    B-> 键入命令
    mvn install:install-file -Dfile=spring-cloud-starter-openfeign-2.2.3.RELEASE.jar -DgroupId=org.springframework.cloud -DartifactId=spring-cloud-starter-openfeign -Dversion=2.2.3.RELEASE -Dpackaging=jar
    注释： -Dfile--jar包所在路径+jar包名称
          -DgroupId， -DartifactId，  -Dversion：三个参数，就是指明了存放maven仓库中的位置；
          -Dpackaging ：猜测就是指明文件类型；  