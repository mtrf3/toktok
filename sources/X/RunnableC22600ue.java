package X;

/* renamed from: X.0ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC22600ue<V> implements Runnable {
    public final AbstractC35091Zh<V> LJLIL;
    public final C76L<? extends V> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL.LJLIL == this) {
                if (AbstractC35091Zh.LJLJJLL.LIZIZ(this.LJLIL, this, AbstractC35091Zh.LJ(this.LJLILLLLZI))) {
                    AbstractC35091Zh.LIZIZ(this.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC22600ue(AbstractC35091Zh<V> abstractC35091Zh, C76L<? extends V> c76l) {
        this.LJLIL = abstractC35091Zh;
        this.LJLILLLLZI = c76l;
    }
}
