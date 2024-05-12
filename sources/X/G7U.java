package X;

/* loaded from: classes8.dex */
public final class G7U implements R3Y {
    public final /* synthetic */ G7X LJLIL;
    public final /* synthetic */ G64 LJLILLLLZI;

    @Override // X.R3Y
    public final void onCancel() {
        this.LJLIL.cancel();
    }

    @Override // X.R3Y
    public final void onSuccess() {
        if (C1DG.LJIIIIZZ()) {
            HB4.LIZLLL();
            this.LJLIL.cancel();
        } else {
            this.LJLIL.LIZIZ(this.LJLILLLLZI);
        }
    }

    public G7U(C42150GgU c42150GgU, G64 g64) {
        this.LJLIL = c42150GgU;
        this.LJLILLLLZI = g64;
    }
}
