package X;

/* renamed from: X.SoK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73212SoK extends AbstractC029609s {
    public final /* synthetic */ C73210SoI LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C73212SoK(C73210SoI c73210SoI) {
        this.LJLIL = c73210SoI;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        C73210SoI c73210SoI = this.LJLIL;
        c73210SoI.notifyItemRangeChanged(c73210SoI.LJZL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        C73210SoI c73210SoI = this.LJLIL;
        c73210SoI.notifyItemRangeInserted(c73210SoI.LJZL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        C73210SoI c73210SoI = this.LJLIL;
        c73210SoI.notifyItemMoved(c73210SoI.LJZL() + i, this.LJLIL.LJZL() + i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        C73210SoI c73210SoI = this.LJLIL;
        c73210SoI.notifyItemRangeRemoved(c73210SoI.LJZL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        C73210SoI c73210SoI = this.LJLIL;
        c73210SoI.notifyItemRangeChanged(c73210SoI.LJZL() + i, i2, obj);
    }
}
