package X;

/* renamed from: X.SxE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73764SxE<T> extends AbstractC73754Sx4<T> {
    public static final long serialVersionUID = 3776720187248809713L;

    public C73764SxE(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        super(interfaceC73740Swq);
    }

    @Override // X.AbstractC73754Sx4, X.InterfaceC215138cP
    public final void onNext(T t) {
        long j;
        if (isCancelled()) {
            return;
        }
        if (t != null) {
            this.LJLIL.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
            return;
        }
        onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
    }
}
