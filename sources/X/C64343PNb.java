package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PNb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64343PNb {
    public static final PThreadPoolExecutor LIZ;
    public static final AtomicBoolean LIZIZ;

    static {
        int max = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        ThreadFactoryC64342PNa threadFactoryC64342PNa = new ThreadFactoryC64342PNa();
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(max, (max * 2) + 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), threadFactoryC64342PNa);
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        LIZ = pThreadPoolExecutor;
        LIZIZ = new AtomicBoolean();
    }
}
