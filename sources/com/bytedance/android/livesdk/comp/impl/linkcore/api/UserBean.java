package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class UserBean extends F9E {

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UserBean() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.api.UserBean.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), Long.valueOf(this.userId)};
    }

    public UserBean(long j, long j2) {
        this.roomId = j;
        this.userId = j2;
    }

    public /* synthetic */ UserBean(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}