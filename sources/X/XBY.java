package X;

/* loaded from: classes16.dex */
public final class XBY implements XB7 {
    public final /* synthetic */ XBG LIZ;
    public final /* synthetic */ C68322mC LIZIZ;

    @Override // X.XB7
    public final void onStart() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Exception] */
    @Override // X.XB7
    public final void LIZ(XB5 xb5) {
        ?? r1 = xb5.LJFF;
        if (r1 == 0) {
            this.LIZ.LJI.LIZ = Long.valueOf(xb5.LIZLLL);
            this.LIZ.LJ.LIZ = Long.valueOf(xb5.LIZ);
            this.LIZ.LJII.LIZ = Long.valueOf(xb5.LJ);
            return;
        }
        this.LIZIZ.element = r1;
    }

    public XBY(XBG xbg, C68322mC c68322mC) {
        this.LIZ = xbg;
        this.LIZIZ = c68322mC;
    }

    @Override // X.X63
    public final void onProgress(int i, long j) {
        XBG xbg = this.LIZ;
        xbg.LJI(xbg, i, j);
    }
}
