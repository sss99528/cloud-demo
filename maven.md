### maven搭建springcloud pom 工程步骤
1. 修改打包方式 
    packing pom
2. dependencyManagement 管理依赖
    这样子节点再倒入相同依赖时，会自动去父节点找相同版本，以此保证版本相同
3. 日志框架整合
    <!--日志框架整合-->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-core</artifactId>
            <version>${logback-core.version}</version>
            <type>jar</type>
        </dependency>
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>${logback-classic.version}</version>
            <type>jar</type>
        </dependency>
4. maven 插件管理
5. dependencyManagement 和 dependencies
   dependencyManagement : 让子模块中引用一个依赖可以不用指定版本号（避免冲突）
   dependencies         : 所有子模块默认继承父模块的jar
