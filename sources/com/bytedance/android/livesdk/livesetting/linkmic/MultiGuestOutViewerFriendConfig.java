package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiGuestOutViewerFriendConfig {

    @InterfaceC65349Pkn("init_count")
    public long initCount;

    @InterfaceC65349Pkn("step")
    public int step;

    public MultiGuestOutViewerFriendConfig() {
        this(0, 0L, 3, null);
    }

    public MultiGuestOutViewerFriendConfig(int i, long j) {
        this.step = i;
        this.initCount = j;
    }

    public /* synthetic */ MultiGuestOutViewerFriendConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 20 : i, (i2 & 2) != 0 ? 20L : j);
    }
}
