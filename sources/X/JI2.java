package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JI2 extends F9E {
    public final C49153JQv LJLIL;
    public final JIB LJLILLLLZI;
    public final JGU LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public JI2(C49153JQv manager, JIB containerStatusProvider, JGU playVideoObserver) {
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        o.LJIIIZ(playVideoObserver, "playVideoObserver");
        this.LJLIL = manager;
        this.LJLILLLLZI = containerStatusProvider;
        this.LJLJI = playVideoObserver;
    }
}
