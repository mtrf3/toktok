package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes12.dex */
public final class QFG {
    public static QFG LIZLLL;
    public final PThreadScheduledThreadPoolExecutor LIZ;
    public final ConcurrentHashMap<QF9, ScheduledFuture> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<QF9, Runnable> LIZJ = new ConcurrentHashMap<>();

    static {
        C16880lQ.LJLLJ(QFG.class);
    }

    public static QFG LIZ() {
        if (LIZLLL == null) {
            synchronized (QFG.class) {
                if (LIZLLL == null) {
                    LIZLLL = new QFG();
                }
            }
        }
        return LIZLLL;
    }

    public QFG() {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(1, new QFJ());
        this.LIZ = pThreadScheduledThreadPoolExecutor;
        pThreadScheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
    }
}
