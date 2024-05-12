package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FT3<V> extends FutureTask<V> implements Comparable<Object> {
    public final Comparable<?> LJLIL;

    @Override // java.lang.Comparable
    public final int compareTo(Object other) {
        o.LJIIIZ(other, "other");
        if (other instanceof FT3) {
            other = ((FT3) other).LJLIL;
        }
        Comparable<?> comparable = this.LJLIL;
        if (comparable != null && other != null) {
            return comparable.compareTo(other);
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FT3(Callable<V> callable, Comparable<?> comparable) {
        super(callable);
        o.LJIIIZ(callable, "callable");
        this.LJLIL = comparable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FT3(Runnable runnable, V v, Comparable<?> comparable) {
        super(runnable, v);
        o.LJIIIZ(runnable, "runnable");
        this.LJLIL = comparable;
    }
}
