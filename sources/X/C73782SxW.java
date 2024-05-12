package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SxW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73782SxW<T> extends AtomicInteger implements InterfaceC73812Sy0<T> {
    public static final long serialVersionUID = -7098360935104053232L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final C73783SxX LJLILLLLZI;
    public final InterfaceC73650SvO<? extends T> LJLJI;
    public final InterfaceC73592SuS<? super Throwable> LJLJJI;
    public long LJLJJL;
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
        long j = this.LJLJJL;
        if (j != Long.MAX_VALUE) {
            this.LJLJJL = j - 1;
        }
        if (j == 0) {
            this.LJLIL.onError(th);
            return;
        }
        try {
            if (this.LJLJJI.test(th)) {
                LIZIZ();
            } else {
                this.LJLIL.onError(th);
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

    public C73782SxW(InterfaceC73740Swq interfaceC73740Swq, long j, InterfaceC73592SuS interfaceC73592SuS, C73783SxX c73783SxX, AbstractC73745Swv abstractC73745Swv) {
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = c73783SxX;
        this.LJLJI = abstractC73745Swv;
        this.LJLJJI = interfaceC73592SuS;
        this.LJLJJL = j;
    }
}
