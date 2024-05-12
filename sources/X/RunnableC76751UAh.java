package X;

import Y.ARunnableS0S4200300_13;
import org.json.JSONObject;

/* renamed from: X.UAh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76751UAh implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public RunnableC76751UAh(U66 u66, String str, String str2, String str3, String str4, long j) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = j;
    }

    public final void LIZ() {
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        UA9.LJFF().LIZIZ(new ARunnableS0S4200300_13(LIZIZ, currentTimeMillis, this.LJLJJLL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, LJIJI, 1));
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
