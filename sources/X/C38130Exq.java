package X;

import android.os.Handler;

/* renamed from: X.Exq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38130Exq implements InterfaceExecutorC38087Ex9 {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceExecutorC38087Ex9
    public final void release() {
        this.LJLIL.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
