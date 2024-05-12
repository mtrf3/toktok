package com.bytedance.android.livesdk.livesetting.rank;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AutoRefreshRankInterval {

    @InterfaceC65349Pkn("hourly_ranklist_interval")
    public int hourly_rank;

    @InterfaceC65349Pkn("weekly_ranklist_interval")
    public int weekly_rank;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoRefreshRankInterval() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankInterval.<init>():void");
    }

    public AutoRefreshRankInterval(int i, int i2) {
        this.hourly_rank = i;
        this.weekly_rank = i2;
    }

    public /* synthetic */ AutoRefreshRankInterval(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 5 : i2);
    }
}
