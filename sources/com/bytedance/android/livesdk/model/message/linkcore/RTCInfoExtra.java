package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class RTCInfoExtra extends F9E {

    @InterfaceC65349Pkn("version")
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public RTCInfoExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.version};
    }

    public RTCInfoExtra(String str) {
        this.version = str;
    }

    public /* synthetic */ RTCInfoExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
