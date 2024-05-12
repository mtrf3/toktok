package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T1u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73982T1u<T> implements InterfaceC64592gB<Throwable> {
    public static final C73982T1u LJLIL = new C73982T1u();

    @Override // X.InterfaceC64592gB
    public final void accept(Throwable th) {
        Throwable th2 = th;
        if (C82891Wg3.LIZIZ()) {
            Thread currentThread = C16880lQ.LLLLIIIILLL();
            o.LJIIIIZZ(currentThread, "currentThread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            return;
        }
        C73548Stk.LIZIZ(th2);
    }
}
