package X;

/* renamed from: X.1Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28811Bd implements C0AK {
    public final AbstractC029409q LJLIL;

    public C28811Bd(AbstractC029409q abstractC029409q) {
        this.LJLIL = abstractC029409q;
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        this.LJLIL.notifyItemRangeRemoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        this.LJLIL.notifyItemRangeInserted(i, i2);
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        this.LJLIL.notifyItemMoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        this.LJLIL.notifyItemRangeChanged(i, i2, obj);
    }
}
