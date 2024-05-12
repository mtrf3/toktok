package X;

import android.os.AsyncTask;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class HRJ {
    public static final ExecutorService LIZ;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (executor != null) {
            LIZ = (ExecutorService) executor;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
    }

    public static final void LIZ(Runnable runnable) {
        new Handler(C16880lQ.LLJJJJ()).post(runnable);
    }
}
