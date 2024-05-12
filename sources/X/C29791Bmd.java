package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.Bmd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29791Bmd {
    public static final C29791Bmd LIZJ = C29792Bme.LIZ;
    public final Handler LIZ;
    public final HandlerThread LIZIZ;

    public C29791Bmd() {
        HandlerThread LIZ = C06M.LIZ("Level-sys-Thread");
        this.LIZ = new Handler(LIZ.getLooper());
        this.LIZIZ = LIZ;
    }

    public final void LIZ(long j, Runnable runnable) {
        if (!this.LIZIZ.isAlive()) {
            C0K2.LIZ("thread not alive", new Throwable());
        }
        if (j <= 0) {
            this.LIZ.post(runnable);
        } else {
            this.LIZ.postDelayed(runnable, j);
        }
    }
}
