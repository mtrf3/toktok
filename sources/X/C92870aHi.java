package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.aHi, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92870aHi extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public static final C92870aHi LJLIL = new C92870aHi();

    public C92870aHi() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        float f;
        InterfaceC07790Sh composed = interfaceC07790Sh;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(composed, "$this$composed");
        interfaceC24520xk2.LJJIIJ(-1230929388);
        float f2 = r0.widthPixels / ((Context) interfaceC24520xk2.LJIILLIIL(C04Q.LIZJ)).getResources().getDisplayMetrics().density;
        if (f2 > 296.0f) {
            f = 280;
        } else {
            f = f2 - 16;
        }
        InterfaceC07790Sh LJIILIIL = C09290Yb.LJIILIIL(composed, f);
        interfaceC24520xk2.LJJIJIIJIL();
        return LJIILIIL;
    }
}
