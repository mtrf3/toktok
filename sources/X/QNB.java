package X;

import android.os.HandlerThread;

/* loaded from: classes12.dex */
public final class QNB {
    public HandlerThread LIZ;
    public QNL LIZIZ;

    public final void LIZ() {
        if (this.LIZ == null) {
            synchronized (QNB.class) {
                if (this.LIZ == null) {
                    HandlerThread handlerThread = new HandlerThread("TuringVerifyThread");
                    this.LIZ = handlerThread;
                    handlerThread.start();
                    this.LIZIZ = new QNL(this, this.LIZ.getLooper());
                }
            }
        }
    }
}
