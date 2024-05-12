package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a47, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92027a47 {
    public static final void LIZ(boolean z, String str, boolean z2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        float f;
        float f2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1988164471);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJI(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (((i2 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            InterfaceC07790Sh LJII = C09290Yb.LJII(C09290Yb.LJIILL(C78866UxK.LJIIL(c1m1, f)));
            float f3 = 5;
            if (z) {
                f2 = 0;
            } else {
                f2 = 10;
            }
            InterfaceC07790Sh LJIL2 = C70657RoD.LJIL(LJII, 0.0f, f3, 0.0f, f2, 5);
            C32371Ov c32371Ov = C0YW.LIZJ;
            LJIL.LJJIIJ(-483455358);
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIL2);
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
                LJIL.LJJIIJ(-1163856341);
                content.invoke(LJIL, Integer.valueOf((i2 >> 9) & 14));
                if (z) {
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    C92025a45.LIZ(str2, C70657RoD.LJIJJ(c1m1, 16, 0.0f, 2), LJIL, 48, 0);
                }
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
        LJJJJLI.LIZLLL = new C92951aJ1(z, str, z2, content, i);
    }
}
