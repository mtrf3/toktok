package com.ss.android.ugc.aweme.audiomode.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SingleSongCreationLoudnessBiasConfig extends F9E {

    @InterfaceC65349Pkn("editing_page_bgm_loudness_bias")
    public final int editingPageBgmLoudnessBias;

    @InterfaceC65349Pkn("mdp_playback_loudness_bias")
    public final int mdpPlaybackLoudnessBias;

    @InterfaceC65349Pkn("shooting_page_bgm_loudness_bias_mic_off")
    public final int shootingPageBgmLoudnessBiasMicOff;

    @InterfaceC65349Pkn("shooting_page_bgm_loudness_bias_mic_on")
    public final int shootingPageBgmLoudnessBiasMicOn;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SingleSongCreationLoudnessBiasConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audiomode.experiment.SingleSongCreationLoudnessBiasConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.mdpPlaybackLoudnessBias), Integer.valueOf(this.shootingPageBgmLoudnessBiasMicOff), Integer.valueOf(this.shootingPageBgmLoudnessBiasMicOn), Integer.valueOf(this.editingPageBgmLoudnessBias)};
    }

    public SingleSongCreationLoudnessBiasConfig(int i, int i2, int i3, int i4) {
        this.mdpPlaybackLoudnessBias = i;
        this.shootingPageBgmLoudnessBiasMicOff = i2;
        this.shootingPageBgmLoudnessBiasMicOn = i3;
        this.editingPageBgmLoudnessBias = i4;
    }

    public /* synthetic */ SingleSongCreationLoudnessBiasConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
