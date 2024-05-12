package com.ss.android.ugc.aweme.im.service.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActivityStatus extends F9E {

    @InterfaceC65349Pkn("active_time")
    public final long activeTime;

    @InterfaceC65349Pkn("inactive_time")
    public final long inactiveTime;

    @InterfaceC65349Pkn("user_id")
    public final String userID;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.userID, Long.valueOf(this.activeTime), Long.valueOf(this.inactiveTime)};
    }

    public ActivityStatus(String userID, long j, long j2) {
        o.LJIIIZ(userID, "userID");
        this.userID = userID;
        this.activeTime = j;
        this.inactiveTime = j2;
    }

    public /* synthetic */ ActivityStatus(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? 0L : j2);
    }
}
