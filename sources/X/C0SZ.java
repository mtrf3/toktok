package X;

import com.google.android.play.core.assetpacks.r2;
import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.0SZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SZ {
    public static final void LIZ(InterfaceC07790Sh modifier, InterfaceC88472Yns<? super InterfaceC33691Tx, C76800UCe> onDraw, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(modifier, "modifier");
        o.LJIIIZ(onDraw, "onDraw");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-932836462);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(onDraw)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !LJIL.LIZ()) {
            C79057V0z.LJ(r2.LJI(modifier, onDraw), LJIL, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000(modifier, (InterfaceC07790Sh) onDraw, (InterfaceC88472Yns<? super InterfaceC33691Tx, C76800UCe>) i, 4);
    }
}
