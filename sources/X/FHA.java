package X;

import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;

/* loaded from: classes7.dex */
public final class FHA {
    public static m LIZ;

    public static void LIZ(String str) {
        FHB.LJ.LJIIIIZZ(str);
    }

    public static void LIZIZ(m mVar, String str) {
        p LJJIJL;
        boolean z;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJL = LJJIJIL.LJJIJL("val")) != null) {
                if (LJJIJL.LJLIL instanceof Number) {
                    FHB fhb = FHB.LJ;
                    if (LJJIJL.LJIILJJIL() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fhb.LJIIJ(str, z);
                } else {
                    FHB.LJ.LJIIJ(str, LJJIJL.LJFF());
                }
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LIZJ(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB.LJ.LJIILIIL(str, LJJIJ.toString());
            } else if (mVar.LJJIJLIJ(str)) {
                FHB.LJ.LJIILIIL(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LIZLLL(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB fhb = FHB.LJ;
                double LJIIIZ = LJJIJ.LJIIIZ();
                if (FHJ.LIZIZ(str)) {
                    FHJ fhj = fhb.LIZJ;
                    fhj.getClass();
                    fhj.LIZ.LJIIIIZZ().LJ(str, LJIIIZ);
                }
                fhb.LJIIIZ().LJ(str, LJIIIZ);
                return;
            }
            LIZ(str);
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJ(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB fhb = FHB.LJ;
                float LJIIJ = LJJIJ.LJIIJ();
                if (FHJ.LIZIZ(str)) {
                    FHJ fhj = fhb.LIZJ;
                    fhj.getClass();
                    fhj.LIZ.LJIIIIZZ().LJII(str, LJIIJ);
                }
                fhb.LJIIIZ().LJII(str, LJIIJ);
                return;
            }
            LIZ(str);
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJFF(m mVar, String str) {
        p LJJIJL;
        int i;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJL = LJJIJIL.LJJIJL("val")) != null) {
                if (LJJIJL.LJLIL instanceof Boolean) {
                    FHB fhb = FHB.LJ;
                    if (LJJIJL.LJFF()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    fhb.LJIIJJI(str, i);
                } else {
                    FHB.LJ.LJIIJJI(str, LJJIJL.LJIILJJIL());
                }
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJI(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB fhb = FHB.LJ;
                long LJIJJLI = LJJIJ.LJIJJLI();
                if (FHJ.LIZIZ(str)) {
                    FHJ fhj = fhb.LIZJ;
                    fhj.getClass();
                    fhj.LIZ.LJIIIIZZ().LIZJ(str, LJIJJLI);
                }
                fhb.LJIIIZ().LIZJ(str, LJIJJLI);
                return;
            }
            LIZ(str);
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJII(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB fhb = FHB.LJ;
                fhb.LJIIL(str, (String[]) ((Gson) fhb.LIZIZ.getValue()).LIZJ(LJJIJ, String[].class));
            } else if (mVar.LJJIJLIJ(str)) {
                FHB.LJ.LJIIL(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }

    public static void LJIIIIZZ(m mVar, String str) {
        j LJJIJ;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null && !(LJJIJ instanceof l)) {
                FHB.LJ.LJIILIIL(str, LJJIJ.LJJIFFI());
            } else if (mVar.LJJIJLIJ(str)) {
                FHB.LJ.LJIILIIL(str, null);
            } else {
                LIZ(str);
            }
        } catch (Throwable th) {
            FII.LIZJ(th, "  , key: ", str);
        }
    }
}
