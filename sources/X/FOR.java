package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FOR {
    public static Handler LIZ;
    public static HandlerThread LIZIZ;
    public static PThreadPoolExecutor LJ;
    public static final FOR LJFF = new FOR();
    public static final C37186Eic LIZJ = new C37186Eic();
    public static final ConcurrentHashMap<String, C37186Eic> LIZLLL = new ConcurrentHashMap<>();

    public final synchronized Executor LIZIZ() {
        PThreadPoolExecutor pThreadPoolExecutor;
        if (LJ == null) {
            FOS fos = new FOS();
            C16990lb c16990lb = C16970lZ.LIZ;
            o.LJFF(c16990lb, "AsyncInflater.config");
            int i = c16990lb.LIZ;
            C16990lb c16990lb2 = C16970lZ.LIZ;
            o.LJFF(c16990lb2, "AsyncInflater.config");
            LJ = new PThreadPoolExecutor(i, c16990lb2.LIZ, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(10000), fos, new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        pThreadPoolExecutor = LJ;
        if (pThreadPoolExecutor == null) {
            o.LJIIZILJ();
            throw null;
        }
        return pThreadPoolExecutor;
    }

    public final Handler LIZ() {
        boolean z;
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C56662Kg.LIZ().LIZJ("method_nita_executor_inflate_handler_duration", false);
        }
        if (LIZ == null) {
            synchronized (this) {
                if (LIZ == null) {
                    HandlerThread handlerThread = new HandlerThread("NitaMainThread");
                    LIZIZ = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = LIZIZ;
                    if (handlerThread2 != null) {
                        Handler handler = new Handler(handlerThread2.getLooper());
                        LIZ = handler;
                        handler.postAtFrontOfQueue(FGP.LJLIL);
                        C16990lb c16990lb = C16970lZ.LIZ;
                        o.LJFF(c16990lb, "AsyncInflater.config");
                        if (c16990lb.LJFF) {
                            HandlerThread handlerThread3 = LIZIZ;
                            if (handlerThread3 != null) {
                                Process.setThreadPriority(handlerThread3.getThreadId(), -20);
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        LIZLLL.put("NitaMainThread", LIZJ);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            }
        }
        Handler handler2 = LIZ;
        if (handler2 != null) {
            if (z) {
                C56662Kg.LIZ().LJFF("method_nita_executor_inflate_handler_duration", false);
            }
            return handler2;
        }
        o.LJIIZILJ();
        throw null;
    }
}
