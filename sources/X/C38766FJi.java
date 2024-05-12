package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FJi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38766FJi {
    public static final PThreadPoolExecutor LIZ;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(max, (max * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new FOT(), new RejectedExecutionHandlerC38765FJh());
        LIZ = pThreadPoolExecutor;
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
