package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S0211400_13 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public long j6;
    public long j7;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l0, String.valueOf(this.j4), U85.APPLICANT);
        if (LIZJ != null) {
            int i = this.i3;
            long j = this.j5;
            JSONObject jSONObject = (JSONObject) this.l1;
            long j2 = this.j6;
            U66 u66 = (U66) this.l0;
            boolean z = this.z2;
            long j3 = this.j7;
            if (i == 1) {
                LIZJ.LJIILLIIL = true;
                LIZJ.LJIJ = j;
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("permit_status", PermitStatus.Companion.stateToString(i));
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "permit_message", LJIIZILJ, j, j2);
            if (i == 1) {
                UAR.LIZLLL(LIZJ);
                UA9.LIZ(u66, LIZJ.LIZIZ(), LIZJ.LIZ());
            } else {
                if (i == 1) {
                    return;
                }
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "permit_message", null, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l0, String.valueOf(this.j4), U85.INVITER);
        if (LIZJ != null) {
            int i = this.i3;
            long j = this.j5;
            JSONObject jSONObject = (JSONObject) this.l1;
            long j2 = this.j6;
            U66 u66 = (U66) this.l0;
            boolean z = this.z2;
            long j3 = this.j7;
            if (i == 1) {
                LIZJ.LJIILL = true;
                LIZJ.LJIJ = j;
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("reply_status", ReplyStatus.Companion.replyStatusToString(i));
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "reply_invite_message", LJIIZILJ, j, j2);
            if (i == 1) {
                UAR.LIZLLL(LIZJ);
                UA9.LIZ(u66, LIZJ.LIZIZ(), LIZJ.LIZ());
            } else {
                if (i == 1) {
                    return;
                }
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "reply_invite_message", null, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S0211400_13 aRunnableS0S0211400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0211400_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0211400_13 aRunnableS0S0211400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0211400_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0211400_13(U66 u66, long j, int i, long j2, JSONObject jSONObject, long j3, boolean z, long j4, int i2) {
        this.$t = i2;
        this.l0 = u66;
        this.j4 = j;
        this.i3 = i;
        this.j5 = j2;
        this.l1 = jSONObject;
        this.j6 = j3;
        this.z2 = z;
        this.j7 = j4;
    }
}
