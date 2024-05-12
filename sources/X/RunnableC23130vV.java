package X;

/* renamed from: X.0vV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC23130vV implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ AbstractC43881ns LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = this.LJLIL;
            C21250sT.LIZ.LIZJ(new IRT(currentTimeMillis, this.LJLILLLLZI, this.LJLJI.LIZ, z));
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC23130vV(AbstractC43881ns abstractC43881ns, boolean z, long j) {
        this.LJLJI = abstractC43881ns;
        this.LJLIL = z;
        this.LJLILLLLZI = j;
    }
}
