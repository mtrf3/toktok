package X;

/* loaded from: classes8.dex */
public final class G7V implements R3Y {
    public final /* synthetic */ G7W LJLIL;

    @Override // X.R3Y
    public final void onCancel() {
    }

    @Override // X.R3Y
    public final void onSuccess() {
        if (this.LJLIL != null) {
            if (C1DG.LJIIIIZZ()) {
                HB4.LIZLLL();
            } else {
                this.LJLIL.onSuccess();
            }
        }
    }

    public G7V(G7W g7w) {
        this.LJLIL = g7w;
    }
}
