package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UA5 implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ long LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ String LJLLI;

    public UA5(U66 u66, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, long j, long j2, long j3, String str6) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = jSONObject;
        this.LJLJLJ = j;
        this.LJLJLLL = j2;
        this.LJLL = j3;
        this.LJLLI = str6;
    }

    public final void LIZ() {
        String LIZIZ;
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = this.LJLIL;
        String str = this.LJLILLLLZI;
        U85 u85 = U85.INVITER;
        UAS LIZJ = LIZLLL.LIZJ(u66, str, u85);
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ()) != null) {
            UA9.LIZLLL().LJFF(LIZIZ);
        }
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), this.LJLIL, this.LJLILLLLZI, this.LJLJI, u85, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null, null, 0, 896);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = this.LJLJL;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.LJLJLJ, this.LJLJLLL);
        JSONObject jSONObject2 = this.LJLJL;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        long j = this.LJLL;
        String str2 = this.LJLLI;
        LJIIZILJ.put("msg_id", j);
        LJIIZILJ.put("operator_uid", str2);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "invite_message", LJIIZILJ, this.LJLJLJ, this.LJLJLLL);
        UA9.LJJJI(LIZ);
        UAR.LJ(LIZ, true, 0L);
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
