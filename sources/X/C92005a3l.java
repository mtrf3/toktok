package X;

import com.google.android.play.core.assetpacks.r2;
import kotlin.jvm.internal.IDqS12S0101000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a3l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92005a3l {
    public static final void LIZ(Object icon, String title, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        float f;
        boolean z6 = z;
        boolean z7 = z2;
        String str2 = str;
        boolean z8 = z3;
        boolean z9 = z4;
        boolean z10 = z5;
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1444933465);
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = null;
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        if ((i3 & 16) != 0) {
            z7 = false;
        }
        if ((i3 & 32) != 0) {
            z8 = false;
        }
        if ((i3 & 64) != 0) {
            z9 = false;
        }
        if ((i3 & 128) != 0) {
            z10 = true;
        }
        if ((i3 & 512) == 0) {
            interfaceC88471Ynr3 = interfaceC88471Ynr2;
        }
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = new C42191l9();
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        C1OH c1oh = (C1OH) LJJJZ;
        InterfaceC35811ar LJFF = C1O1.LJFF(c1oh, LJIL, 6);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        if (z9 || !z10) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        InterfaceC07790Sh LJIIL = C78866UxK.LJIIL(c1m1, f);
        LJIL.LJJIIJ(1157296644);
        boolean LJIJJ = LJIL.LJIJJ(LJFF);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJIJJ || LJJJZ2 == c24490xh) {
            LJJJZ2 = new IDqS418S0100000_31(LJFF, (InterfaceC35811ar<Integer>) 89);
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        C92038a4I.LIZIZ(r2.LJI(LJIIL, (InterfaceC88472Yns) LJJJZ2), C1DJ.LJ(LJIL, -819894184, new C92921aIX(i, title, str2, icon)), C1DJ.LJ(LJIL, -819891306, new IDqS12S0101000_31(i, (InterfaceC88471Ynr) interfaceC88471Ynr, 3)), C1DJ.LJ(LJIL, -819891262, new C92922aIY(z9, z7, interfaceC88471Ynr3, i, z6, z8)), false, z10, c1oh, onClick, LJIL, ((i >> 6) & 458752) | 1576368 | ((i2 << 21) & 29360128), 16);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92923aIZ(icon, title, str2, z6, z7, z8, z9, z10, interfaceC88471Ynr, interfaceC88471Ynr3, onClick, i, i2, i3);
    }
}
