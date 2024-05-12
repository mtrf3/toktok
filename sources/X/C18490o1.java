package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.0o1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18490o1 {
    public static final float LIZ;
    public static final float LIZIZ;

    static {
        float f = 25;
        LIZ = f;
        LIZIZ = (f * 2.0f) / 2.4142137f;
    }

    public static final void LIZIZ(InterfaceC07790Sh modifier, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        InterfaceC07790Sh LIZ2;
        int i3;
        o.LJIIIZ(modifier, "modifier");
        C35931b3 LJIL = interfaceC24520xk.LJIL(694251107);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !LJIL.LIZ()) {
            InterfaceC07790Sh LJIIL = C09290Yb.LJIIL(modifier, LIZIZ, LIZ);
            o.LJIIIZ(LJIIL, "<this>");
            LIZ2 = C07770Sf.LIZ(LJIIL, g1.LIZ, C23B.LJLIL);
            C79057V0z.LJ(LIZ2, LJIL, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(modifier, i, 7);
    }

    public static final void LIZ(long j, InterfaceC07790Sh modifier, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(modifier, "modifier");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-5185995);
        if ((i & 14) == 0) {
            if (LJIL.LJIIJ(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !LJIL.LIZ()) {
            C20120qe.LIZIZ(j, EnumC20220qo.TopMiddle, C1DJ.LJ(LJIL, -1458480226, new IDqS2S0201000((InterfaceC88471Ynr) interfaceC88471Ynr, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) modifier, (InterfaceC07790Sh) i2, 10)), LJIL, (i2 & 14) | 432);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AnonymousClass237(j, modifier, interfaceC88471Ynr, i);
    }
}
