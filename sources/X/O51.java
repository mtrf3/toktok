package X;

import android.os.MessageQueue;

/* loaded from: classes11.dex */
public final class O51 implements MessageQueue.IdleHandler {
    public final /* synthetic */ Runnable LJLIL;

    public O51(Runnable runnable) {
        this.LJLIL = runnable;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.LJLIL.run();
        return false;
    }
}
