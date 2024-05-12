package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SsI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73458SsI<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 4943102778943297569L;
    public final InterfaceC73459SsJ<? super T, ? super Throwable> LJLIL;

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73458SsI(InterfaceC73459SsJ<? super T, ? super Throwable> interfaceC73459SsJ) {
        this.LJLIL = interfaceC73459SsJ;
    }

    @Override // X.InterfaceC73463SsN
    public void onError(Throwable th) {
        try {
            lazySet(EnumC73418Sre.DISPOSED);
            this.LJLIL.accept(null, th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            C73548Stk.LIZIZ(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC73463SsN
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public void onSuccess(T t) {
        try {
            lazySet(EnumC73418Sre.DISPOSED);
            this.LJLIL.accept(t, null);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
    }
}
