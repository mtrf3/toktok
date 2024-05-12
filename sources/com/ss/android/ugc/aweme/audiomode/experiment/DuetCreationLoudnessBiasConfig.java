package com.ss.android.ugc.aweme.audiomode.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class DuetCreationLoudnessBiasConfig extends F9E {

    @InterfaceC65349Pkn("editing_page_bgm_loudness_bias")
    public final int editingPageBgmLoudnessBias;

    @InterfaceC65349Pkn("shooting_page_bgm_loudness_bias_mic_off")
    public final int shootingPageBgmLoudnessBiasMicOff;

    @InterfaceC65349Pkn("shooting_page_bgm_loudness_bias_mic_on")
    public final int shootingPageBgmLoudnessBiasMicOn;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuetCreationLoudnessBiasConfig() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audiomode.experiment.DuetCreationLoudnessBiasConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.shootingPageBgmLoudnessBiasMicOff), Integer.valueOf(this.shootingPageBgmLoudnessBiasMicOn), Integer.valueOf(this.editingPageBgmLoudnessBias)};
    }

    public DuetCreationLoudnessBiasConfig(int i, int i2, int i3) {
        this.shootingPageBgmLoudnessBiasMicOff = i;
        this.shootingPageBgmLoudnessBiasMicOn = i2;
        this.editingPageBgmLoudnessBias = i3;
    }

    public /* synthetic */ DuetCreationLoudnessBiasConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
