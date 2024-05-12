package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAO;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3200700_13 implements Runnable {
    public final int $t;
    public long j10;
    public long j11;
    public long j5;
    public long j6;
    public long j7;
    public long j8;
    public long j9;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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
        U66 u66 = (U66) this.l3;
        String valueOf = String.valueOf(this.j5);
        U85 u85 = U85.INVITER;
        UAS LIZJ = LIZLLL.LIZJ(u66, valueOf, u85);
        if (LIZJ == null) {
            uas = UAO.LIZ(UA9.LIZLLL(), (U66) this.l3, String.valueOf(this.j5), String.valueOf(this.j6), u85, null, null, String.valueOf(this.j7), String.valueOf(this.j8), String.valueOf(this.j9), 1, 48);
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
            JSONObject jSONObject = (JSONObject) this.l4;
            UC0.LJJLIIIJJI(jSONObject, uas);
            C77119UOl.LJJII(LJ, uas, jSONObject, this.j10, this.j11);
        }
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject2 = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject2, uas);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
        LJIIZILJ.put("source", this.s2);
        C77119UOl.LJJIFFI(LJ2, uas, jSONObject2, "invite", LJIIZILJ, this.j10, this.j11);
    }

    public final void LIZ$1() {
        UAS uas;
        UAO LIZLLL = UA9.LIZLLL();
        U66 u66 = (U66) this.l3;
        String valueOf = String.valueOf(this.j5);
        U85 u85 = U85.APPLICANT;
        UAS LIZJ = LIZLLL.LIZJ(u66, valueOf, u85);
        if (LIZJ == null) {
            uas = UAO.LIZ(UA9.LIZLLL(), (U66) this.l3, String.valueOf(this.j5), String.valueOf(this.j6), u85, null, null, String.valueOf(this.j7), String.valueOf(this.j8), String.valueOf(this.j9), 1, 48);
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
            JSONObject jSONObject = (JSONObject) this.l4;
            UC0.LJJLIIIJJI(jSONObject, uas);
            C77119UOl.LJJII(LJ, uas, jSONObject, this.j10, this.j11);
        }
        C76786UBq LJ2 = UA9.LJ();
        JSONObject jSONObject2 = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject2, uas);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
        LJIIZILJ.put("source", this.s2);
        C77119UOl.LJJIFFI(LJ2, uas, jSONObject2, "apply", LJIIZILJ, this.j10, this.j11);
    }

    public static final void run$0(ARunnableS0S3200700_13 aRunnableS0S3200700_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200700_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3200700_13 aRunnableS0S3200700_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200700_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3200700_13(U66 u66, long j, long j2, long j3, long j4, long j5, JSONObject jSONObject, long j6, long j7, String str, String str2, String str3, int i) {
        this.$t = i;
        this.l3 = u66;
        this.j5 = j;
        this.j6 = j2;
        this.j7 = j3;
        this.j8 = j4;
        this.j9 = j5;
        this.l4 = jSONObject;
        this.j10 = j6;
        this.j11 = j7;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
