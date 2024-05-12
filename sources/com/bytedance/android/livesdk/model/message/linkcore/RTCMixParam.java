package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RTCMixParam extends F9E {

    @InterfaceC65349Pkn("video_bitrate_kbps")
    public int videoBitRate;

    public RTCMixParam() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.videoBitRate)};
    }

    public RTCMixParam(int i) {
        this.videoBitRate = i;
    }

    public /* synthetic */ RTCMixParam(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
