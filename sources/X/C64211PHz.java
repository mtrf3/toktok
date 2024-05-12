package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.apm6.cpu.ApmCpuManager;

/* renamed from: X.PHz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64211PHz extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PI2 LJLJJI;

    public final void LIZ() {
        boolean LJJIIZI;
        PI2 pi2 = this.LJLJJI;
        pi2.getClass();
        String cpuSceneString = ApmCpuManager.getInstance().getCpuSceneString();
        boolean z = !cpuSceneString.equals(C30581Hy.LJLIL);
        C30581Hy.LJLIL = cpuSceneString;
        if (z) {
            if (pi2.LJIIZILJ()) {
                C64071PCp.LIZ(PD6.CPU).LIZIZ(pi2.LIZJ);
                return;
            }
            return;
        }
        double LJIIZILJ = C44384HbQ.LJIIZILJ();
        C46625IRp c46625IRp = ((PI1) pi2.LIZ).LJ;
        if (c46625IRp != null) {
            float f = (float) LJIIZILJ;
            C46624IRo c46624IRo = c46625IRp.LIZLLL;
            if (!c46624IRo.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("isAbnormalProcess false, cpuSpeed ");
                LIZ.append(f);
                LIZ.append(", not sample environment");
                X1D.LIZIZ(LIZ);
            } else {
                C46625IRp c46625IRp2 = (C46625IRp) c46624IRo.LIZ;
                if (c46625IRp2.LJ.LIZIZ == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("isAbnormalProcess true, cpuSpeed ");
                    LIZ2.append(f);
                    LIZ2.append(", configSpeed:null");
                    X1D.LIZIZ(LIZ2);
                } else if (f >= 0.0f) {
                    if (0.0f > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        ((C46625IRp) ((InterfaceC46627IRr) c46625IRp2.LIZJ.LJLILLLLZI)).LJ.getClass();
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("isAbnormalProcess true, cpuSpeed ");
                    LIZ3.append(f);
                    LIZ3.append(", configSpeed:");
                    LIZ3.append(0.0f);
                    X1D.LIZIZ(LIZ3);
                }
                LJJIIZI = C30581Hy.LJJIIZI(pi2.LIZIZ, LJIIZILJ, pi2.LIZLLL);
            }
            LJJIIZI = false;
        } else {
            LJJIIZI = C30581Hy.LJJIIZI(pi2.LIZIZ, LJIIZILJ, pi2.LIZLLL);
        }
        if (!pi2.LJIILLIIL(LJJIIZI)) {
            return;
        }
        C64071PCp.LIZ(PD6.CPU).LIZIZ(pi2.LIZJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64211PHz(PI2 pi2, long j, long j2) {
        super(j, j2);
        this.LJLJJI = pi2;
    }
}
