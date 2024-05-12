package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0AO, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AO implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
