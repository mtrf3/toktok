package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73492Ssq<R> implements InterfaceC73463SsN<R> {
    public final AtomicReference<InterfaceC92693kP> LJLIL;
    public final InterfaceC73463SsN<? super R> LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLILLLLZI.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this.LJLIL, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(R r) {
        this.LJLILLLLZI.onSuccess(r);
    }

    public C73492Ssq(InterfaceC73463SsN interfaceC73463SsN, AtomicReference atomicReference) {
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = interfaceC73463SsN;
    }
}
