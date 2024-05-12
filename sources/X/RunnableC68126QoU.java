package X;

/* renamed from: X.QoU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68126QoU implements Runnable {
    public final /* synthetic */ C68132Qoa LJLIL;
    public final /* synthetic */ C68132Qoa LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C68084Qno LJLJJL;

    public RunnableC68126QoU(C68084Qno c68084Qno, C68132Qoa c68132Qoa, C68132Qoa c68132Qoa2, long j, boolean z) {
        this.LJLJJL = c68084Qno;
        this.LJLIL = c68132Qoa;
        this.LJLILLLLZI = c68132Qoa2;
        this.LJLJI = j;
        this.LJLJJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LJIIJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
        } finally {
            if (LIZ) {
            }
        }
    }
}
