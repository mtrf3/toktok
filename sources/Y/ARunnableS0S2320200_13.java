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
public class ARunnableS0S2320200_13 implements Runnable {
    public final int $t;
    public long j7;
    public long j8;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public boolean z5;
    public boolean z6;

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
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l2, this.s0, U85.INVITER);
        if (LIZJ != null) {
            long j = this.j7;
            long j2 = this.j8;
            String str = this.s1;
            OSZ osz = (OSZ) this.l3;
            JSONObject jSONObject = (JSONObject) this.l4;
            boolean z = this.z5;
            boolean z2 = this.z6;
            UAR.LIZIZ(LIZJ, "cancel_invite", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "cancel_invite", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str), j2, j);
            if (z) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "cancel_invite", null, z2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l2, this.s0, U85.APPLICANT);
        if (LIZJ != null) {
            long j = this.j7;
            long j2 = this.j8;
            String str = this.s1;
            OSZ osz = (OSZ) this.l3;
            JSONObject jSONObject = (JSONObject) this.l4;
            boolean z = this.z5;
            boolean z2 = this.z6;
            UAR.LIZIZ(LIZJ, "cancel_apply", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "cancel_apply", UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str), j2, j);
            if (z) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "cancel_apply", null, z2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S2320200_13 aRunnableS0S2320200_13) {
        boolean LIZ;
        try {
            aRunnableS0S2320200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2320200_13 aRunnableS0S2320200_13) {
        boolean LIZ;
        try {
            aRunnableS0S2320200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:long), (r0 I:Y.ARunnableS0S2320200_13) (LINE:167772169) Y.ARunnableS0S2320200_13.j8 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.String), (r0 I:Y.ARunnableS0S2320200_13) (LINE:167772171) Y.ARunnableS0S2320200_13.s1 java.lang.String, block:B:1:0x0000 */
    public ARunnableS0S2320200_13(U66 u66, U66 u662, String str, long j, long j2, String str2, OSZ<Long, String> osz, JSONObject jSONObject, boolean z, boolean z2) {
        long j3;
        String str3;
        this.$t = z2 ? 1 : 0;
        this.l2 = u66;
        this.s0 = u662;
        this.j7 = str;
        this.j8 = j3;
        this.s1 = str3;
        this.l3 = str2;
        this.l4 = osz;
        this.z5 = jSONObject;
        this.z6 = z;
    }
}
