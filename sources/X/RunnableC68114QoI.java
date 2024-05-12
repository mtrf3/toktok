package X;

/* renamed from: X.QoI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68114QoI implements Runnable {
    public final /* synthetic */ C68132Qoa LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C68084Qno LJLJI;

    public RunnableC68114QoI(C68084Qno c68084Qno, C68132Qoa c68132Qoa, long j) {
        this.LJLJI = c68084Qno;
        this.LJLIL = c68132Qoa;
        this.LJLILLLLZI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LJIIJJI(this.LJLIL, false, this.LJLILLLLZI);
            C68084Qno c68084Qno = this.LJLJI;
            c68084Qno.LJ = null;
            C68022Qmo LJIJJ = c68084Qno.LIZ.LJIJJ();
            LJIJJ.LJFF();
            LJIJJ.LJI();
            LJIJJ.LJIIZILJ(new RunnableC68104Qo8(LJIJJ, null));
        } finally {
            if (LIZ) {
            }
        }
    }
}
