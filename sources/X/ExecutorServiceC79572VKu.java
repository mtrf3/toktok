package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.VKu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ExecutorServiceC79572VKu extends C79570VKs implements ExecutorService {
    public ExecutorServiceC79572VKu(Executor executor) {
        super("SerialExecutor", executor, new LinkedBlockingQueue());
    }

    @Override // X.C79570VKs, java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
