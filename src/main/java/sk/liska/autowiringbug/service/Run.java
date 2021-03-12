package sk.liska.autowiringbug.service;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

import sk.liska.autowiringbug.data.DataChild;

/**
 * @author pavol.liska
 * @date 3/12/2021
 */
@Component
public class Run {

    @Autowired
    private AutowireCapableBeanFactory beanFactory;

    @PostConstruct
    public void postConstruct() {
        DependingServiceWorking o = new DependingServiceWorking();
        beanFactory.autowireBean(o);
        o.doWork(new DataChild("Working"));

        DependingServiceNotWorking<DataChild> o2 = new DependingServiceNotWorking<>();
        beanFactory.autowireBean(o2);
        o2.doWork(new DataChild("not Working"));
    }
}
