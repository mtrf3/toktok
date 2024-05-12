package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBF extends ESP {
    public final C29S LJLILLLLZI;
    public final IC6 LJLJI;

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJI.K1();
    }

    @Override // X.ESP
    public final void LJIIIZ(T4Q session) {
        o.LJIIIZ(session, "session");
        this.LJLJI.G7(this.LJLILLLLZI);
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return V3N.LJIJI(session.LIZ);
    }

    public IBF(C29S activity, C46210IBq c46210IBq) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI = activity;
        this.LJLJI = c46210IBq;
    }
}
