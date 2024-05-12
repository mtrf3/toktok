package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.YQl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ExecutorC87363YQl implements Executor {
    public final /* synthetic */ Handler LJLIL;

    public ExecutorC87363YQl(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
