package com.ss.android.ugc.aweme.search.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PollingInfo implements Serializable {

    @InterfaceC65349Pkn("interval_millisecond")
    public final Long interval;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    /* JADX WARN: Multi-variable type inference failed */
    public PollingInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PollingInfo copy$default(PollingInfo pollingInfo, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l = pollingInfo.interval;
        }
        if ((i & 2) != 0) {
            num = pollingInfo.limit;
        }
        return pollingInfo.copy(l, num);
    }

    public final PollingInfo copy(Long l, Integer num) {
        return new PollingInfo(l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollingInfo)) {
            return false;
        }
        PollingInfo pollingInfo = (PollingInfo) obj;
        return o.LJ(this.interval, pollingInfo.interval) && o.LJ(this.limit, pollingInfo.limit);
    }

    public int hashCode() {
        Long l = this.interval;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.limit;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PollingInfo(interval=");
        LIZ.append(this.interval);
        LIZ.append(", limit=");
        return s0.LIZJ(LIZ, this.limit, ')', LIZ);
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public PollingInfo(Long l, Integer num) {
        this.interval = l;
        this.limit = num;
    }

    public /* synthetic */ PollingInfo(Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 3000L : l, (i & 2) != 0 ? 30 : num);
    }
}
