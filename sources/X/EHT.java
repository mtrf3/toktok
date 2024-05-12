package X;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class EHT implements MessageQueue.IdleHandler {
    public final MessageQueue.IdleHandler LJLIL;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        Message message;
        if (!((Boolean) C34710Djm.LJJLIIIJJIZ.getValue()).booleanValue()) {
            return this.LJLIL.queueIdle();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            message = (Message) C36595EXv.LJFF.get(Looper.myQueue());
        } catch (Throwable unused) {
        }
        if (message != null) {
            if (message.getWhen() - uptimeMillis > 10) {
                return this.LJLIL.queueIdle();
            }
            return true;
        }
        return this.LJLIL.queueIdle();
    }

    public EHT(MessageQueue.IdleHandler idleHandler) {
        this.LJLIL = idleHandler;
    }
}
