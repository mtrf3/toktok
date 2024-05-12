package com.ss.android.ugc.aweme.tools.draft.da;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DBEvent extends F9E {

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("new_db_version")
    public final int newDBVersion;

    @InterfaceC65349Pkn("old_db_version")
    public final int oldDBVersion;

    @InterfaceC65349Pkn("timestamp")
    public final long timestamp;

    @InterfaceC65349Pkn("utc_time")
    public final String utcTime;

    @InterfaceC65349Pkn("update_version_code")
    public final int versionCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DBEvent() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r8 = 63
            r0 = r10
            r3 = r2
            r4 = r2
            r7 = r1
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.da.DBEvent.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.eventName, Integer.valueOf(this.oldDBVersion), Integer.valueOf(this.newDBVersion), Integer.valueOf(this.versionCode), Long.valueOf(this.timestamp), this.utcTime};
    }

    public DBEvent(String eventName, int i, int i2, int i3, long j, String utcTime) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(utcTime, "utcTime");
        this.eventName = eventName;
        this.oldDBVersion = i;
        this.newDBVersion = i2;
        this.versionCode = i3;
        this.timestamp = j;
        this.utcTime = utcTime;
    }

    public /* synthetic */ DBEvent(String str, int i, int i2, int i3, long j, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) == 0 ? i3 : -1, (i4 & 16) != 0 ? 0L : j, (i4 & 32) == 0 ? str2 : "");
    }
}
