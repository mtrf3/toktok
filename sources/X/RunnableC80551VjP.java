package X;

/* renamed from: X.VjP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80551VjP implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ AbstractC80544VjI LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            AbstractC80544VjI abstractC80544VjI = this.LJLILLLLZI;
            abstractC80544VjI.LJLIL.setError(C16880lQ.LLLZ(abstractC80544VjI.LJLJJI, new Object[]{C80552VjQ.LIZ(this.LJLIL)}));
            this.LJLILLLLZI.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80551VjP(AbstractC80544VjI abstractC80544VjI, long j) {
        this.LJLILLLLZI = abstractC80544VjI;
        this.LJLIL = j;
    }
}
