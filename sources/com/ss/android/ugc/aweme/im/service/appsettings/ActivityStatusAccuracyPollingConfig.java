package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActivityStatusAccuracyPollingConfig extends F9E {

    @InterfaceC65349Pkn("initial_delay")
    public final long initialDelay;

    @InterfaceC65349Pkn("polling_interval")
    public final long pollingInterval;

    @InterfaceC65349Pkn("position")
    public final String position;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.position, Long.valueOf(this.initialDelay), Long.valueOf(this.pollingInterval)};
    }

    public ActivityStatusAccuracyPollingConfig(String position, long j, long j2) {
        o.LJIIIZ(position, "position");
        this.position = position;
        this.initialDelay = j;
        this.pollingInterval = j2;
    }

    public /* synthetic */ ActivityStatusAccuracyPollingConfig(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 2L : j, (i & 4) != 0 ? 10L : j2);
    }
}
