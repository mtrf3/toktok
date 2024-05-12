package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class CanvasConfig extends F9E {

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("width")
    public final int width;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)};
    }

    public CanvasConfig(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
