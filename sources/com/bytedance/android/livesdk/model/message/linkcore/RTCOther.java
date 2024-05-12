package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RTCOther extends F9E {

    @InterfaceC65349Pkn("max_transcoding_cb_interval_second")
    public int transCodingSecond;

    public RTCOther() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.transCodingSecond)};
    }

    public RTCOther(int i) {
        this.transCodingSecond = i;
    }

    public /* synthetic */ RTCOther(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
