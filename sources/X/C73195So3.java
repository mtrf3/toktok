package X;

/* renamed from: X.So3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73195So3 extends AbstractC029609s {
    public final /* synthetic */ C73184Sns LJLIL;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLIL.notifyDataSetChanged();
    }

    public C73195So3(C73201So9 c73201So9) {
        this.LJLIL = c73201So9;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        LJ(i, i2, null);
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        C73184Sns c73184Sns = this.LJLIL;
        c73184Sns.notifyItemRangeInserted(c73184Sns.LJLZ() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        C73184Sns c73184Sns = this.LJLIL;
        c73184Sns.notifyItemMoved(c73184Sns.LJLZ() + i, this.LJLIL.LJLZ() + i2);
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        C73184Sns c73184Sns = this.LJLIL;
        c73184Sns.notifyItemRangeRemoved(c73184Sns.LJLZ() + i, i2);
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        C73184Sns c73184Sns = this.LJLIL;
        c73184Sns.notifyItemRangeChanged(c73184Sns.LJLZ() + i, i2, obj);
    }
}
