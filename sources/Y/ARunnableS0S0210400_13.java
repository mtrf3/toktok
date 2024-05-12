package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S0210400_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public long j5;
    public long j6;
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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l0, String.valueOf(this.j3), U85.INVITEE);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l1;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z2;
            long j3 = this.j6;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_invite_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
            UAR.LJFF(0L, j, LIZJ, "cancel_invite_message", null, z);
            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l0, String.valueOf(this.j3), U85.HANDLER);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l1;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z2;
            long j3 = this.j6;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_apply_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
            UAR.LJFF(0L, j, LIZJ, "cancel_apply_message", null, z);
            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
        }
    }

    public static final void run$0(ARunnableS0S0210400_13 aRunnableS0S0210400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0210400_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0210400_13 aRunnableS0S0210400_13) {
        boolean LIZ;
        try {
            aRunnableS0S0210400_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0210400_13(U66 u66, long j, JSONObject jSONObject, long j2, long j3, boolean z, long j4, int i) {
        this.$t = i;
        this.l0 = u66;
        this.j3 = j;
        this.l1 = jSONObject;
        this.j4 = j2;
        this.j5 = j3;
        this.z2 = z;
        this.j6 = j4;
    }
}
