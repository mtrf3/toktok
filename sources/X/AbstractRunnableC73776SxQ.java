package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC73776SxQ<T> extends AtomicReference<T> implements InterfaceC73812Sy0<T>, InterfaceC73651SvP, Runnable {
    public static final long serialVersionUID = -3517602651313910099L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final AtomicLong LJLJJL = new AtomicLong();
    public final C73616Suq LJLJJLL = new C73616Suq();
    public InterfaceC73651SvP LJLJL;

    public abstract void LIZIZ();

    public final void LIZJ() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            if (this.LJLJJL.get() != 0) {
                this.LJLIL.onNext(andSet);
                V2B.LJIILJJIL(this.LJLJJL, 1L);
            } else {
                cancel();
                this.LJLIL.onError(new C73799Sxn("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        EnumC73418Sre.dispose(this.LJLJJLL);
        this.LJLJL.cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLJJLL);
        LIZIZ();
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        EnumC73418Sre.dispose(this.LJLJJLL);
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        lazySet(t);
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJL, interfaceC73651SvP)) {
            this.LJLJL = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            C73616Suq c73616Suq = this.LJLJJLL;
            AbstractC73946T0k abstractC73946T0k = this.LJLJJI;
            long j = this.LJLILLLLZI;
            c73616Suq.replace(abstractC73946T0k.LIZLLL(this, j, j, this.LJLJI));
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLJJL, j);
        }
    }

    public AbstractRunnableC73776SxQ(C73843SyV c73843SyV, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = c73843SyV;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
