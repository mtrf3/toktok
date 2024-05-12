package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public final class T0E<T> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = 2728361546769921047L;
    public final T0B<T> LJLIL;
    public final InterfaceC116954iR<? super T> LJLILLLLZI;
    public Object LJLJI;
    public volatile boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLIL.LIZ(this);
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    public T0E(T0B<T> t0b, InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = t0b;
        this.LJLILLLLZI = interfaceC116954iR;
    }
}
