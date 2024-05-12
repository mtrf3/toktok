package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ByteRTCExtInfo extends F9E {

    @InterfaceC65349Pkn("default_signaling_server_first")
    public int defaultSignaling;

    public ByteRTCExtInfo() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.defaultSignaling)};
    }

    public ByteRTCExtInfo(int i) {
        this.defaultSignaling = i;
    }

    public /* synthetic */ ByteRTCExtInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
