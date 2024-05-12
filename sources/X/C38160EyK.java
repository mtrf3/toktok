package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.EyK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38160EyK {
    public static PThreadPoolExecutor LIZ;

    public static ExecutorService LIZ() {
        if (LIZ == null) {
            LIZ = new PThreadPoolExecutor(4, 8, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("MonitorExecutor"), new ThreadPoolExecutor.DiscardPolicy());
        }
        PThreadPoolExecutor pThreadPoolExecutor = LIZ;
        if (pThreadPoolExecutor != null) {
            return pThreadPoolExecutor;
        }
        o.LJIIZILJ();
        throw null;
    }

    public static void LIZIZ(Runnable runnable) {
        LIZ().execute(new EV5(runnable));
    }
}
