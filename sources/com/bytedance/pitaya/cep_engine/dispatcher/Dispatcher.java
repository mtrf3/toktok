package com.bytedance.pitaya.cep_engine.dispatcher;

import X.FZ4;
import X.FZ5;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS14S0101000_10;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Dispatcher implements CepKeeper {
    public static final Dispatcher INSTANCE = new Dispatcher();
    public static final ConcurrentHashMap<String, FZ5> queueMap = new ConcurrentHashMap<>();
    public static final ThreadPoolExecutor threadPool = new PThreadPoolExecutor(4, 6, 3000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory("er/Dispatcher"));

    /* renamed from: dispatch$lambda-2$lambda-1, reason: not valid java name */
    public static final void m74dispatch$lambda2$lambda1(FZ5 q) {
        o.LJIIIZ(q, "$q");
        while (!q.LIZIZ.isEmpty()) {
            Runnable poll = q.LIZIZ.poll();
            if (poll != null) {
                poll.run();
            }
        }
        q.LIZ.set(false);
    }

    /* renamed from: dispatch$lambda-4, reason: not valid java name */
    public static final void m75dispatch$lambda4(FZ4 blockWrapper) {
        o.LJIIIZ(blockWrapper, "$blockWrapper");
        try {
            JniCaller.LIZ.callNoParamsCallback(blockWrapper.LIZ);
        } catch (Throwable unused) {
        }
        Semaphore semaphore = blockWrapper.LIZIZ;
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    private final FZ5 getQueue(String str) {
        ConcurrentHashMap<String, FZ5> concurrentHashMap = queueMap;
        if (!concurrentHashMap.containsKey(str)) {
            synchronized (concurrentHashMap) {
                if (!concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str, new FZ5());
                }
            }
        }
        return concurrentHashMap.get(str);
    }

    private final void dispatch(String str, Runnable runnable) {
        FZ5 queue = getQueue(str);
        if (queue == null) {
            return;
        }
        o.LJIIIZ(runnable, "runnable");
        queue.LIZIZ.put(runnable);
        if (!queue.LIZ.get()) {
            synchronized (queue) {
                if (!queue.LIZ.get()) {
                    queue.LIZ.set(true);
                    threadPool.execute(new ARunnableS11S0101000_7(1, queue, 15));
                }
            }
        }
    }

    public final void dispatchAsync(String key, long j) {
        o.LJIIIZ(key, "key");
        dispatch(key, new FZ4(j, null));
    }

    public final void dispatchSync(String key, long j) {
        o.LJIIIZ(key, "key");
        Semaphore semaphore = new Semaphore(0);
        dispatch(key, new FZ4(j, semaphore));
        semaphore.acquire();
    }

    private final void dispatch(String str, FZ4 fz4) {
        dispatch(str, new ARunnableS14S0101000_10(1, fz4, 2));
    }
}
