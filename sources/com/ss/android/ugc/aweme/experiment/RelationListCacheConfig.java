package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class RelationListCacheConfig extends F9E {

    @InterfaceC65349Pkn("cache_expire_time")
    public final long cacheExpireTime;

    @InterfaceC65349Pkn("follower_cache_number")
    public final int followerCacheNum;

    public RelationListCacheConfig() {
        this(0, 0L, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.followerCacheNum), Long.valueOf(this.cacheExpireTime)};
    }

    public RelationListCacheConfig(int i, long j) {
        this.followerCacheNum = i;
        this.cacheExpireTime = j;
    }

    public /* synthetic */ RelationListCacheConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? LivePreviewNetworkSpeedThresholdSetting.DEFAULT : j);
    }
}
