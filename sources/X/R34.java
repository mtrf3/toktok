package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class R34<T> extends AtomicBoolean implements InterfaceC92693kP {
    public static final long serialVersionUID = 3562861878281475070L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final R33<T> LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.LJLILLLLZI.LJJZ(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return get();
    }

    public R34(InterfaceC116954iR<? super T> interfaceC116954iR, R33<T> r33) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = r33;
    }
}
