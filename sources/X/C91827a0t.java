package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a0t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91827a0t {
    public static final void LIZ(String value, InterfaceC07790Sh interfaceC07790Sh, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z2, Bitmap bitmap, int i, List<String> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, String str2, boolean z3, String str3, boolean z4, C91843a19 c91843a19, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
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
        boolean z5;
        int i18;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro;
        boolean z6 = z;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z7 = z3;
        String str4 = str;
        String str5 = str3;
        boolean z8 = z2;
        Bitmap bitmap2 = bitmap;
        int i19 = i;
        List<String> list2 = list;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
        String str6 = str2;
        C91843a19 c91843a192 = c91843a19;
        o.LJIIIZ(value, "value");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1964479460);
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
            if (LJIL.LJIJJ(str4)) {
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
            if (LJIL.LJIJJ(interfaceC88472Yns4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i24 = i4 & 16;
        int i25 = FileUtils.BUFFER_SIZE;
        if (i24 != 0) {
            i5 |= 24576;
        } else if ((57344 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns3)) {
                i10 = 16384;
            } else {
                i10 = FileUtils.BUFFER_SIZE;
            }
            i5 |= i10;
        }
        int i26 = i4 & 32;
        if (i26 != 0) {
            i5 |= 196608;
        } else if ((458752 & i2) == 0) {
            if (LJIL.LJI(z6)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        int i27 = i4 & 64;
        if (i27 != 0) {
            i5 |= 1572864;
        } else if ((3670016 & i2) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        int i28 = i4 & 128;
        if (i28 != 0) {
            i5 |= 12582912;
        } else if ((29360128 & i2) == 0) {
            if (LJIL.LJI(z8)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i5 |= i13;
        }
        int i29 = i4 & 256;
        if (i29 != 0) {
            i5 |= 33554432;
        }
        if ((1879048192 & i2) == 0) {
            if ((i4 & 512) == 0 && LJIL.LJIIIZ(i19)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i5 |= i18;
        }
        int i30 = i4 & 1024;
        if (i30 != 0) {
            i14 = i3 | 2;
        } else {
            i14 = i3;
        }
        int i31 = i4 & 2048;
        if (i31 != 0) {
            i14 |= 48;
        } else if ((i3 & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro4)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i14 |= i15;
        }
        int i32 = i4 & 4096;
        if (i32 != 0) {
            i14 |= 384;
        } else if ((i3 & 896) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i14 |= i16;
        }
        int i33 = i4 & FileUtils.BUFFER_SIZE;
        if (i33 != 0) {
            i14 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (LJIL.LJI(z7)) {
                i23 = 2048;
            }
            i14 |= i23;
        }
        int i34 = i4 & 16384;
        if (i34 != 0) {
            i14 |= 24576;
        } else if ((57344 & i3) == 0) {
            i34 = 0;
            if (LJIL.LJIJJ(str5)) {
                i25 = 16384;
            }
            i14 |= i25;
        }
        int i35 = i4 & 32768;
        if (i35 != 0) {
            i14 |= 196608;
        } else if ((458752 & i3) == 0) {
            if (LJIL.LJI(z4)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i14 |= i17;
        }
        int i36 = i4 & 65536;
        if (i36 != 0) {
            i14 |= 524288;
        }
        if (((~i4) & 66816) != 0 || ((1533916891 & i5) ^ 306783378) != 0 || ((2995931 & i14) ^ 599186) != 0 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i2 & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i20 != 0) {
                    interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
                }
                if (i21 != 0) {
                    str4 = null;
                }
                if (i22 != 0) {
                    interfaceC88472Yns4 = C92631aDr.LJLIL;
                }
                if (i24 != 0) {
                    interfaceC88472Yns3 = C92632aDs.LJLIL;
                }
                z5 = true;
                if (i26 != 0) {
                    z6 = true;
                }
                if (i27 != 0) {
                    interfaceC65784Pro3 = C92633aDt.LJLIL;
                }
                if (i28 != 0) {
                    z8 = false;
                }
                if (i29 != 0) {
                    bitmap2 = null;
                }
                if ((i4 & 512) != 0) {
                    i5 &= -1879048193;
                    i19 = 1;
                }
                if (i30 != 0) {
                    list2 = C61878OQg.INSTANCE;
                    i14 &= -15;
                }
                if (i31 != 0) {
                    interfaceC65784Pro4 = C92634aDu.LJLIL;
                }
                if (i32 != 0) {
                    str6 = null;
                }
                if (i33 != 0) {
                    z7 = false;
                }
                if (i34 != 0) {
                    str5 = null;
                }
                if (i35 == 0) {
                    z5 = z4;
                }
                if (i36 != 0) {
                    c91843a192 = null;
                }
            } else {
                LJIL.LIZLLL();
                if ((i4 & 512) != 0) {
                    i5 &= -1879048193;
                }
                if (i30 != 0) {
                    i14 &= -15;
                }
                z5 = z4;
            }
            LJIL.LJJJJJL();
            C24610xt.LJ(c91843a192, new C93059aKl(c91843a192, (View) LJIL.LJIILLIIL(C04Q.LJI), null), LJIL);
            LJIL.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
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
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                C91747Zzb.LIZ(list2, LJIL, 8, 0);
                int i37 = i14 >> 6;
                C91742ZzW.LIZ(interfaceC07790Sh2, z7, str5, null, null, C1DJ.LJ(LJIL, -819892938, new C92635aDv(value, interfaceC88472Yns4, interfaceC88472Yns3, i19, str4, str6, z7, z5, interfaceC65784Pro4, i5, i14, z6, interfaceC65784Pro3)), LJIL, ((i5 >> 3) & 14) | 196608 | (i37 & 112) | (i37 & 896), 24);
                if (z8 && bitmap2 != null) {
                    C1QV c1qv = new C1QV(bitmap2);
                    InterfaceC273615o.LJLIIIL.getClass();
                    float f = 5;
                    float f2 = 16;
                    C0SR.LIZIZ(c1qv, null, C09290Yb.LJII(C78840Uwu.LJI(C70657RoD.LJIL(c1m1, f2, 0.0f, f2, f, 2), C17480mO.LIZ(f))), C273415m.LIZLLL, LJIL, 24632);
                }
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
                LJIL.LJIJ();
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
            z5 = z4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92636aDw(value, interfaceC07790Sh2, str4, interfaceC88472Yns4, interfaceC88472Yns3, z6, interfaceC65784Pro3, z8, bitmap2, i19, list2, interfaceC65784Pro4, str6, z7, str5, z5, c91843a192, i2, i3, i4);
    }
}
