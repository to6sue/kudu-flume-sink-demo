# kudu-flume-sink-demo

For demo

0. create table

1. install flume agent and run
    - os version : centos7
    - installation script
        
        sudo yum install flume*
        
        cd  /usr/lib/flume-ng/lib
        
         wget https://repository.cloudera.com/artifactory/cloudera-repos/org/apache/kudu/kudu-flume-sink/1.9.0-cdh6.2.1//kudu-flume-sink-1.9.0-cdh6.2.1.jar

         wget https://repo1.maven.org/maven2/org/json/json/20160810/json-20160810.jar

         wget https://soo-test-bucket.s3.ap-northeast-2.amazonaws.com/kafka-flume/fastjson-1.2.46.jar

         mv /home/centos/kudu-flume-sink-1.0-SNAPSHOT-jar-with-dependencies.jar ./

         cd /etc/flume-ng/conf && vi flume.conf
         
         /usr/bin/flume-ng agent --conf conf --conf-file conf/order.properties --name a1



