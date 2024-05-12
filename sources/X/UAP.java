package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAP implements Runnable {
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
    public final /* synthetic */ boolean LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    public UAP(U66 u66, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, long j, long j2, long j3, boolean z, String str6) {
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
        this.LJLLI = z;
        this.LJLLILLLL = str6;
    }

    public final void LIZ() {
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), this.LJLIL, this.LJLILLLLZI, this.LJLJI, U85.INVITEE, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null, null, 0, 896);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = this.LJLJL;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.LJLJLJ, this.LJLJLLL);
        JSONObject jSONObject2 = this.LJLJL;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        long j = this.LJLL;
        boolean z = this.LJLLI;
        String str = this.LJLLILLLL;
        LJIIZILJ.put("msg_id", j);
        LJIIZILJ.put("is_moderator_operation", z);
        LJIIZILJ.put("operator_uid", str);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "invite_message", LJIIZILJ, this.LJLJLJ, this.LJLJLLL);
        UA9.LJJJI(LIZ);
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
