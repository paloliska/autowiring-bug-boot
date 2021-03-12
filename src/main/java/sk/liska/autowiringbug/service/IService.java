package sk.liska.autowiringbug.service;

import sk.liska.autowiringbug.data.DataParent;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
public interface IService<T extends DataParent> {

    void method(T arg);
}
