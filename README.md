# 简介
一些常用功能\工具的Cordova插件

# 功能
- 1. 彻底退出Android应用
- 2. Android 唤醒功能

# 安装
- 1. git clone
- 2. cordova plugin add XXXXXXX(cloned PATH)

# 使用
- cordova.plugins.baseTools.exit();  //退出
- cordova.plugins.baseTools.wakeUp(time, success, error); //唤醒并保持time毫秒 ("500<time<300000")