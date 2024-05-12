package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Srg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73420Srg<T> implements InterfaceC116954iR<T> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this.LJLILLLLZI, interfaceC92693kP);
    }

    public C73420Srg(InterfaceC116954iR<? super T> interfaceC116954iR, AtomicReference<InterfaceC92693kP> atomicReference) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = atomicReference;
    }
}
