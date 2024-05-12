package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5Z {
    public static final void LIZLLL(int i, InterfaceC24520xk interfaceC24520xk, String text) {
        int i2;
        int i3;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(2020146885);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !LJIL.LIZ()) {
            C79053V0v.LIZIZ(text, null, C79212V6y.LIZ(LJIL).LJIIL(), C79212V6y.LIZIZ(LJIL).LJIILJJIL, 0L, null, 0, false, 0, false, null, null, null, LJIL, i2 & 14, 0, 8178);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V7B(text, i);
    }

    public static final void LJ(String text, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(2122371307);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(text)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) != 18 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            C79053V0v.LIZIZ(text, interfaceC07790Sh2, C79212V6y.LIZ(LJIL).LJIIIZ(), C79212V6y.LIZIZ(LJIL).LJIIJ, 0L, null, 0, false, 0, false, null, null, null, LJIL, (i3 & 14) | (i3 & 112), 0, 8176);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V78(text, interfaceC07790Sh2, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.model.Price r38, java.lang.String r39, java.lang.String r40, X.InterfaceC65784Pro<X.C76800UCe> r41, X.InterfaceC24520xk r42, int r43) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5Z.LIZ(com.ss.android.ugc.aweme.model.Price, java.lang.String, java.lang.String, X.Pro, X.0xk, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (r0 == X.C24500xi.LIZIZ) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.model.Price r16, java.lang.String r17, X.C08370Un r18, X.C08370Un r19, long r20, long r22, X.InterfaceC07790Sh r24, X.InterfaceC24520xk r25, int r26, int r27) {
        /*
            r11 = r24
            java.lang.String r0 = "usdStyle"
            r5 = r18
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "localCurrencyStyle"
            r6 = r19
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r0 = 1442643699(0x55fcfef3, float:3.4771491E13)
            r1 = r25
            X.1b3 r12 = r1.LJIL(r0)
            r25 = r27
            r0 = r25 & 64
            if (r0 == 0) goto L21
            X.1M1 r11 = X.InterfaceC07790Sh.LJJJI
        L21:
            r2 = 1157296644(0x44faf204, float:2007.563)
            r12.LJJIIJ(r2)
            r15 = r16
            boolean r0 = r12.LJIJJ(r15)
            java.lang.Object r4 = r12.LJJJZ()
            if (r0 != 0) goto L3c
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r4 != r0) goto L4a
        L3c:
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 737(0x2e1, float:1.033E-42)
            r1.<init>(r15, r0)
            X.1o4 r4 = X.C78966Uyw.LJIJI(r1)
            r12.LJLJLLL(r4)
        L4a:
            r3 = 0
            r12.LJJJJJ(r3)
            X.0y8 r4 = (X.InterfaceC24760y8) r4
            r12.LJJIIJ(r2)
            boolean r1 = r12.LJIJJ(r15)
            java.lang.Object r0 = r12.LJJJZ()
            r2 = r17
            if (r1 != 0) goto L68
            X.0xi r1 = X.InterfaceC24520xk.LIZ
            r1.getClass()
            X.0xh r1 = X.C24500xi.LIZIZ
            if (r0 != r1) goto L76
        L68:
            kotlin.jvm.internal.AqS80S1100000_13 r1 = new kotlin.jvm.internal.AqS80S1100000_13
            r0 = 12
            r1.<init>(r2, r15, r0)
            X.1o4 r0 = X.C78966Uyw.LJIJI(r1)
            r12.LJLJLLL(r0)
        L76:
            r12.LJJJJJ(r3)
            X.0y8 r0 = (X.InterfaceC24760y8) r0
            java.lang.Object r3 = r4.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r1 = r26
            r13 = r1 & 896(0x380, float:1.256E-42)
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r13 = r13 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r1
            r13 = r13 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r1
            r13 = r13 | r0
            r14 = 0
            r9 = r22
            r7 = r20
            LIZJ(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            X.1b9 r0 = r12.LJJJJLI()
            if (r0 != 0) goto Laa
        La9:
            return
        Laa:
            X.V6x r14 = new X.V6x
            r16 = r2
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r9
            r23 = r11
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r24, r25)
            r0.LIZLLL = r14
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5Z.LIZIZ(com.ss.android.ugc.aweme.model.Price, java.lang.String, X.0Un, X.0Un, long, long, X.0Sh, X.0xk, int, int):void");
    }

    public static final void LIZJ(String str, String selectorText2, C08370Un usdStyle, C08370Un localCurrencyStyle, long j, long j2, InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        String selectorText1 = str;
        o.LJIIIZ(selectorText1, "selectorText1");
        o.LJIIIZ(selectorText2, "selectorText2");
        o.LJIIIZ(usdStyle, "usdStyle");
        o.LJIIIZ(localCurrencyStyle, "localCurrencyStyle");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1482841439);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(selectorText1)) {
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
            if (LJIL.LJIJJ(selectorText2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(usdStyle)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(localCurrencyStyle)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIIJ(j)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIIJ(j2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((2995931 & i3) != 599186 || !LJIL.LIZ()) {
            if (i12 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            int i13 = (i3 >> 18) & 14;
            LJIL.LJJIIJ(693286680);
            C32361Ou c32361Ou = C0YW.LIZ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C0YX.LIZ(c32361Ou, C07730Sb.LJIIJ, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh2);
            int i14 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
                LJIIL.invoke(V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, Integer.valueOf((i14 >> 3) & 112));
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-678309503);
                if (((i14 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                    C32391Ox c32391Ox = C32391Ox.LIZ;
                    int i15 = ((i13 >> 6) & 112) | 6;
                    if ((i15 & 14) == 0) {
                        if (LJIL.LJIJJ(c32391Ox)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        i15 |= i11;
                    }
                    if ((i15 & 91) != 18 || !LJIL.LIZ()) {
                        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                        C31621Ly c31621Ly = C07730Sb.LJIIJJI;
                        selectorText1 = selectorText1;
                        C79053V0v.LIZIZ(selectorText1, c32391Ox.LIZ(c1m1, c31621Ly), j, usdStyle, 0L, null, 0, false, 0, false, null, null, null, LJIL, (i3 & 14) | ((i3 >> 6) & 896) | ((i3 << 3) & 7168), 0, 8176);
                        C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 4), LJIL, 6);
                        C79053V0v.LIZIZ(selectorText2, c32391Ox.LIZ(c1m1, c31621Ly), j2, localCurrencyStyle, 0L, null, 0, false, 0, false, null, null, null, LJIL, ((i3 >> 3) & 14) | ((i3 >> 9) & 896) | (i3 & 7168), 0, 8176);
                    } else {
                        LJIL.LIZLLL();
                    }
                } else {
                    LJIL.LIZLLL();
                }
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
        LJJJJLI.LIZLLL = new V70(selectorText1, selectorText2, usdStyle, localCurrencyStyle, j, j2, interfaceC07790Sh2, i, i2);
    }
}
