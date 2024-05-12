package X;

/* loaded from: classes12.dex */
public final class R4P extends R4M {
    public final /* synthetic */ C38048EwW LIZ;
    public final /* synthetic */ R4Q LIZIZ;

    @Override // X.R4M
    /* renamed from: LIZIZ */
    public final void onSuccess(R40<R7E> r40) {
        super.onSuccess(r40);
        this.LIZIZ.LIZ(this.LIZ, true);
    }

    public R4P(R4Q r4q, C38048EwW c38048EwW) {
        this.LIZIZ = r4q;
        this.LIZ = c38048EwW;
    }

    @Override // X.R4M
    /* renamed from: LIZ */
    public final void onError(R40<R7E> r40, int i) {
        super.onError(r40, i);
        if (this.LIZIZ.LJLILLLLZI != null) {
            C5S1 c5s1 = new C5S1(this.LIZIZ.LJLILLLLZI.get());
            c5s1.LIZLLL(R4R.LIZIZ(r40));
            c5s1.LJ();
        }
        this.LIZIZ.LIZ(this.LIZ, false);
    }

    @Override // X.AbstractC67055QTj
    public final /* bridge */ /* synthetic */ void onNeedCaptcha(QQI qqi, String str) {
    }
}
