package com.ss.android.ugc.aweme.dsp.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class FistEnterOptConfig extends F9E {

    @InterfaceC65349Pkn("opt_engine")
    public final boolean optEngine;

    @InterfaceC65349Pkn("opt_keva")
    public final boolean optKeva;

    @InterfaceC65349Pkn("opt_media_session")
    public final boolean optMediaSession;

    @InterfaceC65349Pkn("opt_parallel_play")
    public final boolean optParallelBindPlay;

    @InterfaceC65349Pkn("opt_preload_cover")
    public final boolean optPreloadCover;

    @InterfaceC65349Pkn("opt_preload_vscope")
    public final boolean optPreloadVscope;

    @InterfaceC65349Pkn("opt_set_mode")
    public final boolean optSetMode;

    @InterfaceC65349Pkn("opt_x2c_fragment_view")
    public final boolean optX2CFragmentView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FistEnterOptConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.experiment.FistEnterOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.optEngine), Boolean.valueOf(this.optPreloadCover), Boolean.valueOf(this.optParallelBindPlay), Boolean.valueOf(this.optX2CFragmentView), Boolean.valueOf(this.optKeva), Boolean.valueOf(this.optPreloadVscope), Boolean.valueOf(this.optMediaSession), Boolean.valueOf(this.optSetMode)};
    }

    public FistEnterOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.optEngine = z;
        this.optPreloadCover = z2;
        this.optParallelBindPlay = z3;
        this.optX2CFragmentView = z4;
        this.optKeva = z5;
        this.optPreloadVscope = z6;
        this.optMediaSession = z7;
        this.optSetMode = z8;
    }

    public /* synthetic */ FistEnterOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) == 0 ? z8 : false);
    }
}
