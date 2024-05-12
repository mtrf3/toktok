package X;

import java.util.concurrent.Executor;

/* renamed from: X.0wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC23760wW implements Executor {
    public final /* synthetic */ C35591aV LJLIL;

    public ExecutorC23760wW(C35591aV c35591aV) {
        this.LJLIL = c35591aV;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.LIZIZ.post(runnable);
    }
}
