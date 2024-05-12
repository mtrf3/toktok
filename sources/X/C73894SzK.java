package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SzK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73894SzK<T> extends AtomicBoolean implements InterfaceC92693kP {
    public static final long serialVersionUID = 3562861878281475070L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final C73893SzJ<T> LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.LJLILLLLZI.LJJZZI(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return get();
    }

    public C73894SzK(InterfaceC116954iR<? super T> interfaceC116954iR, C73893SzJ<T> c73893SzJ) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = c73893SzJ;
    }
}
