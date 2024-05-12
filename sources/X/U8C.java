package X;

/* loaded from: classes14.dex */
public final class U8C implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    public U8C(int i, long j, U66 u66, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = i;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = j;
        this.LJLJLLL = str6;
    }

    public final void LIZ() {
        UA9.LJFF().LIZIZ(new UAQ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, UC0.LJIJI(this.LJLIL), C31012CFc.LIZIZ(), System.currentTimeMillis(), this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL));
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
