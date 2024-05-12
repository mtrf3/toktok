package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class ETF implements Executor {
    public final /* synthetic */ Handler LJLIL;

    public ETF(Handler handler) {
        this.LJLIL = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.LJLIL.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.LJLIL.post(runnable);
        }
    }
}
