package X;

import Y.ARunnableS25S0200000_6;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class FSO implements Executor {
    public final ArrayDeque<Runnable> LJLIL = new ArrayDeque<>();
    public Runnable LJLILLLLZI;

    public final synchronized void LIZ() {
        Runnable poll = this.LJLIL.poll();
        this.LJLILLLLZI = poll;
        if (poll != null) {
            FSM.LJ.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.LJLIL.offer(new ARunnableS25S0200000_6(this, runnable, 73));
        if (this.LJLILLLLZI == null) {
            LIZ();
        }
    }
}
