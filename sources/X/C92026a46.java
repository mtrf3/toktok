package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a46, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92026a46 {
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d8, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0239, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C15010iP r76, X.InterfaceC88472Yns<? super X.C15010iP, X.C76800UCe> r77, X.InterfaceC88472Yns<? super java.lang.Boolean, X.C76800UCe> r78, int r79, X.C18880oe r80, X.C18850ob r81, X.InterfaceC14810i5 r82, java.lang.String r83, java.lang.String r84, boolean r85, boolean r86, boolean r87, X.InterfaceC65784Pro<X.C76800UCe> r88, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r89, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r90, boolean r91, int r92, X.C1OH r93, X.InterfaceC07790Sh r94, X.InterfaceC24520xk r95, int r96, int r97) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92026a46.LIZIZ(X.0iP, X.Yns, X.Yns, int, X.0oe, X.0ob, X.0i5, java.lang.String, java.lang.String, boolean, boolean, boolean, X.Pro, X.Ynr, X.Ynr, boolean, int, X.1OH, X.0Sh, X.0xk, int, int):void");
    }

    public static final void LIZ(String value, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, C18880oe c18880oe, C18850ob c18850ob, InterfaceC14810i5 interfaceC14810i5, String str, String str2, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, boolean z4, int i2, C1OH c1oh, InterfaceC24520xk interfaceC24520xk, int i3, int i4, int i5) {
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
        int i21;
        int i22;
        int i23;
        C1OH c1oh2;
        int i24;
        int i25;
        C1OH c1oh3 = c1oh;
        C18850ob c18850ob2 = c18850ob;
        C18880oe c18880oe2 = c18880oe;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
        boolean z5 = z3;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z6 = z;
        int i26 = i;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns;
        boolean z7 = z2;
        InterfaceC14810i5 interfaceC14810i52 = interfaceC14810i5;
        String str3 = str;
        String str4 = str2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = interfaceC88471Ynr;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr2;
        boolean z8 = z4;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1359217054);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(value)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        int i29 = i5 & 8;
        int i30 = 1024;
        if (i29 != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        int i31 = i3 & 57344;
        int i32 = FileUtils.BUFFER_SIZE;
        if (i31 == 0) {
            if ((i5 & 16) == 0 && LJIL.LJIIIZ(i26)) {
                i25 = 16384;
            } else {
                i25 = FileUtils.BUFFER_SIZE;
            }
            i6 |= i25;
        }
        if ((i3 & 458752) == 0) {
            if ((i5 & 32) == 0 && LJIL.LJIJJ(c18880oe2)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i6 |= i24;
        }
        int i33 = i5 & 64;
        if (i33 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (LJIL.LJIJJ(c18850ob2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        int i34 = i5 & 128;
        if (i34 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (LJIL.LJIJJ(interfaceC14810i52)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i6 |= i12;
        }
        int i35 = i5 & 256;
        if (i35 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i6 |= i13;
        }
        int i36 = i5 & 512;
        if (i36 != 0) {
            i6 |= 805306368;
        } else if ((1879048192 & i3) == 0) {
            if (LJIL.LJIJJ(str4)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i6 |= i14;
        }
        int i37 = i5 & 1024;
        if (i37 != 0) {
            i15 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (LJIL.LJI(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i4 | i16;
        } else {
            i15 = i4;
        }
        int i38 = i5 & 2048;
        if (i38 != 0) {
            i15 |= 48;
        } else if ((i4 & 112) == 0) {
            if (LJIL.LJI(z7)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        int i39 = i5 & 4096;
        if (i39 != 0) {
            i15 |= 384;
        } else if ((i4 & 896) == 0) {
            if (LJIL.LJI(z5)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        int i40 = i5 & FileUtils.BUFFER_SIZE;
        if (i40 != 0) {
            i15 |= 3072;
        } else if ((i4 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i30 = 2048;
            }
            i15 |= i30;
        }
        int i41 = i5 & 16384;
        if (i41 != 0) {
            i15 |= 24576;
        } else if ((i4 & 57344) == 0) {
            i41 = 0;
            if (LJIL.LJIJJ(interfaceC88471Ynr3)) {
                i32 = 16384;
            }
            i15 |= i32;
        }
        int i42 = i5 & 32768;
        if (i42 != 0) {
            i15 |= 196608;
        } else if ((i4 & 458752) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr4)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i15 |= i19;
        }
        int i43 = i5 & 65536;
        if (i43 != 0) {
            i15 |= 1572864;
        } else if ((i4 & 3670016) == 0) {
            if (LJIL.LJI(z8)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i15 |= i20;
        }
        int i44 = i5 & 131072;
        if (i44 != 0) {
            i15 |= 12582912;
        } else if ((i4 & 29360128) == 0) {
            if (LJIL.LJIIIZ(i2)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i15 |= i21;
        }
        int i45 = i5 & 262144;
        if (i45 != 0) {
            i15 |= 100663296;
        } else if ((i4 & 234881024) == 0) {
            if (LJIL.LJIJJ(c1oh3)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i15 |= i22;
        }
        if (((i6 & 1533916891) ^ 306783378) != 0 || ((i15 & 191739611) ^ 38347922) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i3 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i27 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i28 != 0) {
                    interfaceC88472Yns4 = C92941aIr.LJLIL;
                }
                if (i29 != 0) {
                    interfaceC88472Yns3 = C92942aIs.LJLIL;
                }
                i23 = 1;
                if ((i5 & 16) != 0) {
                    i6 &= -57345;
                    i26 = 1;
                }
                if ((i5 & 32) != 0) {
                    c18880oe2 = C18880oe.LJ;
                    i6 &= -458753;
                }
                if (i33 != 0) {
                    c18850ob2 = null;
                }
                if (i34 != 0) {
                    InterfaceC14810i5.LIZ.getClass();
                    interfaceC14810i52 = C1U3.LIZIZ;
                }
                if (i35 != 0) {
                    str3 = null;
                }
                if (i36 != 0) {
                    str4 = null;
                }
                if (i37 != 0) {
                    z6 = false;
                }
                if (i38 != 0) {
                    z7 = true;
                }
                if (i39 != 0) {
                    z5 = false;
                }
                if (i40 != 0) {
                    interfaceC65784Pro2 = C92943aIt.LJLIL;
                }
                if (i41 != 0) {
                    interfaceC88471Ynr3 = null;
                }
                if (i42 != 0) {
                    interfaceC88471Ynr4 = null;
                }
                if (i43 != 0) {
                    z8 = true;
                }
                if (i44 == 0) {
                    i23 = i2;
                }
                if (i45 != 0) {
                    c1oh3 = null;
                }
            } else {
                LJIL.LIZLLL();
                if ((i5 & 16) != 0) {
                    i6 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    i6 &= -458753;
                }
                i23 = i2;
            }
            LJIL.LJJJJJL();
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                int length = interfaceC14810i52.LIZ(new C08440Uu(value, null, 6)).LIZ.length();
                LJJJZ = C78966Uyw.LJJJIL(new C15010iP(value, C17N.LIZLLL(length, length), 4));
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            C15010iP LIZIZ = C15010iP.LIZIZ((C15010iP) interfaceC35811ar.getValue(), value);
            LJIL.LJJIIJ(1618982084);
            boolean LJIJJ = LJIL.LJIJJ(interfaceC35811ar) | LJIL.LJIJJ(value) | LJIL.LJIJJ(interfaceC88472Yns4);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                LJJJZ2 = new C92944aIu(value, interfaceC88472Yns4, interfaceC35811ar);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            InterfaceC88472Yns interfaceC88472Yns5 = (InterfaceC88472Yns) LJJJZ2;
            if (c1oh3 == null) {
                LJIL.LJJIIJ(-492369756);
                Object LJJJZ3 = LJIL.LJJJZ();
                if (LJJJZ3 == c24490xh) {
                    LJJJZ3 = new C42191l9();
                    LJIL.LJLJLLL(LJJJZ3);
                }
                LJIL.LJJJJJ(false);
                c1oh2 = (C1OH) LJJJZ3;
            } else {
                c1oh2 = c1oh3;
            }
            int i46 = i6 >> 3;
            int i47 = (i46 & 234881024) | (i46 & 896) | (i46 & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | ((i15 << 27) & 1879048192);
            int i48 = i15 >> 3;
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns6 = interfaceC88472Yns3;
            int i49 = i26;
            C18880oe c18880oe3 = c18880oe2;
            C18850ob c18850ob3 = c18850ob2;
            InterfaceC14810i5 interfaceC14810i53 = interfaceC14810i52;
            String str5 = str3;
            String str6 = str4;
            boolean z9 = z6;
            boolean z10 = z7;
            boolean z11 = z5;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro2;
            InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr3;
            InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr6 = interfaceC88471Ynr4;
            boolean z12 = z8;
            C1OH c1oh4 = c1oh2;
            InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh2;
            LIZIZ(LIZIZ, interfaceC88472Yns5, interfaceC88472Yns6, i49, c18880oe3, c18850ob3, interfaceC14810i53, str5, str6, z9, z10, z11, interfaceC65784Pro3, interfaceC88471Ynr5, interfaceC88471Ynr6, z12, i23, c1oh4, interfaceC07790Sh3, LJIL, i47, (i48 & 3670016) | (i48 & 14) | (i48 & 112) | (i48 & 896) | (i48 & 7168) | (i48 & 57344) | (i48 & 458752) | ((i6 << 21) & 234881024));
        } else {
            LJIL.LIZLLL();
            i23 = i2;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92945aIv(value, interfaceC07790Sh2, interfaceC88472Yns4, interfaceC88472Yns3, i26, c18880oe2, c18850ob2, interfaceC14810i52, str3, str4, z6, z7, z5, interfaceC65784Pro2, interfaceC88471Ynr3, interfaceC88471Ynr4, z8, i23, c1oh3, i3, i4, i5);
    }
}
