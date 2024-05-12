package X;

/* loaded from: classes16.dex */
public final class XP2<V> implements Runnable {
    public final AbstractC84773XOv<V> LJLIL;
    public final C76L<? extends V> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL.LJLIL == this) {
                if (AbstractC84773XOv.LJLJJLL.LIZIZ(this.LJLIL, this, AbstractC84773XOv.LJI(this.LJLILLLLZI))) {
                    AbstractC84773XOv.LIZJ(this.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public XP2(AbstractC84773XOv<V> abstractC84773XOv, C76L<? extends V> c76l) {
        this.LJLIL = abstractC84773XOv;
        this.LJLILLLLZI = c76l;
    }
}
