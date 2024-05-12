package X;

/* loaded from: classes11.dex */
public final class NXR implements VUP {
    public final /* synthetic */ VUG LIZ;

    @Override // X.VUP
    public final void LIZ(int i) {
    }

    @Override // X.VUP
    public final void LIZIZ() {
    }

    @Override // X.VUP
    public final void LIZJ() {
    }

    @Override // X.VUP
    public final void LIZLLL() {
    }

    public NXR(VUG vug) {
        this.LIZ = vug;
    }

    @Override // X.VUP
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        if (this.LIZ.getScrollY() <= 0) {
            z = true;
        } else {
            z = false;
        }
        C59501NWv.LLII = z;
    }
}
