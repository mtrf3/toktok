package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zzw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91768Zzw {
    public static final void LIZ(String str, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, boolean z, String str2, List<? extends InterfaceC91996a3c> list, InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns3, int i, boolean z2, String str3, boolean z3, String str4, boolean z4, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
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
        String str5;
        boolean z5;
        int i18;
        InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns3;
        List<? extends InterfaceC91996a3c> list2 = list;
        String str6 = str2;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns5 = interfaceC88472Yns2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns6 = interfaceC88472Yns;
        int i19 = i;
        boolean z6 = z2;
        boolean z7 = z3;
        String str7 = str4;
        String value = str;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1824019267);
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
        int i20 = i4 & 2;
        if (i20 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns6)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i22 = i4 & 8;
        int i23 = 1024;
        if (i22 != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns5)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJI(z)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        int i24 = i4 & 32;
        if (i24 != 0) {
            i5 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i25 = i4 & 64;
        if (i25 != 0) {
            i5 |= 524288;
        }
        int i26 = i4 & 128;
        if (i26 != 0) {
            i5 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        if ((234881024 & i2) == 0) {
            if ((i4 & 256) == 0 && LJIL.LJIIIZ(i19)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i5 |= i18;
        }
        int i27 = i4 & 512;
        if (i27 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (LJIL.LJI(z6)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i5 |= i13;
        }
        int i28 = i4 & 1024;
        if (i28 != 0) {
            i14 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i3;
        } else {
            i14 = i3;
        }
        int i29 = i4 & 2048;
        if (i29 != 0) {
            i14 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJI(z7)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        int i30 = i4 & 4096;
        if (i30 != 0) {
            i14 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(str7)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        int i31 = i4 & FileUtils.BUFFER_SIZE;
        if (i31 != 0) {
            i14 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJI(z4)) {
                i23 = 2048;
            }
            i14 |= i23;
        }
        if (((~i4) & 64) != 0 || ((1533916891 & i5) ^ 306783378) != 0 || ((i14 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i20 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i21 != 0) {
                    interfaceC88472Yns6 = C92512aBw.LJLIL;
                }
                if (i22 != 0) {
                    interfaceC88472Yns5 = C92513aBx.LJLIL;
                }
                str5 = null;
                if (i24 != 0) {
                    str6 = null;
                }
                if (i25 != 0) {
                    list2 = null;
                }
                if (i26 != 0) {
                    interfaceC88472Yns4 = C92514aBy.LJLIL;
                }
                z5 = true;
                if ((i4 & 256) != 0) {
                    i5 &= -234881025;
                    i19 = 1;
                }
                if (i27 != 0) {
                    z6 = false;
                }
                if (i28 == 0) {
                    str5 = str3;
                }
                if (i29 != 0) {
                    z7 = true;
                }
                if (i30 != 0) {
                    str7 = "";
                }
                if (i31 == 0) {
                    z5 = z4;
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & 256) != 0) {
                    i5 &= -234881025;
                }
                str5 = str3;
                z5 = z4;
            }
            LJIL.LJJJJJL();
            value = value;
            C91998a3e.LIZ(z, C92515aBz.LJLIL, list2, str7, 4, interfaceC88472Yns4, C1DJ.LJ(LJIL, -819892589, new C92516aC0(interfaceC07790Sh2, z6, str5, i5, i14, z7, value, str6, interfaceC88472Yns6, interfaceC88472Yns5, i19, z5, C015804k.LIZ(LJIL), (C0Z5) LJIL.LJIILLIIL(AnonymousClass057.LJFF))), LJIL, ((i5 >> 12) & 14) | 1598000 | ((i14 << 3) & 7168) | ((i5 >> 6) & 458752), 0);
        } else {
            LJIL.LIZLLL();
            z5 = z4;
            str5 = str3;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92517aC1(value, interfaceC07790Sh2, interfaceC88472Yns6, interfaceC88472Yns5, z, str6, list2, interfaceC88472Yns4, i19, z6, str5, z7, str7, z5, i2, i3, i4);
    }
}
