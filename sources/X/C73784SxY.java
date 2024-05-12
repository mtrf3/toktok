package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SxY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73784SxY<T> extends AtomicInteger implements InterfaceC73812Sy0<T> {
    public static final long serialVersionUID = -7098360935104053232L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final C73783SxX LJLILLLLZI;
    public final InterfaceC73650SvO<? extends T> LJLJI;
    public final InterfaceC73786Sxa<? super Integer, ? super Throwable> LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    public final void LIZIZ() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.LJLILLLLZI.isCancelled()) {
                long j = this.LJLJJLL;
                if (j != 0) {
                    this.LJLJJLL = 0L;
                    this.LJLILLLLZI.produced(j);
                }
                this.LJLJI.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        try {
            InterfaceC73786Sxa<? super Integer, ? super Throwable> interfaceC73786Sxa = this.LJLJJI;
            int i = this.LJLJJL + 1;
            this.LJLJJL = i;
            if (!interfaceC73786Sxa.test(Integer.valueOf(i), th)) {
                this.LJLIL.onError(th);
            } else {
                LIZIZ();
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        this.LJLJJLL++;
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        this.LJLILLLLZI.setSubscription(interfaceC73651SvP);
    }

    public C73784SxY(InterfaceC73740Swq interfaceC73740Swq, InterfaceC73786Sxa interfaceC73786Sxa, C73783SxX c73783SxX, AbstractC73745Swv abstractC73745Swv) {
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = c73783SxX;
        this.LJLJI = abstractC73745Swv;
        this.LJLJJI = interfaceC73786Sxa;
    }
}
