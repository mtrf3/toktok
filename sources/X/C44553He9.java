package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigLevelStruct;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.He9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44553He9 extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44537Hdt LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        UploadSpeedEncodeSettings LJIIL = u.LJIIL(this.LIZIZ.LIZ.uploadSpeedInfo, !r0.isUploadVideo());
        if (LJIIL != null) {
            C44564HeK c44564HeK = new C44564HeK(0);
            c44564HeK.LIZ = Integer.valueOf(LJIIL.LJLIL);
            c44564HeK.LIZIZ = new CompileConfigLevelStruct<>(Boolean.valueOf(LJIIL.useSmartCompile), Boolean.valueOf(LJIIL.highQualityUseSmartCompile));
            c44564HeK.LIZJ = new CompileConfigLevelStruct<>(Integer.valueOf(LJIIL.bitrateOfRecodeThreshold), Integer.valueOf(LJIIL.highQualityBitrateOfRecodeThreshold));
            c44564HeK.LIZLLL = new CompileConfigLevelStruct<>(C44739Hh9.LIZJ(LJIIL.compileVideoSizeIndex), C44739Hh9.LIZJ(LJIIL.highQualityCompileVideoSizeIndex));
            C44537Hdt c44537Hdt = this.LIZIZ;
            C44549He5 c44549He5 = c44537Hdt.LIZIZ;
            c44549He5.LIZIZ = c44564HeK;
            if (c44549He5.LJ.LJI) {
                if (c44537Hdt.LIZ()) {
                    vEVideoEncodeConfigParams2.setExternalSettingsJsonStr(LJIIL.highQualityVeSynthesisSettings);
                } else {
                    vEVideoEncodeConfigParams2.setExternalSettingsJsonStr(LJIIL.veSynthesisSettings);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44553He9(InterfaceC44653Hfl strategy, C44537Hdt initParams) {
        super(strategy);
        C44577HeX c44577HeX = C44577HeX.LIZ;
        String name = c44577HeX.key;
        int i = c44577HeX.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
