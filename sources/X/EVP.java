package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes7.dex */
public class EVP extends Handler {
    public final Handler LIZ;
    public final boolean LIZIZ;

    public EVP(Handler handler, boolean z) {
        super(handler.getLooper());
        this.LIZ = handler;
        this.LIZIZ = z;
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        if (this.LIZIZ && Build.VERSION.SDK_INT >= 22) {
            message.setAsynchronous(true);
        }
        return this.LIZ.sendMessageAtFrontOfQueue(message);
    }
}
