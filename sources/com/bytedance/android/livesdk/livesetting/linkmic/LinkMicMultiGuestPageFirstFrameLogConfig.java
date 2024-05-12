package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPageFirstFrameLogConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("sample_rate")
    public double sampleRate;

    public LinkMicMultiGuestPageFirstFrameLogConfig() {
        this(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3, null);
    }

    public LinkMicMultiGuestPageFirstFrameLogConfig(boolean z, double d) {
        this.enable = z;
        this.sampleRate = d;
    }

    public /* synthetic */ LinkMicMultiGuestPageFirstFrameLogConfig(boolean z, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1.0d : d);
    }
}
