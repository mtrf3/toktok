package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8D implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ C76762UAs LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public U8D(U66 u66, C76762UAs c76762UAs, int i, int i2, int i3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = c76762UAs;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = this.LJLILLLLZI;
            c76762UAs.LIZLLL.LIZIZ(new RunnableC76753UAj(this.LJLIL, LIZIZ, currentTimeMillis, LJIJI, c76762UAs, this.LJLJI, this.LJLJJI, this.LJLJJL));
        } finally {
            if (LIZ) {
            }
        }
    }
}
