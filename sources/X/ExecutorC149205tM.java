package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.5tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC149205tM implements Executor {
    public static final ExecutorC149205tM LJLILLLLZI = new ExecutorC149205tM();
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
