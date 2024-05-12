package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.YQi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ExecutorC87360YQi implements Executor {
    public final /* synthetic */ Handler LJLIL;

    public ExecutorC87360YQi(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.post(runnable);
        } else {
            C63922P6w.LIZIZ("TEImage2Mode", "executor run, handler is null");
        }
    }
}
