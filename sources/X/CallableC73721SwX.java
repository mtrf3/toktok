package X;

import java.util.concurrent.Callable;

/* renamed from: X.SwX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73721SwX<T, U> implements Callable<U>, InterfaceC48038ItG<T, U> {
    public final U LJLIL;

    @Override // java.util.concurrent.Callable
    public final U call() {
        return this.LJLIL;
    }

    public CallableC73721SwX(U u) {
        this.LJLIL = u;
    }

    @Override // X.InterfaceC48038ItG
    public final U apply(T t) {
        return this.LJLIL;
    }
}
