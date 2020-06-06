# 常见问题
1. 依赖导入错误
    - <a href="#1">jar包存在但引入class报错</a>

##### <a name="1">Jar包存在但引入class报错</a>
    1-查看idea/Maven项目配置是否正确,不正确则修改
    2-查看项目面板，找到对应的module下的dependency,查看所需要的jar包是否存在以及是否报错，
      如果报错，删除
    3-降低jar包版本，删除iml 以及idea等临时文件
    4-closeProject后重新导入项目
    5-将项目加入mvn管理
    6-重新reImport
