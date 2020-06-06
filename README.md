# spring-rice

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

[Maven依赖查询地址](https://mvnrepository.com/)

[常见编译问题](https://github.com/chengfengpiaopiao/spring-rice/build-question.md)

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
 ##  3，父子pom引入
    以父pom.xml的dependencyManagement为基准，内部依赖控制子pom.xml的版本信息（子pom中的依赖不需要设置版本）
    外部依赖为所有子pom共享