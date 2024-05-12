package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMetricsCancelImNotRemoveBugFixSetting;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1210300_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public long j6;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, this.s0, U85.INVITEE);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z3;
            long j3 = this.j6;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_invite_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(LJ, LIZJ, 1);
            UAR.LJFF(0L, j, LIZJ, "cancel_invite_message", null, z);
            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, this.s0, U85.HANDLER);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z3;
            long j3 = this.j6;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_apply_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(LJ, LIZJ, 1);
            UAR.LJFF(0L, j, LIZJ, "cancel_apply_message", null, z);
            if (LinkMicMetricsCancelImNotRemoveBugFixSetting.INSTANCE.getValue()) {
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S1210300_13 aRunnableS0S1210300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1210300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1210300_13 aRunnableS0S1210300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1210300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1210300_13(U66 u66, String str, JSONObject jSONObject, long j, long j2, boolean z, long j3, int i) {
        this.$t = i;
        this.l1 = u66;
        this.s0 = str;
        this.l2 = jSONObject;
        this.j4 = j;
        this.j5 = j2;
        this.z3 = z;
        this.j6 = j3;
    }
}
