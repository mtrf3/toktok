package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21490sr {
    public static final float LIZ = 4;
    public static final float LIZIZ = 8;

    public static final int LIZJ(int i, int i2, int i3, int i4, int i5, long j, float f, InterfaceC09420Yo interfaceC09420Yo) {
        int max = Math.max(i3, i5);
        return Math.max(C23360vs.LJIIIIZZ(j), Math.max(i, Math.max(i2, O6R.LJJIIZ(Math.max(interfaceC09420Yo.LIZLLL() * f, i4 / 2.0f) + max + (interfaceC09420Yo.LIZIZ() * f)))));
    }

    public static final int LIZLLL(float f, int i, int i2, int i3, int i4, int i5, long j, InterfaceC09420Yo interfaceC09420Yo, boolean z) {
        int i6;
        int i7 = 0;
        if (z) {
            i6 = i4;
        } else {
            i6 = 0;
        }
        int max = Math.max(i3, Math.max(i6, i5)) + i + i2;
        if (!z) {
            EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
            i7 = O6R.LJJIIZ((interfaceC09420Yo.LIZ(enumC23500w6) + interfaceC09420Yo.LIZJ(enumC23500w6)) * f) + i4;
        }
        return Math.max(max, Math.max(i7, C23360vs.LJIIIZ(j)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x038a, code lost:
    
        if (r11 < r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016e, code lost:
    
        if (r14 == X.C24500xi.LIZIZ) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC07790Sh r48, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r49, X.InterfaceC88473Ynt<? super X.InterfaceC07790Sh, ? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r50, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r51, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r52, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r53, boolean r54, float r55, X.InterfaceC88472Yns<? super X.C10430b1, X.C76800UCe> r56, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r57, X.InterfaceC09420Yo r58, X.InterfaceC24520xk r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21490sr.LIZIZ(X.0Sh, X.Ynr, X.Ynt, X.Ynr, X.Ynr, X.Ynr, boolean, float, X.Yns, X.Ynr, X.0Yo, X.0xk, int, int):void");
    }

    public static final void LIZ(C15010iP value, InterfaceC88472Yns<? super C15010iP, C76800UCe> onValueChange, InterfaceC07790Sh interfaceC07790Sh, boolean z, boolean z2, C08370Un c08370Un, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4, boolean z3, InterfaceC14810i5 interfaceC14810i5, C18880oe c18880oe, C18850ob c18850ob, boolean z4, int i, C1OH c1oh, InterfaceC11790dD interfaceC11790dD, InterfaceC21550sx interfaceC21550sx, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
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
        InterfaceC21550sx interfaceC21550sx2;
        InterfaceC07790Sh interfaceC07790Sh2;
        InterfaceC21550sx interfaceC21550sx3;
        int i20;
        int i21;
        int i22;
        int i23;
        InterfaceC21550sx interfaceC21550sx4 = interfaceC21550sx;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr2;
        C08370Un c08370Un2 = c08370Un;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr6 = interfaceC88471Ynr;
        int i24 = i;
        boolean z5 = z2;
        C18880oe c18880oe2 = c18880oe;
        boolean z6 = z;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr7 = interfaceC88471Ynr3;
        C1OH c1oh2 = c1oh;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr8 = interfaceC88471Ynr4;
        boolean z7 = z3;
        InterfaceC14810i5 interfaceC14810i52 = interfaceC14810i5;
        C18850ob c18850ob2 = c18850ob;
        InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        boolean z8 = z4;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(onValueChange, "onValueChange");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-288998816);
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
        int i25 = i4 & 4;
        if (i25 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i26 = i4 & 8;
        int i27 = 1024;
        if (i26 != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJI(z6)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i28 = i4 & 16;
        int i29 = 16384;
        if (i28 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (LJIL.LJI(z5)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        if ((458752 & i2) == 0) {
            if ((i4 & 32) == 0 && LJIL.LJIJJ(c08370Un2)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i5 |= i23;
        }
        int i30 = i4 & 64;
        if (i30 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr6)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        int i31 = i4 & 128;
        if (i31 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr5)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        int i32 = i4 & 256;
        if (i32 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr7)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        int i33 = i4 & 512;
        if (i33 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr8)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i5 |= i14;
        }
        int i34 = i4 & 1024;
        if (i34 != 0) {
            i15 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJI(z7)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i16 | i3;
        } else {
            i15 = i3;
        }
        int i35 = i4 & 2048;
        if (i35 != 0) {
            i15 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC14810i52)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((i3 & 896) == 0) {
            if ((i4 & 4096) == 0 && LJIL.LJIJJ(c18880oe2)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i15 |= i22;
        }
        if ((i3 & 7168) == 0) {
            if ((i4 & FileUtils.BUFFER_SIZE) == 0 && LJIL.LJIJJ(c18850ob2)) {
                i27 = 2048;
            }
            i15 |= i27;
        }
        int i36 = i4 & 16384;
        if (i36 != 0) {
            i15 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (!LJIL.LJI(z8)) {
                i29 = FileUtils.BUFFER_SIZE;
            }
            i15 |= i29;
        }
        int i37 = i4 & 32768;
        if (i37 != 0) {
            i15 |= 196608;
        } else if ((458752 & i3) == 0) {
            if (LJIL.LJIIIZ(i24)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i15 |= i18;
        }
        int i38 = i4 & 65536;
        if (i38 != 0) {
            i15 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (LJIL.LJIJJ(c1oh2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        if ((i3 & 29360128) == 0) {
            if ((i4 & 131072) == 0 && LJIL.LJIJJ(interfaceC11790dD2)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i15 |= i21;
        }
        if ((i3 & 234881024) == 0) {
            if ((262144 & i4) == 0 && LJIL.LJIJJ(interfaceC21550sx4)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i15 |= i20;
        }
        if ((i5 & 1533916891) != 306783378 || (191739611 & i15) != 38347922 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i25 != 0) {
                    interfaceC07790Sh3 = InterfaceC07790Sh.LJJJI;
                }
                if (i26 != 0) {
                    z6 = true;
                }
                if (i28 != 0) {
                    z5 = false;
                }
                if ((i4 & 32) != 0) {
                    c08370Un2 = (C08370Un) LJIL.LJIILLIIL(C21430sl.LIZ);
                    i5 &= -458753;
                }
                if (i30 != 0) {
                    interfaceC88471Ynr6 = null;
                }
                if (i31 != 0) {
                    interfaceC88471Ynr5 = null;
                }
                if (i32 != 0) {
                    interfaceC88471Ynr7 = null;
                }
                if (i33 != 0) {
                    interfaceC88471Ynr8 = null;
                }
                if (i34 != 0) {
                    z7 = false;
                }
                if (i35 != 0) {
                    InterfaceC14810i5.LIZ.getClass();
                    interfaceC14810i52 = C1U3.LIZIZ;
                }
                if ((i4 & 4096) != 0) {
                    c18880oe2 = C18880oe.LJ;
                    i15 &= -897;
                }
                if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
                    c18850ob2 = new C18850ob(null, null, 63);
                    i15 &= -7169;
                }
                if (i36 != 0) {
                    z8 = false;
                }
                if (i37 != 0) {
                    i24 = Integer.MAX_VALUE;
                }
                if (i38 != 0) {
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
                if ((i4 & 131072) != 0) {
                    interfaceC11790dD2 = C21350sd.LIZIZ(LJIL).LIZ;
                    i15 &= -29360129;
                }
                interfaceC21550sx2 = interfaceC21550sx4;
                if ((262144 & i4) != 0) {
                    i15 &= -234881025;
                    interfaceC21550sx2 = C21600t2.LIZLLL(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, LJIL, 2097151);
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                }
                if ((i4 & 4096) != 0) {
                    i15 &= -897;
                }
                if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
                    i15 &= -7169;
                }
                if ((i4 & 131072) != 0) {
                    i15 &= -29360129;
                }
                interfaceC21550sx2 = interfaceC21550sx4;
                if ((262144 & i4) != 0) {
                    i15 &= -234881025;
                    interfaceC21550sx2 = interfaceC21550sx4;
                }
            }
            LJIL.LJJJJJL();
            LJIL.LJJIIJ(1961402854);
            long LIZIZ2 = c08370Un2.LIZIZ();
            if (LIZIZ2 == C11850dJ.LJI) {
                LIZIZ2 = ((C11850dJ) interfaceC21550sx2.LJ(z6, LJIL).getValue()).LIZ;
            }
            LJIL.LJJJJJ(false);
            C08370Un LIZJ = c08370Un2.LIZJ(new C08370Un(LIZIZ2, 0L, null, null, null, 0L, null, null, 0L, 262142));
            if (interfaceC88471Ynr6 != null) {
                interfaceC07790Sh2 = C70657RoD.LJIL(b.LJJII(interfaceC07790Sh3, true, C525924p.LJLIL), 0.0f, LIZIZ, 0.0f, 0.0f, 13);
            } else {
                interfaceC07790Sh2 = interfaceC07790Sh3;
            }
            InterfaceC07790Sh LIZLLL = C09290Yb.LIZLLL(C78996UzQ.LIZLLL(interfaceC07790Sh2, ((C11850dJ) interfaceC21550sx2.LIZIZ(LJIL).getValue()).LIZ, interfaceC11790dD2), C21600t2.LIZJ, C21600t2.LIZIZ);
            C32691Qb c32691Qb = new C32691Qb(((C11850dJ) interfaceC21550sx2.LJIIIIZZ(z7, LJIL).getValue()).LIZ);
            C40431iJ LJ = C1DJ.LJ(LJIL, -1219079113, new C526024q(value, z6, z8, interfaceC14810i52, c1oh2, z7, interfaceC88471Ynr6, interfaceC88471Ynr5, interfaceC88471Ynr7, interfaceC88471Ynr8, interfaceC21550sx2, i5, i15, interfaceC11790dD2));
            int i39 = (i5 & 57344) | (i5 & 14) | (i5 & 112) | (i5 & 7168);
            int i40 = i15 << 12;
            C18530o5.LIZIZ(value, onValueChange, LIZLLL, z6, z5, LIZJ, c18880oe2, c18850ob2, z8, i24, interfaceC14810i52, null, c1oh2, c32691Qb, LJ, LJIL, i39 | (i40 & 3670016) | (i40 & 29360128) | (i40 & 234881024) | (i40 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
            interfaceC21550sx3 = interfaceC21550sx2;
        } else {
            LJIL.LIZLLL();
            interfaceC21550sx3 = interfaceC21550sx4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C526124r(value, onValueChange, interfaceC07790Sh3, z6, z5, c08370Un2, interfaceC88471Ynr6, interfaceC88471Ynr5, interfaceC88471Ynr7, interfaceC88471Ynr8, z7, interfaceC14810i52, c18880oe2, c18850ob2, z8, i24, c1oh2, interfaceC11790dD2, interfaceC21550sx3, i2, i3, i4);
    }
}
