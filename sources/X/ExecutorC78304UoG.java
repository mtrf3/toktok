package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.UoG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class ExecutorC78304UoG implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
