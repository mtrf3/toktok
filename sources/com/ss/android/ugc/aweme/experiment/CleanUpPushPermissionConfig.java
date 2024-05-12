package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class CleanUpPushPermissionConfig extends F9E {

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("interval")
    public final long interval;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Long.valueOf(this.interval)};
    }

    public CleanUpPushPermissionConfig(int i, long j) {
        this.group = i;
        this.interval = j;
    }
}
