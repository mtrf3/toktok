package com.ss.android.ugc.aweme.inbox.cache;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class Configuration extends F9E {

    @InterfaceC65349Pkn("boot_delay_time")
    public final long bootFinishDelayTime;

    public Configuration() {
        this(0L, 1, null);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = configuration.bootFinishDelayTime;
        }
        return configuration.copy(j);
    }

    public final Configuration copy(long j) {
        return new Configuration(j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.bootFinishDelayTime)};
    }

    public final long getBootFinishDelayTime() {
        return this.bootFinishDelayTime;
    }

    public Configuration(long j) {
        this.bootFinishDelayTime = j;
    }

    public /* synthetic */ Configuration(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 8000L : j);
    }
}
