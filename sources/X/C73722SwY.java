package X;

import java.util.concurrent.Callable;

/* renamed from: X.SwY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73722SwY<T> extends AbstractC73745Swv<T> {
    public final Callable<? extends Throwable> LJLILLLLZI;

    public C73722SwY(CallableC73721SwX callableC73721SwX) {
        this.LJLILLLLZI = callableC73721SwX;
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        try {
            Throwable call = this.LJLILLLLZI.call();
            C73320Sq4.LIZ(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th) {
            th = th;
            V0N.LJJIL(th);
        }
        EnumC73747Swx.error(th, interfaceC73740Swq);
    }
}
