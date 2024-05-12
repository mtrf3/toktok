package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.IsH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47977IsH {
    public final HandlerThread LIZ;
    public final Handler LIZIZ;

    public C47977IsH() {
        HandlerThread handlerThread = new HandlerThread("PublishCommandExecutor");
        this.LIZ = handlerThread;
        handlerThread.start();
        this.LIZIZ = new Handler(handlerThread.getLooper());
    }

    public final void LIZ(InterfaceC47978IsI interfaceC47978IsI) {
        if (this.LIZ.isAlive()) {
            this.LIZIZ.post(new IDRunnableS6S0101000(7, interfaceC47978IsI, 9));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
