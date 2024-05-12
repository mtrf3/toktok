package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73522StK<T> extends AtomicReference<C73521StJ<T>> implements InterfaceC92693kP {
    public static final long serialVersionUID = -7650903191002190468L;
    public final InterfaceC73463SsN<? super T> LJLIL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        C73521StJ<T> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.LJJIIZI(this);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public C73522StK(InterfaceC73463SsN<? super T> interfaceC73463SsN, C73521StJ<T> c73521StJ) {
        this.LJLIL = interfaceC73463SsN;
        lazySet(c73521StJ);
    }
}
