package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.2NR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NR implements Executor {
    public static final C2NR LJLILLLLZI = new C2NR();
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
