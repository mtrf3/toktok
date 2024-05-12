package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CacheConfig extends F9E {

    @InterfaceC65349Pkn("max_store_interval")
    public final long maxStoreInterval;

    @InterfaceC65349Pkn("max_store_size")
    public final int maxStoreSize;

    public CacheConfig() {
        this(0, 0L, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxStoreSize), Long.valueOf(this.maxStoreInterval)};
    }

    public CacheConfig(int i, long j) {
        this.maxStoreSize = i;
        this.maxStoreInterval = j;
    }

    public /* synthetic */ CacheConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LiveMaxRetainAlogMessageSizeSetting.DEFAULT : i, (i2 & 2) != 0 ? 30000L : j);
    }
}
