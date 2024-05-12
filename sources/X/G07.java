package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G07 extends AbstractC73391SrD<E5L> {
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ G06 LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLJI.LIZLLL();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        C34K c34k = this.LJLILLLLZI;
        if (c34k.element) {
            this.LJLJI.LJ = 2;
            return;
        }
        c34k.element = true;
        G06 g06 = this.LJLJI;
        g06.LJ = 1;
        g06.LIZLLL();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object t) {
        o.LJIIIZ(t, "t");
        C34K c34k = this.LJLILLLLZI;
        if (c34k.element) {
            this.LJLJI.LJ = 2;
        } else {
            c34k.element = true;
            this.LJLJI.LIZLLL();
        }
    }

    public G07(C34K c34k, G06 g06) {
        this.LJLILLLLZI = c34k;
        this.LJLJI = g06;
    }
}
