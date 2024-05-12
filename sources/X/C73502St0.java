package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.St0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73502St0<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 4603919676453758899L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final InterfaceC73471SsV<? extends T> LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        InterfaceC92693kP interfaceC92693kP = get();
        if (interfaceC92693kP != EnumC73418Sre.DISPOSED && compareAndSet(interfaceC92693kP, null)) {
            this.LJLILLLLZI.LIZ(new C73501Ssz(this.LJLIL, this));
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }

    public C73502St0(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC73471SsV<? extends T> interfaceC73471SsV) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC73471SsV;
    }
}
