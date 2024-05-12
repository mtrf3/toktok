package X;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class OAJ implements Executor {
    public static volatile OAJ LJLILLLLZI;
    public final Executor LJLIL = C16880lQ.LLLLZLLLI(new OAK());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(runnable);
    }
}
