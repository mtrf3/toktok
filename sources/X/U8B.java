package X;

/* loaded from: classes14.dex */
public final class U8B implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public U8B(U66 u66, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = j;
        this.LJLJLJ = str6;
    }

    public final void LIZ() {
        UA9.LJFF().LIZIZ(new UA5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, UC0.LJIJI(this.LJLIL), C31012CFc.LIZIZ(), System.currentTimeMillis(), this.LJLJL, this.LJLJLJ));
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
