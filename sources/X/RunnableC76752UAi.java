package X;

/* renamed from: X.UAi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76752UAi implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    public RunnableC76752UAi(U66 u66, String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = j;
        this.LJLJLJ = z;
        this.LJLJLLL = str6;
    }

    public final void LIZ() {
        UA9.LJFF().LIZIZ(new UAP(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, UC0.LJIJI(this.LJLIL), C31012CFc.LIZIZ(), System.currentTimeMillis(), this.LJLJL, this.LJLJLJ, this.LJLJLLL));
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
