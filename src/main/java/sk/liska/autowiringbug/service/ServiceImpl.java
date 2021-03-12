package sk.liska.autowiringbug.service;

import org.springframework.stereotype.Service;

import sk.liska.autowiringbug.data.DataChild;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
@Service
public class ServiceImpl implements IService<DataChild> {

    @Override
    public void method(DataChild arg) {
        System.out.println(arg.toString());
    }
}
