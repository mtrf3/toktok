package X;

import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.Zze, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91750Zze {
    public static final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(1677316425);
        if (i != 0 || !LJIL.LIZ()) {
            C92057a4b.LIZ(2, 3078, 6, 0L, 0L, LJIL, C70657RoD.LJIJ(C09290Yb.LJIIJJI(InterfaceC07790Sh.LJJJI, 24), 3));
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92486aBW(i);
    }

    public static final void LIZIZ(Methods method, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC88472Yns<? super Methods, C76800UCe> interfaceC88472Yns, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        String str3;
        String str4;
        boolean z5 = z;
        String str5 = str;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        InterfaceC88472Yns<? super Methods, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
        o.LJIIIZ(method, "method");
        C35931b3 LJIL = interfaceC24520xk.LJIL(136161121);
        String str6 = null;
        if ((i2 & 2) != 0) {
            str5 = null;
        }
        if ((i2 & 4) == 0) {
            str6 = str2;
        }
        if ((i2 & 8) != 0) {
            z5 = false;
        }
        if ((i2 & 16) != 0) {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            z7 = false;
        }
        if ((i2 & 64) != 0) {
            z8 = true;
        }
        if ((i2 & 128) != 0) {
            interfaceC88472Yns2 = C92487aBX.LJLIL;
        }
        if (str5 == null) {
            if (C91671ZyN.LIZ) {
                str3 = method.getIconUrl();
            } else {
                String darkModeIconUrl = method.getDarkModeIconUrl();
                if (darkModeIconUrl == null || darkModeIconUrl.length() == 0) {
                    str3 = method.getIconUrl();
                } else {
                    str3 = method.getDarkModeIconUrl();
                }
            }
        } else {
            str3 = str5;
        }
        if (str6 == null) {
            str4 = C91969a3B.LJIIIIZZ(method);
        } else {
            str4 = str6;
        }
        InterfaceC91779a07 textCell = C91665ZyH.LIZ().getTextCell();
        if (str3 == null) {
            str3 = "";
        }
        int i3 = i << 3;
        textCell.LIZ(str3, str4, false, null, z5, z6, false, z8, null, C1DJ.LJ(LJIL, -819895454, new C92488aBY(z7, z6)), new IDqS178S0200000_31((InterfaceC88472Yns) interfaceC88472Yns2, (InterfaceC88472Yns<? super Methods, C76800UCe>) method, (Methods) 0), LJIL, (57344 & i3) | 907545984 | (458752 & i3) | (i3 & 29360128), 64);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92489aBZ(method, str5, str6, z5, z6, z7, z8, interfaceC88472Yns2, i, i2);
    }
}
