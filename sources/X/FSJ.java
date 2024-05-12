package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FSJ extends XKW {
    public final ExecutorService LJLIL;

    public FSJ(ExecutorService executor) {
        o.LJIIIZ(executor, "executor");
        this.LJLIL = executor;
    }

    @Override // X.MB6, X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return super.plus(context);
    }

    @Override // X.XKW
    public final void dispatch(MBA context, Runnable block) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(block, "block");
        try {
            this.LJLIL.execute(block);
        } catch (RejectedExecutionException unused) {
        }
    }
}
