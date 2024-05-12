package com.bytedance.android.livesdk.workaround;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class Options {

    @InterfaceC65349Pkn("enable_live_inner")
    public boolean optEnablePositionChange;

    @InterfaceC65349Pkn("enable_preview_card")
    public boolean optEnablePreviewPositionChange;

    @InterfaceC65349Pkn("further_position_change")
    public boolean optFurtherPositionChange;

    @InterfaceC65349Pkn("other_plan")
    public boolean optOtherPlan;

    @InterfaceC65349Pkn("position_change")
    public boolean optPositionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Options() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.workaround.Options.<init>():void");
    }

    public Options(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.optPositionChange = z;
        this.optFurtherPositionChange = z2;
        this.optOtherPlan = z3;
        this.optEnablePositionChange = z4;
        this.optEnablePreviewPositionChange = z5;
    }

    public /* synthetic */ Options(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
