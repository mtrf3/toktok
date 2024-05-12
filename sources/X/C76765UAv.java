package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;

/* renamed from: X.UAv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76765UAv {
    public Handler LIZ;

    public final Handler LIZ() {
        Handler handler;
        if (C77413UZt.LJIJJLI(this.LIZ)) {
            return this.LIZ;
        }
        synchronized (this) {
            if (HandlerThreadOptSetting.INSTANCE.enable()) {
                handler = new Handler(C39202Fa2.LIZ.LIZ());
            } else {
                HandlerThread handlerThread = new HandlerThread("MonitorThreadHelper");
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
            }
        }
        this.LIZ = handler;
        return handler;
    }

    public final void LIZIZ(Runnable runnable) {
        Handler LIZ = LIZ();
        if (LIZ != null) {
            LIZ.post(new ARunnableS49S0100000_13(runnable, 265));
        }
    }
}
