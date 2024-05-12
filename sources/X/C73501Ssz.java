package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73501Ssz<T> implements InterfaceC73463SsN<T> {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLILLLLZI, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }

    public C73501Ssz(InterfaceC73463SsN<? super T> interfaceC73463SsN, AtomicReference<InterfaceC92693kP> atomicReference) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = atomicReference;
    }
}
