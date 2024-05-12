package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K62 extends AbstractC65781Prl implements InterfaceC88471Ynr<C50485Jrd, K63, C50485Jrd> {
    public static final K62 LJLIL = new K62();

    public K62() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50485Jrd invoke(C50485Jrd c50485Jrd, K63 k63) {
        C50485Jrd state = c50485Jrd;
        K63 action = k63;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50485Jrd.LIZ(state, null, action.LJLIL, 23);
    }
}
