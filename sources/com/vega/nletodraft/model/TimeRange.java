package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public final class TimeRange extends F9E {

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("start")
    public final long start;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.start), Long.valueOf(this.duration)};
    }

    public TimeRange(long j, long j2) {
        this.start = j;
        this.duration = j2;
    }
}
