package X;

import com.bytedance.common.jato.JatoXL;
import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;

/* renamed from: X.Dx2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35532Dx2 {
    public static boolean LIZ;

    public static final void LIZIZ() {
        C1FP.LJIJI(C35528Dwy.LJLIL);
    }

    public static final void LIZJ() {
        C1FP.LJIJI(C35529Dwz.LJLIL);
    }

    public static final void LIZLLL() {
        C1FP.LJIJI(C35530Dx0.LJLIL);
    }

    public static void LIZ(JatoBoostConfig jatoBoostConfig) {
        if (!LIZ) {
            LIZ = true;
        }
        long j = jatoBoostConfig.cpuBoost;
        if (j > 0) {
            JatoXL.tryCpuBoost(j);
        }
        long j2 = jatoBoostConfig.gpuBoost;
        if (j2 > 0) {
            JatoXL.tryGpuBoost(j2);
        }
        long j3 = jatoBoostConfig.gcBlock;
        if (j3 > 0) {
            JatoXL.requestBlockGc(j3);
        }
    }
}
