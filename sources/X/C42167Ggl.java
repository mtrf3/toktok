package X;

/* renamed from: X.Ggl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42167Ggl extends AbstractC029609s {
    public final /* synthetic */ AbstractC42166Ggk LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C42167Ggl(AbstractC42166Ggk abstractC42166Ggk) {
        this.LJLIL = abstractC42166Ggk;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        AbstractC42166Ggk abstractC42166Ggk = this.LJLIL;
        abstractC42166Ggk.notifyItemRangeChanged(abstractC42166Ggk.LJLZ() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        AbstractC42166Ggk abstractC42166Ggk = this.LJLIL;
        abstractC42166Ggk.notifyItemRangeInserted(abstractC42166Ggk.LJLZ() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        AbstractC42166Ggk abstractC42166Ggk = this.LJLIL;
        abstractC42166Ggk.notifyItemMoved(abstractC42166Ggk.LJLZ() + i, this.LJLIL.LJLZ() + i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        AbstractC42166Ggk abstractC42166Ggk = this.LJLIL;
        abstractC42166Ggk.notifyItemRangeRemoved(abstractC42166Ggk.LJLZ() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        AbstractC42166Ggk abstractC42166Ggk = this.LJLIL;
        abstractC42166Ggk.notifyItemRangeChanged(abstractC42166Ggk.LJLZ() + i, i2, obj);
    }
}
