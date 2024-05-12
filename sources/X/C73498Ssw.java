package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73498Ssw<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T> {
    public static final long serialVersionUID = 2071387740092105509L;
    public final InterfaceC73463SsN<? super T> LJLIL;

    public C73498Ssw(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLIL = interfaceC73463SsN;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }
}
