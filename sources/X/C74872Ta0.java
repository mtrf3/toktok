package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ta0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74872Ta0 extends AbstractC65781Prl implements InterfaceC88472Yns<OSJ<? extends Integer, ? extends Integer, ? extends Integer>, C76800UCe> {
    public static final C74872Ta0 LJLIL = new C74872Ta0();

    public C74872Ta0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OSJ<? extends Integer, ? extends Integer, ? extends Integer> osj) {
        TQU LIZLLL;
        OSJ<? extends Integer, ? extends Integer, ? extends Integer> it = osj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestV3VideoCaptureChangeEvent it=");
        LIZ.append(it);
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            Integer first = it.getFirst();
            o.LJII(first, "null cannot be cast to non-null type kotlin.Int");
            int intValue = first.intValue();
            Integer second = it.getSecond();
            o.LJII(second, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = second.intValue();
            Integer third = it.getThird();
            o.LJII(third, "null cannot be cast to non-null type kotlin.Int");
            LIZLLL.LIZJ(intValue, intValue2, third.intValue());
        }
        return C76800UCe.LIZ;
    }
}
