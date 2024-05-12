package com.byted.cast.common.async;

import X.C16880lQ;
import X.X1D;
import com.byted.cast.common.Logger;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.async.Observer;
import com.byted.cast.common.threadpool.CastThreadFactory;
import com.byted.cast.common.threadpool.CastThreadPoolExecutor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes29.dex */
public class ConcurrentSubject<T> implements Subject<T> {
    public List<Callable<Void>> callables;
    public ExecutorService executor;
    public volatile boolean isDestroy;
    public List<Observer> observers;
    public long timeout = -1;
    public List<Callable<Void>> timeoutCallables;
    public ExecutorService timeoutExecutor;
    public TimerTask timeoutTask;
    public Timer timer;
    public TimeUnit unit;

    /* loaded from: classes29.dex */
    public class TimeoutTask extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com_byted_cast_common_async_ConcurrentSubject$TimeoutTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_common_async_ConcurrentSubject$TimeoutTask__run$___twin___() {
            synchronized (ConcurrentSubject.this) {
                if (ConcurrentSubject.this.isDestroy) {
                    return;
                }
                ConcurrentSubject.this.notifyException(new TimeoutException());
                List<Observer> list = ConcurrentSubject.this.observers;
                if (list != null) {
                    list.clear();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("timeout, observers is clear, observers.size");
                    LIZ.append(ConcurrentSubject.this.observers.size());
                    Logger.i("ConcurrentSubject", X1D.LIZIZ(LIZ));
                } else {
                    Logger.i("ConcurrentSubject", "timeout, observers is null");
                }
            }
        }

        public TimeoutTask() {
        }

