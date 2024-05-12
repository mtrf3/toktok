package com.bytedance.helios.common.utils;

import X.X1D;
import android.os.SystemClock;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CostTimeLog {
    public long cost;
    public long end;
    public String label;
    public String message;
    public Long start;

    public static /* synthetic */ CostTimeLog copy$default(CostTimeLog costTimeLog, String str, Long l, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costTimeLog.label;
        }
        if ((i & 2) != 0) {
            l = costTimeLog.start;
        }
        if ((i & 4) != 0) {
            j = costTimeLog.end;
        }
        if ((i & 8) != 0) {
            str2 = costTimeLog.message;
        }
        return costTimeLog.copy(str, l, j, str2);
    }

    public final CostTimeLog copy(String label, Long l, long j, String str) {
        o.LJIIIZ(label, "label");
        return new CostTimeLog(label, l, j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostTimeLog)) {
            return false;
        }
        CostTimeLog costTimeLog = (CostTimeLog) obj;
        return o.LJ(this.label, costTimeLog.label) && o.LJ(this.start, costTimeLog.start) && this.end == costTimeLog.end && o.LJ(this.message, costTimeLog.message);
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.start;
        int hashCode2 = l != null ? l.hashCode() : 0;
        long j = this.end;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.message;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(label=");
        LIZ.append(this.label);
        LIZ.append(", cost=");
        LIZ.append(this.cost);
        String str2 = this.message;
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            str = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" microsecond, message=");
            LIZ2.append(this.message);
            str = X1D.LIZIZ(LIZ2);
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    public final long getCost() {
        return this.cost;
    }

    public final long getEnd() {
        return this.end;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Long getStart() {
        return this.start;
    }

    public final void setCost(long j) {
        this.cost = j;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setLabel(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.label = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStart(Long l) {
        this.start = l;
    }

    public CostTimeLog(String label, Long l, long j, String str) {
        o.LJIIIZ(label, "label");
        this.label = label;
        this.start = l;
        this.end = j;
        this.message = str;
        if (l != null) {
            this.cost = (this.end - l.longValue()) / 1000;
        }
    }

    public /* synthetic */ CostTimeLog(String str, Long l, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? SystemClock.elapsedRealtimeNanos() : j, (i & 8) == 0 ? str2 : null);
    }
}
