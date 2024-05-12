package X;

import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.Choreographer;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FGN {
    public static Handler LIZIZ;
    public static Handler LIZJ;
    public static HandlerThread LIZLLL;
    public static Choreographer LJ;
    public static boolean LJI;
    public static final FGN LIZ = new FGN();
    public static final java.util.Map<String, Runnable> LJFF = Collections.synchronizedMap(new LinkedHashMap());

    public final void LIZJ() {
        if (!LJI) {
            synchronized (this) {
                if (LJI) {
                    return;
                }
                LIZJ = new Handler(C16880lQ.LLJJJJ());
                HandlerThread handlerThread = new HandlerThread("FakeMainThread");
                LIZLLL = handlerThread;
                handlerThread.start();
                HandlerThread handlerThread2 = LIZLLL;
                if (handlerThread2 != null) {
                    Handler handler = new Handler(handlerThread2.getLooper());
                    LIZIZ = handler;
                    handler.postAtFrontOfQueue(FGO.LJLIL);
                    HandlerThread handlerThread3 = LIZLLL;
                    if (handlerThread3 != null) {
                        Process.setThreadPriority(handlerThread3.getThreadId(), -20);
                        LJI = true;
                        return;
                    } else {
                        o.LJIJI("sHandlerThread");
                        throw null;
                    }
                }
                o.LJIJI("sHandlerThread");
                throw null;
            }
        }
    }

    public static void LIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        java.util.Map<String, Runnable> map = LJFF;
        Runnable runnable = map.get(tag);
        if (runnable != null) {
            synchronized (runnable) {
                if (map.get(tag) == null) {
                    return;
                }
                runnable.run();
                map.remove(tag);
                LIZ.LIZJ();
                Handler handler = LIZIZ;
                if (handler != null) {
                    handler.removeCallbacks(runnable);
                } else {
                    o.LJIJI("fakeMainHandler");
                    throw null;
                }
            }
        }
    }

    public final void LIZIZ(Runnable runnable, String tag, boolean z) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(runnable, "runnable");
        if (z) {
            java.util.Map<String, Runnable> map = LJFF;
            if (map.get(tag) == null) {
                map.put(tag, runnable);
                LIZJ();
                Handler handler = LIZIZ;
                if (handler != null) {
                    handler.post(new ARunnableS7S1100000_6(runnable, tag, 7));
                    return;
                } else {
                    o.LJIJI("fakeMainHandler");
                    throw null;
                }
            }
            throw new RuntimeException("The tag already exists, please do not execute runnable repeatedly");
        }
        runnable.run();
    }
}
