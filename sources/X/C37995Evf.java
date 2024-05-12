package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Evf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37995Evf {
    public static final C38020Ew4 LIZ;
    public static final C38020Ew4 LIZIZ;
    public static final ExecutorService LIZJ;
    public static final C38020Ew4 LIZLLL;

    static {
        C38020Ew4 c38020Ew4 = C38016Ew0.LIZJ;
        o.LJIIIIZZ(c38020Ew4, "getIOThreadPool()");
        LIZ = c38020Ew4;
        C38020Ew4 c38020Ew42 = C38016Ew0.LJFF;
        o.LJIIIIZZ(c38020Ew42, "getBackgroundThreadPool()");
        LIZIZ = c38020Ew42;
        ScheduledExecutorService scheduledExecutorService = C38016Ew0.LIZLLL;
        o.LJIIIIZZ(scheduledExecutorService, "getScheduledThreadPool()");
        LIZJ = scheduledExecutorService;
        LIZLLL = new C38020Ew4(C38016Ew0.LJI, C38016Ew0.LJII, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38240Ezc());
    }
}
