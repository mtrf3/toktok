package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class E1U implements Executor {
    public static final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        LJLIL.post(runnable);
    }
}
