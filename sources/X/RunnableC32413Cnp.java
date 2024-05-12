package X;

/* renamed from: X.Cnp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32413Cnp implements Runnable {
    public final /* synthetic */ C32420Cnw LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ java.util.Map<String, String> LJLLI;

    public RunnableC32413Cnp(C32420Cnw c32420Cnw, long j, long j2, String str, String str2, String str3, int i, String str4, int i2, long j3, java.util.Map<String, String> map) {
        this.LJLIL = c32420Cnw;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = i;
        this.LJLJLJ = str4;
        this.LJLJLLL = i2;
        this.LJLL = j3;
        this.LJLLI = map;
    }

    public final void LIZ() {
        String str;
        C32420Cnw c32420Cnw = this.LJLIL;
        if (c32420Cnw == null || (str = c32420Cnw.LJ) == null) {
            str = "";
        }
        C32710Csc.LIZLLL(this.LJLILLLLZI, this.LJLJI, 0L, 0L, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, null, str, null, this.LJLL, this.LJLLI, 0, 37888);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
