package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RtcMixParam extends F9E {
    public final int videoBitrateKbps;

    public RtcMixParam() {
        this(0, 1, null);
    }

    public static /* synthetic */ RtcMixParam copy$default(RtcMixParam rtcMixParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rtcMixParam.videoBitrateKbps;
        }
        return rtcMixParam.copy(i);
    }

    public final RtcMixParam copy(int i) {
        return new RtcMixParam(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.videoBitrateKbps)};
    }

    public final int getVideoBitrateKbps() {
        return this.videoBitrateKbps;
    }

    public RtcMixParam(int i) {
        this.videoBitrateKbps = i;
    }

    public /* synthetic */ RtcMixParam(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? LinkMicRtcMixBitrateSetting.DEFAULT : i);
    }
}
