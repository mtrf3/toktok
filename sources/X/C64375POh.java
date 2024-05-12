package X;

import Y.ARunnableS15S0100100_11;
import android.os.Handler;
import android.os.HandlerThread;
import com.ss.android.ugc.aweme.trace.TraceLogConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.POh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64375POh {
    public static volatile HandlerThread LIZLLL;
    public static volatile E5O LJ;
    public static InterfaceC64383POp LJFF;
    public static boolean LJI;
    public static final C64375POh LIZ = new C64375POh();
    public static final ConcurrentHashMap<String, POJ> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, POK> LIZJ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C64378POk.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public static TraceLogConfig LIZIZ() {
        E5O e5o = LJ;
        if (e5o != null) {
            if (e5o.LIZ) {
                Boolean bool = Boolean.TRUE;
                return new TraceLogConfig(bool, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, e5o.LIZJ, e5o.LIZLLL, 0 == true ? 1 : 0, bool, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1047166, 0 == true ? 1 : 0);
            }
            if (e5o.LIZIZ) {
                C64377POj.LIZ.getClass();
                TraceLogConfig LIZ2 = C64377POj.LIZ();
                o.LJIIIIZZ(LIZ2, "TraceLogConfigSettings.traceLogConfig");
                return LIZ2;
            }
        }
        C64377POj.LIZ.getClass();
        return C64377POj.LIZIZ;
    }

    public static boolean LIZLLL() {
        E5O e5o = LJ;
        if ((e5o == null || !e5o.LIZ) && !o.LJ(LIZIZ().logForceTraceEnable, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final void LIZ() {
        if (LIZLLL == null) {
            synchronized (this) {
                if (LIZLLL == null) {
                    LIZLLL = new HandlerThread("trace-log-task");
                    HandlerThread handlerThread = LIZLLL;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                }
            }
        }
    }

    public static void LJ() {
        long j;
        Long l = LIZIZ().logResetCheckPointTs;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 60000;
        }
        LJFF(j, C64381POn.LJLIL);
    }

    public static POK LIZJ(String spanIdKey) {
        o.LJIIIZ(spanIdKey, "spanIdKey");
        return LIZJ.get(spanIdKey);
    }

    public static void LJI(InterfaceC88472Yns task) {
        o.LJIIIZ(task, "task");
        LJFF(0L, task);
    }

    public static void LJFF(long j, InterfaceC88472Yns task) {
        o.LJIIIZ(task, "task");
        long currentTimeMillis = System.currentTimeMillis();
        Handler handler = (Handler) LJII.getValue();
        if (handler != null) {
            ARunnableS15S0100100_11 aRunnableS15S0100100_11 = new ARunnableS15S0100100_11(currentTimeMillis, task, 1);
            if (j < 0) {
                j = 0;
            }
            handler.postDelayed(aRunnableS15S0100100_11, j);
        }
    }
}
