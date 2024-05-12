package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public final class Size extends F9E {

    @InterfaceC65349Pkn("height")
    public final long height;

    @InterfaceC65349Pkn("width")
    public final long width;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.height), Long.valueOf(this.width)};
    }

    public Size(long j, long j2) {
        this.height = j;
        this.width = j2;
    }
}
