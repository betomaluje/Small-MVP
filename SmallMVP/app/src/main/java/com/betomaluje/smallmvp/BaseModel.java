package com.betomaluje.smallmvp;

import com.squareup.otto.Bus;

/**
 * Created by betomaluje on 8/3/17.
 */

public abstract class BaseModel {

    protected Bus bus;

    public BaseModel(Bus bus) {
        this.bus = bus;
    }
}
