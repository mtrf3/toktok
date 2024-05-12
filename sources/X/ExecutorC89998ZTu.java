package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.ZTu, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public class ExecutorC89998ZTu implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Handler(C16880lQ.LLJJJJ()).post(runnable);
    }
}
