package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73479Ssd<T> extends AtomicReference<InterfaceC29937Boz> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -8583764624474935784L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        InterfaceC29937Boz andSet = getAndSet(null);
        if (andSet != null) {
            try {
                andSet.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
            this.LJLILLLLZI.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }

    public C73479Ssd(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC73463SsN;
        lazySet(interfaceC29937Boz);
    }
}
