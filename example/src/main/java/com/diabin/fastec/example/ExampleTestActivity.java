package com.diabin.fastec.example;

import com.diabin.latte.app.activities.ProxyActivity;
import com.diabin.latte.app.delegates.LatteDelegate;

public class ExampleTestActivity  extends ProxyActivity{
    private static final int ONE = 1;
    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
