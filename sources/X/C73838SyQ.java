package X;

/* renamed from: X.SyQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73838SyQ<T, K> extends AbstractC73836SyO<T, T> {
    public final InterfaceC48038ItG<? super T, K> LJLJJLL;
    public final InterfaceC73786Sxa<? super K, ? super K> LJLJL;
    public K LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        while (true) {
            T poll = this.LJLJI.poll();
            if (poll == null) {
                return null;
            }
            K apply = this.LJLJJLL.apply(poll);
            if (!this.LJLJLLL) {
                this.LJLJLLL = true;
                this.LJLJLJ = apply;
                return poll;
            }
            if (!this.LJLJL.test(this.LJLJLJ, apply)) {
                this.LJLJLJ = apply;
                return poll;
            }
            this.LJLJLJ = apply;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJJL != 0) {
            this.LJLIL.onNext(t);
            return;
        }
        try {
            K apply = this.LJLJJLL.apply(t);
            if (this.LJLJLLL) {
                boolean test = this.LJLJL.test(this.LJLJLJ, apply);
                this.LJLJLJ = apply;
                if (test) {
                    return;
                }
            } else {
                this.LJLJLLL = true;
                this.LJLJLJ = apply;
            }
            this.LJLIL.onNext(t);
        } catch (Throwable th) {
            LIZ(th);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73838SyQ(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC48038ItG<? super T, K> interfaceC48038ItG, InterfaceC73786Sxa<? super K, ? super K> interfaceC73786Sxa) {
        super(interfaceC116954iR);
        this.LJLJJLL = interfaceC48038ItG;
        this.LJLJL = interfaceC73786Sxa;
    }
}
