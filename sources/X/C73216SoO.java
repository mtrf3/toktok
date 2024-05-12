package X;

/* renamed from: X.SoO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73216SoO extends AbstractC029609s {
    public final /* synthetic */ C73214SoM LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C73216SoO(C73214SoM c73214SoM) {
        this.LJLIL = c73214SoM;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        C73214SoM c73214SoM = this.LJLIL;
        c73214SoM.notifyItemRangeChanged(c73214SoM.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        C73214SoM c73214SoM = this.LJLIL;
        c73214SoM.notifyItemRangeInserted(c73214SoM.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        C73214SoM c73214SoM = this.LJLIL;
        c73214SoM.notifyItemMoved(c73214SoM.LJLLLLLL() + i, this.LJLIL.LJLLLLLL() + i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        C73214SoM c73214SoM = this.LJLIL;
        c73214SoM.notifyItemRangeRemoved(c73214SoM.LJLLLLLL() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        C73214SoM c73214SoM = this.LJLIL;
        c73214SoM.notifyItemRangeChanged(c73214SoM.LJLLLLLL() + i, i2, obj);
    }
}
