package Y;

import X.B83;
import X.C29374Bfu;
import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.UA9;
import X.UAS;
import X.UAY;
import X.UC0;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1200500_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public long j5;
    public long j6;
    public long j7;
    public Object l1;
    public Object l2;
    public String s0;

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

    public final void LIZ$1() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        if (((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == this.j3) {
            UA9.LJFF().LIZIZ(new UAY(UA9.LIZIZ((List) ((Map) this.l2).get(Long.valueOf(this.j4))), (U66) this.l1, LJIJI, this.j5, this.j6, this.j4, this.j7, this.s0));
        } else {
            UA9.LJFF().LIZIZ(new ARunnableS0S1200500_13(this.j3, this.j5, this.j6, this.j4, this.j7, (U66) this.l1, this.s0, LJIJI, 0));
        }
    }

    public final void LIZ$0() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, String.valueOf(this.j3), null);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            long j3 = this.j6;
            long j4 = this.j7;
            String str = this.s0;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("leave_group_channel_id", j3);
            LJIIZILJ.put("stay_group_channel_id", j4);
            LJIIZILJ.put("source", str);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "kick_out", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S1200500_13 aRunnableS0S1200500_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200500_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1200500_13 aRunnableS0S1200500_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200500_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1200500_13(long j, long j2, long j3, long j4, long j5, Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j3 = j;
        this.l2 = obj2;
        this.j4 = j2;
        this.j5 = j3;
        this.j6 = j4;
        this.j7 = j5;
        this.s0 = str;
    }
}
