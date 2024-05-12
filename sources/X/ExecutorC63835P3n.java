package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.P3n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC63835P3n implements Executor {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        o.LJIIIZ(command, "command");
        this.LJLIL.post(command);
    }
}
