package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class DataPoint extends F9E {

    @InterfaceC65349Pkn("timestamp")
    public final float x;

    @InterfaceC65349Pkn("value")
    public final float y;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.x), Float.valueOf(this.y)};
    }

    public DataPoint(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
