package X;

/* renamed from: X.Ggj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42165Ggj extends AbstractC029609s {
    public final /* synthetic */ AbstractC42164Ggi LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C42165Ggj(AbstractC42164Ggi abstractC42164Ggi) {
        this.LJLIL = abstractC42164Ggi;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        int LJZI = this.LJLIL.LJZI(i);
        this.LJLIL.notifyItemRangeChanged(LJZI, this.LJLIL.LJZI(i + i2) - LJZI);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        this.LJLIL.notifyDataSetChanged();
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        this.LJLIL.notifyDataSetChanged();
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        this.LJLIL.notifyDataSetChanged();
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        int LJZI = this.LJLIL.LJZI(i);
        this.LJLIL.notifyItemRangeChanged(LJZI, this.LJLIL.LJZI(i + i2) - LJZI, obj);
    }
}
