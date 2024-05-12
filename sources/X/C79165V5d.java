package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS1S0121000_1;
import kotlin.jvm.internal.AqS26S0210000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.V5d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79165V5d {
    public static final Boolean LIZIZ(InterfaceC35811ar<Boolean> interfaceC35811ar) {
        return interfaceC35811ar.getValue();
    }

    public static final void LJ(boolean z, boolean z2, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        String LJIILLIIL;
        int i3;
        int i4;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1104279051);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i5 = 32;
        if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !LJIL.LIZ()) {
            if (z) {
                LJIL.LJJIIJ(-674315535);
                LJIILLIIL = V2B.LJIILLIIL(R.string.jgj, LJIL);
                LJIL.LJJJJJ(false);
            } else {
                LJIL.LJJIIJ(-674315440);
                LJIILLIIL = V2B.LJIILLIIL(R.string.jgi, LJIL);
                LJIL.LJJJJJ(false);
            }
            InterfaceC07790Sh LJII = C09290Yb.LJII(InterfaceC07790Sh.LJJJI);
            if (!z2) {
                i5 = 24;
            }
            C79053V0v.LIZIZ(LJIILLIIL, C70657RoD.LJIJJ(LJII, i5, 0.0f, 2), C79212V6y.LIZ(LJIL).LJIIIZ(), C79212V6y.LIZIZ(LJIL).LJIIJJI, 0L, new C22060tm(3), 0, false, 0, false, null, null, null, LJIL, 0, 0, 8144);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V7A(z, z2, i);
    }

    public static final void LJFF(boolean z, boolean z2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(1284316635);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = 32;
        if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !LJIL.LIZ()) {
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LJII = C09290Yb.LJII(c1m1);
            LJIL.LJJIIJ(-483455358);
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJII);
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
                C06460Ne.LIZLLL(0, LJIIL, V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, 2058660585, -1163856341);
                InterfaceC07790Sh LJIIIIZZ = C09290Yb.LJIIIIZZ(C09290Yb.LJII(c1m1), (float) 0.5d);
                if (!z2) {
                    i6 = 24;
                }
                C21690tB.LIZ(C70657RoD.LJIJJ(LJIIIIZZ, i6, 0.0f, 2), C79212V6y.LIZ(LJIL).LJII(), 0.0f, 0.0f, LJIL, 0, 12);
                C24920yO.LIZ(C79203V6p.LJLJL, C70657RoD.LJIL(C09290Yb.LJII(c1m1), 0.0f, 0.0f, 0.0f, 20, 7), new AqS26S0210000_1((Context) LJIL.LJIILLIIL(C04Q.LIZJ), interfaceC88472Yns, z, 3), LJIL, 48, 0);
                V52.LIZ(LJIL, false, false, false, false);
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
        LJJJJLI.LIZLLL = new AqS1S0121000_1(z, z2, interfaceC88472Yns, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r10 == X.C24500xi.LIZIZ) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(boolean r8, X.InterfaceC07790Sh r9, X.InterfaceC65784Pro<X.C76800UCe> r10, X.InterfaceC24520xk r11, int r12, int r13) {
        /*
            r4 = r9
            java.lang.String r0 = "onActionClick"
            r5 = r10
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r0 = 565830617(0x21b9e3d9, float:1.2596398E-18)
            r1 = r11
            X.1b3 r11 = r1.LJIL(r0)
            r7 = r13
            r0 = r7 & 1
            r3 = r8
            r6 = r12
            if (r0 == 0) goto La7
            r0 = r6 | 6
        L18:
            r2 = r7 & 2
            if (r2 == 0) goto L95
            r0 = r0 | 48
        L1e:
            r1 = r7 & 4
            if (r1 == 0) goto L84
            r0 = r0 | 384(0x180, float:5.38E-43)
        L24:
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L30
            boolean r0 = r11.LIZ()
            if (r0 != 0) goto L80
        L30:
            if (r2 == 0) goto L34
            X.1M1 r4 = X.InterfaceC07790Sh.LJJJI
        L34:
            X.V6g r8 = X.C79194V6g.LJLJL
            X.0Sh r9 = X.C09290Yb.LJII(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.LJJIIJ(r0)
            boolean r1 = r11.LJIJJ(r1)
            boolean r0 = r11.LJIJJ(r5)
            r1 = r1 | r0
            java.lang.Object r10 = r11.LJJJZ()
            if (r1 != 0) goto L5c
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r10 != r0) goto L65
        L5c:
            kotlin.jvm.internal.AqS53S0110000_10 r10 = new kotlin.jvm.internal.AqS53S0110000_10
            r0 = 2
            r10.<init>(r5, r3, r0)
            r11.LJLJLLL(r10)
        L65:
            r0 = 0
            r11.LJJJJJ(r0)
            X.Yns r10 = (X.InterfaceC88472Yns) r10
            r12 = 0
            r13 = r12
            X.C24920yO.LIZ(r8, r9, r10, r11, r12, r13)
        L70:
            X.1b9 r0 = r11.LJJJJLI()
            if (r0 != 0) goto L77
        L76:
            return
        L77:
            kotlin.jvm.internal.AqS0S0212000_13 r2 = new kotlin.jvm.internal.AqS0S0212000_13
            r8 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.LIZLLL = r2
            goto L76
        L80:
            r11.LIZLLL()
            goto L70
        L84:
            r1 = r6 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L24
            boolean r1 = r11.LJIJJ(r5)
            if (r1 == 0) goto L92
            r1 = 256(0x100, float:3.59E-43)
        L90:
            r0 = r0 | r1
            goto L24
        L92:
            r1 = 128(0x80, float:1.8E-43)
            goto L90
        L95:
            r1 = r6 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L1e
            boolean r1 = r11.LJIJJ(r4)
            if (r1 == 0) goto La4
            r1 = 32
        La1:
            r0 = r0 | r1
            goto L1e
        La4:
            r1 = 16
            goto La1
        La7:
            r0 = r6 & 14
            if (r0 != 0) goto Lb7
            boolean r0 = r11.LJI(r3)
            if (r0 == 0) goto Lb5
            r0 = 4
        Lb2:
            r0 = r0 | r6
            goto L18
        Lb5:
            r0 = 2
            goto Lb2
        Lb7:
            r0 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79165V5d.LIZJ(boolean, X.0Sh, X.Pro, X.0xk, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r12 == X.C24500xi.LIZIZ) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.String r9, X.InterfaceC07790Sh r10, int r11, X.InterfaceC65784Pro<X.C76800UCe> r12, X.InterfaceC24520xk r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79165V5d.LIZLLL(java.lang.String, X.0Sh, int, X.Pro, X.0xk, int, int):void");
    }

    public static final void LIZ(boolean z, boolean z2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        String LJIILLIIL;
        V68 LIZ;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-308177203);
        if ((i & 14) == 0) {
            if (LJIL.LJI(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i5 = 16384;
            } else {
                i5 = FileUtils.BUFFER_SIZE;
            }
            i2 |= i5;
        }
        if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((2995931 & i2) != 599186 || !LJIL.LIZ()) {
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                Object value = C62889OmD.LJI.getValue();
                if (value == null) {
                    value = Boolean.FALSE;
                }
                LJJJZ = C78966Uyw.LJJJIL(value);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJJJZ2 == c24490xh) {
                LJJJZ2 = C78966Uyw.LJJJIL(Boolean.valueOf(!LIZIZ(interfaceC35811ar).booleanValue()));
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJJJZ2;
            if (z) {
                LJIL.LJJIIJ(-349518333);
                LJIILLIIL = V2B.LJIILLIIL(R.string.jgn, LJIL);
                LJIL.LJJJJJ(false);
            } else {
                LJIL.LJJIIJ(-349518235);
                Boolean nonPersonalized = LIZIZ(interfaceC35811ar);
                o.LJIIIIZZ(nonPersonalized, "nonPersonalized");
                if (nonPersonalized.booleanValue()) {
                    LJIL.LJJIIJ(-349518204);
                    LJIILLIIL = V2B.LJIILLIIL(R.string.jgy, LJIL);
                    LJIL.LJJJJJ(false);
                } else {
                    LJIL.LJJIIJ(-349518114);
                    LJIILLIIL = V2B.LJIILLIIL(R.string.jgx, LJIL);
                    LJIL.LJJJJJ(false);
                }
                LJIL.LJJJJJ(false);
            }
            if (z2) {
                LIZ = V79.LIZIZ();
            } else {
                LIZ = V79.LIZ();
            }
            V66.LIZ(LIZ, null, null, null, null, C1DJ.LJ(LJIL, -1071938356, new C79168V5g(z2, interfaceC65784Pro, i2, z, interfaceC35811ar2, interfaceC88472Yns4, interfaceC88472Yns2, interfaceC35811ar, interfaceC88472Yns3, LJIILLIIL, interfaceC88472Yns)), LJIL, 196608, 30);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new A7T(z, z2, interfaceC88472Yns, interfaceC88472Yns2, interfaceC88472Yns3, interfaceC65784Pro, interfaceC88472Yns4, i);
    }
}
