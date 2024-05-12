package X;

import Y.IDRunnableS29S0200000;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0BJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BJ implements Executor {
    public final Executor LJLIL;
    public final ArrayDeque<Runnable> LJLILLLLZI = new ArrayDeque<>();
    public Runnable LJLJI;

    public final synchronized void LIZ() {
        Runnable poll = this.LJLILLLLZI.poll();
        this.LJLJI = poll;
        if (poll != null) {
            this.LJLIL.execute(poll);
        }
    }

    public C0BJ(Executor executor) {
        this.LJLIL = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.LJLILLLLZI.offer(new IDRunnableS29S0200000(runnable, this, 13));
        if (this.LJLJI == null) {
            LIZ();
        }
    }
}
