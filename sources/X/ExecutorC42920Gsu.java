package X;

import java.util.concurrent.Executor;

/* renamed from: X.Gsu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ExecutorC42920Gsu implements Executor {
    public static final ExecutorC42920Gsu LJLIL = new ExecutorC42920Gsu();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
