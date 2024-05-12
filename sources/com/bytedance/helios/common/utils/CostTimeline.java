package com.bytedance.helios.common.utils;

import X.HandlerThreadC65936PuG;
import X.ORZ;
import Y.ARunnableS12S1100000_11;
import android.os.SystemClock;
import defpackage.i0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CostTimeline {
    public final CopyOnWriteArrayList<CostTimeLog> costTimeLogs;
    public final long init;

    public CostTimeline() {
        this(0L, 1, null);
    }

    public final CopyOnWriteArrayList<CostTimeLog> getCostTimeLogs() {
        return this.costTimeLogs;
    }

    public final long getInit() {
        return this.init;
    }

    public CostTimeline(long j) {
        this.init = j;
        this.costTimeLogs = new CopyOnWriteArrayList<>();
    }

    public final void printLog(String tag) {
        o.LJIIIZ(tag, "tag");
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLILLLLZI.post(new ARunnableS12S1100000_11(this, tag, 2));
    }

    public final void logTotal(String label, String str) {
        o.LJIIIZ(label, "label");
        this.costTimeLogs.add(new CostTimeLog(i0.LJFF(label, "(total)"), Long.valueOf(this.init), 0L, str, 4, null));
    }

    public /* synthetic */ CostTimeline(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SystemClock.elapsedRealtimeNanos() : j);
    }

    public final void logCostTime(String label, Long l, long j, String str) {
        long j2;
        o.LJIIIZ(label, "label");
        CostTimeLog costTimeLog = (CostTimeLog) ORZ.LLFII(this.costTimeLogs);
        if (l != null) {
            j2 = l.longValue();
        } else if (costTimeLog != null) {
            j2 = costTimeLog.getEnd();
        } else {
            j2 = this.init;
        }
        this.costTimeLogs.add(new CostTimeLog(label, Long.valueOf(j2), j, str));
    }

    public static /* synthetic */ void logTotal$default(CostTimeline costTimeline, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        costTimeline.logTotal(str, str2);
    }

    public static /* synthetic */ void logCostTime$default(CostTimeline costTimeline, String str, Long l, long j, String str2, int i, Object obj) {
        Long l2 = l;
        long j2 = j;
        String str3 = null;
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            j2 = SystemClock.elapsedRealtimeNanos();
        }
        if ((i & 8) == 0) {
            str3 = str2;
        }
        costTimeline.logCostTime(str, l2, j2, str3);
    }
}
