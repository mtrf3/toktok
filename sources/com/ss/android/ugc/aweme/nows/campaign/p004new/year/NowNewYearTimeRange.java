package com.ss.android.ugc.aweme.nows.campaign.p004new.year;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowNewYearTimeRange {

    @InterfaceC65349Pkn("end")
    public final Long end;

    @InterfaceC65349Pkn("start")
    public final Long start;

    /* JADX WARN: Multi-variable type inference failed */
    public NowNewYearTimeRange() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowNewYearTimeRange)) {
            return false;
        }
        NowNewYearTimeRange nowNewYearTimeRange = (NowNewYearTimeRange) obj;
        return o.LJ(this.start, nowNewYearTimeRange.start) && o.LJ(this.end, nowNewYearTimeRange.end);
    }

    public final int hashCode() {
        Long l = this.start;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.end;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowNewYearTimeRange(start=");
        LIZ.append(this.start);
        LIZ.append(", end=");
        return JBR.LJ(LIZ, this.end, ')', LIZ);
    }

    public NowNewYearTimeRange(Long l, Long l2) {
        this.start = l;
        this.end = l2;
    }

    public /* synthetic */ NowNewYearTimeRange(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2);
    }
}
