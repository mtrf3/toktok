package com.ss.android.ugc.gamora.editor.audioservice.service.audioenhance;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioEnhanceSnrModelConfig {

    @InterfaceC65349Pkn("denoise_enable_snr")
    public final int enableSNR;

    @InterfaceC65349Pkn("denoise_model_key")
    public final String modelName;

    @InterfaceC65349Pkn("denoise_init_param")
    public final String samiConfigInfo;

    @InterfaceC65349Pkn("denoise_level_param")
    public final String samiDenoiseLevel;

    @InterfaceC65349Pkn("denoise_snr_param")
    public final String samiSnr;

    @InterfaceC65349Pkn("snr_model_key")
    public final String snrModelName;

    @InterfaceC65349Pkn("denoise_use_ce")
    public final int useCE;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioEnhanceSnrModelConfig() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audioservice.service.audioenhance.AudioEnhanceSnrModelConfig.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEnhanceSnrModelConfig)) {
            return false;
        }
        AudioEnhanceSnrModelConfig audioEnhanceSnrModelConfig = (AudioEnhanceSnrModelConfig) obj;
        return this.useCE == audioEnhanceSnrModelConfig.useCE && this.enableSNR == audioEnhanceSnrModelConfig.enableSNR && o.LJ(this.modelName, audioEnhanceSnrModelConfig.modelName) && o.LJ(this.snrModelName, audioEnhanceSnrModelConfig.snrModelName) && o.LJ(this.samiConfigInfo, audioEnhanceSnrModelConfig.samiConfigInfo) && o.LJ(this.samiDenoiseLevel, audioEnhanceSnrModelConfig.samiDenoiseLevel) && o.LJ(this.samiSnr, audioEnhanceSnrModelConfig.samiSnr);
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.useCE * 31) + this.enableSNR) * 31;
        String str = this.modelName;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.snrModelName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.samiSnr.hashCode() + C79062V1e.LJ(this.samiDenoiseLevel, C79062V1e.LJ(this.samiConfigInfo, (i3 + i2) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioEnhanceSnrModelConfig(useCE=");
        LIZ.append(this.useCE);
        LIZ.append(", enableSNR=");
        LIZ.append(this.enableSNR);
        LIZ.append(", modelName=");
        LIZ.append(this.modelName);
        LIZ.append(", snrModelName=");
        LIZ.append(this.snrModelName);
        LIZ.append(", samiConfigInfo=");
        LIZ.append(this.samiConfigInfo);
        LIZ.append(", samiDenoiseLevel=");
        LIZ.append(this.samiDenoiseLevel);
        LIZ.append(", samiSnr=");
        return q.LIZIZ(LIZ, this.samiSnr, ')', LIZ);
    }

    public AudioEnhanceSnrModelConfig(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str3, "samiConfigInfo", str4, "samiDenoiseLevel", str5, "samiSnr");
        this.useCE = i;
        this.enableSNR = i2;
        this.modelName = str;
        this.snrModelName = str2;
        this.samiConfigInfo = str3;
        this.samiDenoiseLevel = str4;
        this.samiSnr = str5;
    }

    public /* synthetic */ AudioEnhanceSnrModelConfig(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) == 0 ? str5 : "");
    }
}
