package com.bytedance.android.livesdk.sei;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SeiMultiCoHostStreamInfo extends F9E {

    @InterfaceC65349Pkn("stream_status")
    public int streamStatus;

    public SeiMultiCoHostStreamInfo() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.streamStatus)};
    }

    public SeiMultiCoHostStreamInfo(int i) {
        this.streamStatus = i;
    }

    public /* synthetic */ SeiMultiCoHostStreamInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