        public static void com_byted_cast_common_async_ConcurrentSubject$TimeoutTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TimeoutTask timeoutTask) {
            boolean LIZ;
            try {
                timeoutTask.com_byted_cast_common_async_ConcurrentSubject$TimeoutTask__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public synchronized void destroy() {
        if (this.isDestroy) {
            return;
        }
        this.isDestroy = true;
        List<Observer> list = this.observers;
        if (list != null) {
            list.clear();
            this.observers = null;
        }
        ExecutorService executorService = this.executor;
        if (executorService != null) {
            executorService.shutdownNow();
            this.executor = null;
        }
        ExecutorService executorService2 = this.timeoutExecutor;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.timeoutExecutor = null;
        }
        List<Callable<Void>> list2 = this.callables;
        if (list2 != null) {
            list2.clear();
            this.callables = null;
        }
        List<Callable<Void>> list3 = this.timeoutCallables;
        if (list3 != null) {
            list3.clear();
            this.timeoutCallables = null;
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    @Override // com.byted.cast.common.async.Subject
    public void clearObservers() {
        Logger.d("ConcurrentSubject", "clearObservers:");
        if (this.isDestroy) {
            return;
        }
        this.observers.clear();
    }

    @Override // com.byted.cast.common.async.Subject
    public void dispose() {
        if (this.isDestroy) {
            return;
        }
        TimerTask timerTask = this.timeoutTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timeoutCallables.clear();
    }

    public ConcurrentSubject() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.unit = timeUnit;
        Logger.i("ConcurrentSubject", "ConcurrentSubject ctor");
        this.observers = new CopyOnWriteArrayList();
        this.timer = new PthreadTimer("ConcurrentSubject");
        this.executor = new CastThreadPoolExecutor(4, 32, 10L, timeUnit, new LinkedBlockingQueue(64), new CastThreadFactory("ConcurrentSubject"));
        this.timeoutExecutor = new CastThreadPoolExecutor(4, 32, 10L, timeUnit, new LinkedBlockingQueue(64), new CastThreadFactory("ConcurrentSubject"));
        this.callables = new CopyOnWriteArrayList();
        this.timeoutCallables = new CopyOnWriteArrayList();
    }

    private void awaitAfterShutdown(ExecutorService executorService) {
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(60L, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                C16880lQ.LLLLIIIILLL().interrupt();
            }
        }
    }

    @Override // com.byted.cast.common.async.Subject
    public Subject addObserver(Observer observer) {
        this.observers.add(observer);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addObserver, size:");
        LIZ.append(this.observers.size());
        Logger.i("ConcurrentSubject", X1D.LIZIZ(LIZ));
        return this;
    }

    @Override // com.byted.cast.common.async.Subject
    public void notifyException(final Exception exc) {
        ExecutorService executorService;
        List<Callable<Void>> list;
        Logger.d("ConcurrentSubject", "notifyException in");
        if (this.isDestroy) {
            return;
        }
        for (final Observer observer : this.observers) {
            List<Callable<Void>> list2 = this.timeoutCallables;
            if (list2 == null) {
                Logger.d("ConcurrentSubject", "notifyException timeoutCallables is null");
                return;
            }
            list2.add(new Callable() { // from class: X.ZZd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ConcurrentSubject.lambda$notifyException$1(Observer.this, exc);
                }
            });
        }
        try {
            executorService = this.timeoutExecutor;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (executorService == null || (list = this.timeoutCallables) == null) {
            Logger.d("ConcurrentSubject", "notifyException timeoutExecutor or timeoutCallables is null");
        } else {
            executorService.invokeAll(list);
            Logger.d("ConcurrentSubject", "notifyException out");
        }
    }

    @Override // com.byted.cast.common.async.Subject
    public void notifyObserver(final T t) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyObserver in, content:");
        LIZ.append(t);
        Logger.d("ConcurrentSubject", X1D.LIZIZ(LIZ));
        if (this.isDestroy) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (t != null) {
            ArrayList arrayList = new ArrayList();
            for (final Observer observer : this.observers) {
                try {
                    arrayList.add(this.executor.submit(new Callable() { // from class: X.ZZe
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ConcurrentSubject.lambda$notifyObserver$0(Observer.this, t);
                        }
                    }));
                } catch (RejectedExecutionException e) {
                    e.printStackTrace();
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("notifyObserver, observers.size:");
            LIZ2.append(this.observers.size());
            LIZ2.append(", futures:");
            LIZ2.append(arrayList.size());
            Logger.d("ConcurrentSubject", X1D.LIZIZ(LIZ2));
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).get();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (ExecutionException e3) {
                e3.printStackTrace();
            }
            Logger.d("ConcurrentSubject", "notifyObserver out");
        }
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.byted.cast.common.async.Subject
    public void removeObserver(Observer observer) {
        int indexOf;
        Logger.d("ConcurrentSubject", "removeObserver:");
        if (!this.isDestroy && (indexOf = this.observers.indexOf(observer)) >= 0) {
            ListProtector.remove(this.observers, indexOf);
        }
    }

    @Override // com.byted.cast.common.async.Subject
    public Subject setExecutor(ExecutorService executorService) {
        this.executor = executorService;
        return this;
    }

    public static /* synthetic */ Void lambda$notifyException$1(Observer observer, Exception exc) {
        observer.exception(exc);
        return null;
    }

    public static /* synthetic */ Void lambda$notifyObserver$0(Observer observer, Object obj) {
        observer.call(obj);
        return null;
    }

    @Override // com.byted.cast.common.async.Subject
    public Subject setTimeout(long j, TimeUnit timeUnit) {
        this.timeout = j;
        this.unit = timeUnit;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTimeout:");
        LIZ.append(timeUnit.toMillis(j));
        LIZ.append(" ms");
        Logger.d("ConcurrentSubject", X1D.LIZIZ(LIZ));
        TimerTask timerTask = this.timeoutTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        if (j != 0) {
            TimerTask timerTask2 = this.timeoutTask;
            if (timerTask2 != null) {
                timerTask2.cancel();
            }
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer.purge();
            }
            this.timer = new PthreadTimer("ConcurrentSubject");
            TimeoutTask timeoutTask = new TimeoutTask();
            this.timeoutTask = timeoutTask;
            this.timer.schedule(timeoutTask, timeUnit.toMillis(j));
        }
        return this;
    }
}
