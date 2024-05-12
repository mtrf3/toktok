package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAU implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ OSZ<Long, String> LJLJLLL;
    public final /* synthetic */ JSONObject LJLL;

    public UAU(U66 u66, String str, String str2, boolean z, int i, long j, long j2, String str3, OSZ<Long, String> osz, JSONObject jSONObject) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = j;
        this.LJLJL = j2;
        this.LJLJLJ = str3;
        this.LJLJLLL = osz;
        this.LJLL = jSONObject;
    }

    public final void LIZ() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ(this.LJLIL, this.LJLILLLLZI, U85.HANDLER);
        if (LIZIZ != null) {
            String str = this.LJLJI;
            boolean z = this.LJLJJI;
            int i = this.LJLJJL;
            long j = this.LJLJJLL;
            long j2 = this.LJLJL;
            String str2 = this.LJLJLJ;
            OSZ<Long, String> osz = this.LJLJLLL;
            JSONObject jSONObject = this.LJLL;
            U66 u66 = this.LJLIL;
            if (str != null) {
                LIZIZ.LIZJ(str);
            }
            if (z && i == 1) {
                LIZIZ.LJIILJJIL = true;
                LIZIZ.LJIJ = j;
            }
            UAR.LIZIZ(LIZIZ, "permit", j - j2, str2, osz.getFirst().longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            C77119UOl.LJIJJLI(LJ, LIZIZ, jSONObject, "permit", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str2), j2, j);
            if (z) {
                if (i == 1) {
                    UAR.LIZLLL(LIZIZ);
                    UA9.LIZ(u66, LIZIZ.LIZIZ(), LIZIZ.LIZ());
                } else {
                    C77119UOl.LJJ(UA9.LJ(), LIZIZ, 1);
                    UA9.LIZLLL().LJFF(LIZIZ.LIZIZ());
                }
            }
        }
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
