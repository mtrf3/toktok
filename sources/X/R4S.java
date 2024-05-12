package X;

/* loaded from: classes12.dex */
public final class R4S extends AbstractC68940R3w {
    public final /* synthetic */ C38048EwW LIZ;
    public final /* synthetic */ R4T LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        this.LIZIZ.LIZ(this.LIZ, 0);
    }

    public R4S(R4T r4t, C38048EwW c38048EwW) {
        this.LIZIZ = r4t;
        this.LIZ = c38048EwW;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        R4T r4t = this.LIZIZ;
        if (r4t.LJLILLLLZI != null && !r4t.LJLJJI) {
            C5S1 c5s1 = new C5S1(this.LIZIZ.LJLILLLLZI.get());
            c5s1.LIZLLL(R4R.LIZIZ(qqi));
            c5s1.LJ();
        }
        this.LIZIZ.LIZ(this.LIZ, i);
    }
}
