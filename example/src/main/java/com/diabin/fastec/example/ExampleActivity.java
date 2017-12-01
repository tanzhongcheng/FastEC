package com.diabin.fastec.example;

import com.diabin.latte.app.activities.ProxyActivity;
import com.diabin.latte.app.delegates.LatteDelegate;


public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
