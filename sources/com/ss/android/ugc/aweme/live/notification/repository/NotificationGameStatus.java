package com.ss.android.ugc.aweme.live.notification.repository;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NotificationGameStatus extends F9E {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.statusMsg, Integer.valueOf(this.statusCode)};
    }

    public NotificationGameStatus(String statusMsg, int i) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusMsg = statusMsg;
        this.statusCode = i;
    }

    public /* synthetic */ NotificationGameStatus(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }
}
