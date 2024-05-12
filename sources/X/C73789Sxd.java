package X;

/* renamed from: X.Sxd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73789Sxd<T> extends AbstractC73790Sxe<T, Throwable> {
    public static final long serialVersionUID = -2680129890138081029L;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLLI.cancel();
        this.LJLJLLL.onComplete();
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        setSubscription(EnumC73747Swx.INSTANCE);
        long j = this.LJLLILLLL;
        if (j != 0) {
            this.LJLLILLLL = 0L;
            produced(j);
        }
        this.LJLLI.request(1L);
        this.LJLL.onNext(th);
    }

    public C73789Sxd(C73843SyV c73843SyV, AbstractC73797Sxl abstractC73797Sxl, C73787Sxb c73787Sxb) {
        super(c73843SyV, abstractC73797Sxl, c73787Sxb);
    }
}
