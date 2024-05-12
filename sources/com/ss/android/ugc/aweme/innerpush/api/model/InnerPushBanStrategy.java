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
public final class InnerPushBanStrategy implements Serializable {

    @InterfaceC65349Pkn("ban_by_cancel_times")
    public final int banByCancelTimes;

    @InterfaceC65349Pkn("ban_seconds_by_cancel")
    public final long banSecondsByCancel;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("records")
    public List<Long> records;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushBanStrategy() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerPushBanStrategy copy$default(InnerPushBanStrategy innerPushBanStrategy, long j, int i, long j2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = innerPushBanStrategy.id;
        }
        if ((i2 & 2) != 0) {
            i = innerPushBanStrategy.banByCancelTimes;
        }
        if ((i2 & 4) != 0) {
            j2 = innerPushBanStrategy.banSecondsByCancel;
        }
        if ((i2 & 8) != 0) {
            list = innerPushBanStrategy.records;
        }
        return innerPushBanStrategy.copy(j, i, j2, list);
    }

    public final InnerPushBanStrategy copy(long j, int i, long j2, List<Long> list) {
        return new InnerPushBanStrategy(j, i, j2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPushBanStrategy)) {
            return false;
        }
        InnerPushBanStrategy innerPushBanStrategy = (InnerPushBanStrategy) obj;
        return this.id == innerPushBanStrategy.id && this.banByCancelTimes == innerPushBanStrategy.banByCancelTimes && this.banSecondsByCancel == innerPushBanStrategy.banSecondsByCancel && o.LJ(this.records, innerPushBanStrategy.records);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.banSecondsByCancel, ((C16880lQ.LLJIJIL(this.id) * 31) + this.banByCancelTimes) * 31, 31);
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
        LIZ.append("InnerPushBanStrategy(id=");
        LIZ.append(this.id);
        LIZ.append(", banByCancelTimes=");
        LIZ.append(this.banByCancelTimes);
        LIZ.append(", banSecondsByCancel=");
        LIZ.append(this.banSecondsByCancel);
        LIZ.append(", records=");
        return C1NE.LIZIZ(LIZ, this.records, ')', LIZ);
    }

    public final int getBanByCancelTimes() {
        return this.banByCancelTimes;
    }

    public final long getBanSecondsByCancel() {
        return this.banSecondsByCancel;
    }

    public final long getId() {
        return this.id;
    }

    public final List<Long> getRecords() {
        return this.records;
    }

    public final void setRecords(List<Long> list) {
        this.records = list;
    }

    public InnerPushBanStrategy(long j, int i, long j2, List<Long> list) {
        this.id = j;
        this.banByCancelTimes = i;
        this.banSecondsByCancel = j2;
        this.records = list;
    }

    public /* synthetic */ InnerPushBanStrategy(long j, int i, long j2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? null : list);
    }
}
