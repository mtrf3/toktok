package com.ss.android.ugc.aweme.relation.storage.model;

import X.AnonymousClass311;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;

/* loaded from: classes2.dex */
public final class LocalPushRawEvent {

    @InterfaceC65349Pkn("after_user")
    public final UserData afterUser;

    @InterfaceC65349Pkn("before_user")
    public final UserData beforeUser;

    @InterfaceC65349Pkn("create_time")
    public final Long createTime;

    @InterfaceC65349Pkn("event_type")
    public final Integer eventType;

    @InterfaceC65349Pkn("signal_type")
    public final Integer signalType;

    @InterfaceC65349Pkn("data_sync_type")
    public final Integer syncType;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalPushRawEvent(eventType=");
        LIZ.append(this.eventType);
        LIZ.append(", signalType=");
        LIZ.append(this.signalType);
        LIZ.append(", syncType=");
        LIZ.append(this.syncType);
        LIZ.append(", beforeUser=");
        UserData userData = this.beforeUser;
        String str2 = null;
        if (userData != null) {
            str = AnonymousClass311.LIZIZ(userData);
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", afterUser=");
        UserData userData2 = this.afterUser;
        if (userData2 != null) {
            str2 = AnonymousClass311.LIZIZ(userData2);
        }
        LIZ.append(str2);
        LIZ.append(", createTime=");
        return JBR.LJ(LIZ, this.createTime, ')', LIZ);
    }

    public LocalPushRawEvent(Integer num, Integer num2, Integer num3, UserData userData, UserData userData2, Long l) {
        this.eventType = num;
        this.signalType = num2;
        this.syncType = num3;
        this.beforeUser = userData;
        this.afterUser = userData2;
        this.createTime = l;
    }
}
