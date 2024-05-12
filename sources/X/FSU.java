package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class FSU {
    public static final AtomicInteger LIZ;
    public static final int LIZIZ;
    public static final FSW LIZJ;
    public static final FSW LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final long LJI;
    public static final RejectedExecutionHandlerC38997FSf LJII;
    public static final RejectedExecutionHandlerC38996FSe LJIIIIZZ;
    public static volatile InterfaceC36534EVm LJIIIZ;

    public static FSW LIZ() {
        return new FSW(FSY.IO, 0, 128, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC37315Ekh("tp-io", false, 0), LJII);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        LIZ = new AtomicInteger(0);
        int i = availableProcessors + 1;
        int i2 = availableProcessors - 1;
        int max = Math.max(2, Math.min(i2, 6)) * 2;
        LIZIZ = Math.max(2, Math.min(i2, 4));
        Math.max(2, i2);
        LIZJ = LIZIZ(max, FSY.IO, "tp-reject");
        LIZLLL = LIZIZ(i, FSY.DEFAULT, "tp-default-reject");
        LJI = TimeUnit.SECONDS.toMillis(3L);
        LJII = new RejectedExecutionHandlerC38997FSf();
        LJIIIIZZ = new RejectedExecutionHandlerC38996FSe();
        LJIIIZ = null;
    }

    public static FSW LIZIZ(int i, FSY fsy, String str) {
        FSW fsw = new FSW(fsy, i, i, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC37315Ekh(str, false, 0));
        fsw.allowCoreThreadTimeOut(true);
        return fsw;
    }
}
