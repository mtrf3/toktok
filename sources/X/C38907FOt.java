package X;

import Y.ARunnableS42S0100000_6;
import android.os.MessageQueue;

/* renamed from: X.FOt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38907FOt implements MessageQueue.IdleHandler {
    public final /* synthetic */ ARunnableS42S0100000_6 LJLIL;

    public C38907FOt(ARunnableS42S0100000_6 aRunnableS42S0100000_6) {
        this.LJLIL = aRunnableS42S0100000_6;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        ((C38903FOp) this.LJLIL.l0).LIZIZ();
        return true;
    }
}
