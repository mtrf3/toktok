package X;

import android.os.Handler;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.X8q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84352X8q {
    public final Object LIZ = new Object();
    public final Queue<C84354X8s> LIZIZ = new ConcurrentLinkedQueue();
    public final HandlerThreadC84353X8r LIZJ = new HandlerThreadC84353X8r(this);
    public Handler LIZLLL;

    public final void LIZ(Runnable runnable, long j) {
        if (this.LIZLLL == null) {
            synchronized (this.LIZ) {
                if (this.LIZLLL == null) {
                    ((ConcurrentLinkedQueue) this.LIZIZ).add(new C84354X8s(runnable, j));
                    return;
                }
            }
        }
        this.LIZLLL.postDelayed(runnable, j);
    }
}
