package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Content extends F9E {

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("size")
    public int size;

    @InterfaceC65349Pkn("text")
    public String text;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.color, Integer.valueOf(this.size)};
    }

    public Content(String text, String color, int i) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(color, "color");
        this.text = text;
        this.color = color;
        this.size = i;
    }
}
