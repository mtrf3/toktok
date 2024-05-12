package com.bytedance.android.live.effect.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public final class LastPosition extends F9E {

    @InterfaceC65349Pkn("x")
    public int x;

    @InterfaceC65349Pkn("y")
    public int y;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.x), Integer.valueOf(this.y)};
    }

    public LastPosition(int i, int i2) {
        this.x = i;
        this.y = i2;
    }
}
