package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1IW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IW implements InterfaceExecutorC06770Oj {
    public final C0T6 LJLIL;

    public C1IW() {
        C30931Jh value = C0T8.LIZIZ;
        o.LJIIJ(value, "$this$value");
        this.LJLIL = ((C0T7) ((C5H3) ((AtomicReference) value.LJLIL).get()).getValue()).LIZ();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        this.LJLIL.LIZ(new IDqS420S0100000(runnable, 66), 0L);
    }
}
