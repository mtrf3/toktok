package X;

import org.json.JSONObject;

/* renamed from: X.UAm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76756UAm implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ C76762UAs LJLILLLLZI;
    public final /* synthetic */ OSZ<Long, String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC76756UAm(U7T u7t, C76762UAs c76762UAs, OSZ osz, String str, long j, long j2, String str2) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = c76762UAs;
        this.LJLJI = osz;
        this.LJLJJI = str;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
            C76762UAs c76762UAs = this.LJLILLLLZI;
            c76762UAs.LIZLLL.LIZIZ(new UAD(c76762UAs, this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, LJIJI, this.LJLJL));
        } finally {
            if (LIZ) {
            }
        }
    }
}
