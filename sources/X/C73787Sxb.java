package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sxb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73787Sxb<T, U> extends AtomicInteger implements InterfaceC73812Sy0<Object>, InterfaceC73651SvP {
    public static final long serialVersionUID = 2827772011130406689L;
    public final InterfaceC73650SvO<T> LJLIL;
    public final AtomicReference<InterfaceC73651SvP> LJLILLLLZI = new AtomicReference<>();
    public final AtomicLong LJLJI = new AtomicLong();
    public C73789Sxd LJLJJI;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        EnumC73755Sx5.cancel(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLJJI.cancel();
        this.LJLJJI.LJLJLLL.onComplete();
    }

    public C73787Sxb(AbstractC73745Swv abstractC73745Swv) {
        this.LJLIL = abstractC73745Swv;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        this.LJLJJI.cancel();
        this.LJLJJI.LJLJLLL.onError(th);
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(Object obj) {
        if (getAndIncrement() != 0) {
            return;
        }
        while (this.LJLILLLLZI.get() != EnumC73755Sx5.CANCELLED) {
            this.LJLIL.subscribe(this.LJLJJI);
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        EnumC73755Sx5.deferredSetOnce(this.LJLILLLLZI, this.LJLJI, interfaceC73651SvP);
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        EnumC73755Sx5.deferredRequest(this.LJLILLLLZI, this.LJLJI, j);
    }
}
