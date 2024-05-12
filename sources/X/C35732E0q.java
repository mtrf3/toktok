package X;

/* renamed from: X.E0q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35732E0q extends AbstractC73391SrD<Long> {
    public final /* synthetic */ IDR LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        IDR idr = this.LJLILLLLZI;
        if (idr != null) {
            idr.startLineProgressBarAnimation();
        }
        if (((Boolean) C86801Y4v.LIZ.getValue()).booleanValue()) {
            C35810E3q.LJI(5000L);
        }
    }

    public C35732E0q(IDR idr) {
        this.LJLILLLLZI = idr;
    }

    @Override // X.InterfaceC116954iR
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
