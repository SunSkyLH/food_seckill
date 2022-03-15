# food_seckill
## How to play

 1. git clone `https://github.com/SunSkyLH/food_seckill.git`
 2. open IDEA -->  File  -->  New  --> Open 
 3. choose seckill's pom.xml，open it
 4. update the `jdbc.properties` files about your mysql's username and password
 5. deploy the tomcat，and start up
 6. enter in the browser: `http://localhost:8080/seckill/list`
 7. enjoy it 
 

## Develop environment
IDEA+Maven+SSM框架。  

## Written in front of words

之前做了一个特色美食推荐及秒杀系统。此系统主要是利用了java最近非常流行的框架即Spring、SpringMVC、MyBatis，并对它们进行了整合。充分利用MVC的分层思想对该工程加以实践，并且采用分模块的思想进行松耦合。系统可以提供用户登录、美食推荐、购买、打分评论等功能。在推荐模块中实现了基于用户的ip地址定位，推荐给用户所在行政区域的精准定位推荐，并且用户还可以通过美食标签实现选择。为了更加突出显示网站的推荐信息，另外增加了秒杀美食的模块，本系统的每秒访问人次能够达到千级，更加具有稳定性和扩展性。

我主要实现了其中的美食秒杀模块，该部分代码即为秒杀实现的代码。maven的强大之处就是你不用再像以前那样，如果在项目中用到spring框架还要到spring官网上去下载一系列的jar包，用了maven对项目进行管理之后你就可以直接在它的pom.xml文件中添加jar包的相应坐标，这样maven就能自动从它的中央仓库中为我们将这些jar包下载到其本地仓库中供我们使用。  

用maven对项目进行管理的知识很简单，关于创建maven项目的知识大家可以自行上网查询相关资料。 

秒杀系统搭建环境:IDEA+Maven+SSM框架。  

完成这个秒杀系统，需要完成四个模块的代码编写，分别是:  

- 1.[Java高并发秒杀APi之业务分析与DAO层代码编写]
- 2.[Java高并发秒杀APi之Service层代码编写]
- 3.[Java高并发秒杀APi之Web层代码编写]

其实完成这三个模块就可以完成我们的秒杀系统了，但对于我们的秒杀系统中一件秒杀商品，在秒杀的时候肯定会有成千上万的用户参与进来，通过上述三个模块完成的系统无法解决这么多用户的高并发操作，所以我们还需要第四个模块:  

- 4.Java高并发秒杀APi之高并发优化。

相关配置的官网地址如下：

- 1.[logback配置](http://logback.qos.ch/manual/configuration.html)。
- 2.[spring配置](http://docs.spring.io/spring/docs/)。
- 3.[mybatis配置](http://mybatis.github.io/mybatis-3/zh/index.html)。
