package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.a58, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92090a58 {
    public static final void LIZ(String title, String buttonTitle, InterfaceC07790Sh interfaceC07790Sh, boolean z, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        boolean z2 = z;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        String str2 = str;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(buttonTitle, "buttonTitle");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1925983994);
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
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(str2)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if (((i3 & 374491) ^ 74898) != 0 || !LJIL.LIZ()) {
            if (i11 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i12 != 0) {
                z2 = false;
            }
            if (i13 != 0) {
                str2 = null;
            }
            if (i14 != 0) {
                interfaceC65784Pro2 = C93006aJu.LJLIL;
            }
            float f2 = ((C92121a5d) LJIL.LJIILLIIL(C91674ZyQ.LIZ)).LJLIL;
            InterfaceC07760Se.LJJJ.getClass();
            C31611Lx c31611Lx = C07730Sb.LJIILJJIL;
            C32301Oo c32301Oo = C0YW.LJ;
            int i15 = ((i3 >> 6) & 14) | 432;
            LJIL.LJJIIJ(-483455358);
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32301Oo, c31611Lx, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i16 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i16 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                if (((i16 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    C1P2 c1p2 = C1P2.LIZ;
                    int i17 = ((i15 >> 6) & 112) | 6;
                    if ((i17 & 14) == 0) {
                        if (LJIL.LJIJJ(c1p2)) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        i17 |= i10;
                    }
                    if (((i17 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
                        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                        if (z2) {
                            f = 142;
                        } else {
                            f = (float) 21.5d;
                        }
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, f), LJIL, 0);
                        C0SR.LIZ(C79081V1x.LJJIIZ(R.drawable.k_, LJIL), null, C09290Yb.LJIIJJI(c1m1, 80), null, null, 0.0f, null, LJIL, 440, LiveTryModeCountDownThresholdSetting.DEFAULT);
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 24), LJIL, 6);
                        C21430sl.LIZIZ(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJ(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LIZJ, 0L, null, null, 262142), LJIL, i3 & 14, 0, 32766);
                        LJIL.LJJIIJ(-1986532374);
                        if (str2 != null) {
                            C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 8), LJIL, 6);
                            C21430sl.LIZIZ(str2, null, 0L, 0L, null, null, null, 0L, null, new C22060tm(3), 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJFF(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LJ, 0L, null, null, 262142), LJIL, (i3 >> 12) & 14, 0, 32254);
                        }
                        LJIL.LJJJJJ(false);
                        C79057V0z.LJ(C1P1.LIZLLL(c1m1), LJIL, 0);
                        C91986a3S.LIZ(null, buttonTitle, null, true, false, null, f2, null, null, null, null, interfaceC65784Pro2, LJIL, (i3 & 112) | 3072, (i3 >> 12) & 112, 1973);
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(c1m1, 12), LJIL, 6);
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
        LJJJJLI.LIZLLL = new C93007aJv(title, buttonTitle, interfaceC07790Sh2, z2, str2, interfaceC65784Pro2, i, i2);
    }
}
