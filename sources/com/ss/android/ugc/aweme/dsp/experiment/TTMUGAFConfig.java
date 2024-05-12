package com.ss.android.ugc.aweme.dsp.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class TTMUGAFConfig extends F9E {

    @InterfaceC65349Pkn("music_dsp_af_s2s_click")
    public final int musicDspAfClick;

    @InterfaceC65349Pkn("music_dsp_af_s2s_opt")
    public final int musicDspAfOpt;

    @InterfaceC65349Pkn("music_dsp_af_s2s_show")
    public final int musicDspAfShow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTMUGAFConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.experiment.TTMUGAFConfig.<init>():void");
    }

    public static /* synthetic */ TTMUGAFConfig copy$default(TTMUGAFConfig tTMUGAFConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tTMUGAFConfig.musicDspAfClick;
        }
        if ((i4 & 2) != 0) {
            i2 = tTMUGAFConfig.musicDspAfShow;
        }
        if ((i4 & 4) != 0) {
            i3 = tTMUGAFConfig.musicDspAfOpt;
        }
        return tTMUGAFConfig.copy(i, i2, i3);
    }

    public final TTMUGAFConfig copy(int i, int i2, int i3) {
        return new TTMUGAFConfig(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.musicDspAfClick), Integer.valueOf(this.musicDspAfShow), Integer.valueOf(this.musicDspAfOpt)};
    }

    public final int getMusicDspAfClick() {
        return this.musicDspAfClick;
    }

    public final int getMusicDspAfOpt() {
        return this.musicDspAfOpt;
    }

    public final int getMusicDspAfShow() {
        return this.musicDspAfShow;
    }

    public TTMUGAFConfig(int i, int i2, int i3) {
        this.musicDspAfClick = i;
        this.musicDspAfShow = i2;
        this.musicDspAfOpt = i3;
    }

    public /* synthetic */ TTMUGAFConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
