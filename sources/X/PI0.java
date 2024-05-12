package X;

import com.bytedance.apm6.cpu.ApmCpuManager;

/* loaded from: classes12.dex */
public final class PI0 extends PGA {
    public volatile PI1 LIZ;
    public final PG9 LIZIZ;

    @Override // X.PGA, X.InterfaceC64219PIh
    public final void LIZIZ() {
        this.LIZ.LIZIZ(false);
    }

    public final void LJI() {
        PI1 pi1 = this.LIZ;
        synchronized (pi1) {
            PMI pmi = pi1.LJFF;
            if (pmi != null && pi1.LIZ) {
                pmi.LJII();
                pi1.LIZ = false;
            }
        }
    }

    @Override // X.PGA, X.InterfaceC64219PIh
    public final void onBackground() {
        this.LIZ.LIZIZ(true);
    }

    public PI0() {
        PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
        this.LIZIZ = pg9;
        this.LIZ = new PI1(pg9);
        PI7 pi7 = new PI7(this.LIZ);
        PI3 pi3 = new PI3(this.LIZ);
        C64209PHx c64209PHx = new C64209PHx(this.LIZ);
        PI6 pi6 = new PI6(this.LIZ);
        PI4 pi4 = new PI4(this.LIZ);
        PI1 pi1 = this.LIZ;
        if (!pi1.LIZIZ) {
            pi1.LJII = pi7;
            pi1.LJIIIIZZ = pi3;
            pi1.LJIIIZ = c64209PHx;
            pi1.LJIIJ = pi6;
            pi1.LJIIJJI = pi4;
            try {
                pi1.LJ = UC0.LJIIJ(C09970aH.LIZ);
            } catch (Throwable unused) {
            }
            pi1.LIZIZ = true;
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LJFF(C64198PHm c64198PHm) {
        PI1 pi1 = this.LIZ;
        synchronized (pi1) {
            if (!pi1.LIZ && pi1.LIZIZ) {
                pi1.LJI = c64198PHm;
                boolean z = true;
                pi1.LIZ = true;
                C30581Hy.LJLIL = ApmCpuManager.getInstance().getCpuSceneString();
                if (pi1.LIZLLL.isForeground()) {
                    z = false;
                }
                pi1.LIZJ = z;
                pi1.LIZJ();
            }
        }
    }
}
