package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.V0v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79053V0v {
    public static final C08370Un LIZJ(InterfaceC35811ar<C08370Un> interfaceC35811ar) {
        return interfaceC35811ar.getValue();
    }

    public static final C08370Un LIZLLL(long j, C22060tm c22060tm, C08370Un c08370Un) {
        C0VD c0vd = c08370Un.LIZ;
        long j2 = c0vd.LIZIZ;
        C13640gC c13640gC = c0vd.LIZJ;
        long j3 = c08370Un.LIZIZ.LIZJ;
        return c08370Un.LIZJ(new C08370Un(j, j2, c13640gC, c0vd.LIZLLL, c0vd.LJFF, c0vd.LJII, c0vd.LJIIL, c22060tm, j3, 175952));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03d3, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x037d, code lost:
    
        if (r13 == X.C24500xi.LIZIZ) goto L198;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C08440Uu r50, X.InterfaceC07790Sh r51, long r52, X.C08370Un r54, long r55, X.C22060tm r57, int r58, boolean r59, int r60, boolean r61, java.util.Map<java.lang.String, X.C18650oH> r62, X.InterfaceC88472Yns<? super X.C0VG, X.C76800UCe> r63, X.InterfaceC88471Ynr<? super X.C08410Ur<java.lang.String>, ? super java.lang.Boolean, X.C76800UCe> r64, X.InterfaceC24520xk r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79053V0v.LIZ(X.0Uu, X.0Sh, long, X.0Un, long, X.0tm, int, boolean, int, boolean, java.util.Map, X.Yns, X.Ynr, X.0xk, int, int, int):void");
    }

    public static final void LIZIZ(String text, InterfaceC07790Sh interfaceC07790Sh, long j, C08370Un c08370Un, long j2, C22060tm c22060tm, int i, boolean z, int i2, boolean z2, java.util.Map<String, C18650oH> map, InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C08410Ur<String>, ? super Boolean, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i3, int i4, int i5) {
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
        boolean z3;
        int i19;
        int i20 = i;
        C22060tm c22060tm2 = c22060tm;
        C08370Un c08370Un2 = c08370Un;
        long j3 = j2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        long j4 = j;
        int i21 = i2;
        boolean z4 = z2;
        java.util.Map<String, C18650oH> map2 = map;
        InterfaceC88472Yns<? super C0VG, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        InterfaceC88471Ynr<? super C08410Ur<String>, ? super Boolean, C76800UCe> interfaceC88471Ynr2 = interfaceC88471Ynr;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(959498774);
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
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i23 = i5 & 4;
        if (i23 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIIJ(j4)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i3 & 7168) == 0) {
            if ((i5 & 8) == 0 && LJIL.LJIJJ(c08370Un2)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i6 |= i19;
        }
        int i24 = i5 & 16;
        if (i24 != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (LJIL.LJIIJ(j3)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i6 |= i10;
        }
        int i25 = i5 & 32;
        if (i25 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (LJIL.LJIJJ(c22060tm2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i6 |= i11;
        }
        int i26 = i5 & 64;
        if (i26 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (LJIL.LJIIIZ(i20)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        int i27 = i5 & 128;
        if (i27 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (LJIL.LJI(z)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i6 |= i13;
        }
        int i28 = i5 & 256;
        if (i28 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (LJIL.LJIIIZ(i21)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i6 |= i14;
        }
        int i29 = i5 & 512;
        if (i29 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (LJIL.LJI(z4)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i6 |= i15;
        }
        int i30 = i5 & 1024;
        if (i30 != 0) {
            i16 = i4 | 2;
        } else {
            i16 = i4;
        }
        int i31 = i5 & 2048;
        if (i31 != 0) {
            i16 |= 48;
        } else if ((i4 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i16 |= i17;
        }
        int i32 = i5 & 4096;
        if (i32 != 0) {
            i16 |= 384;
        } else if ((i4 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i16 |= i18;
        }
        if (i30 != 1024 || (1533916891 & i6) != 306783378 || (i16 & 731) != 146 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i3 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i22 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i23 != 0) {
                    j4 = C11850dJ.LJI;
                }
                if ((i5 & 8) != 0) {
                    c08370Un2 = (C08370Un) LJIL.LJIILLIIL(C21430sl.LIZ);
                    i6 &= -7169;
                }
                if (i24 != 0) {
                    j3 = C23520w8.LIZJ;
                }
                if (i25 != 0) {
                    c22060tm2 = null;
                }
                z3 = true;
                if (i26 != 0) {
                    i20 = 1;
                }
                if (i27 == 0) {
                    z3 = z;
                }
                if (i28 != 0) {
                    i21 = Integer.MAX_VALUE;
                }
                if (i29 != 0) {
                    z4 = false;
                }
                if (i30 != 0) {
                    map2 = C113554cx.LJJJLIIL();
                    i16 &= -15;
                }
                if (i31 != 0) {
                    interfaceC88472Yns2 = C79055V0x.LJLIL;
                }
                if (i32 != 0) {
                    interfaceC88471Ynr2 = C79054V0w.LJLIL;
                }
            } else {
                LJIL.LIZLLL();
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                }
                if (i30 != 0) {
                    i16 &= -15;
                }
                z3 = z;
            }
            LJIL.LJJJJJL();
            LIZ(new C08440Uu(text, null, 6), interfaceC07790Sh2, j4, c08370Un2, j3, c22060tm2, i20, z3, i21, z4, map2, interfaceC88472Yns2, interfaceC88471Ynr2, LJIL, (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), (i16 & 112) | 8 | (i16 & 896), 0);
        } else {
            LJIL.LIZLLL();
            z3 = z;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C79052V0u(text, interfaceC07790Sh2, j4, c08370Un2, j3, c22060tm2, i20, z3, i21, z4, map2, interfaceC88472Yns2, interfaceC88471Ynr2, i3, i4, i5);
    }
}
