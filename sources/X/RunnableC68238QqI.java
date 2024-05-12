package X;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.QqI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68238QqI implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        ((BinderC68232QqC) this.LJLJI).LJLIL.LJFF();
        if (((zzac) this.LJLILLLLZI).zzc.LJJJJL() == null) {
            C68241QqL c68241QqL = ((BinderC68232QqC) this.LJLJI).LJLIL;
            zzac zzacVar = (zzac) this.LJLILLLLZI;
            c68241QqL.getClass();
            String str = zzacVar.zza;
            QH7.LJIIIIZZ(str);
            zzq LJJI = c68241QqL.LJJI(str);
            if (LJJI != null) {
                c68241QqL.LJIILIIL(zzacVar, LJJI);
                return;
            }
            return;
        }
        C68241QqL c68241QqL2 = ((BinderC68232QqC) this.LJLJI).LJLIL;
        zzac zzacVar2 = (zzac) this.LJLILLLLZI;
        c68241QqL2.getClass();
        String str2 = zzacVar2.zza;
        QH7.LJIIIIZZ(str2);
        zzq LJJI2 = c68241QqL2.LJJI(str2);
        if (LJJI2 != null) {
            c68241QqL2.LJIILLIIL(zzacVar2, LJJI2);
        }
    }

    public final void LIZIZ() {
        C68241QqL c68241QqL = (C68241QqL) this.LJLJI;
        c68241QqL.LIZIZ().LJFF();
        c68241QqL.LJIIJ = new C67604Qg4(c68241QqL);
        C68242QqM c68242QqM = new C68242QqM(c68241QqL);
        c68242QqM.LJII();
        c68241QqL.LIZJ = c68242QqM;
        C68034Qn0 LJJIJIL = c68241QqL.LJJIJIL();
        C68244QqO c68244QqO = c68241QqL.LIZ;
        QH7.LJIIIIZZ(c68244QqO);
        LJJIJIL.LIZJ = c68244QqO;
        C67275Qal c67275Qal = new C67275Qal(c68241QqL);
        c67275Qal.LJII();
        c68241QqL.LJIIIIZZ = c67275Qal;
        C68279Qqx c68279Qqx = new C68279Qqx(c68241QqL);
        c68279Qqx.LJII();
        c68241QqL.LJFF = c68279Qqx;
        C68317QrZ c68317QrZ = new C68317QrZ(c68241QqL);
        c68317QrZ.LJII();
        c68241QqL.LJII = c68317QrZ;
        C68151Qot c68151Qot = new C68151Qot(c68241QqL);
        c68151Qot.LJII();
        c68241QqL.LJ = c68151Qot;
        c68241QqL.LIZLLL = new C68240QqK(c68241QqL);
        if (c68241QqL.LJIILLIIL != c68241QqL.LJIIZILJ) {
            c68241QqL.LIZJ().LJFF.LIZJ(Integer.valueOf(c68241QqL.LJIILLIIL), Integer.valueOf(c68241QqL.LJIIZILJ), "Not all upload components initialized");
        }
        c68241QqL.LJIIL = true;
        C68241QqL c68241QqL2 = (C68241QqL) this.LJLJI;
        c68241QqL2.LIZIZ().LJFF();
        C68242QqM c68242QqM2 = c68241QqL2.LIZJ;
        C68241QqL.LJJIJIIJI(c68242QqM2);
        c68242QqM2.LJJJI();
        if (c68241QqL2.LJIIIIZZ.LJIIIZ.LIZ() == 0) {
            C67194QYs c67194QYs = c68241QqL2.LJIIIIZZ.LJIIIZ;
            c68241QqL2.LIZLLL().getClass();
            c67194QYs.LIZIZ(System.currentTimeMillis());
        }
        c68241QqL2.LJJIIJ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC68238QqI(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
