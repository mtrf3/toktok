package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAV implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ OSZ<Long, String> LJLJLJ;
    public final /* synthetic */ JSONObject LJLJLLL;

    public UAV(U66 u66, String str, boolean z, int i, long j, long j2, String str2, OSZ<Long, String> osz, JSONObject jSONObject) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = str2;
        this.LJLJLJ = osz;
        this.LJLJLLL = jSONObject;
    }

    public final void LIZ() {
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, this.LJLILLLLZI, U85.INVITEE);
        if (LIZJ != null) {
            boolean z = this.LJLJI;
            int i = this.LJLJJI;
            long j = this.LJLJJL;
            long j2 = this.LJLJJLL;
            String str = this.LJLJL;
            OSZ<Long, String> osz = this.LJLJLJ;
            JSONObject jSONObject = this.LJLJLLL;
            U66 u66 = this.LJLIL;
            if (z && i == 1) {
                LIZJ.LJIIZILJ = true;
                LIZJ.LJIJ = j;
            }
            UAR.LIZIZ(LIZJ, "reply_invite", j - j2, str, osz.getFirst().longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "reply_invite", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str), j2, j);
            if (z) {
                if (i == 1) {
                    UAR.LIZLLL(LIZJ);
                    UA9.LIZ(u66, LIZJ.LIZIZ(), LIZJ.LIZ());
                } else {
                    C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                    UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
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
