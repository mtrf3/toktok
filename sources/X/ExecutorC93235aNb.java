package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.aNb, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class ExecutorC93235aNb implements Executor {
    public static C93323aP1 LJLJI;
    public static final ExecutorC93235aNb LJLJL = new ExecutorC93235aNb();
    public static InterfaceExecutorC93236aNc LJLIL = new C93323aP1(2, "wq");
    public static final C93323aP1 LJLILLLLZI = new C93323aP1(3, "dq");
    public static final Object LJLJJI = new Object();
    public static final ConcurrentHashMap<String, Handler> LJLJJL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Thread> LJLJJLL = new ConcurrentHashMap<>();

    public static Handler LIZ(String str) {
        ConcurrentHashMap<String, Handler> concurrentHashMap;
        ConcurrentHashMap<String, Handler> concurrentHashMap2 = LJLJJL;
        if (concurrentHashMap2.get(str) != null) {
            return concurrentHashMap2.get(str);
        }
        ConcurrentHashMap<String, Thread> concurrentHashMap3 = LJLJJLL;
        synchronized (concurrentHashMap3) {
            if (concurrentHashMap3.get(str) == null) {
                concurrentHashMap3.put(str, LJLIL.LJIJJ(new RunnableC93234aNa(str), str));
                Thread thread = concurrentHashMap3.get(str);
                if (thread != null) {
                    thread.start();
                }
            }
        }
        synchronized (LJLJJI) {
            while (true) {
                concurrentHashMap = LJLJJL;
                if (concurrentHashMap.get(str) != null) {
                    break;
                }
                LJLJJI.wait();
            }
        }
        Handler handler = concurrentHashMap.get(str);
        if (handler != null) {
            return handler;
        }
        o.LJIIZILJ();
        throw null;
    }

    public static void LIZIZ(Runnable runnable) {
        Handler LIZ = LIZ("pty-ord-t");
        if (LIZ != null) {
            LIZ.post(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r) {
        o.LJIIJ(r, "r");
        LJLIL.execute(r);
    }
}
