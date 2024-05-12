package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91728ZzI {
    public static final void LIZ(String value, InterfaceC07790Sh interfaceC07790Sh, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, String str2, boolean z, String str3, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, boolean z3, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
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
        String str4;
        int i19;
        int i20 = i;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        String str5 = str2;
        String str6 = str;
        boolean z4 = z;
        boolean z5 = z2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro5 = interfaceC65784Pro2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro6 = interfaceC65784Pro3;
        boolean z6 = z3;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1555785998);
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
        int i21 = i4 & 2;
        if (i21 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
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
            if (LJIL.LJIJJ(str6)) {
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
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i25 = i4 & 16;
        if (i25 != 0) {
            i5 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        if ((458752 & i2) == 0) {
            if ((i4 & 32) == 0 && LJIL.LJIIIZ(i20)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i5 |= i19;
        }
        int i26 = i4 & 64;
        if (i26 != 0) {
            i5 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (LJIL.LJIJJ(str5)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        int i27 = i4 & 128;
        if (i27 != 0) {
            i5 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJI(z4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        int i28 = i4 & 256;
        if (i28 != 0) {
            i5 |= 100663296;
        } else if ((234881024 & i2) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        int i29 = i4 & 512;
        if (i29 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (LJIL.LJI(z5)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i5 |= i14;
        }
        int i30 = i4 & 1024;
        if (i30 != 0) {
            i15 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro4)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i3 | i16;
        } else {
            i15 = i3;
        }
        int i31 = i4 & 2048;
        if (i31 != 0) {
            i15 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro5)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        int i32 = i4 & 4096;
        if (i32 != 0) {
            i15 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro6)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        int i33 = i4 & FileUtils.BUFFER_SIZE;
        if (i33 != 0) {
            i15 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJI(z6)) {
                i24 = 2048;
            }
            i15 |= i24;
        }
        if (((i5 & 1533916891) ^ 306783378) != 0 || ((i15 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i21 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                str4 = null;
                if (i22 != 0) {
                    str6 = null;
                }
                if (i23 != 0) {
                    interfaceC88472Yns4 = C92407aAF.LJLIL;
                }
                if (i25 != 0) {
                    interfaceC88472Yns3 = C92408aAG.LJLIL;
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                    i20 = 1;
                }
                if (i26 != 0) {
                    str5 = null;
                }
                if (i27 != 0) {
                    z4 = false;
                }
                if (i28 == 0) {
                    str4 = str3;
                }
                if (i29 != 0) {
                    z5 = true;
                }
                if (i30 != 0) {
                    interfaceC65784Pro4 = C92409aAH.LJLIL;
                }
                if (i31 != 0) {
                    interfaceC65784Pro5 = C92410aAI.LJLIL;
                }
                if (i32 != 0) {
                    interfaceC65784Pro6 = C92411aAJ.LJLIL;
                }
                if (i33 != 0) {
                    z6 = true;
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                }
                str4 = str3;
            }
            LJIL.LJJJJJL();
            C40431iJ LJ = C1DJ.LJ(LJIL, -819895759, new C92412aAK(str5, value, interfaceC88472Yns4, interfaceC88472Yns3, i20, str6, z4, z6, i5, i15, z5, interfaceC65784Pro5, interfaceC65784Pro6, interfaceC65784Pro4));
            int i34 = ((i5 >> 3) & 14) | 196608;
            int i35 = i5 >> 18;
            C91742ZzW.LIZ(interfaceC07790Sh2, z4, str4, null, null, LJ, LJIL, i34 | (i35 & 112) | (i35 & 896), 24);
        } else {
            LJIL.LIZLLL();
            str4 = str3;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92413aAL(value, interfaceC07790Sh2, str6, interfaceC88472Yns4, interfaceC88472Yns3, i20, str5, z4, str4, z5, interfaceC65784Pro4, interfaceC65784Pro5, interfaceC65784Pro6, z6, i2, i3, i4);
    }
}
