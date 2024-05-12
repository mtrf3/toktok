package com.ss.android.ugc.aweme.relation.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FriendsTabConfig extends F9E {

    @InterfaceC65349Pkn("flow_position_history")
    public int historyFlowPosition;

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

    @InterfaceC65349Pkn("flow_position_unread")
    public int unreadFlowPosition;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FriendsTabConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.feed.FriendsTabConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.intervalLite), Integer.valueOf(this.showsPerDayLite), Integer.valueOf(this.interval), Integer.valueOf(this.showsPerDay), Integer.valueOf(this.intervalPlus), Integer.valueOf(this.showsPerDayPlus), Integer.valueOf(this.unreadFlowPosition), Integer.valueOf(this.historyFlowPosition)};
    }

    public FriendsTabConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.intervalLite = i;
        this.showsPerDayLite = i2;
        this.interval = i3;
        this.showsPerDay = i4;
        this.intervalPlus = i5;
        this.showsPerDayPlus = i6;
        this.unreadFlowPosition = i7;
        this.historyFlowPosition = i8;
    }

    public /* synthetic */ FriendsTabConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 1 : i, (i9 & 2) != 0 ? 1 : i2, (i9 & 4) != 0 ? 1 : i3, (i9 & 8) != 0 ? 1 : i4, (i9 & 16) != 0 ? 4 : i5, (i9 & 32) == 0 ? i6 : 1, (i9 & 64) != 0 ? 5 : i7, (i9 & 128) != 0 ? 3 : i8);
    }
}
