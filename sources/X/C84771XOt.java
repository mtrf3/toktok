package X;

/* renamed from: X.XOt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84771XOt extends AbstractC84770XOs {
    @Override // X.AbstractC84770XOs
    public final void LIZLLL(C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        c84772XOu.LIZIZ = c84772XOu2;
    }

    @Override // X.AbstractC84770XOs
    public final void LJ(C84772XOu c84772XOu, Thread thread) {
        c84772XOu.LIZ = thread;
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZ(AbstractC84773XOv<?> abstractC84773XOv, XP9 xp9, XP9 xp92) {
        synchronized (abstractC84773XOv) {
            if (abstractC84773XOv.LJLILLLLZI == xp9) {
                abstractC84773XOv.LJLILLLLZI = xp92;
                return true;
            }
            return false;
        }
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZIZ(AbstractC84773XOv<?> abstractC84773XOv, Object obj, Object obj2) {
        synchronized (abstractC84773XOv) {
            if (abstractC84773XOv.LJLIL == obj) {
                abstractC84773XOv.LJLIL = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // X.AbstractC84770XOs
    public final boolean LIZJ(AbstractC84773XOv<?> abstractC84773XOv, C84772XOu c84772XOu, C84772XOu c84772XOu2) {
        synchronized (abstractC84773XOv) {
            if (abstractC84773XOv.LJLJI == c84772XOu) {
                abstractC84773XOv.LJLJI = c84772XOu2;
                return true;
            }
            return false;
        }
    }
}
