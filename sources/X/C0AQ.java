package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0AQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AQ {
    public final C0B8 LIZ;
    public final InterfaceC03210Ar LIZIZ;
    public final AbstractC029409q<RecyclerView.ViewHolder> LIZJ;
    public final C0AP LIZLLL;
    public int LJ;
    public final C28831Bf LJFF;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Bf, X.09s] */
    public C0AQ(AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q, C0AP c0ap, C0B9 c0b9, InterfaceC03210Ar interfaceC03210Ar) {
        ?? r1 = new AbstractC029609s() { // from class: X.1Bf
            @Override // X.AbstractC029609s
            public final void LIZJ() {
                C0AQ c0aq = C0AQ.this;
                c0aq.LJ = c0aq.LIZJ.getItemCount();
                C28881Bk c28881Bk = (C28881Bk) C0AQ.this.LIZLLL;
                c28881Bk.LIZ.notifyDataSetChanged();
                c28881Bk.LIZIZ();
            }

            @Override // X.AbstractC029609s
            public final void LJIIIIZZ() {
                ((C28881Bk) C0AQ.this.LIZLLL).LIZIZ();
            }

            @Override // X.AbstractC029609s
            public final void LIZLLL(int i, int i2) {
                C0AQ c0aq = C0AQ.this;
                C28881Bk c28881Bk = (C28881Bk) c0aq.LIZLLL;
                c28881Bk.LIZ.notifyItemRangeChanged(i + c28881Bk.LIZJ(c0aq), i2, null);
            }

            @Override // X.AbstractC029609s
            public final void LJFF(int i, int i2) {
                C0AQ c0aq = C0AQ.this;
                c0aq.LJ += i2;
                C28881Bk c28881Bk = (C28881Bk) c0aq.LIZLLL;
                c28881Bk.LIZ.notifyItemRangeInserted(i + c28881Bk.LIZJ(c0aq), i2);
                C0AQ c0aq2 = C0AQ.this;
                if (c0aq2.LJ > 0 && c0aq2.LIZJ.mStateRestorationPolicy == EnumC029309p.PREVENT_WHEN_EMPTY) {
                    ((C28881Bk) c0aq2.LIZLLL).LIZIZ();
                }
            }

            @Override // X.AbstractC029609s
            public final void LJI(int i, int i2) {
                C0AQ c0aq = C0AQ.this;
                C28881Bk c28881Bk = (C28881Bk) c0aq.LIZLLL;
                int LIZJ = c28881Bk.LIZJ(c0aq);
                c28881Bk.LIZ.notifyItemMoved(i + LIZJ, i2 + LIZJ);
            }

            @Override // X.AbstractC029609s
            public final void LJII(int i, int i2) {
                C0AQ c0aq = C0AQ.this;
                c0aq.LJ -= i2;
                C28881Bk c28881Bk = (C28881Bk) c0aq.LIZLLL;
                c28881Bk.LIZ.notifyItemRangeRemoved(i + c28881Bk.LIZJ(c0aq), i2);
                C0AQ c0aq2 = C0AQ.this;
                if (c0aq2.LJ < 1 && c0aq2.LIZJ.mStateRestorationPolicy == EnumC029309p.PREVENT_WHEN_EMPTY) {
                    ((C28881Bk) c0aq2.LIZLLL).LIZIZ();
                }
            }

            @Override // X.AbstractC029609s
            public final void LJ(int i, int i2, Object obj) {
                C0AQ c0aq = C0AQ.this;
                C28881Bk c28881Bk = (C28881Bk) c0aq.LIZLLL;
                c28881Bk.LIZ.notifyItemRangeChanged(i + c28881Bk.LIZJ(c0aq), i2, obj);
            }
        };
        this.LJFF = r1;
        this.LIZJ = abstractC029409q;
        this.LIZLLL = c0ap;
        this.LIZ = c0b9.LIZIZ(this);
        this.LIZIZ = interfaceC03210Ar;
        this.LJ = abstractC029409q.getItemCount();
        abstractC029409q.registerAdapterDataObserver(r1);
    }
}
