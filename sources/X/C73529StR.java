package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73529StR<R> implements InterfaceC73509St7<R> {
    public final AtomicReference<InterfaceC92693kP> LJLIL;
    public final InterfaceC73509St7<? super R> LJLILLLLZI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLILLLLZI.onComplete();
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLILLLLZI.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this.LJLIL, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(R r) {
        this.LJLILLLLZI.onSuccess(r);
    }

    public C73529StR(AtomicReference<InterfaceC92693kP> atomicReference, InterfaceC73509St7<? super R> interfaceC73509St7) {
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = interfaceC73509St7;
    }
}
