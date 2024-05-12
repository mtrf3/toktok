package X;

import android.view.Surface;
import ccb.t;
import com.ss.texturerender.VideoSurface;

/* loaded from: classes15.dex */
public final class VAV implements InterfaceC47921IrN {
    public final /* synthetic */ t LIZ;

    @Override // X.InterfaceC47921IrN
    public final void onDraw() {
        VideoSurface videoSurface;
        Surface LJII = this.LIZ.LLD.LJII();
        InterfaceC48269Iwz interfaceC48269Iwz = this.LIZ.LJLJL;
        if (interfaceC48269Iwz != null) {
            try {
                ((VBU) interfaceC48269Iwz).LJFF(LJII);
            } catch (Throwable unused) {
            }
        }
        t tVar = this.LIZ;
        if (tVar.y6.LIZ == 1 && tVar.LJLJL != null && (videoSurface = tVar.LLD) != null) {
            videoSurface.LIZIZ(112);
            this.LIZ.LLD.LIZIZ(113);
            this.LIZ.LLD.LIZIZ(114);
            this.LIZ.LLD.LIZIZ(115);
            this.LIZ.LJLJL.getClass();
        }
        t tVar2 = this.LIZ;
        if (tVar2.LJLLL == null) {
            return;
        }
        if (tVar2.B == 1) {
            if (tVar2.D != -1) {
                long currentTimeMillis = System.currentTimeMillis();
                t tVar3 = this.LIZ;
                long j = currentTimeMillis - tVar3.D;
                int i = t.N8;
                if (j >= i) {
                    if (!tVar3.l5) {
                        tVar3.LJLJJI.LJJIJLIJ(i, j, true, true);
                        this.LIZ.f1(t.N8, j, true);
                    } else {
                        C46496IMq.LIZJ();
                        this.LIZ.l5 = false;
                    }
                }
            }
            this.LIZ.D = System.currentTimeMillis();
        }
        t tVar4 = this.LIZ;
        if (!tVar4.R3) {
            if (!tVar4.LLIL && tVar4.LJLLL.getLongOption(77, -1L) != -1 && this.LIZ.LJLLL.getLongOption(77, -1L) != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ondraw first frame:");
                LIZ.append(this.LIZ.LJLILLLLZI);
                X1D.LIZIZ(LIZ);
                C46496IMq.LJ();
                if (this.LIZ.F0()) {
                    t tVar5 = this.LIZ;
                    if (tVar5.LJLJL != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("first frame rendered==== ");
                        V10.LJI(LIZ2, this.LIZ.u5, LIZ2, tVar5, 5);
                    }
                }
                t tVar6 = this.LIZ;
                tVar6.LLIL = true;
                tVar6.LJLJJI.LJJIFFI(tVar6.T);
                this.LIZ.LJLJJI.LJJLIIIJJI();
                InterfaceC48269Iwz interfaceC48269Iwz2 = this.LIZ.LJLJL;
                if (interfaceC48269Iwz2 != null) {
                    ((VBU) interfaceC48269Iwz2).LIZJ();
                }
                VE6 ve6 = this.LIZ.f103n8;
                if (ve6 != null) {
                    ve6.LIZ(null, 106, 0, "");
                }
                this.LIZ.LJLJJI.m2 = System.currentTimeMillis();
                t tVar7 = this.LIZ;
                if ((tVar7.p7 == 1 || tVar7.LLLIL || (tVar7.z7 == 1 && tVar7.P3 == 0)) && tVar7.LLLI && tVar7.LLLII.equals("abr_bb_4live") && this.LIZ.LLZLLIL.equals("auto")) {
                    t tVar8 = this.LIZ;
                    long j2 = tVar8.LLLIILIL;
                    if (j2 > 0 && !tVar8.LLLILZ) {
                        tVar8.G1(j2, tVar8.LLLIIL);
                    }
                }
                this.LIZ.getClass();
            }
        } else if (!tVar4.Q3 && tVar4.LJLLL.getLongOption(77, -1L) != -1 && this.LIZ.LJLLL.getLongOption(77, -1L) != 0) {
            C46496IMq.LIZJ();
            t tVar9 = this.LIZ;
            tVar9.Q3 = true;
            tVar9.LJLJJI.m2 = System.currentTimeMillis();
        }
        this.LIZ.LJLJJI.LJJIIZ();
    }

    public VAV(t tVar) {
        this.LIZ = tVar;
    }
}
