package X;

import java.util.Collection;

/* renamed from: X.SyP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73837SyP<T, K> extends AbstractC73836SyO<T, T> {
    public final Collection<? super K> LJLJJLL;
    public final InterfaceC48038ItG<? super T, K> LJLJL;

    @Override // X.AbstractC73836SyO, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJJLL.clear();
        super.clear();
    }

    @Override // X.AbstractC73836SyO, X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLJJLL.clear();
            this.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        T poll;
        Collection<? super K> collection;
        K apply;
        do {
            poll = this.LJLJI.poll();
            if (poll == null) {
                break;
            }
            collection = this.LJLJJLL;
            apply = this.LJLJL.apply(poll);
            C73320Sq4.LIZ(apply, "The keySelector returned a null key");
        } while (!collection.add(apply));
        return poll;
    }

    @Override // X.AbstractC73836SyO, X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJJI = true;
        this.LJLJJLL.clear();
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJJL == 0) {
            try {
                K apply = this.LJLJL.apply(t);
                C73320Sq4.LIZ(apply, "The keySelector returned a null key");
                if (this.LJLJJLL.add(apply)) {
                    this.LJLIL.onNext(t);
                    return;
                }
                return;
            } catch (Throwable th) {
                LIZ(th);
                return;
            }
        }
        this.LJLIL.onNext(null);
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73837SyP(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC48038ItG<? super T, K> interfaceC48038ItG, Collection<? super K> collection) {
        super(interfaceC116954iR);
        this.LJLJL = interfaceC48038ItG;
        this.LJLJJLL = collection;
    }
}
