package X;

import ccb.t;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VAT implements VBL {
    public final WeakReference<t> LIZ;

    public VAT(t tVar) {
        this.LIZ = new WeakReference<>(tVar);
    }

    public final void LIZ(boolean z) {
        String str;
        String LJIIL;
        String[] strArr;
        String LJIIL2;
        t tVar = this.LIZ.get();
        if (tVar == null || tVar.LJLLL == null) {
            return;
        }
        tVar.J1();
        tVar.LJLJJI.LJJJJ();
        tVar.LJLJJI.LJIILIIL();
        tVar.K();
        tVar.E = true;
        if (tVar.v0()) {
            tVar.LJLJJI.Q0 = 2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRetryResetPlayer ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (!tVar.LLILIL) {
            tVar.LLILIL = true;
            tVar.LJLJJI.LJJLIIIJILLIZJL(tVar.LJLLL.getLongOption(314, 0L));
        }
        tVar.h();
        tVar.LJLJJI.LJJIIZI();
        VAN van = tVar.LJLLJ;
        int i = van.LIZLLL;
        if (i == 1) {
            if (van.LJIIJJI() != null) {
                LJIIL = tVar.LJLLJ.LJIIJJI().LIZ;
            }
            LJIIL = null;
        } else {
            if (i == 2) {
                if (tVar.m2 == 1 && tVar.LLLFZ && tVar.v0()) {
                    String LJI = tVar.LJLLJ.LJI();
                    if (tVar.LLZLLLL == -1) {
                        int i2 = 0;
                        while (true) {
                            String[] strArr2 = VB1.LIZ;
                            if (i2 >= strArr2.length) {
                                break;
                            }
                            if (strArr2[i2].equals(LJI)) {
                                tVar.LLZLLLL = i2;
                                break;
                            }
                            i2++;
                        }
                    }
                    int i3 = tVar.LLZLLLL + 1;
                    while (true) {
                        strArr = VB1.LIZ;
                        if (i3 >= strArr.length || tVar.LJLLJ.LJJI(strArr[i3])) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < strArr.length) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("abrDegradeResolution, resolution: ");
                        LIZ2.append(strArr[i3]);
                        LIZ2.append(", auto defalut resolution: ");
                        LIZ2.append(tVar.LJLLJ.LJI());
                        X1D.LIZIZ(LIZ2);
                        C46496IMq.LIZJ();
                        if (!tVar.LJLLJ.LJI().equals(strArr[i3]) && (LJIIL2 = tVar.LJLLJ.LJIIL(strArr[i3], tVar.LLZZJLIL, tVar.LLZZ)) != null) {
                            String str2 = tVar.LLLF;
                            tVar.LLLF = LJIIL2;
                            tVar.LLZLLLL = i3;
                            tVar.LJLLJ.LJJIFFI(strArr[i3]);
                            tVar.LJLJJI.I0 = strArr[i3];
                            tVar.k1();
                            VAD vad = tVar.LJLJJI;
                            String str3 = tVar.LLLF;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("auto_");
                            LIZ3.append(tVar.LJLJJI.J0);
                            LIZ3.append("_to_");
                            LIZ3.append(tVar.LLZLLIL);
                            vad.LJJJJLI(-100015, str2, str3, X1D.LIZIZ(LIZ3));
                            tVar.LJLJJI.LJLLJ = tVar.LLLF;
                            tVar.LLZZ = "main";
                            tVar.LLLFFI = 0;
                            tVar.O0(LJIIL2);
                            return;
                        }
                    }
                }
                if (tVar.LLZLLIL.equals("auto")) {
                    str = tVar.a0();
                } else {
                    str = tVar.LLZLLIL;
                }
                LJIIL = tVar.LJLLJ.LJIIL(str, tVar.LLZZJLIL, tVar.LLZZ);
            }
            LJIIL = null;
        }
        C0AX.LIZIZ("retry url: ", LJIIL);
        tVar.LJLJJI.LJLLJ = LJIIL;
        System.currentTimeMillis();
        tVar.LJLJJI.q2 = System.currentTimeMillis();
        if (tVar.LLIILII == EnumC47633Imj.PREPARED) {
            tVar.O0(LJIIL);
        } else {
            tVar.LLZZZZ();
            tVar.O0(LJIIL);
        }
    }
}
