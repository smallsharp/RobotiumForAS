# RobotiumForAS
A demo for robotium by androidstudio;


1.创建Android工程

2.build.gradle 中增加配置
  defaultConfig中加入如下：
  testInstrumentationRunner "android.test.InstrumentationTestRunner"//第一处：InstrumentationTestRunner
  
  dependencies中加入如下（其实不用加入，系统自动生成）：
  androidTestCompile 'com.jayway.android.robotium:robotium-solo:5.6.2' //第二处：这个自动生成，但是没下载成功
  compile files('libs/robotium-solo-5.3.1.jar')// 第三处：project/app/libs/solojar,引入后，系统自动生成的

3.接第2步，如果没有solo.jar，去其他地方下载，放到project/app/libs中，并引入系统

4.在project/app/src/java/包名下，编写测试脚本

5.执行测试脚本

