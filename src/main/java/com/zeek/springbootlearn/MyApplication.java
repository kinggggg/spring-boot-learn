package com.zeek.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {

        /// 在IDE中直接运行输出为：sun.misc.Launcher$AppClassLoader@18b4aac2，是应用类加载器！因为通过IDEA直接运行的方式
        // 所有的类都位于classpath路径下，并且也不存在fatjar（即，jar包又含有jar包的问题）
        // 当构建成jar文件，并且通过java -jar方式进行运行时，下面的代码输出为：
        // org.springframework.boot.loader.LaunchedURLClassLoader@17f052a3，即，之前课程中所总结的SpringBoot自定义的一个
        // 类加载器
        System.out.println(MyApplication.class.getClassLoader());

        SpringApplication.run(MyApplication.class, args);

//        SpringApplication springApplication = new SpringApplication(MyApplication.class);
//        springApplication.setBannerMode(Banner.Mode.CONSOLE);
//        springApplication.run(args);
    }

}
