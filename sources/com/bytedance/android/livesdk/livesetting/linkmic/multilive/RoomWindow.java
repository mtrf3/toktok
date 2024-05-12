package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RoomWindow {

    @InterfaceC65349Pkn("times")
    public long allUsersTimeWindow;

    @InterfaceC65349Pkn("count")
    public long totalMaxTimes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RoomWindow() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.multilive.RoomWindow.<init>():void");
    }

    public RoomWindow(long j, long j2) {
        this.allUsersTimeWindow = j;
        this.totalMaxTimes = j2;
    }

    public /* synthetic */ RoomWindow(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 3600L : j, (i & 2) != 0 ? 100L : j2);
    }
}
