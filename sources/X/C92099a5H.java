package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS12S0101000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a5H, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92099a5H {
    public static final void LIZ(InterfaceC91781a09 interfaceC91781a09, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        Integer valueOf;
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1980256896);
        if (!o.LJ(interfaceC91781a09, C92379a9n.LIZ)) {
            if (o.LJ(interfaceC91781a09, C92380a9o.LIZ)) {
                if (C91671ZyN.LIZ) {
                    i5 = R.drawable.jw;
                } else {
                    i5 = R.drawable.jx;
                }
                valueOf = Integer.valueOf(i5);
            } else if (o.LJ(interfaceC91781a09, C92381a9p.LIZ)) {
                if (C91671ZyN.LIZ) {
                    i4 = R.drawable.jy;
                } else {
                    i4 = R.drawable.jz;
                }
                valueOf = Integer.valueOf(i4);
            } else if (o.LJ(interfaceC91781a09, C92378a9m.LIZ)) {
                if (C91671ZyN.LIZ) {
                    i3 = R.drawable.ju;
                } else {
                    i3 = R.drawable.jv;
                }
                valueOf = Integer.valueOf(i3);
            } else if (o.LJ(interfaceC91781a09, C92382a9q.LIZ)) {
                if (C91671ZyN.LIZ) {
                    i2 = R.drawable.k0;
                } else {
                    i2 = R.drawable.k1;
                }
                valueOf = Integer.valueOf(i2);
            }
            if (valueOf != null) {
                C0SR.LIZ(C79081V1x.LJJIIZ(valueOf.intValue(), LJIL), "", C09290Yb.LJIIJJI(C70657RoD.LJIL(InterfaceC07790Sh.LJJJI, 0.0f, 0.0f, 8, 0.0f, 11), 20), null, null, 0.0f, null, LJIL, 440, LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS12S0101000_31(interfaceC91781a09, i, 7);
    }

    public static final void LIZJ(String message, InterfaceC91781a09 interfaceC91781a09, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        o.LJIIIZ(message, "message");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1549421462);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(message)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if ((2 & (~i2)) != 0 || ((i3 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            if (i5 != 0) {
                interfaceC91781a09 = C92379a9n.LIZ;
            }
            C09300Yc.LIZ(null, null, false, C1DJ.LJ(LJIL, -819890522, new C93026aKE(40, interfaceC91781a09, message, i3)), LJIL, 3072, 7);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C93027aKF(message, interfaceC91781a09, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(InterfaceC35811ar<Boolean> show, String message, InterfaceC91781a09 interfaceC91781a09, long j, int i, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2 = j;
        InterfaceC91781a09 interfaceC91781a092 = interfaceC91781a09;
        int i11 = i;
        boolean z2 = z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(show, "show");
        o.LJIIIZ(message, "message");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1730610102);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(show)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(message)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIIJ(j2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIIIZ(i11)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i8;
        }
        int i15 = i3 & 32;
        if (i15 != 0) {
            i4 |= 196608;
        } else if ((458752 & i2) == 0) {
            if (LJIL.LJI(z2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        int i16 = i3 & 64;
        if (i16 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        if (((~i3) & 4) != 0 || ((2995931 & i4) ^ 599186) != 0 || !LJIL.LIZ()) {
            if (i12 != 0) {
                interfaceC91781a092 = C92379a9n.LIZ;
            }
            if (i13 != 0) {
                j2 = 3000;
            }
            if (i14 != 0) {
                i11 = 10;
            }
            if (i15 != 0) {
                z2 = true;
            }
            if (i16 != 0) {
                interfaceC65784Pro2 = C93023aKB.LJLIL;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = new C0Q5(Boolean.FALSE);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            C0Q5 c0q5 = (C0Q5) LJJJZ;
            c0q5.LIZIZ.setValue(show.getValue());
            if (((Boolean) c0q5.LIZ.getValue()).booleanValue() || ((Boolean) c0q5.LIZIZ.getValue()).booleanValue() || !o.LJ(c0q5.LIZ.getValue(), c0q5.LIZIZ.getValue()) || ((Boolean) c0q5.LIZJ.getValue()).booleanValue()) {
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(j2);
                LJIL.LJJIIJ(1618982084);
                boolean LJIJJ = LJIL.LJIJJ(valueOf2) | LJIL.LJIJJ(show) | LJIL.LJIJJ(interfaceC65784Pro2);
                Object LJJJZ2 = LJIL.LJJJZ();
                if (LJIJJ || LJJJZ2 == c24490xh) {
                    LJJJZ2 = new C93155aMJ(j2, show, interfaceC65784Pro2, null);
                    LJIL.LJLJLLL(LJJJZ2);
                }
                LJIL.LJJJJJ(false);
                C24610xt.LIZLLL(valueOf, show, (InterfaceC88471Ynr) LJJJZ2, LJIL);
                InterfaceC07790Sh LJI = C09290Yb.LJI(InterfaceC07790Sh.LJJJI);
                LJIL.LJJIIJ(733328855);
                InterfaceC07760Se.LJJJ.getClass();
                InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, false, LJIL);
                LJIL.LJJIIJ(-1323940314);
                Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
                Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(LJI);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                    LJIL.LJJIIJ(2058660585);
                    LJIL.LJJIIJ(-2137368960);
                    C25830zr.LIZIZ(C07730Sb.LIZJ, C78939UyV.LIZ(0, i11), null, null, C1DJ.LJ(LJIL, -819893254, new C93024aKC(z2, c0q5, message, interfaceC91781a092, i4)), LJIL, 24582, 12);
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                    LJIL.LJIJ();
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C93025aKD(show, message, interfaceC91781a092, j2, i11, z2, interfaceC65784Pro2, i2, i3);
    }
}
