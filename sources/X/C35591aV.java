package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.1aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35591aV implements InterfaceC23750wV {
    public final ExecutorC20520rI LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public final ExecutorC23760wW LIZJ = new ExecutorC23760wW(this);

    public C35591aV(Executor executor) {
        this.LIZ = new ExecutorC20520rI(executor);
    }

    public final void LIZ(Runnable runnable) {
        this.LIZ.execute(runnable);
    }
}
