package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73499Ssx<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = 37497744973048446L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();
    public final C73498Ssw<T> LJLJI;
    public InterfaceC73471SsV<? extends T> LJLJJI;
    public final long LJLJJL;
    public final TimeUnit LJLJJLL;

    public final void LIZ() {
        InterfaceC92693kP interfaceC92693kP = get();
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && compareAndSet(interfaceC92693kP, enumC73418Sre)) {
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            InterfaceC73471SsV<? extends T> interfaceC73471SsV = this.LJLJJI;
            if (interfaceC73471SsV == null) {
                this.LJLIL.onError(new TimeoutException(C73864Syq.LIZ(this.LJLJJL, this.LJLJJLL)));
            } else {
                this.LJLJJI = null;
                interfaceC73471SsV.LIZ(this.LJLJI);
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        EnumC73418Sre.dispose(this.LJLILLLLZI);
        C73498Ssw<T> c73498Ssw = this.LJLJI;
        if (c73498Ssw != null) {
            EnumC73418Sre.dispose(c73498Ssw);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        InterfaceC92693kP interfaceC92693kP = get();
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && compareAndSet(interfaceC92693kP, enumC73418Sre)) {
            EnumC73418Sre.dispose(this.LJLILLLLZI);
            this.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        InterfaceC92693kP interfaceC92693kP = get();
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && compareAndSet(interfaceC92693kP, enumC73418Sre)) {
            EnumC73418Sre.dispose(this.LJLILLLLZI);
            this.LJLIL.onSuccess(t);
        }
    }

    public RunnableC73499Ssx(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC73471SsV<? extends T> interfaceC73471SsV, long j, TimeUnit timeUnit) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLJJI = interfaceC73471SsV;
        this.LJLJJL = j;
        this.LJLJJLL = timeUnit;
        if (interfaceC73471SsV != null) {
            this.LJLJI = new C73498Ssw<>(interfaceC73463SsN);
        } else {
            this.LJLJI = null;
        }
    }
}
