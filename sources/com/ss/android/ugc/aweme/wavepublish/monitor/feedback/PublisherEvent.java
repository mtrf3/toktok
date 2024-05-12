package com.ss.android.ugc.aweme.wavepublish.monitor.feedback;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PublisherEvent extends F9E {

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("publish_id")
    public final String publishId;

    @InterfaceC65349Pkn("timestamp")
    public final long timestamp;

    @InterfaceC65349Pkn("utc_time")
    public final String utcTime;

    @InterfaceC65349Pkn("update_version_code")
    public final int versionCode;

    /* JADX WARN: Multi-variable type inference failed */
    public PublisherEvent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0L, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.eventName, this.publishId, this.creationId, Integer.valueOf(this.versionCode), Long.valueOf(this.timestamp), this.utcTime};
    }

    public PublisherEvent(String str, String str2, String str3, int i, long j, String str4) {
        C43588H8u.LIZLLL(str, "eventName", str2, "publishId", str3, "creationId", str4, "utcTime");
        this.eventName = str;
        this.publishId = str2;
        this.creationId = str3;
        this.versionCode = i;
        this.timestamp = j;
        this.utcTime = str4;
    }

    public /* synthetic */ PublisherEvent(String str, String str2, String str3, int i, long j, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? 0L : j, (i2 & 32) == 0 ? str4 : "");
    }
}
