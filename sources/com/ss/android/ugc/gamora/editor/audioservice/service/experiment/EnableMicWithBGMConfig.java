package com.ss.android.ugc.gamora.editor.audioservice.service.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class EnableMicWithBGMConfig extends F9E {

    @InterfaceC65349Pkn("enable_aec")
    public final boolean enableAEC;

    @InterfaceC65349Pkn("enable_loudness_norm")
    public final boolean enableLoudnessNorm;

    @InterfaceC65349Pkn("enable_mic_button")
    public final boolean enableMicButton;

    @InterfaceC65349Pkn("enable_time_alignment")
    public final boolean enableTimeAlignment;

    @InterfaceC65349Pkn("use_red_mic_button")
    public final boolean useRedButton;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EnableMicWithBGMConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableMicButton), Boolean.valueOf(this.useRedButton), Boolean.valueOf(this.enableAEC), Boolean.valueOf(this.enableLoudnessNorm), Boolean.valueOf(this.enableTimeAlignment)};
    }

    public EnableMicWithBGMConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableMicButton = z;
        this.useRedButton = z2;
        this.enableAEC = z3;
        this.enableLoudnessNorm = z4;
        this.enableTimeAlignment = z5;
    }

    public /* synthetic */ EnableMicWithBGMConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
