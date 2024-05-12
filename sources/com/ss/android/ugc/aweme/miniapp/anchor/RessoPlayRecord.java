package com.ss.android.ugc.aweme.miniapp.anchor;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class RessoPlayRecord extends F9E {

    @InterfaceC65349Pkn("last_finished_time")
    public final long lastFinishedTime;

    @InterfaceC65349Pkn("lifetime_finished_count")
    public final int lifetimeFinishedCount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.lifetimeFinishedCount), Long.valueOf(this.lastFinishedTime)};
    }

    public RessoPlayRecord(int i, long j) {
        this.lifetimeFinishedCount = i;
        this.lastFinishedTime = j;
    }
}
