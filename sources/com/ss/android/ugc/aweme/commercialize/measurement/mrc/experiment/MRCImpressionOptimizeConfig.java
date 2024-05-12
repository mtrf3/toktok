package com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class MRCImpressionOptimizeConfig extends F9E {

    @InterfaceC65349Pkn("enable_ignore_piv")
    public final boolean enableIgnorePiv;

    @InterfaceC65349Pkn("fix_lack_break")
    public final boolean fixLackBreak;

    @InterfaceC65349Pkn("fix_more_over")
    public final boolean fixMoreOver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MRCImpressionOptimizeConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionOptimizeConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableIgnorePiv), Boolean.valueOf(this.fixMoreOver), Boolean.valueOf(this.fixLackBreak)};
    }

    public MRCImpressionOptimizeConfig(boolean z, boolean z2, boolean z3) {
        this.enableIgnorePiv = z;
        this.fixMoreOver = z2;
        this.fixLackBreak = z3;
    }

    public /* synthetic */ MRCImpressionOptimizeConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
