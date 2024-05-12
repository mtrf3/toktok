package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.X8r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class HandlerThreadC84353X8r extends HandlerThread {
    public final /* synthetic */ C84352X8q LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        Looper looper = getLooper();
        synchronized (this.LJLIL.LIZ) {
            this.LJLIL.LIZLLL = new Handler(looper);
        }
        while (!((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).isEmpty()) {
            C84354X8s c84354X8s = (C84354X8s) ((ConcurrentLinkedQueue) this.LJLIL.LIZIZ).poll();
            if (c84354X8s != null) {
                this.LJLIL.LIZLLL.postDelayed(c84354X8s.LIZ, c84354X8s.LIZIZ);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC84353X8r(C84352X8q c84352X8q) {
        super("DownloaderNotifyThread");
        this.LJLIL = c84352X8q;
    }
}
