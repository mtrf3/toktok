package X;

/* loaded from: classes15.dex */
public final class W5K extends AbstractC32664Crs<Void> {
    public final /* synthetic */ InterfaceC31104CIq LIZ;
    public final /* synthetic */ W5J LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<Void> w4w) {
        HWC.LIZIZ(this.LIZIZ.LIZ);
        if (this.LIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailureImpl ex=");
        LIZ.append(w4w.LJFF());
        C79083V1z.LIZIZ(0, "FrescoImageLoaderImpl", "download", X1D.LIZIZ(LIZ));
        this.LIZ.onFailed(w4w.LJFF());
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<Void> w4w) {
        HWC.LIZIZ(this.LIZIZ.LIZ);
        if (this.LIZ == null || !w4w.LIZIZ()) {
            return;
        }
        W5J w5j = this.LIZIZ;
        w5j.LIZJ.mCache.LJIIIIZZ(w5j.LIZIZ, new W5L(this));
    }

    public W5K(W5J w5j, InterfaceC31104CIq interfaceC31104CIq) {
        this.LIZIZ = w5j;
        this.LIZ = interfaceC31104CIq;
    }
}
