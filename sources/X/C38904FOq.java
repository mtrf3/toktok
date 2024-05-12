package X;

import android.os.MessageQueue;

/* renamed from: X.FOq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38904FOq implements MessageQueue.IdleHandler {
    public final /* synthetic */ C38903FOp LJLIL;

    public C38904FOq(C38903FOp c38903FOp) {
        this.LJLIL = c38903FOp;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.LJLIL.LIZIZ();
        return true;
    }
}
