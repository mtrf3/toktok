package X;

/* renamed from: X.Zku, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90836Zku extends AbstractC90102ZXu {
    public final /* synthetic */ C90506Zfa LIZ;

    @Override // X.AbstractC90102ZXu
    public final void LJFF() {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRoutePresentationDisplayChanged");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIJ() {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteUnselected");
        this.LIZ.LJI();
    }

    public C90836Zku(C90506Zfa c90506Zfa) {
        this.LIZ = c90506Zfa;
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZ(ZY5 zy5) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onProviderRemoved");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZIZ(ZY5 zy5) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onProviderChanged");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZJ(ZY5 zy5) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onProviderRemoved");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJII(ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteSelected");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIL(ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteVolumeChanged");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZLLL(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteAdded");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJ(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteChanged");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJI(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteRemoved");
        this.LIZ.LJI();
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIIIZZ(ZY5 zy5, ZY4 zy4) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteSelected");
        this.LIZ.LJI();
        LJII(zy4);
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIIZ(ZY5 zy5, ZY4 zy4, int i) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteSelected");
        this.LIZ.LJI();
        LJIIIIZZ(zy5, zy4);
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIJJI(ZY5 zy5, ZY4 zy4, int i) {
        this.LIZ.LJIJJLI.i("ChromeCastSourceImpl", "onRouteUnselected");
        this.LIZ.LJI();
        LJIIJ();
    }
}
