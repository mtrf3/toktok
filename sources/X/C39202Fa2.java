package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.CommonThreadPoolParamsSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Fa2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39202Fa2 {
    public static final C39202Fa2 LIZ = new C39202Fa2();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static HandlerThread LIZJ;
    public static Handler LIZLLL;
    public static HandlerThread LJ;
    public static PThreadScheduledThreadPoolExecutor LJFF;

    public final synchronized void LIZLLL() {
        HandlerThread handlerThread = LJ;
        if (handlerThread != null && handlerThread.isAlive()) {
            try {
                HandlerThread handlerThread2 = LJ;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                HandlerThread handlerThread3 = LJ;
                if (handlerThread3 != null) {
                    handlerThread3.interrupt();
                }
                LJ = null;
            } catch (Exception unused) {
            }
        }
    }

    public static ScheduledExecutorService LIZJ() {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = LJFF;
        if (pThreadScheduledThreadPoolExecutor != null) {
            return pThreadScheduledThreadPoolExecutor;
        }
        CommonThreadPoolParamsSetting commonThreadPoolParamsSetting = CommonThreadPoolParamsSetting.INSTANCE;
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor2 = new PThreadScheduledThreadPoolExecutor(commonThreadPoolParamsSetting.corePoolSize(), new ThreadFactoryC39203Fa3(commonThreadPoolParamsSetting.threadPriority()), new ThreadPoolExecutor.DiscardPolicy());
        pThreadScheduledThreadPoolExecutor2.setKeepAliveTime(commonThreadPoolParamsSetting.keepAliveTime(), TimeUnit.SECONDS);
        pThreadScheduledThreadPoolExecutor2.allowCoreThreadTimeOut(false);
        pThreadScheduledThreadPoolExecutor2.setMaximumPoolSize(commonThreadPoolParamsSetting.maximumPoolSize());
        LJFF = pThreadScheduledThreadPoolExecutor2;
        return pThreadScheduledThreadPoolExecutor2;
    }

    public final Looper LIZ() {
        HandlerThread handlerThread = LJ;
        if (handlerThread == null) {
            synchronized (this) {
                handlerThread = new HandlerThread("Common_Handler_Thread_For_Log", CommonThreadPoolParamsSetting.INSTANCE.threadPriority());
                LJ = handlerThread;
                handlerThread.start();
            }
        }
        Looper looper = handlerThread.getLooper();
        o.LJIIIIZZ(looper, "getLogHandlerThread().looper");
        return looper;
    }

    public final Looper LIZIZ() {
        HandlerThread handlerThread = LIZJ;
        if (handlerThread == null) {
            synchronized (this) {
                handlerThread = new HandlerThread("Common_Handler_Thread");
                LIZJ = handlerThread;
                handlerThread.start();
            }
        }
        Looper looper = handlerThread.getLooper();
        o.LJIIIIZZ(looper, "getHandlerThread().looper");
        return looper;
    }
}
