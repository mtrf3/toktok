package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.0sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21430sl {
    public static final C44021o6 LIZ = C24410xZ.LIZIZ(C36041bE.LIZ, C525024g.LJLIL);

    public static final void LIZ(C08370Un value, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1772272796);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(value)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(content)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !LJIL.LIZ()) {
            C44021o6 c44021o6 = LIZ;
            C24410xZ.LIZ(new C24620xu[]{c44021o6.LIZIZ(((C08370Un) LJIL.LJIILLIIL(c44021o6)).LIZJ(value))}, content, LJIL, (i2 & 112) | 8);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000(value, (C08370Un) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 15);
    }

    public static final void LIZIZ(String text, InterfaceC07790Sh interfaceC07790Sh, long j, long j2, C13570g5 c13570g5, C13640gC c13640gC, AbstractC13490fx abstractC13490fx, long j3, C22080to c22080to, C22060tm c22060tm, long j4, int i, boolean z, int i2, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, C08370Un c08370Un, InterfaceC24520xk interfaceC24520xk, int i3, int i4, int i5) {
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
        C22060tm c22060tm2;
        long LIZIZ;
        int i21;
        C13570g5 c13570g52 = c13570g5;
        long j5 = j2;
        C08370Un c08370Un2 = c08370Un;
        C13640gC c13640gC2 = c13640gC;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        AbstractC13490fx abstractC13490fx2 = abstractC13490fx;
        long j6 = j;
        long j7 = j3;
        C22080to c22080to2 = c22080to;
        long j8 = j4;
        int i22 = i;
        boolean z2 = z;
        int i23 = i2;
        C22060tm c22060tm3 = c22060tm;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-366126944);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i3;
        } else {
            i6 = i3;
        }
        int i24 = i5 & 2;
        if (i24 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i25 = i5 & 4;
        if (i25 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIIJ(j6)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        int i26 = i5 & 8;
        int i27 = 1024;
        if (i26 != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJIIJ(j5)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        int i28 = i5 & 16;
        int i29 = FileUtils.BUFFER_SIZE;
        if (i28 != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (LJIL.LJIJJ(c13570g52)) {
                i11 = 16384;
            } else {
                i11 = FileUtils.BUFFER_SIZE;
            }
            i6 |= i11;
        }
        int i30 = i5 & 32;
        if (i30 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (LJIL.LJIJJ(c13640gC2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        int i31 = i5 & 64;
        if (i31 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (LJIL.LJIJJ(abstractC13490fx2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        int i32 = i5 & 128;
        if (i32 != 0) {
            i6 |= 12582912;
        } else if ((29360128 & i3) == 0) {
            if (LJIL.LJIIJ(j7)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i6 |= i14;
        }
        int i33 = i5 & 256;
        if (i33 != 0) {
            i6 |= 100663296;
        } else if ((234881024 & i3) == 0) {
            if (LJIL.LJIJJ(c22080to2)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i6 |= i15;
        }
        int i34 = i5 & 512;
        if (i34 != 0) {
            i6 |= 805306368;
        } else if ((1879048192 & i3) == 0) {
            if (LJIL.LJIJJ(c22060tm3)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i6 |= i16;
        }
        int i35 = i5 & 1024;
        if (i35 != 0) {
            i17 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (LJIL.LJIIJ(j8)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i4 | i18;
        } else {
            i17 = i4;
        }
        int i36 = i5 & 2048;
        if (i36 != 0) {
            i17 |= 48;
        } else if ((i4 & 112) == 0) {
            if (LJIL.LJIIIZ(i22)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i17 |= i19;
        }
        int i37 = i5 & 4096;
        if (i37 != 0) {
            i17 |= 384;
        } else if ((i4 & 896) == 0) {
            if (LJIL.LJI(z2)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i17 |= i20;
        }
        int i38 = i5 & FileUtils.BUFFER_SIZE;
        if (i38 != 0) {
            i17 |= 3072;
        } else if ((i4 & 7168) == 0) {
            if (LJIL.LJIIIZ(i23)) {
                i27 = 2048;
            }
            i17 |= i27;
        }
        int i39 = i5 & 16384;
        if (i39 != 0) {
            i17 |= 24576;
        } else if ((i4 & 57344) == 0) {
            i39 = 0;
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i29 = 16384;
            }
            i17 |= i29;
        }
        if ((i4 & 458752) == 0) {
            if ((i5 & 32768) == 0 && LJIL.LJIJJ(c08370Un2)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i17 |= i21;
        }
        if ((1533916891 & i6) != 306783378 || (374491 & i17) != 74898 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i3 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i24 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i25 != 0) {
                    j6 = C11850dJ.LJI;
                }
                if (i26 != 0) {
                    j5 = C23520w8.LIZJ;
                }
                c22060tm2 = null;
                if (i28 != 0) {
                    c13570g52 = null;
                }
                if (i30 != 0) {
                    c13640gC2 = null;
                }
                if (i31 != 0) {
                    abstractC13490fx2 = null;
                }
                if (i32 != 0) {
                    j7 = C23520w8.LIZJ;
                }
                if (i33 != 0) {
                    c22080to2 = null;
                }
                if (i34 == 0) {
                    c22060tm2 = c22060tm3;
                }
                if (i35 != 0) {
                    j8 = C23520w8.LIZJ;
                }
                if (i36 != 0) {
                    i22 = 1;
                }
                if (i37 != 0) {
                    z2 = true;
                }
                if (i38 != 0) {
                    i23 = Integer.MAX_VALUE;
                }
                if (i39 != 0) {
                    interfaceC88472Yns2 = C525124h.LJLIL;
                }
                if ((i5 & 32768) != 0) {
                    c08370Un2 = (C08370Un) LJIL.LJIILLIIL(LIZ);
                    i17 &= -458753;
                }
            } else {
                LJIL.LIZLLL();
                if ((i5 & 32768) != 0) {
                    i17 &= -458753;
                }
                c22060tm2 = c22060tm3;
            }
            LJIL.LJJJJJL();
            LJIL.LJJIIJ(1557613088);
            long j9 = C11850dJ.LJI;
            if (j6 != j9) {
                LIZIZ = j6;
            } else {
                LIZIZ = c08370Un2.LIZIZ();
                if (LIZIZ == j9) {
                    LIZIZ = C11850dJ.LIZIZ(((C11850dJ) LJIL.LJIILLIIL(C21620t4.LIZ)).LIZ, ((Number) LJIL.LJIILLIIL(C21610t3.LIZ)).floatValue());
                }
            }
            LJIL.LJJJJJ(false);
            c22060tm3 = c22060tm2;
            c13640gC2 = c13640gC2;
            c13570g52 = c13570g52;
            abstractC13490fx2 = abstractC13490fx2;
            c22080to2 = c22080to2;
            int i40 = i17 << 9;
            C18540o6.LIZIZ(text, interfaceC07790Sh2, c08370Un2.LIZJ(new C08370Un(LIZIZ, j5, c13640gC2, c13570g52, abstractC13490fx2, j7, c22080to2, c22060tm2, j8, 175952)), interfaceC88472Yns2, i22, z2, i23, LJIL, (i6 & 112) | (i6 & 14) | ((i17 >> 3) & 7168) | (i40 & 57344) | (i40 & 458752) | (i40 & 3670016), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C525224i(text, interfaceC07790Sh2, j6, j5, c13570g52, c13640gC2, abstractC13490fx2, j7, c22080to2, c22060tm3, j8, i22, z2, i23, interfaceC88472Yns2, c08370Un2, i3, i4, i5);
    }
}
