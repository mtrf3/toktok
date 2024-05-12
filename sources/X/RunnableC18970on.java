package X;

import Y.IDRunnableS29S0200000;

/* renamed from: X.0on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC18970on implements Runnable {
    public final /* synthetic */ AbstractC19190p9 LJLIL;
    public final /* synthetic */ AbstractC19190p9 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ AbstractC19190p9 LJLJJI;
    public final /* synthetic */ C18960om LJLJJL;

    public final void LIZ() {
        final C19210pB<T> c19210pB = this.LJLIL.LJLJJL;
        final C19210pB<T> c19210pB2 = this.LJLILLLLZI.LJLJJL;
        final AbstractC03160Am<T> abstractC03160Am = this.LJLJJL.LIZIZ.LIZIZ;
        final int LJFF = c19210pB.LJFF();
        int LJFF2 = c19210pB2.LJFF();
        final int size = (c19210pB.size() - LJFF) - c19210pB.LJII();
        final int size2 = (c19210pB2.size() - LJFF2) - c19210pB2.LJII();
        this.LJLJJL.LIZJ.execute(new IDRunnableS29S0200000(C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.1Xn
            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return size2;
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return size;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                Object obj = C19210pB.this.get(i + LJFF);
                C19210pB c19210pB3 = c19210pB2;
                Object obj2 = c19210pB3.get(i2 + c19210pB3.LJLIL);
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return abstractC03160Am.LIZ(obj, obj2);
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                Object obj = C19210pB.this.get(i + LJFF);
                C19210pB c19210pB3 = c19210pB2;
                Object obj2 = c19210pB3.get(i2 + c19210pB3.LJLIL);
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return abstractC03160Am.LIZIZ(obj, obj2);
            }

            @Override // X.AbstractC03120Ai
            public final Object LIZJ(int i, int i2) {
                Object obj = C19210pB.this.get(i + LJFF);
                C19210pB c19210pB3 = c19210pB2;
                Object obj2 = c19210pB3.get(i2 + c19210pB3.LJLIL);
                if (obj == null || obj2 == null) {
                    return null;
                }
                return abstractC03160Am.LIZJ(obj, obj2);
            }
        }, true), this, 34));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC18970on(C18960om c18960om, AbstractC19190p9 abstractC19190p9, AbstractC19190p9 abstractC19190p92, int i, AbstractC19190p9 abstractC19190p93) {
        this.LJLJJL = c18960om;
        this.LJLIL = abstractC19190p9;
        this.LJLILLLLZI = abstractC19190p92;
        this.LJLJI = i;
        this.LJLJJI = abstractC19190p93;
    }
}
