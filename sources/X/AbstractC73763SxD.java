package X;

/* renamed from: X.SxD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73763SxD<T> extends AbstractC73754Sx4<T> {
    public static final long serialVersionUID = 4127754106204442833L;

    public abstract void LJ();

    public AbstractC73763SxD(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        super(interfaceC73740Swq);
    }

    @Override // X.AbstractC73754Sx4, X.InterfaceC215138cP
    public final void onNext(T t) {
        if (isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() != 0) {
            this.LJLIL.onNext(t);
            V2B.LJIILJJIL(this, 1L);
        } else {
            LJ();
        }
    }
}
