package com.diabin.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by tan on 2017/10/9.
 */

public enum  EcIcons  implements Icon{
    icon_android('\ue60c');

    private char character;
    EcIcons(char character){
        this.character = character;
    }
    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
