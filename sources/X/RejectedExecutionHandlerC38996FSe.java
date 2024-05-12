package X;

import Y.ARunnableS17S0300000_6;
import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.FSe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RejectedExecutionHandlerC38996FSe implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        FSU.LIZLLL.execute(runnable);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - FSU.LJFF >= FSU.LJI || C38995FSd.LIZ.LIZ) {
            FSU.LJFF = elapsedRealtime;
            C38999FSh.LIZ.getClass();
            if (!C38995FSd.LIZIZ.LIZJ()) {
                return;
            }
            C39004FSm.LIZLLL.execute(new ARunnableS17S0300000_6(runnable, threadPoolExecutor, new Exception(), 9));
            return;
        }
        FSU.LJFF = elapsedRealtime;
    }
}
