package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.2NG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NG implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.LJLIL.post(new ARunnableS37S0100000_1(runnable, 0));
        }
    }
}
