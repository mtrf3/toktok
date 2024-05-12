package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73583SuJ<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T> {
    public static final long serialVersionUID = 8663801314800248617L;
    public final InterfaceC73509St7<? super T> LJLIL;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public C73583SuJ(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL = interfaceC73509St7;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }
}
