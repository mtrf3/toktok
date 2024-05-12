package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a1M, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91856a1M {
    public static final String LIZLLL(String str) {
        if (str == null) {
            return C92054a4Y.LIZ("pipo_common_error_card_default", "");
        }
        String LJIILLIIL = o.LJIILLIIL(str, "pipo_common_error_");
        String LIZ = C92054a4Y.LIZ(LJIILLIIL, new String[0]);
        if (o.LJ(LIZ, LJIILLIIL)) {
            return C92054a4Y.LIZ("pipo_common_error_card_default", str);
        }
        return LIZ;
    }

    public static final void LIZ(String label, String content, C08370Un contextTextStyle, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(label, "label");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(contextTextStyle, "contextTextStyle");
        C35931b3 LJIL = interfaceC24520xk.LJIL(827614615);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(label)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(content)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(contextTextStyle)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (((i2 & 731) ^ 146) != 0 || !LJIL.LIZ()) {
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            o.LJIIIZ(c1m1, "<this>");
            C50931zF c50931zF = C09290Yb.LIZ;
            c1m1.LLLIIIL(c50931zF);
            C32331Or c32331Or = C0YW.LJFF;
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            LJIL.LJJIIJ(693286680);
            InterfaceC273215k LIZ = C0YX.LIZ(c32331Or, c31621Ly, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c50931zF);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-678309503);
                C21430sl.LIZIZ(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new C08370Un(C91671ZyN.LIZ(LJIL).LJ, C79043V0l.LJIIIIZZ(15), C13640gC.LJLILLLLZI, null, null, 0L, null, null, C79043V0l.LJIIIIZZ(18), 196600), LJIL, i2 & 14, 0, 32766);
                C21430sl.LIZIZ(content, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, contextTextStyle, LJIL, (i2 >> 3) & 14, (i2 << 9) & 458752, 32766);
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
                LJIL.LJIJ();
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
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
        LJJJJLI.LIZLLL = new C92660aEK(label, content, contextTextStyle, i);
    }

    public static final void LIZIZ(List<C91872a1c> items, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        C08370Un c08370Un;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(items, "items");
        C35931b3 LJIL = interfaceC24520xk.LJIL(830071963);
        if ((i2 & 2) != 0) {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        C32351Ot c32351Ot = new C32351Ot(16, C50651yn.LJLIL);
        int i3 = ((i >> 3) & 14) | 48;
        LJIL.LJJIIJ(-483455358);
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C09330Yf.LIZ(c32351Ot, C07730Sb.LJIILIIL, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
        int i4 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
            LJIL.LJIIIIZZ();
            LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i4 >> 3) & 112));
            LJIL.LJJIIJ(2058660585);
            LJIL.LJJIIJ(-1163856341);
            if (((i4 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                if ((16 ^ ((((i3 >> 6) & 112) | 6) & 81)) != 0 || !LJIL.LIZ()) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(items, 10));
                    for (C91872a1c c91872a1c : items) {
                        if (c91872a1c.LIZJ == EnumC91871a1b.Amount) {
                            LJIL.LJJIIJ(1912660055);
                            c08370Un = new C08370Un(C91671ZyN.LIZ(LJIL).LIZJ, C79043V0l.LJIIIIZZ(20), C13640gC.LJLJI, null, null, 0L, null, null, C79043V0l.LJIIIIZZ(18), 196600);
                            LJIL.LJJJJJ(false);
                        } else {
                            LJIL.LJJIIJ(1912660246);
                            c08370Un = new C08370Un(C91671ZyN.LIZ(LJIL).LIZJ, C79043V0l.LJIIIIZZ(15), C13640gC.LJLILLLLZI, null, null, 0L, null, null, C79043V0l.LJIIIIZZ(18), 196600);
                            LJIL.LJJJJJ(false);
                        }
                        LIZ(c91872a1c.LIZ, c91872a1c.LIZIZ, c08370Un, LJIL, 0);
                        arrayList.add(C76800UCe.LIZ);
                    }
                } else {
                    LJIL.LIZLLL();
                }
            } else {
                LJIL.LIZLLL();
            }
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new C92661aEL(items, interfaceC07790Sh2, i, i2);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r7 == X.C24500xi.LIZIZ) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C92108a5Q r17, X.C92283a8F r18, java.lang.Boolean r19, X.InterfaceC65784Pro<X.C76800UCe> r20, X.InterfaceC24520xk r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91856a1M.LIZJ(X.a5Q, X.a8F, java.lang.Boolean, X.Pro, X.0xk, int, int):void");
    }
}
