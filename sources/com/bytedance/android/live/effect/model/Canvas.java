package com.bytedance.android.live.effect.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public final class Canvas extends F9E {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("width")
    public int width;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    public Canvas(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
