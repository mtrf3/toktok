package X;

import java.util.concurrent.Executor;

/* renamed from: X.O4o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ExecutorC61314O4o implements Executor {
    public static final ExecutorC61314O4o LJLIL = new ExecutorC61314O4o();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
