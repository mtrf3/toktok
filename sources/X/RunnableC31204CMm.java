package X;

/* renamed from: X.CMm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31204CMm implements Runnable {
    public final /* synthetic */ C31202CMk LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public RunnableC31204CMm(C31202CMk c31202CMk, String str, long j, String str2, boolean z) {
        this.LJLIL = c31202CMk;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = str2;
        this.LJLJJL = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
