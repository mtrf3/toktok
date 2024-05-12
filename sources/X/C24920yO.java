package X;

import android.content.Context;
import android.view.View;
import com.google.gson.internal.b;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24920yO {
    public static final AnonymousClass272 LIZ = AnonymousClass272.LJLIL;

    public static final <T extends View> void LIZ(InterfaceC88472Yns<? super Context, ? extends T> factory, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        o.LJIIIZ(factory, "factory");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(factory)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) != 146 || !LJIL.LIZ()) {
            if (i7 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i8 != 0) {
                interfaceC88472Yns2 = LIZ;
            }
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = new InterfaceC25720zg() { // from class: X.1bJ
                    @Override // X.InterfaceC25720zg
                    public final long LIZIZ(int i9, long j) {
                        return C10370av.LIZIZ;
                    }

                    @Override // X.InterfaceC25720zg
                    public final Object LIZLLL(long j, InterfaceC67352kd interfaceC67352kd) {
                        return new C23560wC(C23560wC.LIZIZ);
                    }

                    @Override // X.InterfaceC25720zg
                    public final Object LIZ(long j, long j2, InterfaceC67352kd interfaceC67352kd) {
                        return new C23560wC(C23560wC.LIZIZ);
                    }

                    @Override // X.InterfaceC25720zg
                    public final long LIZJ(int i9, long j, long j2) {
                        return C10370av.LIZIZ;
                    }
                };
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            C36091bJ c36091bJ = (C36091bJ) LJJJZ;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJJJZ2 == c24490xh) {
                LJJJZ2 = new C25730zh();
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            C25730zh c25730zh = (C25730zh) LJJJZ2;
            InterfaceC07790Sh LIZJ = C07770Sf.LIZJ(LJIL, b.LJJII(interfaceC07790Sh2.LLLIIIL(C25740zi.LIZ(InterfaceC07790Sh.LJJJI, c36091bJ, c25730zh)), true, AnonymousClass271.LJLIL));
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            AbstractC24810yD LJJ = C78929UyL.LJJ(LJIL);
            C0MG c0mg = (C0MG) LJIL.LJIILLIIL(C0MH.LIZ);
            String valueOf = String.valueOf(LJIL.LJJIJ());
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ3 = LJIL.LJJJZ();
            if (LJJJZ3 == c24490xh) {
                LJJJZ3 = new C03770Cv();
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            C03770Cv c03770Cv = (C03770Cv) LJJJZ3;
            Object LJIILLIIL3 = LJIL.LJIILLIIL(C04Q.LJ);
            Object LJIILLIIL4 = LJIL.LJIILLIIL(C04Q.LJFF);
            C532026y c532026y = new C532026y(context, LJJ, c25730zh, factory, c0mg, valueOf, c03770Cv);
            LJIL.LJJIIJ(1886828752);
            if (LJIL.LIZIZ instanceof C40471iN) {
                LJIL.LJLI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(new IDqS420S0100000(c532026y, 176));
                } else {
                    LJIL.LIZIZ();
                }
                C24830yF.LIZ(LJIL, LIZJ, new IDqS443S0100000(c03770Cv, 35));
                C24830yF.LIZ(LJIL, LJIILLIIL, new IDqS443S0100000(c03770Cv, 36));
                C24830yF.LIZ(LJIL, LJIILLIIL3, new IDqS443S0100000(c03770Cv, 37));
                C24830yF.LIZ(LJIL, LJIILLIIL4, new IDqS443S0100000(c03770Cv, 38));
                C24830yF.LIZ(LJIL, interfaceC88472Yns2, new IDqS443S0100000(c03770Cv, 39));
                C24830yF.LIZ(LJIL, LJIILLIIL2, new IDqS443S0100000(c03770Cv, 40));
                LJIL.LJIJ();
                LJIL.LJJJJJ(false);
                if (c0mg != null) {
                    C24610xt.LIZ(c0mg, valueOf, new C532126z(c0mg, valueOf, c03770Cv), LJIL);
                }
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AnonymousClass270(factory, interfaceC07790Sh2, interfaceC88472Yns2, i, i2);
    }
}
