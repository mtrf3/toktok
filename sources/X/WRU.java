package X;

/* loaded from: classes15.dex */
public final class WRU implements InterfaceC82284WRc {
    public final InterfaceC82294WRm LIZ;

    @Override // X.InterfaceC82284WRc
    public final boolean LIZ() {
        return C60903NvH.LJIIJJI().LJJIL().getDisableFilter(false);
    }

    public WRU(HDT hdt) {
        this.LIZ = hdt;
    }

    @Override // X.InterfaceC82284WRc
    public final int LIZIZ(int i) {
        return this.LIZ.LIZ(i);
    }

    @Override // X.InterfaceC82284WRc
    public final void LIZLLL(boolean z) {
        C60903NvH.LJIIJJI().LJJIL().setDisableFilter(z);
    }

    @Override // X.InterfaceC82284WRc
    public final void LJ(int i, int i2) {
        this.LIZ.setDefaultFilterForCamera(i, i2);
    }
}
