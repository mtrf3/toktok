package X;

/* renamed from: X.GhG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42198GhG extends AbstractC029609s {
    public final AbstractC029409q<?> LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C42198GhG(C42197GhF c42197GhF) {
        this.LJLIL = c42197GhF;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        this.LJLIL.notifyItemRangeChanged(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        this.LJLIL.notifyItemRangeInserted(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        this.LJLIL.notifyDataSetChanged();
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        this.LJLIL.notifyItemRangeRemoved(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        LIZLLL(i, i2);
        this.LJLIL.notifyItemRangeChanged(i, i2, obj);
    }
}
