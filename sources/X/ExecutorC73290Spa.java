package X;

import Y.ARunnableS31S0200000_12;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Spa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ExecutorC73290Spa implements Executor {
    public final LinkedBlockingQueue<Runnable> LJLIL = new LinkedBlockingQueue<>();
    public Runnable LJLILLLLZI;
    public static final C73274SpK LJLJJL = new C73274SpK();
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C73272SpI.LJLIL);
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C73291Spb.INSTANCE);

    public final synchronized void LIZ() {
        Runnable poll = this.LJLIL.poll();
        if (poll != null) {
            LJLJJL.getClass();
            ((Executor) LJLJI.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.LJLILLLLZI = poll;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable r) {
        o.LJIIJ(r, "r");
        this.LJLIL.offer(new ARunnableS31S0200000_12(r, this, 23));
        if (this.LJLILLLLZI == null) {
            LIZ();
        }
    }
}
