package X;

import Y.ARunnableS25S0200000_6;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.FPp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC38929FPp implements Executor {
    public static final C5H3<ExecutorService> LJLJI = C221108m2.LIZ(EnumC221088m0.NONE, C38915FPb.INSTANCE);
    public final LinkedBlockingQueue<Runnable> LJLIL = new LinkedBlockingQueue<>();
    public Runnable LJLILLLLZI;

    public final synchronized void LIZ() {
        Runnable poll = this.LJLIL.poll();
        if (poll != null) {
            LJLJI.getValue().execute(poll);
        } else {
            poll = null;
        }
        this.LJLILLLLZI = poll;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable r) {
        o.LJIIIZ(r, "r");
        this.LJLIL.offer(new ARunnableS25S0200000_6(this, r, 47));
        if (this.LJLILLLLZI == null) {
            LIZ();
        }
    }
}
