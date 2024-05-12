package X;

import java.util.concurrent.Executor;

/* renamed from: X.El6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC37340El6 implements Executor {
    public static final ExecutorC37340El6 LJLIL = new ExecutorC37340El6();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
