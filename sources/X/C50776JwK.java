package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JwK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50776JwK extends AbstractC65781Prl implements InterfaceC88471Ynr<C50485Jrd, C50771JwF, C50485Jrd> {
    public static final C50776JwK LJLIL = new C50776JwK();

    public C50776JwK() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50485Jrd invoke(C50485Jrd c50485Jrd, C50771JwF c50771JwF) {
        C50485Jrd state = c50485Jrd;
        C50771JwF action = c50771JwF;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50485Jrd.LIZ(state, action.LJLIL, false, 30);
    }
}
