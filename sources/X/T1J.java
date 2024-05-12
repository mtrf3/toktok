package X;

/* loaded from: classes13.dex */
public final class T1J implements Runnable {
    public final T1K LJLIL;
    public final /* synthetic */ T1I LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJLJJI = true;
            this.LJLILLLLZI.LJLIL.remove(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public T1J(T1I t1i, T1K t1k) {
        this.LJLILLLLZI = t1i;
        this.LJLIL = t1k;
    }
}
