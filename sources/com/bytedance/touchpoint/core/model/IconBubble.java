package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes4.dex */
public final class IconBubble extends F9E {

    @InterfaceC65349Pkn("background_colors")
    public final List<String> backgroundColor;

    @InterfaceC65349Pkn("animation_number_max")
    public final String numberStr;

    @InterfaceC65349Pkn("text")
    public final Title title;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.backgroundColor, this.numberStr};
    }

    public IconBubble(Title title, List<String> list, String str) {
        this.title = title;
        this.backgroundColor = list;
        this.numberStr = str;
    }
}
