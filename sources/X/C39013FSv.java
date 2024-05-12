package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FSv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39013FSv {
    public static final ExecutorService LIZ;

    static {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39012FSu("GAC_Executor"));
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        LIZ = Executors.unconfigurableExecutorService(pThreadPoolExecutor);
    }
}
