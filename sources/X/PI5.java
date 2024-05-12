package X;

/* loaded from: classes12.dex */
public final class PI5 extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PI1 LJLJJI;
    public final /* synthetic */ PI6 LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            PI6 pi6 = this.LJLJJL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cool down task run, is back?: ");
            LIZ2.append(this.LJLJJL.LIZJ);
            pi6.LIZ(X1D.LIZIZ(LIZ2));
            PI1 pi1 = this.LJLJJI;
            synchronized (pi1) {
                pi1.LIZ(pi1.LJIIJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PI5(PI6 pi6, long j, PI1 pi1) {
        super(j, 0L);
        this.LJLJJL = pi6;
        this.LJLJJI = pi1;
    }
}
