package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.StB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73513StB<T> extends AtomicInteger implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 4109457741734051389L;
    public final InterfaceC73509St7<? super T> LJLIL;
    public final InterfaceC29937Boz LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    public final void LIZ() {
        if (compareAndSet(0, 1)) {
            try {
                this.LJLILLLLZI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
        LIZ();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
        LIZ();
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
        LIZ();
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
        LIZ();
    }

    public C73513StB(InterfaceC73509St7<? super T> interfaceC73509St7, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC29937Boz;
    }
}
