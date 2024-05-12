package X;

/* renamed from: X.SoG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73208SoG extends AbstractC029609s {
    public final /* synthetic */ C73207SoF LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C73208SoG(C61938OSo c61938OSo) {
        this.LJLIL = c61938OSo;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        C73207SoF c73207SoF = this.LJLIL;
        c73207SoF.notifyItemRangeChanged(c73207SoF.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        C73207SoF c73207SoF = this.LJLIL;
        c73207SoF.notifyItemRangeInserted(c73207SoF.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        C73207SoF c73207SoF = this.LJLIL;
        c73207SoF.notifyItemMoved(c73207SoF.LJLLLLLL() + i, this.LJLIL.LJLLLLLL() + i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        C73207SoF c73207SoF = this.LJLIL;
        c73207SoF.notifyItemRangeRemoved(c73207SoF.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        C73207SoF c73207SoF = this.LJLIL;
        c73207SoF.notifyItemRangeChanged(c73207SoF.LJLLLLLL() + i, i2, obj);
    }
}
