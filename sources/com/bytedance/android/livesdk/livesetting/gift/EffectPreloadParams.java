package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class EffectPreloadParams {

    @InterfaceC65349Pkn("live_effect_preloading_delay")
    public long preloadDelay;

    @InterfaceC65349Pkn("live_effect_preloading_enter_room")
    public boolean preloadOnEnter;

    public EffectPreloadParams() {
        this(false, 0L, 3, null);
    }

    public EffectPreloadParams(boolean z, long j) {
        this.preloadOnEnter = z;
        this.preloadDelay = j;
    }

    public /* synthetic */ EffectPreloadParams(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
