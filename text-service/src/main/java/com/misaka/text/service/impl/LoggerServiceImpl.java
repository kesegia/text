package com.misaka.text.service.impl;
import com.misaka.text.service.LoggerService;
import com.misaka.text.dao.mapper.LoggerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释，
 * 而用 @Component 对那些比较中立的类进行注释。@Component,@Service,@Controller,@Repository注解的类，
 * 并把这些类纳入进spring容器中管理。它的作用和在xml文件中使用bean节点配置组件时一样的*/
@Service
public class LoggerServiceImpl implements LoggerService {

/** @Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
 通过 @Autowired的使用来消除 set ，get方法。其实在启动spring IoC时，
容器自动装载了一个AutowiredAnnotationBeanPostProcessor后置处理器，
当容器扫描到@Autowied、@Resource或@Inject时，就会在IoC容器自动查找需要的bean，并装配给该对象的属性 */
    @Autowired
    private LoggerMapper loggerMapper;

    @Override
    public void addLogger() {
          loggerMapper.insertLogger();
    }
}
