package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91733ZzN {
    public static final long LIZIZ() {
        if (C91671ZyN.LIZ) {
            return C78897Uxp.LJFF(4278190080L);
        }
        return C78897Uxp.LJFF(3875536895L);
    }

    public static final long LIZJ() {
        if (C91671ZyN.LIZ) {
            return C78897Uxp.LJFF(4294847573L);
        }
        return C78897Uxp.LJFF(4294916956L);
    }

    public static final void LIZ(int i, int i2, int i3, InterfaceC24520xk interfaceC24520xk, InterfaceC07790Sh interfaceC07790Sh, String value, String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, boolean z, boolean z2) {
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
        String str4;
        boolean z3;
        int i14;
        int i15;
        boolean z4 = z;
        String str5 = str;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns interfaceC88472Yns3 = interfaceC88472Yns;
        InterfaceC88472Yns interfaceC88472Yns4 = interfaceC88472Yns2;
        int i16 = i;
        String str6 = str2;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-839160342);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(value)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(str5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i19 = i3 & 8;
        if (i19 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i20 = i3 & 16;
        if (i20 != 0) {
            i4 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i9 = 16384;
            } else {
                i9 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i9;
        }
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0 && LJIL.LJIIIZ(i16)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i4 |= i15;
        }
        int i21 = i3 & 64;
        if (i21 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        int i22 = i3 & 128;
        if (i22 != 0) {
            i4 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJI(z4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        }
        int i23 = i3 & 256;
        if (i23 != 0) {
            i4 |= 100663296;
        } else if ((234881024 & i2) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        int i24 = i3 & 512;
        if (i24 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (LJIL.LJI(z2)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i4 |= i13;
        }
        if (((i4 & 1533916891) ^ 306783378) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i17 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                str4 = null;
                if (i18 != 0) {
                    str5 = null;
                }
                if (i19 != 0) {
                    interfaceC88472Yns3 = C92414aAM.LJLIL;
                }
                if (i20 != 0) {
                    interfaceC88472Yns4 = C92417aAP.LJLIL;
                }
                z3 = true;
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i16 = 1;
                }
                if (i21 != 0) {
                    str6 = null;
                }
                if (i22 != 0) {
                    z4 = false;
                }
                if (i23 == 0) {
                    str4 = str3;
                }
                if (i24 == 0) {
                    z3 = z2;
                }
                i14 = i16;
            } else {
                LJIL.LIZLLL();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                str4 = str3;
                z3 = z2;
                i14 = i16;
            }
            LJIL.LJJJJJL();
            int i25 = i14;
            i16 = i14;
            C40431iJ LJ = C1DJ.LJ(LJIL, -819894843, new C92420aAS(i25, i4, str6, value, str5, interfaceC88472Yns3, interfaceC88472Yns4, z4, z3));
            int i26 = ((i4 >> 3) & 14) | 196608;
            int i27 = i4 >> 18;
            C91742ZzW.LIZ(interfaceC07790Sh2, z4, str4, null, null, LJ, LJIL, i26 | (i27 & 112) | (i27 & 896), 24);
        } else {
            LJIL.LIZLLL();
            str4 = str3;
            z3 = z2;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92432aAe(i16, i2, i3, interfaceC07790Sh2, value, str5, str6, str4, interfaceC88472Yns3, interfaceC88472Yns4, z4, z3);
    }
}
