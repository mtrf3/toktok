package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAT implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ long LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ String LJLLI;

    public UAT(U66 u66, String str, String str2, int i, long j, JSONObject jSONObject, long j2, boolean z, long j3, boolean z2, String str3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = jSONObject;
        this.LJLJL = j2;
        this.LJLJLJ = z;
        this.LJLJLLL = j3;
        this.LJLL = z2;
        this.LJLLI = str3;
    }

    public final void LIZ() {
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, this.LJLILLLLZI, U85.APPLICANT);
        if (LIZJ != null) {
            String str = this.LJLJI;
            int i = this.LJLJJI;
            long j = this.LJLJJL;
            JSONObject jSONObject = this.LJLJJLL;
            long j2 = this.LJLJL;
            U66 u66 = this.LJLIL;
            boolean z = this.LJLJLJ;
            long j3 = this.LJLJLLL;
            boolean z2 = this.LJLL;
            String str2 = this.LJLLI;
            LIZJ.LIZLLL(str);
            if (i == 1) {
                LIZJ.LJIILLIIL = true;
                LIZJ.LJIJ = j;
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("permit_status", PermitStatus.Companion.stateToString(i));
            LJIIZILJ.put("msg_id", j3);
            LJIIZILJ.put("is_moderator_operation", z2);
            LJIIZILJ.put("operator_uid", str2);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "permit_message", LJIIZILJ, j, j2);
            if (i == 1) {
                UAR.LIZLLL(LIZJ);
                UA9.LIZ(u66, LIZJ.LIZIZ(), LIZJ.LIZ());
            } else {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "permit_message", null, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
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
