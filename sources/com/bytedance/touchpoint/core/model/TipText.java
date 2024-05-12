package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class TipText extends F9E {

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("text")
    public final String text;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.color};
    }

    public TipText(String str, String str2) {
        this.text = str;
        this.color = str2;
    }
}
