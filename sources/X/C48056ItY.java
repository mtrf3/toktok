package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ItY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48056ItY {
    public static volatile PThreadPoolExecutor LIZ;
    public static final Deque<RunnableC48057ItZ> LIZIZ = new ArrayDeque();
    public static final Deque<RunnableC48057ItZ> LIZJ = new ArrayDeque();

    public static void LIZIZ() {
        if (LIZ == null) {
            synchronized (C48056ItY.class) {
                if (LIZ == null) {
                    LIZ = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("iveThreadPool"));
                }
            }
        }
    }

    public static synchronized void LIZ(Runnable runnable) {
        synchronized (C48056ItY.class) {
            if (LIZ == null) {
                LIZIZ();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addExecuteTask,cur thread num:");
            if (LIZ == null) {
                LIZIZ();
            }
            LIZ2.append(LIZ.getPoolSize());
            X1D.LIZIZ(LIZ2);
            C46496IMq.LIZ();
            RunnableC48057ItZ runnableC48057ItZ = new RunnableC48057ItZ(runnable);
            Deque<RunnableC48057ItZ> deque = LIZJ;
            if (((ArrayDeque) deque).size() >= 5) {
                ((ArrayDeque) LIZIZ).add(runnableC48057ItZ);
            } else {
                ((ArrayDeque) deque).add(runnableC48057ItZ);
                LIZ.submit(runnableC48057ItZ);
            }
        }
    }
}
