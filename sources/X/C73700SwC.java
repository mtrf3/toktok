package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SwC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73700SwC<T> extends AtomicReference<Object> implements InterfaceC92693kP {
    public static final long serialVersionUID = -1100270633763673112L;
    public final InterfaceC116954iR<? super T> LJLIL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet != null && andSet != this) {
            ((C73698SwA) andSet).LIZ(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == this) {
            return true;
        }
        return false;
    }

    public C73700SwC(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }
}
