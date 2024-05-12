package X;

import android.os.MessageQueue;

/* loaded from: classes16.dex */
public final class XJA implements MessageQueue.IdleHandler {
    public final /* synthetic */ XJL<C76800UCe> LJLIL;

    public XJA(XKS xks) {
        this.LJLIL = xks;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        XJL<C76800UCe> xjl = this.LJLIL;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
        return false;
    }
}
