package X;

import java.util.concurrent.Callable;

/* renamed from: X.SsZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73475SsZ<T> extends AbstractC73638SvC<T> {
    public final Callable<? extends Throwable> LJLIL;

    public C73475SsZ(CallableC73721SwX callableC73721SwX) {
        this.LJLIL = callableC73721SwX;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        try {
            Throwable call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th) {
            th = th;
            V0N.LJJIL(th);
        }
        EnumC73538Sta.error(th, interfaceC73463SsN);
    }
}
