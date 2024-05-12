package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzT, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91739ZzT {
    public static final void LIZ(C91741ZzV value, InterfaceC07790Sh interfaceC07790Sh, String str, InterfaceC88472Yns<? super C91741ZzV, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i, String str2, boolean z, String str3, boolean z2, InterfaceC24520xk interfaceC24520xk, int i2, int i3) {
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
        int i14;
        boolean z3 = z2;
        boolean z4 = z;
        String str5 = str;
        String str6 = str2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns<? super C91741ZzV, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns2;
        int i15 = i;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1912067530);
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
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(str5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i19 = i3 & 16;
        if (i19 != 0) {
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
            if ((i3 & 32) == 0 && LJIL.LJIIIZ(i15)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i4 |= i14;
        }
        int i20 = i3 & 64;
        if (i20 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        int i21 = i3 & 128;
        if (i21 != 0) {
            i4 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJI(z4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        }
        int i22 = i3 & 256;
        if (i22 != 0) {
            i4 |= 100663296;
        } else if ((234881024 & i2) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        int i23 = i3 & 512;
        if (i23 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (LJIL.LJI(z3)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i4 |= i13;
        }
        if (((i4 & 1533916891) ^ 306783378) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i16 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                str4 = null;
                if (i17 != 0) {
                    str5 = null;
                }
                if (i18 != 0) {
                    interfaceC88472Yns3 = C92464aBA.LJLIL;
                }
                if (i19 != 0) {
                    interfaceC88472Yns4 = C92465aBB.LJLIL;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i15 = 1;
                }
                if (i20 != 0) {
                    str6 = null;
                }
                if (i21 != 0) {
                    z4 = false;
                }
                if (i22 == 0) {
                    str4 = str3;
                }
                if (i23 != 0) {
                    z3 = true;
                }
            } else {
                LJIL.LIZLLL();
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                str4 = str3;
            }
            LJIL.LJJJJJL();
            str6 = str6;
            int i24 = i4 >> 18;
            C91742ZzW.LIZ(interfaceC07790Sh2, z4, str4, null, null, C1DJ.LJ(LJIL, -819893751, new C92466aBC(value, str6, interfaceC88472Yns3, i4, interfaceC88472Yns4, i15, str5, z4, z3)), LJIL, (i24 & 896) | ((i4 >> 3) & 14) | 196608 | (i24 & 112), 24);
        } else {
            LJIL.LIZLLL();
            str4 = str3;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92467aBD(value, interfaceC07790Sh2, str5, interfaceC88472Yns3, interfaceC88472Yns4, i15, str6, z4, str4, z3, i2, i3);
    }
}
