package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class E1S implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.post(runnable);
    }
}
