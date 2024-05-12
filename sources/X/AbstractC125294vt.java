package X;

import kotlin.jvm.internal.AqS48S0400000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125294vt {
    public abstract void LIZ(C125284vs c125284vs, AqS48S0400000_2 aqS48S0400000_2, InterfaceC88472Yns interfaceC88472Yns);

    public abstract void LIZJ(C125284vs c125284vs, AqS48S0400000_2 aqS48S0400000_2);

    public final void LIZIZ(C125304vu chain, C125284vs request, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(chain, "chain");
        AqS48S0400000_2 aqS48S0400000_2 = new AqS48S0400000_2(chain, request, interfaceC88472Yns, interfaceC88472Yns2, 2);
        if (request.LIZ == EnumC126024x4.APPLY) {
            LIZ(request, aqS48S0400000_2, interfaceC88472Yns2);
        } else {
            LIZJ(request, aqS48S0400000_2);
        }
    }
}
