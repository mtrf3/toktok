package com.ss.android.ugc.aweme.property;

import X.C44654Hfm;
import X.C44743HhD;
import X.C44747HhH;
import X.C44750HhK;
import X.C44751HhL;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.L9A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadSpeedEncodeSettings extends F9E implements L9A {
    public int LJLIL;

    @InterfaceC65349Pkn("bitrate_of_recode_threshold")
    public final int bitrateOfRecodeThreshold;

    @InterfaceC65349Pkn("compile_video_size_index")
    public final int compileVideoSizeIndex;

    @InterfaceC65349Pkn("high_quality_bitrate_of_recode_threshold")
    public final int highQualityBitrateOfRecodeThreshold;

    @InterfaceC65349Pkn("high_quality_compile_video_size_index")
    public final int highQualityCompileVideoSizeIndex;

    @InterfaceC65349Pkn("high_quality_use_smart_compile")
    public final boolean highQualityUseSmartCompile;

    @InterfaceC65349Pkn("high_quality_ve_synthesis_settings")
    public final String highQualityVeSynthesisSettings;

    @InterfaceC65349Pkn("max_speed")
    public final int maxSpeed;

    @InterfaceC65349Pkn("use_smart_compile")
    public final boolean useSmartCompile;

    @InterfaceC65349Pkn("ve_synthesis_settings")
    public final String veSynthesisSettings;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSpeedEncodeSettings() {
        /*
            r12 = this;
            r1 = 0
            r4 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r11 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxSpeed), Integer.valueOf(this.compileVideoSizeIndex), Integer.valueOf(this.highQualityCompileVideoSizeIndex), this.veSynthesisSettings, this.highQualityVeSynthesisSettings, Boolean.valueOf(this.useSmartCompile), Boolean.valueOf(this.highQualityUseSmartCompile), Integer.valueOf(this.bitrateOfRecodeThreshold), Integer.valueOf(this.highQualityBitrateOfRecodeThreshold)};
    }

    @Override // X.L9A
    public final int LJLI() {
        return this.maxSpeed;
    }

    @Override // X.L9A
    public final void setIndex(int i) {
        this.LJLIL = i;
    }

    public UploadSpeedEncodeSettings(int i, int i2, int i3, String veSynthesisSettings, String highQualityVeSynthesisSettings, boolean z, boolean z2, int i4, int i5) {
        o.LJIIIZ(veSynthesisSettings, "veSynthesisSettings");
        o.LJIIIZ(highQualityVeSynthesisSettings, "highQualityVeSynthesisSettings");
        this.maxSpeed = i;
        this.compileVideoSizeIndex = i2;
        this.highQualityCompileVideoSizeIndex = i3;
        this.veSynthesisSettings = veSynthesisSettings;
        this.highQualityVeSynthesisSettings = highQualityVeSynthesisSettings;
        this.useSmartCompile = z;
        this.highQualityUseSmartCompile = z2;
        this.bitrateOfRecodeThreshold = i4;
        this.highQualityBitrateOfRecodeThreshold = i5;
        this.LJLIL = -1;
    }

    public /* synthetic */ UploadSpeedEncodeSettings(int i, int i2, int i3, String str, String str2, boolean z, boolean z2, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? C44743HhD.LIZ() : i2, (i6 & 4) != 0 ? C44747HhH.LIZ() : i3, (i6 & 8) != 0 ? C44654Hfm.LIZIZ(false) : str, (i6 & 16) != 0 ? C44654Hfm.LIZ() : str2, (i6 & 32) != 0 ? false : z, (i6 & 64) == 0 ? z2 : false, (i6 & 128) != 0 ? C44751HhL.LIZ() : i4, (i6 & 256) != 0 ? C44750HhK.LIZ() : i5);
    }
}
