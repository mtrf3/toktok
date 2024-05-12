package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import defpackage.a1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FX0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ExecutorService] */
    public static ExecutorService LIZ(int i, String str, ExecutorService executorService) {
        ?? r2 = executorService;
        if (i > 0) {
            r2 = new PThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl(a1.LJ("DownloadThreadPool-", str, "-fixed")));
            try {
                r2.allowCoreThreadTimeOut(true);
            } catch (Exception unused) {
            }
        }
        return r2;
    }
}
