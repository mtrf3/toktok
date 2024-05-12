package X;

/* renamed from: X.Qob, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68133Qob implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C68082Qnm LJLJJL;

    public RunnableC68133Qob(C68082Qnm c68082Qnm, String str, String str2, Object obj, long j) {
        this.LJLJJL = c68082Qnm;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = obj;
        this.LJLJJI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68082Qnm c68082Qnm = this.LJLJJL;
            String str = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            c68082Qnm.LJIJJLI(this.LJLJJI, this.LJLJI, str, str2);
        } finally {
            if (LIZ) {
            }
        }
    }
}
