package sk.liska.autowiringbug.service;

import sk.liska.autowiringbug.data.DataParent;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
public class DependingServiceNotWorking<T extends DataParent> extends AbstractDependingService<T> {

    @Override
    public void doWork(T something) {
        getiService().method(something);
    }
}
