package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveRecyclerviewPerformanceOptData {

    @InterfaceC65349Pkn("other")
    public boolean other;

    @InterfaceC65349Pkn("reuse_pool")
    public boolean reusePool;

    @InterfaceC65349Pkn("viewholder_layout_preload")
    public boolean viewHolderLayoutPreload;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveRecyclerviewPerformanceOptData() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptData.<init>():void");
    }

    public LiveRecyclerviewPerformanceOptData(boolean z, boolean z2, boolean z3) {
        this.viewHolderLayoutPreload = z;
        this.reusePool = z2;
        this.other = z3;
    }

    public /* synthetic */ LiveRecyclerviewPerformanceOptData(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
