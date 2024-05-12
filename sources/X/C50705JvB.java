package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JvB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50705JvB extends AbstractC65781Prl implements InterfaceC88471Ynr<C50700Jv6, C50706JvC, C50700Jv6> {
    public static final C50705JvB LJLIL = new C50705JvB();

    public C50705JvB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50700Jv6 invoke(C50700Jv6 c50700Jv6, C50706JvC c50706JvC) {
        C50700Jv6 state = c50700Jv6;
        C50706JvC action = c50706JvC;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        if (state.LJLIL) {
            return state;
        }
        return C50700Jv6.LIZ(state, false, action.LIZ, 0L, 0L, null, null, null, 125);
    }
}
