package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1NI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NI<R> implements C76L<R> {
    public final InterfaceC79150V4o LJLIL;
    public final C43731nd<R> LJLILLLLZI;

    @Override // X.C76L
    public final void LJFF(Runnable runnable, Executor executor) {
        this.LJLILLLLZI.LJFF(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.LJLILLLLZI.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.LJLILLLLZI.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.LJLILLLLZI.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LJLILLLLZI.isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LJLILLLLZI.LJLIL instanceof C22560ua;
    }

    public C1NI(C84673XKz c84673XKz) {
        C43731nd<R> c43731nd = new C43731nd<>();
        this.LJLIL = c84673XKz;
        this.LJLILLLLZI = c43731nd;
        c84673XKz.LJJIII(new IDqS416S0100000((C1NI) this, (C1NI<Object>) 174));
    }
}
