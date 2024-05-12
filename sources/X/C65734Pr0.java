package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: X.Pr0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65734Pr0 extends QXX {
    public static <V> V LLLLZIL(Future<V> future) {
        C76917UGr.LJIILJJIL("Future was expected to be done: %s", future.isDone(), future);
        return (V) P8D.LIZ(future);
    }

    public static <V> void LLLLZ(C76L<V> c76l, InterfaceC65753PrJ<? super V> interfaceC65753PrJ, Executor executor) {
        c76l.LJFF(new RunnableC65751PrH(c76l, interfaceC65753PrJ), executor);
    }
}
