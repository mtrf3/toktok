package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzQ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91736ZzQ {
    public static final void LIZ(int i, int i2, InterfaceC24520xk interfaceC24520xk, String str, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        C35931b3 LJIL = interfaceC24520xk.LJIL(150814585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if (((i3 & 731) ^ 146) != 0 || !LJIL.LIZ()) {
            if (i7 != 0) {
                z2 = false;
            }
            if (i8 != 0) {
                interfaceC65784Pro2 = C92492aBc.LJLIL;
            }
            C92038a4I.LIZIZ(null, C1DJ.LJ(LJIL, -819903419, new C92495aBf(str, i3)), null, C1DJ.LJ(LJIL, -819902988, new C92498aBi(z2, i3)), false, false, null, interfaceC65784Pro2, LJIL, ((i3 << 15) & 29360128) | 3120, 117);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92501aBl(i, i2, str, interfaceC65784Pro2, z2);
    }

    public static final void LIZIZ(List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-50932885);
        float f = 8;
        C21790tL.LIZ(C09290Yb.LJII(C09290Yb.LJIIIZ(InterfaceC07790Sh.LJJJI, 0.0f, 414, 1)), C17480mO.LIZJ(f, f), C91671ZyN.LIZ(LJIL).LIZIZ, 0L, null, 0.0f, C1DJ.LJ(LJIL, -819888795, new C92446aAs(i, interfaceC24760y8, list, interfaceC65784Pro, interfaceC88472Yns)), LJIL, 1572870, 56);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92447aAt(i, interfaceC24760y8, list, interfaceC65784Pro, interfaceC88472Yns);
    }

    public static final void LIZJ(String value, String code, List<String> codes, InterfaceC24760y8<Integer> selectedIndex, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, int i, String str2, boolean z, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, boolean z2, boolean z3, InterfaceC24520xk interfaceC24520xk, int i2, int i3, int i4) {
        int i5;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns3;
        String str4 = str;
        int i6 = i;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns5 = interfaceC88472Yns2;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z4 = z;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns6 = interfaceC88472Yns;
        String str5 = str2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
        boolean z5 = z2;
        boolean z6 = z3;
        o.LJIIIZ(value, "value");
        o.LJIIIZ(code, "code");
        o.LJIIIZ(codes, "codes");
        o.LJIIIZ(selectedIndex, "selectedIndex");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1402023854);
        if ((i4 & 16) != 0) {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        if ((i4 & 32) != 0) {
            interfaceC88472Yns6 = C92448aAu.LJLIL;
        }
        String str6 = null;
        if ((i4 & 64) != 0) {
            str4 = null;
        }
        if ((i4 & 128) != 0) {
            interfaceC88472Yns5 = C92449aAv.LJLIL;
        }
        if ((i4 & 256) != 0) {
            interfaceC88472Yns4 = C92450aAw.LJLIL;
        }
        if ((i4 & 512) != 0) {
            i5 = i2 & (-1879048193);
            i6 = 1;
        } else {
            i5 = i2;
        }
        if ((i4 & 1024) != 0) {
            str5 = null;
        }
        if ((i4 & 2048) != 0) {
            z4 = false;
        }
        if ((i4 & 4096) == 0) {
            str6 = str3;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            interfaceC65784Pro3 = C92451aAx.LJLIL;
        }
        if ((i4 & 16384) != 0) {
            interfaceC65784Pro4 = C92452aAy.LJLIL;
        }
        if ((32768 & i4) != 0) {
            z5 = true;
        }
        if ((65536 & i4) != 0) {
            z6 = false;
        }
        LJIL.LJJIIJ(773894976);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        if (LJJJZ == C24500xi.LIZIZ) {
            LJJJZ = new C35821as(C24610xt.LJII(MBB.INSTANCE, LJIL));
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJJJZ).LJLIL;
        LJIL.LJJJJJ(false);
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        InterfaceC91776a04 form = C91665ZyH.LIZ().getForm();
        C40431iJ LJ = C1DJ.LJ(LJIL, -819894139, new C92453aAz(value, interfaceC07790Sh2, interfaceC88472Yns5, interfaceC88472Yns4, i6, str4, str5, z4, z5, code, i5, i3, z6, interfaceC70422pa, view, codes, selectedIndex, interfaceC88472Yns6, interfaceC65784Pro3, interfaceC65784Pro4));
        int i7 = i3 >> 3;
        form.LIZ(z4, str6, z5, LJ, LJIL, (i7 & 112) | (i7 & 14) | 35840 | ((i3 >> 9) & 896));
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92454aB0(value, code, codes, selectedIndex, interfaceC07790Sh2, interfaceC88472Yns6, str4, interfaceC88472Yns5, interfaceC88472Yns4, i6, str5, z4, str6, interfaceC65784Pro3, interfaceC65784Pro4, z5, z6, i2, i3, i4);
    }
}
