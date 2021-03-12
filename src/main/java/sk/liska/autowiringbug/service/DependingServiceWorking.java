package sk.liska.autowiringbug.service;

import sk.liska.autowiringbug.data.DataChild;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
public class DependingServiceWorking extends AbstractDependingService<DataChild> {

    @Override
    public void doWork(DataChild something) {
        getiService().method(something);
    }
}
