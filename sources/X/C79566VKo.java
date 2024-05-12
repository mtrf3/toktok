package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.VKo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79566VKo {
    public static C79566VKo LJ;
    public Handler LIZ;
    public HandlerThread LIZIZ;
    public int LIZJ;
    public final Object LIZLLL = new Object();

    public final void LIZ() {
        synchronized (this.LIZLLL) {
            if (this.LIZ == null) {
                if (this.LIZJ > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.LIZIZ = handlerThread;
                    handlerThread.start();
                    this.LIZ = new Handler(this.LIZIZ.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZLLL) {
            this.LIZIZ.quit();
            this.LIZIZ = null;
            this.LIZ = null;
        }
    }

    public final void LIZIZ(Runnable runnable) {
        synchronized (this.LIZLLL) {
            LIZ();
            this.LIZ.post(runnable);
        }
    }
}
