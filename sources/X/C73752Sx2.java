package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sx2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73752Sx2<T> extends AtomicInteger implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public static final long serialVersionUID = -4945028590049415624L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final C73568Su4 LJLILLLLZI = new C73568Su4();
    public final AtomicLong LJLJI = new AtomicLong();
    public final AtomicReference<InterfaceC73651SvP> LJLJJI = new AtomicReference<>();
    public final AtomicBoolean LJLJJL = new AtomicBoolean();
    public volatile boolean LJLJJLL;

    @Override // X.InterfaceC73740Swq
    public void onComplete() {
        this.LJLJJLL = true;
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        C73568Su4 c73568Su4 = this.LJLILLLLZI;
        if (getAndIncrement() == 0) {
            Throwable terminate = c73568Su4.terminate();
            if (terminate != null) {
                interfaceC73740Swq.onError(terminate);
            } else {
                interfaceC73740Swq.onComplete();
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public void cancel() {
        if (!this.LJLJJLL) {
            EnumC73755Sx5.cancel(this.LJLJJI);
        }
    }

    public C73752Sx2(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC73740Swq
    public void onError(Throwable th) {
        this.LJLJJLL = true;
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        C73568Su4 c73568Su4 = this.LJLILLLLZI;
        if (c73568Su4.addThrowable(th)) {
            if (getAndIncrement() == 0) {
                interfaceC73740Swq.onError(c73568Su4.terminate());
                return;
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC73740Swq
    public void onNext(T t) {
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        C73568Su4 c73568Su4 = this.LJLILLLLZI;
        if (get() == 0 && compareAndSet(0, 1)) {
            interfaceC73740Swq.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable terminate = c73568Su4.terminate();
                if (terminate != null) {
                    interfaceC73740Swq.onError(terminate);
                } else {
                    interfaceC73740Swq.onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (this.LJLJJL.compareAndSet(false, true)) {
            this.LJLIL.onSubscribe(this);
            EnumC73755Sx5.deferredSetOnce(this.LJLJJI, this.LJLJI, interfaceC73651SvP);
        } else {
            interfaceC73651SvP.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(C61845OOz.LIZ("§3.9 violated: positive request amount required but it was ", j)));
        } else {
            EnumC73755Sx5.deferredRequest(this.LJLJJI, this.LJLJI, j);
        }
    }
}
