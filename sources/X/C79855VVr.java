package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VVr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79855VVr {
    public static C80005Vab LIZ(int i, long j) {
        boolean z;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(i, i, j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("or/ThreadPool"));
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        pThreadPoolExecutor.allowCoreThreadTimeOut(z);
        return new C80005Vab(pThreadPoolExecutor);
    }
}
