package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.OSZ;
import X.RunnableC76748UAe;
import X.U66;
import X.U85;
import X.UA9;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S3200300_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public long j7;
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

    public final void LIZ$1() {
        UA9.LJFF().LIZIZ(new RunnableC76748UAe((U66) this.l3, this.j5, this.j6, this.j7, this.s0, (OSZ) this.l4, UC0.LJIJI((U66) this.l3), this.s1, this.s2));
    }

    public final void LIZ$0() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l3, String.valueOf(this.j5), U85.INVITER);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l4;
            long j = this.j6;
            long j2 = this.j7;
            String str = this.s0;
            String str2 = this.s1;
            String str3 = this.s2;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("source", str3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_invite", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$2() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l3, String.valueOf(this.j5), U85.APPLICANT);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l4;
            long j = this.j6;
            long j2 = this.j7;
            String str = this.s0;
            String str2 = this.s1;
            String str3 = this.s2;
            if (str != null) {
                LIZJ.LIZJ(str);
            }
            if (str2 != null) {
                LIZJ.LIZLLL(str2);
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("source", str3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_apply", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S3200300_13 aRunnableS0S3200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3200300_13 aRunnableS0S3200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S3200300_13 aRunnableS0S3200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S3200300_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3200300_13(long j, long j2, long j3, Object obj, String str, String str2, String str3, Object obj2, int i) {
        this.$t = i;
        this.l3 = obj;
        this.j5 = j;
        this.j6 = j2;
        this.j7 = j3;
        this.s0 = str;
        this.l4 = obj2;
        this.s1 = str2;
        this.s2 = str3;
    }
}
