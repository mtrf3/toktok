package X;

/* loaded from: classes9.dex */
public final class J9I extends AbstractC36569EWv {
    public final /* synthetic */ J9J LJLIL;

    public J9I(XZP xzp) {
        this.LJLIL = xzp;
    }

    @Override // X.E0U
    public final void LJJJJI(String str) {
        this.LJLIL.onStart();
    }

    @Override // X.E0U
    public final void LJJJLIIL(String str) {
        this.LJLIL.LIZ();
    }

    @Override // X.E0U
    public final void LJIIJ(String str, boolean z) {
        if (z) {
            this.LJLIL.LIZJ(str);
        }
    }

    @Override // X.E0U
    public final void LJJJJJ(String str, float f) {
        this.LJLIL.LIZIZ();
    }

    @Override // X.E0U
    public final void LJJJ(String str, int i, int i2, String str2) {
        if (i == EnumC136795Yl.DOWNLOAD_ERROR_NON_RETRYABLE.ordinal()) {
            this.LJLIL.LIZLLL();
        } else {
            this.LJLIL.onError();
        }
    }

    @Override // X.AbstractC36569EWv
    public final void LIZ(String str, int i, int i2, float f, String str2) {
        this.LJLIL.LJ();
    }
}
