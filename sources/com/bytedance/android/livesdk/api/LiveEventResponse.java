package com.bytedance.android.livesdk.api;

import X.C16880lQ;
import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LiveEventResponse {

    @InterfaceC65349Pkn("status_code")
    public final long code;

    @InterfaceC65349Pkn("events")
    public final List<Object> eventList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("has_permission")
    public final Boolean hasPermission;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveEventResponse() {
        this(0L, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEventResponse)) {
            return false;
        }
        LiveEventResponse liveEventResponse = (LiveEventResponse) obj;
        return this.code == liveEventResponse.code && o.LJ(this.msg, liveEventResponse.msg) && this.hasMore == liveEventResponse.hasMore && o.LJ(this.hasPermission, liveEventResponse.hasPermission) && o.LJ(this.eventList, liveEventResponse.eventList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.msg, C16880lQ.LLJIJIL(this.code) * 31, 31);
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        Boolean bool = this.hasPermission;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return this.eventList.hashCode() + ((i2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEventResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", hasPermission=");
        LIZ.append(this.hasPermission);
        LIZ.append(", eventList=");
        return C1NE.LIZIZ(LIZ, this.eventList, ')', LIZ);
    }

    public LiveEventResponse(long j, String msg, boolean z, Boolean bool, List<Object> eventList) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(eventList, "eventList");
        this.code = j;
        this.msg = msg;
        this.hasMore = z;
        this.hasPermission = bool;
        this.eventList = eventList;
    }

    public /* synthetic */ LiveEventResponse(long j, String str, boolean z, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? new ArrayList() : list);
    }
}
