package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.5i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC142245i8 implements Executor {
    public static final ExecutorC142245i8 LJLILLLLZI = new ExecutorC142245i8();
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }

    public final void LIZ(long j, Runnable runnable) {
        this.LJLIL.postDelayed(runnable, j);
    }
}
