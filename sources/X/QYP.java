package X;

import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final /* synthetic */ class QYP implements Executor {
    public static final /* synthetic */ QYP LJLIL = new QYP();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
