package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public final class T0L<T> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = 466549804534799122L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final T0J<T> LJLILLLLZI;
    public Object LJLJI;
    public volatile boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLILLLLZI.LJJZZIII(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    public T0L(InterfaceC116954iR<? super T> interfaceC116954iR, T0J<T> t0j) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = t0j;
    }
}
