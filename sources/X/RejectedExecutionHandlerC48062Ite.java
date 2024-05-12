package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.Ite, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RejectedExecutionHandlerC48062Ite implements RejectedExecutionHandler {
    public final /* synthetic */ BlockingQueue LIZ;

    public RejectedExecutionHandlerC48062Ite(BlockingQueue blockingQueue) {
        this.LIZ = blockingQueue;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            this.LIZ.offer(runnable);
            C48841JEv.LJIILIIL("TAG_PROXY_TT", "task rejected in preloader, put first!!!", null);
        } catch (Throwable unused) {
        }
    }
}
