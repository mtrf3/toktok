package com.bytedance.helios.api.consumer;

import X.F9E;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AnchorExtra extends F9E {
    public int anchorCheckCount;
    public Set<Object> floatingViewEvents;
    public Set<Object> historyFloatingViewEvents;
    public long lastAnchorCheckTime;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorExtra() {
        this(0, 0L, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorExtra copy$default(AnchorExtra anchorExtra, int i, long j, Set set, Set set2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anchorExtra.anchorCheckCount;
        }
        if ((i2 & 2) != 0) {
            j = anchorExtra.lastAnchorCheckTime;
        }
        if ((i2 & 4) != 0) {
            set = anchorExtra.floatingViewEvents;
        }
        if ((i2 & 8) != 0) {
            set2 = anchorExtra.historyFloatingViewEvents;
        }
        return anchorExtra.copy(i, j, set, set2);
    }

    public final AnchorExtra copy(int i, long j, Set<Object> floatingViewEvents, Set<Object> historyFloatingViewEvents) {
        o.LJIIIZ(floatingViewEvents, "floatingViewEvents");
        o.LJIIIZ(historyFloatingViewEvents, "historyFloatingViewEvents");
        return new AnchorExtra(i, j, floatingViewEvents, historyFloatingViewEvents);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.anchorCheckCount), Long.valueOf(this.lastAnchorCheckTime), this.floatingViewEvents, this.historyFloatingViewEvents};
    }

    public final int getAnchorCheckCount() {
        return this.anchorCheckCount;
    }

    public final Set<Object> getFloatingViewEvents() {
        return this.floatingViewEvents;
    }

    public final Set<Object> getHistoryFloatingViewEvents() {
        return this.historyFloatingViewEvents;
    }

    public final long getLastAnchorCheckTime() {
        return this.lastAnchorCheckTime;
    }

    public final void setAnchorCheckCount(int i) {
        this.anchorCheckCount = i;
    }

    public final void setFloatingViewEvents(Set<Object> set) {
        o.LJIIIZ(set, "<set-?>");
        this.floatingViewEvents = set;
    }

    public final void setHistoryFloatingViewEvents(Set<Object> set) {
        o.LJIIIZ(set, "<set-?>");
        this.historyFloatingViewEvents = set;
    }

    public final void setLastAnchorCheckTime(long j) {
        this.lastAnchorCheckTime = j;
    }

    public AnchorExtra(int i, long j, Set<Object> floatingViewEvents, Set<Object> historyFloatingViewEvents) {
        o.LJIIIZ(floatingViewEvents, "floatingViewEvents");
        o.LJIIIZ(historyFloatingViewEvents, "historyFloatingViewEvents");
        this.anchorCheckCount = i;
        this.lastAnchorCheckTime = j;
        this.floatingViewEvents = floatingViewEvents;
        this.historyFloatingViewEvents = historyFloatingViewEvents;
    }

    public /* synthetic */ AnchorExtra(int i, long j, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? new LinkedHashSet() : set, (i2 & 8) != 0 ? new LinkedHashSet() : set2);
    }
}
