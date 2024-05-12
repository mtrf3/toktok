package X;

/* renamed from: X.QoQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68122QoQ implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C68084Qno LJLILLLLZI;

    public RunnableC68122QoQ(C68084Qno c68084Qno, long j) {
        this.LJLILLLLZI = c68084Qno;
        this.LJLIL = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LIZ.LJIIL().LJIIIIZZ(this.LJLIL);
            this.LJLILLLLZI.LJ = null;
        } finally {
            if (LIZ) {
            }
        }
    }
}
