package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ew0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38016Ew0 {
    public static ExecutorService LIZ;
    public static final C38020Ew4 LIZIZ;
    public static final C38020Ew4 LIZJ;
    public static final ScheduledExecutorService LIZLLL;
    public static final C38020Ew4 LJ;
    public static final C38020Ew4 LJFF;
    public static final int LJI;
    public static final int LJII;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        int i = availableProcessors - 1;
        int max = Math.max(2, Math.min(i, 6)) * 2;
        LJI = max;
        int i2 = (max * 2) + 1;
        LJII = i2;
        int max2 = Math.max(2, Math.min(i, 3));
        int i3 = (availableProcessors * 2) + 1;
        FOU fou = new FOU("TTDefaultExecutors");
        FOU fou2 = new FOU("TTCpuExecutors");
        FOU fou3 = new FOU("TTScheduledExecutors");
        FOU fou4 = new FOU("TTDownLoadExecutors");
        FOU fou5 = new FOU("TTSerialExecutors");
        FOV fov = new FOV();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        RejectedExecutionHandlerC38021Ew5 rejectedExecutionHandlerC38021Ew5 = new RejectedExecutionHandlerC38021Ew5();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C38020Ew4 c38020Ew4 = new C38020Ew4(max, i2, timeUnit, linkedBlockingQueue, fou, rejectedExecutionHandlerC38021Ew5);
        LIZ = c38020Ew4;
        c38020Ew4.allowCoreThreadTimeOut(true);
        C38020Ew4 c38020Ew42 = new C38020Ew4(max2, i3, timeUnit, linkedBlockingQueue2, fou2, rejectedExecutionHandlerC38021Ew5);
        LIZIZ = c38020Ew42;
        c38020Ew42.allowCoreThreadTimeOut(true);
        LIZLLL = C16880lQ.LLLLZLL(3, fou3);
        C38020Ew4 c38020Ew43 = new C38020Ew4(2, 2, timeUnit, linkedBlockingQueue3, fou4, rejectedExecutionHandlerC38021Ew5);
        LIZJ = c38020Ew43;
        c38020Ew43.allowCoreThreadTimeOut(true);
        C38020Ew4 c38020Ew44 = new C38020Ew4(1, 1, timeUnit, new LinkedBlockingQueue(), fou5);
        LJ = c38020Ew44;
        c38020Ew44.allowCoreThreadTimeOut(true);
        C38020Ew4 c38020Ew45 = new C38020Ew4(0, 3, timeUnit, new LinkedBlockingQueue(), fov);
        LJFF = c38020Ew45;
        c38020Ew45.allowCoreThreadTimeOut(true);
    }
}
