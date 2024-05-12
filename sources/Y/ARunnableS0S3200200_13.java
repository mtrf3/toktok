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
public class ARunnableS0S3200200_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), (U66) this.l3, this.s0, this.s1, U85.APPLICANT, null, null, this.s2, null, null, 0, 944);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.j5, this.j6);
        JSONObject jSONObject2 = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "apply", UC0.LJIIZILJ(7, null, null), this.j5, this.j6);
        UA9.LJJJI(LIZ);
    }

    public final void LIZ$1() {
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), (U66) this.l3, this.s0, this.s1, U85.INVITER, null, null, this.s2, null, null, 0, 944);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.j5, this.j6);
        JSONObject jSONObject2 = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "invite", UC0.LJIIZILJ(7, null, null), this.j5, this.j6);
        UA9.LJJJI(LIZ);
    }

    public final void LIZ$2() {
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), (U66) this.l3, this.s0, this.s1, U85.INVITEE, null, null, this.s2, null, null, 0, 944);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.j5, this.j6);
        JSONObject jSONObject2 = (JSONObject) this.l4;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "join_direct", UC0.LJIIZILJ(7, null, null), this.j5, this.j6);
        UA9.LJJJI(LIZ);
    }

    public static final void run$0(ARunnableS0S3200200_13 aRunnableS0S3200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3200200_13 aRunnableS0S3200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S3200200_13 aRunnableS0S3200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3200200_13(U66 u66, String str, String str2, String str3, JSONObject jSONObject, long j, long j2, int i) {
        this.$t = i;
        this.l3 = u66;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = jSONObject;
        this.j5 = j;
        this.j6 = j2;
    }
}
