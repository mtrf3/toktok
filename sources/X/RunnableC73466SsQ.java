package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SsQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73466SsQ<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 3528003840217436037L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;
    public T LJLJI;
    public Throwable LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Throwable th = this.LJLJJI;
            if (th != null) {
                this.LJLIL.onError(th);
            } else {
                this.LJLIL.onSuccess(this.LJLJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLJJI = th;
        EnumC73418Sre.replace(this, this.LJLILLLLZI.LIZIZ(this));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLJI = t;
        EnumC73418Sre.replace(this, this.LJLILLLLZI.LIZIZ(this));
    }

    public RunnableC73466SsQ(InterfaceC73463SsN<? super T> interfaceC73463SsN, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
