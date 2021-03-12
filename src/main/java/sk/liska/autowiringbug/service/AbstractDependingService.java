package sk.liska.autowiringbug.service;

import org.springframework.beans.factory.annotation.Autowired;

import sk.liska.autowiringbug.data.DataParent;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
public abstract class AbstractDependingService<T extends DataParent> {

    @Autowired
    public IService<T> iService;

    public abstract void doWork(T something);

    public IService<T> getiService() {
        return iService;
    }
}
