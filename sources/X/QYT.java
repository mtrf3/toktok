package X;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes12.dex */
public final class QYT {
    public static QYT LJ;
    public final Context LIZ;
    public final ScheduledExecutorService LIZIZ;
    public QYU LIZJ = new QYU(this);
    public int LIZLLL = 1;

    public final synchronized int LIZIZ() {
        int i;
        i = this.LIZLLL;
        this.LIZLLL = i + 1;
        return i;
    }

    public static synchronized QYT LIZ(Context context) {
        QYT qyt;
        synchronized (QYT.class) {
            if (LJ == null) {
                LJ = new QYT(context, Executors.unconfigurableScheduledExecutorService(C16880lQ.LLLLZLL(1, new ThreadFactoryC39014FSw("MessengerIpcClient"))));
            }
            qyt = LJ;
        }
        return qyt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized C67646Qgk LIZJ(QYY qyy) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(qyy).length() + 9);
        }
        if (!this.LIZJ.LIZLLL(qyy)) {
            QYU qyu = new QYU(this);
            this.LIZJ = qyu;
            qyu.LIZLLL(qyy);
        }
        return qyy.LIZIZ.LIZ;
    }

    public QYT(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.LIZIZ = scheduledExecutorService;
        this.LIZ = C16880lQ.LLLLL(context);
    }
}
