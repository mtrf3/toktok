package com.bytedance.pitaya.cep_engine.timer;

import Y.ARunnableS1S0001000_6;
import Y.ARunnableS8S0000100_6;
import Y.ARunnableS9S0201000_6;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Timer implements CepKeeper {
    public static volatile Handler handler;
    public static Thread timerThread;
    public static final Timer INSTANCE = new Timer();
    public static Object globalLock = new Object();
    public static final ConcurrentHashMap<String, Runnable> runnableMap = new ConcurrentHashMap<>();

    /* renamed from: timer$lambda-5$lambda-3 */
    public static final void m82timer$lambda5$lambda3() {
        synchronized (globalLock) {
            Looper.prepare();
            Looper myLooper = Looper.myLooper();
            o.LJI(myLooper);
            handler = new Handler(myLooper);
            globalLock.notifyAll();
        }
        if (handler != null) {
            Looper.loop();
        }
    }

    /* renamed from: timer$lambda-1 */
    public static final void m81timer$lambda1(long j) {
        try {
            JniCaller.LIZ.callNoParamsCallback(j);
        } catch (Throwable unused) {
        }
    }

    public final void cancelTimer(String token) {
        Handler handler2;
        o.LJIIIZ(token, "token");
        ConcurrentHashMap<String, Runnable> concurrentHashMap = runnableMap;
        Runnable runnable = concurrentHashMap.get(token);
        if (runnable != null && (handler2 = handler) != null) {
            handler2.removeCallbacks(runnable);
        }
        concurrentHashMap.remove(token);
    }

    /* renamed from: timer$lambda-6 */
    public static final void m83timer$lambda6(String token, Runnable r) {
        o.LJIIIZ(token, "$token");
        o.LJIIIZ(r, "$r");
        runnableMap.remove(token);
        r.run();
    }

    public final String timer(Runnable r, long j) {
        String obj;
        o.LJIIIZ(r, "r");
        if (handler == null) {
            synchronized (this) {
                if (handler == null) {
                    PthreadThread pthreadThread = new PthreadThread(null, new ARunnableS1S0001000_6(0, 24), "cep-timer_thread", 0L);
                    timerThread = pthreadThread;
                    pthreadThread.start();
                    synchronized (globalLock) {
                        while (handler == null) {
                            globalLock.wait();
                        }
                    }
                }
            }
        }
        try {
            obj = String.valueOf(Math.random() * Integer.MAX_VALUE);
        } catch (Throwable unused) {
            obj = r.toString();
        }
        ARunnableS9S0201000_6 aRunnableS9S0201000_6 = new ARunnableS9S0201000_6(obj, r, 0);
        runnableMap.put(obj, aRunnableS9S0201000_6);
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.postDelayed(aRunnableS9S0201000_6, j);
        }
        return obj;
    }

    public final String timer(long j, long j2) {
        return timer(new ARunnableS8S0000100_6(j, 9), j2);
    }
}
