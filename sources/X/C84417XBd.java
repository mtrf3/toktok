package X;

/* renamed from: X.XBd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84417XBd implements XB7 {
    public final /* synthetic */ XBH LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C84432XBs LIZJ;

    @Override // X.XB7
    public final void onStart() {
    }

    @Override // X.XB7
    public final void LIZ(XB5 xb5) {
        Exception exc = xb5.LJFF;
        if (exc == null) {
            this.LIZJ.getClass();
            this.LIZJ.getClass();
            this.LIZJ.getClass();
        } else {
            this.LIZJ.LIZ = new C84418XBe(exc);
        }
    }

    @Override // X.X63
    public final void onProgress(int i, long j) {
        if (this.LIZIZ) {
            XBW<C84430XBq> xbw = this.LIZ.LJIIJJI;
            xbw.LJI(xbw, i, j);
        }
    }

    public C84417XBd(XBH xbh, boolean z, C84432XBs c84432XBs) {
        this.LIZ = xbh;
        this.LIZIZ = z;
        this.LIZJ = c84432XBs;
    }
}
