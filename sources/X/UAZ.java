package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAZ implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ long LJLJLJ;

    public UAZ(U66 u66, String str, int i, long j, JSONObject jSONObject, long j2, boolean z, long j3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = j2;
        this.LJLJL = z;
        this.LJLJLJ = j3;
    }

    public final void LIZ() {
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, this.LJLILLLLZI, U85.INVITER);
        if (LIZJ != null) {
            int i = this.LJLJI;
            long j = this.LJLJJI;
            JSONObject jSONObject = this.LJLJJL;
            long j2 = this.LJLJJLL;
            U66 u66 = this.LJLIL;
            boolean z = this.LJLJL;
            long j3 = this.LJLJLJ;
            if (i == 1) {
                LIZJ.LJIILL = true;
                LIZJ.LJIJ = j;
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("reply_status", ReplyStatus.Companion.replyStatusToString(i));
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "reply_invite_message", LJIIZILJ, j, j2);
            if (i == 1) {
                UAR.LIZLLL(LIZJ);
                UA9.LIZ(u66, LIZJ.LIZIZ(), LIZJ.LIZ());
            } else {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "reply_invite_message", null, z);
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
