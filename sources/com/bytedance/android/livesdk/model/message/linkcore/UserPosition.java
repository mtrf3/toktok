package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class UserPosition extends F9E {

    @InterfaceC65349Pkn("pos")
    public MicPositionData position;

    @InterfaceC65349Pkn("user_id")
    public long uid;

    /* JADX WARN: Multi-variable type inference failed */
    public UserPosition() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uid), this.position};
    }

    public UserPosition(long j, MicPositionData micPositionData) {
        this.uid = j;
        this.position = micPositionData;
    }

    public /* synthetic */ UserPosition(long j, MicPositionData micPositionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : micPositionData);
    }
}
