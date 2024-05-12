package X;

import android.util.Pair;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.FUg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39050FUg extends PThreadScheduledThreadPoolExecutor {
    public final java.util.Map<Integer, List<ScheduledFuture<?>>> LJLIL;
    public final java.util.Map<ScheduledFuture<?>, Pair<Integer, Boolean>> LJLILLLLZI;
    public ExecutorService LJLJI;
    public ThreadPoolExecutor LJLJJI;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void terminated() {
        super.terminated();
    }

    public final void LIZ(PD3 pd3) {
        boolean z;
        if (pd3 == null) {
            return;
        }
        int hashCode = pd3.hashCode();
        List<ScheduledFuture> list = (List) ((ConcurrentHashMap) this.LJLIL).get(Integer.valueOf(hashCode));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("z-debug scheduledFutures in ?");
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (list != null && !list.isEmpty()) {
            for (ScheduledFuture scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    scheduledFuture.cancel(true);
                    LIZIZ(Integer.valueOf(hashCode), scheduledFuture);
                }
            }
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        ExecutorService executorService = this.LJLJI;
        if (executorService != null) {
            return executorService.submit(runnable);
        }
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        ExecutorService executorService = this.LJLJI;
        if (executorService != null) {
            return executorService.submit(callable);
        }
        return super.submit(callable);
    }

    public C39050FUg(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.LJLIL = new ConcurrentHashMap();
        this.LJLILLLLZI = new ConcurrentHashMap();
    }

    public final void LIZIZ(Integer num, ScheduledFuture scheduledFuture) {
        List list = (List) ((ConcurrentHashMap) this.LJLIL).get(num);
        if (list != null) {
            list.remove(scheduledFuture);
            if (list.isEmpty()) {
                ((ConcurrentHashMap) this.LJLIL).remove(num);
            }
        }
        ((ConcurrentHashMap) this.LJLILLLLZI).remove(scheduledFuture);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        Object obj;
        super.afterExecute(runnable, th);
        if (runnable instanceof ScheduledFuture) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) runnable;
            Pair pair = (Pair) ((ConcurrentHashMap) this.LJLILLLLZI).get(scheduledFuture);
            if (pair != null && (obj = pair.first) != null) {
                int intValue = ((Integer) obj).intValue();
                Boolean bool = (Boolean) pair.second;
                if (bool == null || bool.booleanValue()) {
                    return;
                }
                LIZIZ(Integer.valueOf(intValue), scheduledFuture);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        ExecutorService executorService = this.LJLJI;
        if (executorService != null) {
            return executorService.submit(runnable, t);
        }
        return super.submit(runnable, t);
    }

    public final void LIZJ(ScheduledFuture<?> scheduledFuture, int i, boolean z) {
        List list = (List) ((ConcurrentHashMap) this.LJLIL).get(Integer.valueOf(i));
        if (list == null) {
            list = new CopyOnWriteArrayList();
            ((ConcurrentHashMap) this.LJLIL).put(Integer.valueOf(i), list);
        }
        list.add(scheduledFuture);
        ((ConcurrentHashMap) this.LJLILLLLZI).put(scheduledFuture, new Pair(Integer.valueOf(i), Boolean.valueOf(z)));
    }
}
