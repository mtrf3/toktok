package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18540o6 {
    public static final void LIZIZ(String text, InterfaceC07790Sh interfaceC07790Sh, C08370Un c08370Un, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, int i, boolean z, int i2, InterfaceC24520xk interfaceC24520xk, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long longValue;
        C08370Un style = c08370Un;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        int i13 = i;
        boolean z2 = z;
        int i14 = i2;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1022429478);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(style)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i17 = i4 & 8;
        if (i17 != 0) {
            i5 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i18 = i4 & 16;
        if (i18 != 0) {
            i5 |= 24576;
        } else if ((57344 & i3) == 0) {
            if (LJIL.LJIIIZ(i13)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        int i19 = i4 & 32;
        if (i19 != 0) {
            i5 |= 196608;
        } else if ((458752 & i3) == 0) {
            if (LJIL.LJI(z2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i20 = i4 & 64;
        if (i20 != 0) {
            i5 |= 1572864;
        } else if ((3670016 & i3) == 0) {
            if (LJIL.LJIIIZ(i14)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((i5 & 2995931) != 599186 || !LJIL.LIZ()) {
            if (i15 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i16 != 0) {
                style = C08370Un.LIZLLL;
            }
            if (i17 != 0) {
                interfaceC88472Yns2 = C23H.LJLIL;
            }
            if (i18 != 0) {
                i13 = 1;
            }
            if (i19 != 0) {
                z2 = true;
            }
            if (i20 != 0) {
                i14 = Integer.MAX_VALUE;
            }
            if (i14 > 0) {
                InterfaceC20310qx interfaceC20310qx = (InterfaceC20310qx) LJIL.LJIILLIIL(C20320qy.LIZ);
                C44031o7 c44031o7 = AnonymousClass057.LJ;
                InterfaceC23370vt density = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                InterfaceC13480fw fontFamilyResolver = (InterfaceC13480fw) LJIL.LJIILLIIL(AnonymousClass057.LJII);
                LJIL.LJJIIJ(959238313);
                if (interfaceC20310qx == null) {
                    longValue = 0;
                } else {
                    longValue = ((Number) C73975T1n.LJIIIIZZ(new Object[]{text, interfaceC20310qx}, C0MJ.LIZ(C23L.LJLIL, new IDqS443S0100000(interfaceC20310qx, 28)), new IDqS420S0100000(interfaceC20310qx, 143), LJIL, 4)).longValue();
                }
                LJIL.LJJJJJ(false);
                LJIL.LJJIIJ(-492369756);
                Object LJJJZ = LJIL.LJJJZ();
                InterfaceC24520xk.LIZ.getClass();
                if (LJJJZ == C24500xi.LIZIZ) {
                    LJJJZ = new C1XO(new C18860oc(new C18590oB(new C08440Uu(text, null, 6), style, i14, z2, i13, density, fontFamilyResolver, 128), longValue));
                    LJIL.LJLJLLL(LJJJZ);
                }
                LJIL.LJJJJJ(false);
                C1XO c1xo = (C1XO) LJJJZ;
                C18860oc c18860oc = c1xo.LJLIL;
                if (!LJIL.LJJIL) {
                    C18590oB current = c18860oc.LIZ;
                    o.LJIIIZ(current, "current");
                    o.LJIIIZ(style, "style");
                    o.LJIIIZ(density, "density");
                    o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
                    if (!o.LJ(current.LIZ.LJLIL, text) || !o.LJ(current.LIZIZ, style) || current.LIZLLL != z2 || current.LJ != i13 || current.LIZJ != i14 || !o.LJ(current.LJFF, density) || current.LJI != fontFamilyResolver) {
                        current = new C18590oB(new C08440Uu(text, null, 6), style, i14, z2, i13, density, fontFamilyResolver, 128);
                    }
                    c1xo.LJ(current);
                }
                c18860oc.getClass();
                o.LJIIIZ(interfaceC88472Yns2, "<set-?>");
                c18860oc.LIZJ = interfaceC88472Yns2;
                c1xo.LJFF(interfaceC20310qx);
                LJIL.LJJIIJ(959239630);
                if (interfaceC20310qx != null) {
                }
                LJIL.LJJJJJ(false);
                InterfaceC07790Sh LLLIIIL = interfaceC07790Sh2.LLLIIIL(c1xo.LJLJJL.LLLIIIL(c1xo.LJLJJLL).LLLIIIL(c1xo.LJLJL));
                C1XM c1xm = c1xo.LJLJJI;
                LJIL.LJJIIJ(544976794);
                Object LJIILLIIL = LJIL.LJIILLIIL(c44031o7);
                Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC07790Sh LIZJ = C07770Sf.LIZJ(LJIL, LLLIIIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                LJIL.LJJIIJ(1405779621);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(new IDqS420S0100000(c46041rM, 145));
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, c1xm, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                    C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LIZJ);
                    LJIL.LJIIIIZZ();
                    LJIL.LJIJ();
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } else {
                "maxLines should be greater than 0".toString();
                throw new IllegalArgumentException("maxLines should be greater than 0");
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C23I(text, interfaceC07790Sh2, style, interfaceC88472Yns2, i13, z2, i14, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0371 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0372  */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C08440Uu r26, X.InterfaceC07790Sh r27, X.C08370Un r28, X.InterfaceC88472Yns<? super X.C0VG, X.C76800UCe> r29, int r30, boolean r31, int r32, java.util.Map<java.lang.String, X.C18650oH> r33, X.InterfaceC24520xk r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18540o6.LIZ(X.0Uu, X.0Sh, X.0Un, X.Yns, int, boolean, int, java.util.Map, X.0xk, int, int):void");
    }
}
