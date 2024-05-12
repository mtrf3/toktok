package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS1S0102000_31;

/* renamed from: X.a3o, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92008a3o {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-2004163391);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((2 ^ (i3 & 11)) != 0 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (LJIL.LJIILLIIL(AnonymousClass057.LJIIJ) == EnumC23500w6.Ltr) {
                i5 = R.drawable.if;
            } else {
                i5 = R.drawable.ig;
            }
            C0SR.LIZ(C79081V1x.LJJIIZ(i5, LJIL), null, interfaceC07790Sh2, null, null, 0.0f, C11860dK.LIZIZ(C91671ZyN.LIZ(LJIL).LIZJ), LJIL, ((i3 << 6) & 896) | 56, 56);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS1S0102000_31(interfaceC07790Sh2, i, i2, 2);
    }
}
