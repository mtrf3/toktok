package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RTCMixBase extends F9E {

    @InterfaceC65349Pkn("bitrate")
    public int bitrate;

    public RTCMixBase() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bitrate)};
    }

    public RTCMixBase(int i) {
        this.bitrate = i;
    }

    public /* synthetic */ RTCMixBase(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
