package X;

import android.os.Handler;

/* renamed from: X.EvM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37976EvM implements InterfaceExecutorC37917EuP {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.LJLIL.post(runnable);
        }
    }
}
