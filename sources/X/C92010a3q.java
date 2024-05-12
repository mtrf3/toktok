package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS1S0102000_31;

/* renamed from: X.a3q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92010a3q {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1231467545);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((2 ^ (i3 & 11)) != 0 || !LJIL.LIZ()) {
            if (i5 != 0) {
                interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
            }
            C0SR.LIZ(C79081V1x.LJJIIZ(R.drawable.ig, LJIL), null, C92004a3k.LIZ(interfaceC07790Sh), null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(LJIL).LJ), LJIL, 56, 56);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS1S0102000_31(interfaceC07790Sh, i, i2, 3);
    }
}
