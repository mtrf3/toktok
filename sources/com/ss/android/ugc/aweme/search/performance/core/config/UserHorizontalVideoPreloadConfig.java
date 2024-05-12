package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class UserHorizontalVideoPreloadConfig extends F9E {

    @InterfaceC65349Pkn("enable_user_horizontal_card_video_preload")
    public final boolean enableUserVideoPreload;

    @InterfaceC65349Pkn("preload_delay_time")
    public final long preloadDelayTime;

    public UserHorizontalVideoPreloadConfig() {
        this(false, 0L, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableUserVideoPreload), Long.valueOf(this.preloadDelayTime)};
    }

    public UserHorizontalVideoPreloadConfig(boolean z, long j) {
        this.enableUserVideoPreload = z;
        this.preloadDelayTime = j;
    }

    public /* synthetic */ UserHorizontalVideoPreloadConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
