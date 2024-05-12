package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAO;
import X.UAR;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S2200800_13 implements Runnable {
    public final int $t;
    public long j10;
    public long j11;
    public long j4;
    public long j5;
    public long j6;
    public long j7;
    public long j8;
    public long j9;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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
        UAS uas;
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = (U66) this.l2;
        String valueOf = String.valueOf(this.j4);
        U85 u85 = U85.INVITEE;
        UAS LIZJ = LIZLLL.LIZJ(u66, valueOf, u85);
        if (LIZJ == null) {
            uas = UAO.LIZ(UA9.LIZLLL(), (U66) this.l2, String.valueOf(this.j4), String.valueOf(this.j5), u85, null, null, String.valueOf(this.j6), String.valueOf(this.j7), String.valueOf(this.j8), 1, 48);
        } else {
            uas = LIZJ;
        }
        String str = this.s0;
        String str2 = this.s1;
        if (str != null) {
            uas.LIZJ(str);
        }
        if (str2 != null) {
            uas.LIZLLL(str2);
        }
        if (LIZJ == null) {
            C76786UBq LJ = UA9.LJ();
            JSONObject jSONObject = (JSONObject) this.l3;
            UC0.LJJLIIIJJI(jSONObject, uas);
            C77119UOl.LJJII(LJ, uas, jSONObject, this.j9, this.j10);
        }
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject2 = (JSONObject) this.l3;
        UC0.LJJLIIIJJI(jSONObject2, uas);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
        LJIIZILJ.put("msg_id", this.j11);
        C77119UOl.LJJIFFI(LJ2, uas, jSONObject2, "invite_message", LJIIZILJ, this.j9, this.j10);
        UAR.LJ(uas, true, 0L);
    }

    public final void LIZ$1() {
        UAS uas;
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = (U66) this.l2;
        String valueOf = String.valueOf(this.j4);
        U85 u85 = U85.HANDLER;
        UAS LIZJ = LIZLLL.LIZJ(u66, valueOf, u85);
        if (LIZJ == null) {
            uas = UAO.LIZ(UA9.LIZLLL(), (U66) this.l2, String.valueOf(this.j4), String.valueOf(this.j5), u85, null, null, String.valueOf(this.j6), String.valueOf(this.j7), String.valueOf(this.j8), 1, 48);
        } else {
            uas = LIZJ;
        }
        String str = this.s0;
        String str2 = this.s1;
        if (str != null) {
            uas.LIZJ(str);
        }
        if (str2 != null) {
            uas.LIZLLL(str2);
        }
        if (LIZJ == null) {
            C76786UBq LJ = UA9.LJ();
            JSONObject jSONObject = (JSONObject) this.l3;
            UC0.LJJLIIIJJI(jSONObject, uas);
            C77119UOl.LJJII(LJ, uas, jSONObject, this.j9, this.j10);
        }
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject2 = (JSONObject) this.l3;
        UC0.LJJLIIIJJI(jSONObject2, uas);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
        LJIIZILJ.put("msg_id", this.j11);
        C77119UOl.LJJIFFI(LJ2, uas, jSONObject2, "apply_message", LJIIZILJ, this.j9, this.j10);
        UAR.LJ(uas, true, 0L);
    }

    public static final void run$0(ARunnableS0S2200800_13 aRunnableS0S2200800_13) {
        boolean LIZ;
        try {
            aRunnableS0S2200800_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2200800_13 aRunnableS0S2200800_13) {
        boolean LIZ;
        try {
            aRunnableS0S2200800_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2200800_13(U66 u66, long j, long j2, long j3, long j4, long j5, JSONObject jSONObject, long j6, long j7, String str, String str2, long j8, int i) {
        this.$t = i;
        this.l2 = u66;
        this.j4 = j;
        this.j5 = j2;
        this.j6 = j3;
        this.j7 = j4;
        this.j8 = j5;
        this.l3 = jSONObject;
        this.j9 = j6;
        this.j10 = j7;
        this.s0 = str;
        this.s1 = str2;
        this.j11 = j8;
    }
}
