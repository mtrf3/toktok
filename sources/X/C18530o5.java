package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.0o5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18530o5 {
    public static final void LIZ(String value, InterfaceC88472Yns<? super String, C76800UCe> onValueChange, InterfaceC07790Sh interfaceC07790Sh, boolean z, boolean z2, C08370Un c08370Un, C18880oe c18880oe, C18850ob c18850ob, boolean z3, int i, InterfaceC14810i5 interfaceC14810i5, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, C1OH c1oh, AbstractC11740d8 abstractC11740d8, InterfaceC88473Ynt<? super InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C18850ob c18850ob2 = c18850ob;
        C18880oe c18880oe2 = c18880oe;
        C08370Un c08370Un2 = c08370Un;
        boolean z4 = z2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z5 = z;
        AbstractC11740d8 abstractC11740d82 = abstractC11740d8;
        boolean z6 = z3;
        InterfaceC88473Ynt<? super InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt2 = interfaceC88473Ynt;
        int i21 = i;
        InterfaceC14810i5 interfaceC14810i52 = interfaceC14810i5;
        InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        C1OH c1oh2 = c1oh;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(onValueChange, "onValueChange");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-454732590);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(value)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(onValueChange)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i23 = i4 & 8;
        int i24 = 1024;
        if (i23 != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJI(z5)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i25 = i4 & 16;
        int i26 = 16384;
        if (i25 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (LJIL.LJI(z4)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        int i27 = i4 & 32;
        if (i27 != 0) {
            i5 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (LJIL.LJIJJ(c08370Un2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i28 = i4 & 64;
        if (i28 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (LJIL.LJIJJ(c18880oe2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        int i29 = i4 & 128;
        if (i29 != 0) {
            i5 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJIJJ(c18850ob2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i5 |= i13;
        }
        int i30 = i4 & 256;
        if (i30 != 0) {
            i5 |= 100663296;
        } else if ((234881024 & i2) == 0) {
            if (LJIL.LJI(z6)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i5 |= i14;
        }
        int i31 = i4 & 512;
        if (i31 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (LJIL.LJIIIZ(i21)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i5 |= i15;
        }
        int i32 = i4 & 1024;
        if (i32 != 0) {
            i16 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC14810i52)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i3 | i17;
        } else {
            i16 = i3;
        }
        int i33 = i4 & 2048;
        if (i33 != 0) {
            i16 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i16 |= i18;
        }
        int i34 = i4 & 4096;
        if (i34 != 0) {
            i16 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(c1oh2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i16 |= i19;
        }
        if ((i3 & 7168) == 0) {
            if ((i4 & FileUtils.BUFFER_SIZE) == 0 && LJIL.LJIJJ(abstractC11740d82)) {
                i24 = 2048;
            }
            i16 |= i24;
        }
        int i35 = i4 & 16384;
        if (i35 != 0) {
            i16 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (!LJIL.LJIJJ(interfaceC88473Ynt2)) {
                i26 = FileUtils.BUFFER_SIZE;
            }
            i16 |= i26;
        }
        if ((1533916891 & i5) != 306783378 || (46811 & i16) != 9362 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i22 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i23 != 0) {
                    z5 = true;
                }
                if (i25 != 0) {
                    z4 = false;
                }
                if (i27 != 0) {
                    c08370Un2 = C08370Un.LIZLLL;
                }
                if (i28 != 0) {
                    c18880oe2 = C18880oe.LJ;
                }
                if (i29 != 0) {
                    c18850ob2 = C18850ob.LJI;
                }
                if (i30 != 0) {
                    z6 = false;
                }
                if (i31 != 0) {
                    i21 = Integer.MAX_VALUE;
                }
                if (i32 != 0) {
                    InterfaceC14810i5.LIZ.getClass();
                    interfaceC14810i52 = C1U3.LIZIZ;
                }
                if (i33 != 0) {
                    interfaceC88472Yns2 = C23C.LJLIL;
                }
                if (i34 != 0) {
                    LJIL.LJJIIJ(-492369756);
                    Object LJJJZ = LJIL.LJJJZ();
                    InterfaceC24520xk.LIZ.getClass();
                    if (LJJJZ == C24500xi.LIZIZ) {
                        LJJJZ = new C42191l9();
                        LJIL.LJLJLLL(LJJJZ);
                    }
                    LJIL.LJJJJJ(false);
                    c1oh2 = (C1OH) LJJJZ;
                }
                if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
                    abstractC11740d82 = new C32691Qb(C11850dJ.LIZIZ);
                    i16 &= -7169;
                }
                if (i35 != 0) {
                    interfaceC88473Ynt2 = C18640oG.LIZ;
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
                    i16 &= -7169;
                }
            }
            LJIL.LJJJJJL();
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ2 == c24490xh) {
                LJJJZ2 = C78966Uyw.LJJJIL(new C15010iP(value, 0L, 6));
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ2;
            C15010iP LIZIZ = C15010iP.LIZIZ((C15010iP) interfaceC35811ar.getValue(), value);
            LJIL.LJJIIJ(511388516);
            boolean LJIJJ = LJIL.LJIJJ(LIZIZ) | LJIL.LJIJJ(interfaceC35811ar);
            Object LJJJZ3 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ3 == c24490xh) {
                LJJJZ3 = new IDqS176S0200000(interfaceC35811ar, LIZIZ, 42);
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LJI((InterfaceC65784Pro) LJJJZ3, LJIL);
            LJIL.LJJIIJ(1157296644);
            boolean LJIJJ2 = LJIL.LJIJJ(value);
            Object LJJJZ4 = LJIL.LJJJZ();
            if (LJIJJ2 || LJJJZ4 == c24490xh) {
                LJJJZ4 = C78966Uyw.LJJJIL(value);
                LJIL.LJLJLLL(LJJJZ4);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJJJZ4;
            c18880oe2.getClass();
            C14870iB c14870iB = new C14870iB(z6, c18880oe2.LIZ, c18880oe2.LIZIZ, c18880oe2.LIZJ, c18880oe2.LIZLLL);
            boolean z7 = !z6;
            if (z6) {
                i20 = 1;
            } else {
                i20 = i21;
            }
            LJIL.LJJIIJ(1618982084);
            boolean LJIJJ3 = LJIL.LJIJJ(interfaceC35811ar) | LJIL.LJIJJ(interfaceC35811ar2) | LJIL.LJIJJ(onValueChange);
            Object LJJJZ5 = LJIL.LJJJZ();
            if (LJIJJ3 || LJJJZ5 == c24490xh) {
                LJJJZ5 = new IDqS28S0300000(onValueChange, (InterfaceC88472Yns<? super String, C76800UCe>) interfaceC35811ar, (InterfaceC35811ar<C15010iP>) interfaceC35811ar2, (InterfaceC35811ar<String>) 22);
                LJIL.LJLJLLL(LJJJZ5);
            }
            LJIL.LJJJJJ(false);
            int i36 = i16 << 12;
            int i37 = i5 >> 3;
            C18750oR.LIZ(LIZIZ, (InterfaceC88472Yns) LJJJZ5, interfaceC07790Sh2, c08370Un2, interfaceC14810i52, interfaceC88472Yns2, c1oh2, abstractC11740d82, z7, i20, c14870iB, c18850ob2, z5, z4, interfaceC88473Ynt2, LJIL, (i5 & 896) | ((i5 >> 6) & 7168) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128), (i37 & 7168) | ((i5 >> 18) & 112) | (i37 & 896) | (i16 & 57344), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C23D(value, onValueChange, interfaceC07790Sh2, z5, z4, c08370Un2, c18880oe2, c18850ob2, z6, i21, interfaceC14810i52, interfaceC88472Yns2, c1oh2, abstractC11740d82, interfaceC88473Ynt2, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        if (r10 == X.C24500xi.LIZIZ) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C15010iP r33, X.InterfaceC88472Yns<? super X.C15010iP, X.C76800UCe> r34, X.InterfaceC07790Sh r35, boolean r36, boolean r37, X.C08370Un r38, X.C18880oe r39, X.C18850ob r40, boolean r41, int r42, X.InterfaceC14810i5 r43, X.InterfaceC88472Yns<? super X.C0VG, X.C76800UCe> r44, X.C1OH r45, X.AbstractC11740d8 r46, X.InterfaceC88473Ynt<? super X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe>, ? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r47, X.InterfaceC24520xk r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18530o5.LIZIZ(X.0iP, X.Yns, X.0Sh, boolean, boolean, X.0Un, X.0oe, X.0ob, boolean, int, X.0i5, X.Yns, X.1OH, X.0d8, X.Ynt, X.0xk, int, int, int):void");
    }
}
