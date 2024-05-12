package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAQ implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ long LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    public UAQ(U66 u66, String str, String str2, String str3, JSONObject jSONObject, long j, long j2, int i, String str4, String str5, long j3, String str6) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = j;
        this.LJLJL = j2;
        this.LJLJLJ = i;
        this.LJLJLLL = str4;
        this.LJLL = str5;
        this.LJLLI = j3;
        this.LJLLILLLL = str6;
    }

    public final void LIZ() {
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = this.LJLIL;
        String str = this.LJLILLLLZI;
        U85 u85 = U85.HANDLER;
        UAS LIZJ = LIZLLL.LIZJ(u66, str, u85);
        if (LIZJ == null) {
            U66 u662 = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            String str3 = this.LJLJLLL;
            String str4 = this.LJLJI;
            String str5 = this.LJLL;
            JSONObject jSONObject = this.LJLJJL;
            long j = this.LJLJJLL;
            long j2 = this.LJLJL;
            UAS LIZ = UAO.LIZ(UA9.LIZLLL(), u662, str2, str3, u85, str4, null, str5, null, null, 0, 928);
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZ);
            LIZJ = LIZ;
            C77119UOl.LJJII(LJ, LIZJ, jSONObject, j, j2);
        }
        String str6 = this.LJLJI;
        if (str6 != null) {
            LIZJ.LIZLLL(str6);
        }
        LIZJ.LIZJ(this.LJLJJI);
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject2 = this.LJLJJL;
        UC0.LJJLIIIJJI(jSONObject2, LIZJ);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        int i = this.LJLJLJ;
        long j3 = this.LJLLI;
        String str7 = this.LJLLILLLL;
        LJIIZILJ.put("permit_status", PermitStatus.Companion.stateToString(i));
        LJIIZILJ.put("msg_id", j3);
        LJIIZILJ.put("operator_uid", str7);
        C77119UOl.LJJIFFI(LJ2, LIZJ, jSONObject2, "permit_message", LJIIZILJ, this.LJLJJLL, this.LJLJL);
        if (this.LJLJLJ == 1) {
            UAR.LIZLLL(LIZJ);
        } else {
            C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
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
