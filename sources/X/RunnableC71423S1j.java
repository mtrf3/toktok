package X;

/* renamed from: X.S1j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71423S1j implements Runnable {
    public final /* synthetic */ C71419S1f LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public RunnableC71423S1j(C71419S1f c71419S1f, int i, int i2, int i3) {
        this.LJLIL = c71419S1f;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
    }

    public final void LIZ() {
        this.LJLIL.LJJJJZI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLIL.getPoiNameTv().getWidth(), this.LJLIL.getPoiSuffixTv().getWidth(), LC5.LIZIZ(this.LJLIL.getPoiTagDividerView()) + LC5.LIZIZ(this.LJLIL.getPoiTag2Tv()) + LC5.LIZIZ(this.LJLIL.getPoiTag1Tv()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
