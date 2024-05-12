package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73515StD<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 5566860102500855068L;
    public final InterfaceC73509St7<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public T LJLJJL;
    public Throwable LJLJJLL;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        EnumC73418Sre.replace(this, this.LJLJJI.LIZJ(this, this.LJLILLLLZI, this.LJLJI));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Throwable th = this.LJLJJLL;
            if (th != null) {
                this.LJLIL.onError(th);
            } else {
                T t = this.LJLJJL;
                if (t != null) {
                    this.LJLIL.onSuccess(t);
                } else {
                    this.LJLIL.onComplete();
                }
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

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLJJLL = th;
        EnumC73418Sre.replace(this, this.LJLJJI.LIZJ(this, this.LJLILLLLZI, this.LJLJI));
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        this.LJLJJL = t;
        EnumC73418Sre.replace(this, this.LJLJJI.LIZJ(this, this.LJLILLLLZI, this.LJLJI));
    }

    public RunnableC73515StD(InterfaceC73509St7<? super T> interfaceC73509St7, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
