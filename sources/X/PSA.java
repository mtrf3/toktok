package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PSA {
    public static volatile boolean LIZ;
    public static final java.util.Map<Thread, Integer> LIZIZ;

    static {
        new LinkedHashMap();
        LIZIZ = new LinkedHashMap();
    }

    public static void LIZ(PE3 pe3, boolean z, C39050FUg c39050FUg, Field field) {
        ScheduledThreadPoolExecutor c39050FUg2;
        if (!(c39050FUg.getRejectedExecutionHandler() instanceof PSC)) {
            c39050FUg.setRejectedExecutionHandler(new PSC());
        }
        if (z) {
            if (!(c39050FUg instanceof PS7)) {
                int corePoolSize = c39050FUg.getCorePoolSize();
                ThreadFactory threadFactory = c39050FUg.getThreadFactory();
                o.LJIIIIZZ(threadFactory, "pool.threadFactory");
                c39050FUg2 = new PS7(corePoolSize, threadFactory, LiveApmInhibitionSettings.INSTANCE.getPriority());
                c39050FUg2.setRejectedExecutionHandler(new PSC());
            } else {
                return;
            }
        } else {
            if (!(c39050FUg instanceof PS7)) {
                return;
            }
            c39050FUg2 = new C39050FUg(c39050FUg.getCorePoolSize(), c39050FUg.getThreadFactory());
            c39050FUg2.setRejectedExecutionHandler(new PSC());
        }
        field.set(pe3, c39050FUg2);
        BlockingQueue<Runnable> queue = c39050FUg2.getQueue();
        BlockingQueue<Runnable> queue2 = c39050FUg.getQueue();
        o.LJIIIIZZ(queue2, "pool.queue");
        queue.addAll(queue2);
        c39050FUg.shutdown();
    }
}
