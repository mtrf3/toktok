package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzM, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91732ZzM {
    public static final void LIZ(String value, InterfaceC07790Sh interfaceC07790Sh, String str, String str2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, String str3, boolean z, String str4, boolean z2, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
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
        String str5;
        boolean z3;
        int i17;
        boolean z4 = z;
        String str6 = str3;
        String str7 = str;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        String str8 = str2;
        int i18 = i;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns2;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1531755710);
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
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(str7)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i21 = i4 & 8;
        if (i21 != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIJJ(str8)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i22 = i4 & 16;
        if (i22 != 0) {
            i5 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        int i23 = i4 & 32;
        if (i23 != 0) {
            i5 |= 196608;
        } else if ((458752 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((3670016 & i2) == 0) {
            if ((i4 & 64) == 0 && LJIL.LJIIIZ(i18)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i5 |= i17;
        }
        int i24 = i4 & 128;
        if (i24 != 0) {
            i5 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        int i25 = i4 & 256;
        if (i25 != 0) {
            i5 |= 100663296;
        } else if ((234881024 & i2) == 0) {
            if (LJIL.LJI(z4)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        int i26 = i4 & 512;
        if (i26 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (LJIL.LJIJJ(str4)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i5 |= i14;
        }
        int i27 = i4 & 1024;
        if (i27 != 0) {
            i15 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJI(z2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i3 | i16;
        } else {
            i15 = i3;
        }
        if (((i5 & 1533916891) ^ 306783378) != 0 || ((i15 & 11) ^ 2) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i19 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                str5 = null;
                if (i20 != 0) {
                    str7 = null;
                }
                if (i21 != 0) {
                    str8 = null;
                }
                if (i22 != 0) {
                    interfaceC88472Yns3 = C92434aAg.LJLIL;
                }
                if (i23 != 0) {
                    interfaceC88472Yns4 = C92435aAh.LJLIL;
                }
                z3 = true;
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                    i18 = 1;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i25 != 0) {
                    z4 = false;
                }
                if (i26 == 0) {
                    str5 = str4;
                }
                if (i27 == 0) {
                    z3 = z2;
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                }
                str5 = str4;
                z3 = z2;
            }
            LJIL.LJJJJJL();
            str8 = str8;
            str7 = str7;
            int i28 = i5 >> 24;
            C91665ZyH.LIZ().getForm().LIZ(z4, str5, z3, C1DJ.LJ(LJIL, -819895488, new C92436aAi(i18, i5, i15, interfaceC07790Sh2, value, str8, str6, str7, interfaceC88472Yns3, interfaceC88472Yns4, z4, z3)), LJIL, (i28 & 112) | (i28 & 14) | 35840 | ((i15 << 6) & 896));
        } else {
            LJIL.LIZLLL();
            z3 = z2;
            str5 = str4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92437aAj(value, interfaceC07790Sh2, str7, str8, interfaceC88472Yns3, interfaceC88472Yns4, i18, str6, z4, str5, z3, i2, i3, i4);
    }
}
