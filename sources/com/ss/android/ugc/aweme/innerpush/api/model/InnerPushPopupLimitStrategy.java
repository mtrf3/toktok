package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C16880lQ;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InnerPushPopupLimitStrategy implements Serializable {

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("max_popup_times")
    public final int maxPopupTimes;

    @InterfaceC65349Pkn("period_in_seconds")
    public final long periodInSeconds;

    @InterfaceC65349Pkn("records")
    public List<Long> records;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushPopupLimitStrategy() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r7 = 15
            r0 = r9
            r4 = r1
            r8 = r6
            r0.<init>(r1, r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerPushPopupLimitStrategy copy$default(InnerPushPopupLimitStrategy innerPushPopupLimitStrategy, long j, int i, long j2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = innerPushPopupLimitStrategy.id;
        }
        if ((i2 & 2) != 0) {
            i = innerPushPopupLimitStrategy.maxPopupTimes;
        }
        if ((i2 & 4) != 0) {
            j2 = innerPushPopupLimitStrategy.periodInSeconds;
        }
        if ((i2 & 8) != 0) {
            list = innerPushPopupLimitStrategy.records;
        }
        return innerPushPopupLimitStrategy.copy(j, i, j2, list);
    }

    public final InnerPushPopupLimitStrategy copy(long j, int i, long j2, List<Long> list) {
        return new InnerPushPopupLimitStrategy(j, i, j2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushPopupLimitStrategy)) {
            return false;
        }
        InnerPushPopupLimitStrategy innerPushPopupLimitStrategy = (InnerPushPopupLimitStrategy) obj;
        return this.id == innerPushPopupLimitStrategy.id && this.maxPopupTimes == innerPushPopupLimitStrategy.maxPopupTimes && this.periodInSeconds == innerPushPopupLimitStrategy.periodInSeconds && o.LJ(this.records, innerPushPopupLimitStrategy.records);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.periodInSeconds, ((C16880lQ.LLJIJIL(this.id) * 31) + this.maxPopupTimes) * 31, 31);
        List<Long> list = this.records;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerPushPopupLimitStrategy(id=");
        LIZ.append(this.id);
        LIZ.append(", maxPopupTimes=");
        LIZ.append(this.maxPopupTimes);
        LIZ.append(", periodInSeconds=");
        LIZ.append(this.periodInSeconds);
        LIZ.append(", records=");
        return C1NE.LIZIZ(LIZ, this.records, ')', LIZ);
    }

    public final long getId() {
        return this.id;
    }

    public final int getMaxPopupTimes() {
        return this.maxPopupTimes;
    }

    public final long getPeriodInSeconds() {
        return this.periodInSeconds;
    }

    public final List<Long> getRecords() {
        return this.records;
    }

    public final void setRecords(List<Long> list) {
        this.records = list;
    }

    public InnerPushPopupLimitStrategy(long j, int i, long j2, List<Long> list) {
        this.id = j;
        this.maxPopupTimes = i;
        this.periodInSeconds = j2;
        this.records = list;
    }

    public /* synthetic */ InnerPushPopupLimitStrategy(long j, int i, long j2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? null : list);
    }
}
