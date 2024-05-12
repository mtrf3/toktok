package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class OpenTikTokOnMuteConfig extends F9E {

    @InterfaceC65349Pkn("boot_push_wait")
    public final long PUSH_COUNTDOWN_TIME;

    public OpenTikTokOnMuteConfig() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.PUSH_COUNTDOWN_TIME)};
    }

    public OpenTikTokOnMuteConfig(long j) {
        this.PUSH_COUNTDOWN_TIME = j;
    }

    public /* synthetic */ OpenTikTokOnMuteConfig(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j);
    }
}
