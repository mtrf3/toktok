package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class AudienceMultiGuestPermissionParams extends F9E {

    @InterfaceC65349Pkn("app_id")
    public long appId;

    @InterfaceC65349Pkn("live_id")
    public long liveId;

    @InterfaceC65349Pkn("live_room_mode")
    public long liveRoomMode;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudienceMultiGuestPermissionParams() {
        /*
            r11 = this;
            r1 = 0
            r9 = 15
            r10 = 0
            r0 = r11
            r3 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), Long.valueOf(this.appId), Long.valueOf(this.liveId), Long.valueOf(this.liveRoomMode)};
    }

    public AudienceMultiGuestPermissionParams(long j, long j2, long j3, long j4) {
        this.roomId = j;
        this.appId = j2;
        this.liveId = j3;
        this.liveRoomMode = j4;
    }

    public /* synthetic */ AudienceMultiGuestPermissionParams(long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) == 0 ? j4 : 0L);
    }
}
