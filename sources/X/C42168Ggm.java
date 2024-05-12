package X;

/* renamed from: X.Ggm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42168Ggm extends AbstractC029609s {
    public final /* synthetic */ AbstractC029409q LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C42168Ggm(AbstractC029409q abstractC029409q) {
        this.LJLIL = abstractC029409q;
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
        this.LJLIL.notifyItemMoved(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        this.LJLIL.notifyItemRangeRemoved(i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        this.LJLIL.notifyItemRangeChanged(i, i2, obj);
    }
}
