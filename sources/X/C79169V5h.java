package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V5h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79169V5h {
    public static final C44021o6 LIZ = C24410xZ.LIZJ(V7P.LJLIL);

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC07790Sh interfaceC07790Sh, boolean z, InterfaceC11790dD interfaceC11790dD, long j, long j2, C0SX c0sx, float f, C1OH c1oh, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f2 = f;
        boolean z2 = z;
        C0SX c0sx2 = c0sx;
        C1OH c1oh2 = c1oh;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        long j3 = j;
        long j4 = j2;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-591499514);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJI(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC11790dD2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0 && LJIL.LJIIJ(j3)) {
                i13 = 16384;
            } else {
                i13 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i13;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0 && LJIL.LJIIJ(j4)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(c0sx2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJII(f2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        int i19 = i2 & 256;
        if (i19 != 0) {
            i3 |= 100663296;
        } else if ((234881024 & i) == 0) {
            if (LJIL.LJIJJ(c1oh2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2 = interfaceC88471Ynr;
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((1879048192 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr2)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 1533916891) != 306783378 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i14 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i15 != 0) {
                    z2 = true;
                }
                if (i16 != 0) {
                    interfaceC11790dD2 = C11710d5.LIZ;
                }
                if ((i2 & 16) != 0) {
                    j3 = C21350sd.LIZ(LJIL).LJI();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    j4 = C21570sz.LIZIZ(j3, LJIL);
                    i3 &= -458753;
                }
                if (i17 != 0) {
                    c0sx2 = null;
                }
                if (i18 != 0) {
                    f2 = 0;
                }
                if (i19 != 0) {
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
            } else {
                LJIL.LIZLLL();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 = (-458753) & i3;
                }
            }
            LJIL.LJJJJJL();
            C44021o6 c44021o6 = C21780tK.LIZIZ;
            float f3 = ((C23390vv) LJIL.LJIILLIIL(c44021o6)).LJLIL + f2;
            interfaceC65784Pro2 = interfaceC65784Pro2;
            interfaceC88471Ynr2 = interfaceC88471Ynr2;
            C24410xZ.LIZ(new C24620xu[]{C21620t4.LIZ.LIZIZ(new C11850dJ(j4)), c44021o6.LIZIZ(new C23390vv(f3))}, C1DJ.LJ(LJIL, 2050241094, new V13(interfaceC07790Sh2, interfaceC11790dD2, j3, f3, i3, c0sx2, f2, c1oh2, C44384HbQ.LLIIIL(0.0f, LJIL, 1), z2, interfaceC65784Pro2, interfaceC88471Ynr2)), LJIL, 56);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V65(interfaceC65784Pro2, interfaceC07790Sh2, z2, interfaceC11790dD2, j3, j4, c0sx2, f2, c1oh2, interfaceC88471Ynr2, i, i2);
    }

    public static final void LIZJ(InterfaceC65784Pro<C76800UCe> onClick, InterfaceC88472Yns<? super C23360vs, C76800UCe> onConstraints, InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC07790Sh interfaceC07790Sh, boolean z, C1OH c1oh, InterfaceC11790dD interfaceC11790dD, C0SX c0sx, InterfaceC21340sc interfaceC21340sc, InterfaceC09420Yo interfaceC09420Yo, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        InterfaceC21340sc interfaceC21340sc2;
        InterfaceC21340sc interfaceC21340sc3;
        int i11;
        int i12;
        int i13;
        InterfaceC09420Yo interfaceC09420Yo2 = interfaceC09420Yo;
        boolean z2 = z;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        C1OH c1oh2 = c1oh;
        C0SX c0sx2 = c0sx;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        InterfaceC21340sc interfaceC21340sc4 = interfaceC21340sc;
        o.LJIIIZ(onClick, "onClick");
        o.LJIIIZ(onConstraints, "onConstraints");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(657115400);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(onClick)) {
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
            if (LJIL.LJIJJ(onConstraints)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(content)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJI(z2)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(c1oh2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0 && LJIL.LJIJJ(interfaceC11790dD2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJIJJ(c0sx2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((i & 234881024) == 0) {
            if ((i2 & 256) == 0 && LJIL.LJIJJ(interfaceC21340sc4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((1879048192 & i) == 0) {
            if ((i2 & 512) == 0 && LJIL.LJIJJ(interfaceC09420Yo2)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 1533916891) != 306783378 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i14 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i15 != 0) {
                    z2 = true;
                }
                if (i16 != 0) {
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
                if ((i2 & 64) != 0) {
                    interfaceC11790dD2 = C21350sd.LIZIZ(LJIL).LIZ;
                    i3 &= -3670017;
                }
                if (i17 != 0) {
                    c0sx2 = null;
                }
                InterfaceC21340sc interfaceC21340sc5 = interfaceC21340sc4;
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    interfaceC21340sc5 = C21380sg.LIZ(0L, 0L, 0L, 0L, LJIL, 32768, 15);
                }
                interfaceC21340sc2 = interfaceC21340sc5;
                if ((i2 & 512) != 0) {
                    interfaceC09420Yo2 = C21380sg.LIZ;
                    i3 &= -1879048193;
                    interfaceC21340sc2 = interfaceC21340sc5;
                }
            } else {
                LJIL.LIZLLL();
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                interfaceC21340sc2 = interfaceC21340sc4;
                if ((i2 & 512) != 0) {
                    i3 &= -1879048193;
                    interfaceC21340sc2 = interfaceC21340sc4;
                }
            }
            LJIL.LJJJJJL();
            InterfaceC35811ar LIZ2 = interfaceC21340sc2.LIZ(z2, LJIL);
            int i18 = i3 >> 6;
            InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh2;
            boolean z3 = z2;
            InterfaceC11790dD interfaceC11790dD3 = interfaceC11790dD2;
            LIZ(onClick, interfaceC07790Sh3, z3, interfaceC11790dD3, ((C11850dJ) interfaceC21340sc2.LIZIZ(z2, LJIL).getValue()).LIZ, C11850dJ.LIZIZ(((C11850dJ) LIZ2.getValue()).LIZ, 1.0f), c0sx2, 0, c1oh2, C1DJ.LJ(LJIL, -421327455, new C79177V5p(LIZ2, onConstraints, interfaceC09420Yo2, content, i3)), LJIL, (i3 & 14) | 817889280 | (i18 & 112) | (i18 & 896) | ((i3 >> 9) & 7168) | ((i3 >> 3) & 3670016) | ((i3 << 9) & 234881024), 0);
            interfaceC21340sc3 = interfaceC21340sc2;
        } else {
            LJIL.LIZLLL();
            interfaceC21340sc3 = interfaceC21340sc4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V60(onClick, onConstraints, content, interfaceC07790Sh2, z2, c1oh2, interfaceC11790dD2, c0sx2, interfaceC21340sc3, interfaceC09420Yo2, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> onClick, String text, InterfaceC07790Sh interfaceC07790Sh, boolean z, boolean z2, long j, boolean z3, C1OH c1oh, Integer num, Integer num2, EnumC79195V6h enumC79195V6h, EnumC79196V6i enumC79196V6i, EnumC79201V6n enumC79201V6n, Integer num3, boolean z4, InterfaceC09420Yo interfaceC09420Yo, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        int i4;
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
        V63 v63;
        boolean z5;
        C46419IJr c46419IJr;
        boolean z6;
        C79187V5z c79187V5z;
        boolean z7;
        boolean z8;
        float f;
        boolean z9;
        int i20;
        C0SX c0sx;
        long j2;
        long j3;
        boolean z10;
        boolean z11 = z3;
        long j4 = j;
        boolean z12 = z2;
        C1OH c1oh2 = c1oh;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        Integer num4 = num3;
        boolean z13 = z;
        Integer num5 = num;
        Integer num6 = num2;
        EnumC79195V6h enumC79195V6h2 = enumC79195V6h;
        EnumC79196V6i enumC79196V6i2 = enumC79196V6i;
        EnumC79201V6n enumC79201V6n2 = enumC79201V6n;
        boolean z14 = z4;
        InterfaceC09420Yo interfaceC09420Yo2 = interfaceC09420Yo;
        o.LJIIIZ(onClick, "onClick");
        o.LJIIIZ(text, "text");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1984454033);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(onClick)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(text)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i21 = i3 & 4;
        if (i21 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i22 = i3 & 8;
        int i23 = 1024;
        if (i22 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z13)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i24 = i3 & 16;
        int i25 = FileUtils.BUFFER_SIZE;
        if (i24 != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJI(z12)) {
                i9 = 16384;
            } else {
                i9 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i9;
        }
        int i26 = i3 & 32;
        if (i26 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            if (LJIL.LJIIJ(j4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i27 = i3 & 64;
        if (i27 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJI(z11)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i28 = i3 & 128;
        if (i28 != 0) {
            i4 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJIJJ(c1oh2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i29 = i3 & 256;
        if (i29 != 0) {
            i4 |= 100663296;
        } else if ((234881024 & i) == 0) {
            if (LJIL.LJIJJ(num5)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i30 = i3 & 512;
        if (i30 != 0) {
            i4 |= 805306368;
        } else if ((1879048192 & i) == 0) {
            if (LJIL.LJIJJ(num6)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i31 = i3 & 1024;
        if (i31 != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(enumC79195V6h2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        int i32 = i3 & 2048;
        if (i32 != 0) {
            i15 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(enumC79196V6i2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        int i33 = i3 & 4096;
        if (i33 != 0) {
            i15 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(enumC79201V6n2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        int i34 = i3 & FileUtils.BUFFER_SIZE;
        if (i34 != 0) {
            i15 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIJJ(num4)) {
                i23 = 2048;
            }
            i15 |= i23;
        }
        int i35 = i3 & 16384;
        if (i35 != 0) {
            i15 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (LJIL.LJI(z14)) {
                i25 = 16384;
            }
            i15 |= i25;
        }
        int i36 = i3 & 32768;
        if (i36 != 0) {
            i15 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (LJIL.LJIJJ(interfaceC09420Yo2)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i15 |= i19;
        }
        if ((i4 & 1533916891) != 306783378 || (374491 & i15) != 74898 || !LJIL.LIZ()) {
            if (i21 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i22 != 0) {
                z13 = true;
            }
            if (i24 != 0) {
                z12 = true;
            }
            if (i26 != 0) {
                j4 = C23520w8.LIZJ;
            }
            if (i27 != 0) {
                z11 = false;
            }
            if (i28 != 0) {
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
            if (i29 != 0) {
                num5 = null;
            }
            if (i30 != 0) {
                num6 = null;
            }
            if (i31 != 0) {
                enumC79195V6h2 = EnumC79195V6h.MEDIUM;
            }
            if (i32 != 0) {
                enumC79196V6i2 = EnumC79196V6i.PRIMARY;
            }
            if (i33 != 0) {
                enumC79201V6n2 = EnumC79201V6n.ROUNDED;
            }
            if (i34 != 0) {
                num4 = null;
            }
            if (i35 != 0) {
                z14 = false;
            }
            if (i36 != 0) {
                interfaceC09420Yo2 = C70657RoD.LIZ(8, 0.0f, 2);
            }
            o.LJIIIZ(enumC79195V6h2, "<this>");
            LJIL.LJJIIJ(-1644351997);
            int i37 = V6Z.LIZIZ[enumC79195V6h2.ordinal()];
            if (i37 != 1) {
                if (i37 != 2) {
                    if (i37 != 3) {
                        if (i37 == 4) {
                            LJIL.LJJIIJ(-1372120808);
                            float f2 = 20;
                            v63 = new V63(163, Float.POSITIVE_INFINITY, 44, C79212V6y.LIZIZ(LJIL).LJIIJ, f2, f2);
                            z5 = false;
                            LJIL.LJJJJJ(false);
                        } else {
                            LJIL.LJJIIJ(-1372123011);
                            LJIL.LJJJJJ(false);
                            throw new C162476Zf();
                        }
                    } else {
                        LJIL.LJJIIJ(-1372121094);
                        float f3 = 20;
                        v63 = new V63(88, 122, 36, C79212V6y.LIZIZ(LJIL).LJIILIIL, f3, f3);
                        LJIL.LJJJJJ(false);
                    }
                } else {
                    LJIL.LJJIIJ(-1372121382);
                    float f4 = 16;
                    v63 = new V63(88, LiveTryModeCountDownThresholdSetting.DEFAULT, 28, C79212V6y.LIZIZ(LJIL).LJIILIIL, f4, f4);
                    LJIL.LJJJJJ(false);
                }
                z5 = false;
            } else {
                LJIL.LJJIIJ(-1372121668);
                float f5 = 12;
                v63 = new V63(64, 100, 24, C79212V6y.LIZIZ(LJIL).LJIJI, f5, f5);
                z5 = false;
                LJIL.LJJJJJ(false);
            }
            LJIL.LJJJJJ(z5);
            o.LJIIIZ(enumC79201V6n2, "<this>");
            LJIL.LJJIIJ(1157915223);
            int i38 = V6Z.LIZ[enumC79201V6n2.ordinal()];
            if (i38 != 1) {
                if (i38 != 2) {
                    if (i38 == 3) {
                        c46419IJr = new C46419IJr(8);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    c46419IJr = new C46419IJr(24);
                }
                z6 = false;
            } else {
                z6 = false;
                c46419IJr = new C46419IJr(0);
            }
            LJIL.LJJJJJ(z6);
            int i39 = i4 >> 6;
            o.LJIIIZ(enumC79196V6i2, "<this>");
            LJIL.LJJIIJ(-1304599461);
            LJIL.LJJIIJ(-1372119619);
            if (!z13) {
                int i40 = V6Z.LIZJ[enumC79196V6i2.ordinal()];
                if (i40 != 1) {
                    if (i40 != 2) {
                        if (i40 != 3) {
                            if (i40 == 4) {
                                LJIL.LJJIIJ(-1372117538);
                                float f6 = 1;
                                c79187V5z = new C79187V5z(C79212V6y.LIZ(LJIL).LJIIIIZZ(), C79212V6y.LIZ(LJIL).LIZLLL(), C79212V6y.LIZ(LJIL).LIZLLL(), 0.0f, C79212V6y.LIZ(LJIL).LJIIIIZZ(), C79212V6y.LIZ(LJIL).LJIIJ(), C79212V6y.LIZ(LJIL).LJIIJ(), C79043V0l.LIZ(f6, C79212V6y.LIZ(LJIL).LJIIIIZZ()), C79043V0l.LIZ(f6, C79212V6y.LIZ(LJIL).LJIIJ()), 0L, 0L, 3088);
                                LJIL.LJJJJJ(false);
                            } else {
                                LJIL.LJJIIJ(-1372123011);
                                LJIL.LJJJJJ(false);
                                throw new C162476Zf();
                            }
                        } else {
                            LJIL.LJJIIJ(-1372118222);
                            long LJIIIZ = C79212V6y.LIZ(LJIL).LJIIIZ();
                            long LJIIJ = C79212V6y.LIZ(LJIL).LJIIJ();
                            C0SX LIZ2 = C79043V0l.LIZ(1, ((C11850dJ) C79212V6y.LIZ(LJIL).LJJLIIIJLLLLLLLZ.getValue()).LIZ);
                            c79187V5z = new C79187V5z(LJIIIZ, C79212V6y.LIZ(LJIL).LIZLLL(), C79212V6y.LIZ(LJIL).LIZLLL(), 0.0f, C79212V6y.LIZ(LJIL).LJIIIZ(), 0L, LJIIJ, LIZ2, null, C79212V6y.LIZ(LJIL).LIZLLL(), C79212V6y.LIZ(LJIL).LIZLLL(), 592);
                            LJIL.LJJJJJ(false);
                        }
                    } else {
                        LJIL.LJJIIJ(-1372118864);
                        c79187V5z = new C79187V5z(C79212V6y.LIZ(LJIL).LJFF(), C79212V6y.LIZ(LJIL).LJ(), C79212V6y.LIZ(LJIL).LJ(), 0.4f, C79212V6y.LIZ(LJIL).LJFF(), 0L, 0L, null, null, C79212V6y.LIZ(LJIL).LJ(), C79212V6y.LIZ(LJIL).LJ(), 704);
                        LJIL.LJJJJJ(false);
                    }
                    z10 = false;
                } else {
                    LJIL.LJJIIJ(-1372119508);
                    long LJFF = C79212V6y.LIZ(LJIL).LJFF();
                    long LJIIJ2 = C79212V6y.LIZ(LJIL).LJIIJ();
                    c79187V5z = new C79187V5z(LJFF, C79212V6y.LIZ(LJIL).LJIIIIZZ(), C79212V6y.LIZ(LJIL).LJIIIIZZ(), 0.0f, C79212V6y.LIZ(LJIL).LJFF(), 0L, LJIIJ2, null, null, C79212V6y.LIZ(LJIL).LIZIZ(), C79212V6y.LIZ(LJIL).LIZIZ(), 592);
                    z10 = false;
                    LJIL.LJJJJJ(false);
                }
                LJIL.LJJJJJ(z10);
                LJIL.LJJJJJ(z10);
            } else {
                LJIL.LJJJJJ(false);
                int i41 = V6Z.LIZJ[enumC79196V6i2.ordinal()];
                if (i41 != 1) {
                    if (i41 == 3) {
                        LJIL.LJJIIJ(-1372115941);
                        if (enumC79201V6n2 == EnumC79201V6n.BORDERLESS) {
                            LJIL.LJJIIJ(-1372115901);
                            long LJIIIZ2 = C79212V6y.LIZ(LJIL).LJIIIZ();
                            long j5 = C11850dJ.LJFF;
                            c79187V5z = new C79187V5z(LJIIIZ2, j5, j5, 0.4f, C79212V6y.LIZ(LJIL).LJIIIZ(), 0L, 0L, null, null, 0L, 0L, 4032);
                            z7 = false;
                            LJIL.LJJJJJ(false);
                        } else {
                            LJIL.LJJIIJ(-1372115512);
                            c79187V5z = new C79187V5z(C79212V6y.LIZ(LJIL).LJIIIZ(), C79212V6y.LIZ(LJIL).LIZ(), C79212V6y.LIZ(LJIL).LIZ(), 0.4f, C79212V6y.LIZ(LJIL).LJIIIZ(), 0L, 0L, null, null, 0L, 0L, 4032);
                            z7 = false;
                            LJIL.LJJJJJ(false);
                        }
                        LJIL.LJJJJJ(z7);
                    } else {
                        LJIL.LJJIIJ(-1372115099);
                        LJIL.LJJJJJ(false);
                        throw new RuntimeException("not support in v2 version");
                    }
                } else {
                    LJIL.LJJIIJ(-1372116819);
                    if (enumC79201V6n2 == EnumC79201V6n.BORDERLESS) {
                        LJIL.LJJIIJ(-1372116779);
                        long LJIIIIZZ = C79212V6y.LIZ(LJIL).LJIIIIZZ();
                        long j6 = C11850dJ.LJFF;
                        c79187V5z = new C79187V5z(LJIIIIZZ, j6, j6, 0.4f, C79212V6y.LIZ(LJIL).LJIIIIZZ(), 0L, 0L, null, null, 0L, 0L, 4032);
                        z7 = false;
                        LJIL.LJJJJJ(false);
                    } else {
                        LJIL.LJJIIJ(-1372116398);
                        c79187V5z = new C79187V5z(C79212V6y.LIZ(LJIL).LJFF(), C79212V6y.LIZ(LJIL).LJIIIIZZ(), C79212V6y.LIZ(LJIL).LJIIIIZZ(), 0.4f, C79212V6y.LIZ(LJIL).LJFF(), 0L, 0L, null, null, 0L, 0L, 4032);
                        z7 = false;
                        LJIL.LJJJJJ(false);
                    }
                    LJIL.LJJJJJ(z7);
                }
                LJIL.LJJJJJ(z7);
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ2 = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            Object obj = C24500xi.LIZIZ;
            if (LJJJZ2 == obj) {
                z8 = false;
                LJJJZ2 = C78966Uyw.LJJJIL(new C23360vs(C78555UsJ.LJ(0, 0, 15)));
                LJIL.LJLJLLL(LJJJZ2);
            } else {
                z8 = false;
            }
            LJIL.LJJJJJ(z8);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ2;
            InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(AnonymousClass057.LJ);
            float f7 = v63.LIZJ;
            InterfaceC07790Sh heightIn = interfaceC07790Sh2;
            o.LJIIIZ(heightIn, "$this$heightIn");
            InterfaceC07790Sh widthIn = interfaceC07790Sh2.LLLIIIL(new C50831z5(0.0f, f7, 0.0f, Float.POSITIVE_INFINITY, 5));
            float f8 = v63.LIZ;
            float f9 = v63.LIZIZ;
            o.LJIIIZ(widthIn, "$this$widthIn");
            InterfaceC07790Sh LLLIIIL = widthIn.LLLIIIL(new C50831z5(f8, 0.0f, f9, 0.0f, 10));
            if (z12) {
                f = c79187V5z.LIZLLL;
            } else {
                f = c79187V5z.LJ;
            }
            InterfaceC07790Sh LJIIL = C78866UxK.LJIIL(LLLIIIL, f);
            if (z12 || z11) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z13) {
                i20 = c46419IJr.LJLIL;
            } else {
                i20 = 2;
            }
            C43401n6 LIZ3 = C17480mO.LIZ(i20);
            if (z13) {
                c0sx = null;
            } else if (z12) {
                c0sx = c79187V5z.LJIIIIZZ;
            } else {
                c0sx = c79187V5z.LJIIIZ;
            }
            long j7 = c79187V5z.LIZIZ;
            long j8 = c79187V5z.LIZJ;
            if (z13) {
                j2 = j7;
                j3 = j8;
            } else {
                j2 = c79187V5z.LJIIJ;
                z13 = false;
                j3 = c79187V5z.LJIIJJI;
            }
            C1ZJ LIZ4 = C21380sg.LIZ(j7, j8, j2, j3, LJIL, 32768, 0);
            LJIL.LJJIIJ(1157296644);
            boolean LJIJJ = LJIL.LJIJJ(interfaceC35811ar);
            Object LJJJZ3 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ3 == obj) {
                LJJJZ3 = new AqS179S0100000_13(interfaceC35811ar, (InterfaceC35811ar<C10430b1>) 356);
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            LIZJ(onClick, (InterfaceC88472Yns) LJJJZ3, C1DJ.LJ(LJIL, 947449374, new C79173V5l(text, z12, c79187V5z, z14, num4, v63, num5, i4, j4, num6, interfaceC09420Yo2, interfaceC23370vt, interfaceC35811ar, z13)), LJIIL, z9, c1oh2, LIZ3, c0sx, LIZ4, interfaceC09420Yo2, LJIL, (i4 & 14) | 384 | (i39 & 458752) | ((i15 << 12) & 1879048192), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V62(onClick, text, interfaceC07790Sh2, z13, z12, j4, z11, c1oh2, num5, num6, enumC79195V6h2, enumC79196V6i2, enumC79201V6n2, num4, z14, interfaceC09420Yo2, i, i2, i3);
    }
}
