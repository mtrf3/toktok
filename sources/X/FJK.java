package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes7.dex */
public final class FJK implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task ");
        LIZ.append(runnable.toString());
        LIZ.append(" rejected from ");
        LIZ.append(threadPoolExecutor.toString());
        LIZ.append(" Pending tasks: ");
        LIZ.append(queue);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }
}
