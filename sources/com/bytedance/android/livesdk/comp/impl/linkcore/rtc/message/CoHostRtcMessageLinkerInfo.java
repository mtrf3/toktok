package com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CoHostRtcMessageLinkerInfo extends F9E {

    @InterfaceC65349Pkn("linkmic_Id")
    public final String linkmicId;

    @InterfaceC65349Pkn("room_Id")
    public final long roomId;

    @InterfaceC65349Pkn("user_Id")
    public final long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Long.valueOf(this.roomId), this.linkmicId};
    }

    public CoHostRtcMessageLinkerInfo(long j, long j2, String linkmicId) {
        o.LJIIIZ(linkmicId, "linkmicId");
        this.userId = j;
        this.roomId = j2;
        this.linkmicId = linkmicId;
    }
}
