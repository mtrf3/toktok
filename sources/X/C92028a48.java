package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.a48, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92028a48 {
    public static final void LIZ(String title, String buttonTitle, InterfaceC07790Sh interfaceC07790Sh, boolean z, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long LIZLLL;
        boolean z2;
        boolean z3 = z;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        String str2 = str;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(buttonTitle, "buttonTitle");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1327460827);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(title)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(buttonTitle)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(str2)) {
                i7 = 16384;
            } else {
                i7 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i7;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if (((i3 & 369371) ^ 73874) != 0 || !LJIL.LIZ()) {
            if (i9 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if ((i2 & 8) != 0) {
                z3 = false;
            }
            if (i10 != 0) {
                str2 = null;
            }
            if (i11 != 0) {
                interfaceC65784Pro2 = C92953aJ3.LJLIL;
            }
            InterfaceC07760Se.LJJJ.getClass();
            C31611Lx c31611Lx = C07730Sb.LJIILJJIL;
            C32301Oo c32301Oo = C0YW.LJ;
            int i12 = ((i3 >> 6) & 14) | 432;
            LJIL.LJJIIJ(-483455358);
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32301Oo, c31611Lx, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i13 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i13 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                if (((i13 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    if ((((((i12 >> 6) & 112) | 6) & 81) ^ 16) != 0 || !LJIL.LIZ()) {
                        AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.kc, LJIL);
                        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                        InterfaceC07790Sh LJIIJJI = C09290Yb.LJIIJJI(c1m1, 72);
                        if (C91671ZyN.LIZ) {
                            LIZLLL = C78897Uxp.LIZLLL(1461065763);
                        } else {
                            LIZLLL = C78897Uxp.LIZLLL(1476395007);
                        }
                        C0SR.LIZ(LJJIIZ, null, LJIIJJI, null, null, 0.0f, C11860dK.LIZIZ(LIZLLL), LJIL, 440, 56);
                        float f = 20;
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f), LJIL, 6);
                        C21430sl.LIZIZ(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJ(C21350sd.LIZJ(LJIL), LJIL), C91733ZzN.LIZIZ(), 0L, null, null, 262142), LJIL, i3 & 14, 0, 32766);
                        LJIL.LJJIIJ(140712836);
                        if (str2 != null) {
                            C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 12), LJIL, 6);
                            C21430sl.LIZIZ(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJ(C21350sd.LIZJ(LJIL), LJIL), C91733ZzN.LIZIZ(), 0L, null, null, 262142), LJIL, (i3 >> 12) & 14, 0, 32766);
                        }
                        z2 = false;
                        LJIL.LJJJJJ(false);
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f), LJIL, 6);
                        C91973a3F.LIZ(buttonTitle, Integer.valueOf(R.drawable.b3f), true, false, C92369a9d.LIZJ, interfaceC65784Pro2, LJIL, ((i3 >> 3) & 14) | 33152 | (i3 & 458752), 8);
                        LJIL.LJJJJJ(z2);
                        LJIL.LJJJJJ(z2);
                        LJIL.LJIJ();
                        LJIL.LJJJJJ(z2);
                        LJIL.LJJJJJ(z2);
                    } else {
                        LJIL.LIZLLL();
                    }
                } else {
                    LJIL.LIZLLL();
                }
                z2 = false;
                LJIL.LJJJJJ(z2);
                LJIL.LJJJJJ(z2);
                LJIL.LJIJ();
                LJIL.LJJJJJ(z2);
                LJIL.LJJJJJ(z2);
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
        LJJJJLI.LIZLLL = new C92954aJ4(title, buttonTitle, interfaceC07790Sh2, z3, str2, interfaceC65784Pro2, i, i2);
    }
}
