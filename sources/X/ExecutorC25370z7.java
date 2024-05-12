package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC25370z7 implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
