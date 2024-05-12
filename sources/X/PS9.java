package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PS9 {
    public static boolean LIZ;
    public static final java.util.Map<Thread, Integer> LIZIZ = new LinkedHashMap();

    public static void LIZ(boolean z, PD6 pd6) {
        ScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        C64071PCp LIZ2 = C64071PCp.LIZ(pd6);
        Field[] fields = C64071PCp.class.getDeclaredFields();
        o.LJIIIIZZ(fields, "fields");
        for (Field field : fields) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                Object obj = field.get(LIZ2);
                if (obj != null && ScheduledThreadPoolExecutor.class.isAssignableFrom(obj.getClass())) {
                    try {
                        Object obj2 = field.get(LIZ2);
                        o.LJII(obj2, "null cannot be cast to non-null type java.util.concurrent.ScheduledThreadPoolExecutor");
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj2;
                        if (scheduledThreadPoolExecutor != null) {
                            if (!(scheduledThreadPoolExecutor.getRejectedExecutionHandler() instanceof PSB)) {
                                scheduledThreadPoolExecutor.setRejectedExecutionHandler(new PSB());
                            }
                            if (z) {
                                if (!(scheduledThreadPoolExecutor instanceof PS8)) {
                                    int corePoolSize = scheduledThreadPoolExecutor.getCorePoolSize();
                                    ThreadFactory threadFactory = scheduledThreadPoolExecutor.getThreadFactory();
                                    o.LJIIIIZZ(threadFactory, "pool.threadFactory");
                                    pThreadScheduledThreadPoolExecutor = new PS8(corePoolSize, threadFactory, LiveApmInhibitionSettings.INSTANCE.getPriority());
                                    pThreadScheduledThreadPoolExecutor.setRejectedExecutionHandler(new PSB());
                                } else {
                                    return;
                                }
                            } else {
                                if (!(scheduledThreadPoolExecutor instanceof PS8)) {
                                    return;
                                }
                                pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(scheduledThreadPoolExecutor.getCorePoolSize(), scheduledThreadPoolExecutor.getThreadFactory());
                                pThreadScheduledThreadPoolExecutor.setRejectedExecutionHandler(new PSB());
                            }
                            field.set(LIZ2, pThreadScheduledThreadPoolExecutor);
                            BlockingQueue<Runnable> queue = pThreadScheduledThreadPoolExecutor.getQueue();
                            BlockingQueue<Runnable> queue2 = scheduledThreadPoolExecutor.getQueue();
                            o.LJIIIIZZ(queue2, "pool.queue");
                            queue.addAll(queue2);
                            scheduledThreadPoolExecutor.shutdown();
                            return;
                        }
                        return;
                    } catch (ClassCastException e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    } catch (IllegalAccessException e2) {
                        C16880lQ.LLLLIIL(e2);
                        return;
                    } catch (IllegalArgumentException e3) {
                        C16880lQ.LLLLIIL(e3);
                        return;
                    }
                }
            } catch (IllegalAccessException e4) {
                C16880lQ.LLLLIIL(e4);
            } catch (IllegalArgumentException e5) {
                C16880lQ.LLLLIIL(e5);
            }
        }
    }
}
