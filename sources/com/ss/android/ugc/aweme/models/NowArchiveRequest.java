package com.ss.android.ugc.aweme.models;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class NowArchiveRequest extends F9E {

    @InterfaceC65349Pkn("count")
    public final long count;

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("load_type")
    public final int loadType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.cursor), Long.valueOf(this.count), Integer.valueOf(this.loadType)};
    }

    public NowArchiveRequest(long j, long j2, int i) {
        this.cursor = j;
        this.count = j2;
        this.loadType = i;
    }
}
