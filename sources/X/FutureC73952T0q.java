package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T0q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class FutureC73952T0q implements Future<Object> {
    public final InterfaceC92693kP LJLIL;

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
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

    public FutureC73952T0q(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL = interfaceC92693kP;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.LJLIL.dispose();
        return false;
    }
}
