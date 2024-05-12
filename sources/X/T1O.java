package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1O implements Future<Object> {
    public final /* synthetic */ T1L LJLIL;
    public final /* synthetic */ RunnableC80373Dl LJLILLLLZI;

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        o.LJIIIZ(timeUnit, "timeUnit");
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.LJLIL.LJLILLLLZI.remove(this.LJLILLLLZI);
    }

    public T1O(T1L t1l, RunnableC80373Dl runnableC80373Dl) {
        this.LJLIL = t1l;
        this.LJLILLLLZI = runnableC80373Dl;
    }
}
