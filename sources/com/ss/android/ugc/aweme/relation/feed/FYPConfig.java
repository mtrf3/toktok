package com.ss.android.ugc.aweme.relation.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FYPConfig extends F9E {

    @InterfaceC65349Pkn("flow_position_backup")
    public int backUpFlowPosition;

    @InterfaceC65349Pkn("flow_index")
    public int flowIndex;

    @InterfaceC65349Pkn("flow_position")
    public int flowPosition;

    @InterfaceC65349Pkn("interval")
    public int interval;

    @InterfaceC65349Pkn("interval_lite")
    public int intervalLite;

    @InterfaceC65349Pkn("interval_plus")
    public int intervalPlus;

    @InterfaceC65349Pkn("shows_per_day")
    public int showsPerDay;

    @InterfaceC65349Pkn("shows_per_day_lite")
    public int showsPerDayLite;

    @InterfaceC65349Pkn("shows_per_day_plus")
    public int showsPerDayPlus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FYPConfig() {
        /*
            r12 = this;
            r1 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r11 = 0
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.feed.FYPConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.intervalLite), Integer.valueOf(this.showsPerDayLite), Integer.valueOf(this.interval), Integer.valueOf(this.showsPerDay), Integer.valueOf(this.intervalPlus), Integer.valueOf(this.showsPerDayPlus), Integer.valueOf(this.flowIndex), Integer.valueOf(this.flowPosition), Integer.valueOf(this.backUpFlowPosition)};
    }

    public FYPConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.intervalLite = i;
        this.showsPerDayLite = i2;
        this.interval = i3;
        this.showsPerDay = i4;
        this.intervalPlus = i5;
        this.showsPerDayPlus = i6;
        this.flowIndex = i7;
        this.flowPosition = i8;
        this.backUpFlowPosition = i9;
    }

    public /* synthetic */ FYPConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1 : i, (i10 & 2) != 0 ? 1 : i2, (i10 & 4) != 0 ? 1 : i3, (i10 & 8) != 0 ? 1 : i4, (i10 & 16) != 0 ? 3 : i5, (i10 & 32) == 0 ? i6 : 1, (i10 & 64) != 0 ? 2 : i7, (i10 & 128) == 0 ? i8 : 2, (i10 & 256) != 0 ? 6 : i9);
    }
}
