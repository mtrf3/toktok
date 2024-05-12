package com.ss.android.ugc.aweme.story.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class StoryPerfOptConfig extends F9E {

    @InterfaceC65349Pkn("postponeBottomAreaEnabled")
    public final boolean postponeBottomAreaEnabled;

    @InterfaceC65349Pkn("preCreateCellAssemEnabled")
    public final boolean preCreateCellAssemEnabled;

    @InterfaceC65349Pkn("preCreateCellEnabled")
    public final boolean preCreateCellEnabled;

    @InterfaceC65349Pkn("prefetchEnabled")
    public final boolean prefetchEnabled;

    @InterfaceC65349Pkn("suppressViewPagerPreload")
    public final boolean suppressViewPagerPreload;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryPerfOptConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.experiment.StoryPerfOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.prefetchEnabled), Boolean.valueOf(this.preCreateCellEnabled), Boolean.valueOf(this.preCreateCellAssemEnabled), Boolean.valueOf(this.postponeBottomAreaEnabled), Boolean.valueOf(this.suppressViewPagerPreload)};
    }

    public StoryPerfOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.prefetchEnabled = z;
        this.preCreateCellEnabled = z2;
        this.preCreateCellAssemEnabled = z3;
        this.postponeBottomAreaEnabled = z4;
        this.suppressViewPagerPreload = z5;
    }

    public /* synthetic */ StoryPerfOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
