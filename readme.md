# Zookeeper演示Demo
#### 启动zookeeper服务
下载zookeeper程序 `https://mirrors.cnnic.cn/apache/zookeeper/zookeeper-3.6.1/apache-zookeeper-3.6.1-bin.tar.gz` 
启动zookeeper程序`apache-zookeeper-3.6.1-bin\bin\zkServer.cmd`   

#### 启动zookeeper演示程序
1: 启动zookeeper服务图形界面（此步骤可忽略）（zk图形界面程序下载地址`https://github.com/WraithBorg/zookeepUI.git`）
2: 启动生产者服务`com.zkd.ProviderDxApplication`
3: 启动消费者服务`com.zkd.ConsumerDxApplication`(可以启动多个,需要在idea设置Allow parallel run)
4: 访问演示URL `http://127.0.0.1:9002/get-greeting`
