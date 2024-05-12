package X;

import android.os.MessageQueue;

/* loaded from: classes7.dex */
public final class EES implements MessageQueue.IdleHandler {
    public final /* synthetic */ EER LJLIL;

    public EES(EER eer) {
        this.LJLIL = eer;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (EEZ.LIZIZ()) {
            this.LJLIL.LJFF();
            return true;
        }
        return true;
    }
}
