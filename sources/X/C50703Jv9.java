package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jv9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50703Jv9 extends AbstractC65781Prl implements InterfaceC88471Ynr<C50700Jv6, C50704JvA, C50700Jv6> {
    public static final C50703Jv9 LJLIL = new C50703Jv9();

    public C50703Jv9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50700Jv6 invoke(C50700Jv6 c50700Jv6, C50704JvA c50704JvA) {
        C50700Jv6 state = c50700Jv6;
        C50704JvA action = c50704JvA;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        if (state.LJLIL) {
            return state;
        }
        return C50700Jv6.LIZ(state, false, false, action.LIZIZ, action.LIZ, action.LIZJ, action.LIZLLL, null, 67);
    }
}
