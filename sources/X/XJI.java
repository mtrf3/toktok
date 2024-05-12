package X;

import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes16.dex */
public final class XJI extends EventLoopImplBase {
    public final Thread LJLIL;

    @Override // X.XJF
    public final Thread getThread() {
        return this.LJLIL;
    }

    public XJI(Thread thread) {
        this.LJLIL = thread;
    }
}
