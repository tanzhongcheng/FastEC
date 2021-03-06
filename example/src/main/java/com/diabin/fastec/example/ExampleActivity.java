package com.diabin.fastec.example;

import com.diabin.latte.app.activities.ProxyActivity;
import com.diabin.latte.app.delegates.LatteDelegate;


public class ExampleActivity extends ProxyActivity {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    private static final int FOUR = 4;
    private static final int FIVE = 5;

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
