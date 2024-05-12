package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class Scale extends F9E {

    @InterfaceC65349Pkn("x")
    public final float x;

    @InterfaceC65349Pkn("y")
    public final float y;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.x), Float.valueOf(this.y)};
    }

    public Scale(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
