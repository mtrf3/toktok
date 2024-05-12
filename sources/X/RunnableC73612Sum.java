package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sum, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73612Sum<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final C73616Suq LJLILLLLZI = new C73616Suq();
    public final InterfaceC73471SsV<? extends T> LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ(this);
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
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

    public RunnableC73612Sum(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC73471SsV<? extends T> interfaceC73471SsV) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLJI = interfaceC73471SsV;
    }
}
