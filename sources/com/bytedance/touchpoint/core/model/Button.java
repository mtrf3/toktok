package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Button extends F9E {

    @InterfaceC65349Pkn("background_color")
    public String bgColor;

    @InterfaceC65349Pkn("content")
    public Content content;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.bgColor, this.content};
    }

    public Button(String bgColor, Content content) {
        o.LJIIIZ(bgColor, "bgColor");
        this.bgColor = bgColor;
        this.content = content;
    }
}
