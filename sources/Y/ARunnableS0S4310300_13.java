package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.OSZ;
import X.U66;
import X.U85;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S4310300_13 implements Runnable {
    public final int $t;
    public long j10;
    public long j8;
    public long j9;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z7;

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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, String.valueOf(this.j8), U85.INVITER);
        if (LIZJ != null) {
            long j = this.j9;
            long j2 = this.j10;
            String str = this.s0;
            OSZ osz = (OSZ) this.l5;
            JSONObject jSONObject = (JSONObject) this.l6;
            String str2 = this.s1;
            boolean z = this.z7;
            String str3 = this.s2;
            String str4 = this.s3;
            if (str3 != null) {
                LIZJ.LIZJ(str3);
            }
            if (str4 != null) {
                LIZJ.LIZLLL(str4);
            }
            UAR.LIZIZ(LIZJ, "cancel_invite", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIILLIIL = UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str);
            LJIILLIIL.put("source", str2);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "cancel_invite", LJIILLIIL, j2, j);
            if (((Number) osz.getFirst()).longValue() == 0) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "cancel_invite", str2, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, String.valueOf(this.j8), U85.APPLICANT);
        if (LIZJ != null) {
            long j = this.j9;
            long j2 = this.j10;
            String str = this.s0;
            OSZ osz = (OSZ) this.l5;
            JSONObject jSONObject = (JSONObject) this.l6;
            String str2 = this.s1;
            boolean z = this.z7;
            String str3 = this.s2;
            String str4 = this.s3;
            if (str3 != null) {
                LIZJ.LIZJ(str3);
            }
            if (str4 != null) {
                LIZJ.LIZLLL(str4);
            }
            UAR.LIZIZ(LIZJ, "cancel_apply", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIILLIIL = UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str);
            LJIILLIIL.put("source", str2);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "cancel_apply", LJIILLIIL, j2, j);
            if (((Number) osz.getFirst()).longValue() == 0) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "cancel_apply", str2, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S4310300_13 aRunnableS0S4310300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4310300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4310300_13 aRunnableS0S4310300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4310300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0009: IPUT (r5 I:long), (r0 I:Y.ARunnableS0S4310300_13) (LINE:201326601) Y.ARunnableS0S4310300_13.j9 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000b: IPUT (r7 I:long), (r0 I:Y.ARunnableS0S4310300_13) (LINE:201326603) Y.ARunnableS0S4310300_13.j10 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000d: IPUT (r9 I:java.lang.String), (r0 I:Y.ARunnableS0S4310300_13) (LINE:201326605) Y.ARunnableS0S4310300_13.s0 java.lang.String, block:B:1:0x0000 */
    public ARunnableS0S4310300_13(U66 u66, U66 u662, long j, long j2, long j3, String str, OSZ<Long, String> osz, JSONObject jSONObject, String str2, boolean z, String str3, String str4) {
        long j4;
        long j5;
        String str5;
        this.$t = str4;
        this.l4 = u66;
        this.j8 = u662;
        this.j9 = j4;
        this.j10 = j5;
        this.s0 = str5;
        this.l5 = str;
        this.l6 = osz;
        this.s1 = jSONObject;
        this.z7 = str2;
        this.s2 = z;
        this.s3 = str3;
    }
}
