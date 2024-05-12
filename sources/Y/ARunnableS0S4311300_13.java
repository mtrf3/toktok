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
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitStatus;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyStatus;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S4311300_13 implements Runnable {
    public final int $t;
    public int i8;
    public long j10;
    public long j11;
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
        int i;
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, String.valueOf(this.j9), U85.HANDLER);
        if (LIZJ != null) {
            OSZ osz = (OSZ) this.l5;
            int i2 = this.i8;
            long j = this.j10;
            long j2 = this.j11;
            String str = this.s0;
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
            if (((Number) osz.getFirst()).longValue() == 0 && i2 == 1) {
                LIZJ.LJIILJJIL = true;
                LIZJ.LJIJ = j;
            }
            UAR.LIZIZ(LIZJ, "permit", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIILLIIL = UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str);
            LJIILLIIL.put("permit_status", PermitStatus.Companion.stateToString(i2));
            LJIILLIIL.put("source", str2);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "permit", LJIILLIIL, j2, j);
            if (((Number) osz.getFirst()).longValue() == 0) {
                i = 1;
                if (i2 == 1) {
                    UAR.LIZLLL(LIZJ);
                }
            } else {
                i = 1;
            }
            if (((Number) osz.getFirst()).longValue() == 0 && i2 != i) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, i);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "permit", str2, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public final void LIZ$1() {
        int i;
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l4, String.valueOf(this.j9), U85.INVITEE);
        if (LIZJ != null) {
            OSZ osz = (OSZ) this.l5;
            int i2 = this.i8;
            long j = this.j10;
            long j2 = this.j11;
            String str = this.s0;
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
            if (((Number) osz.getFirst()).longValue() == 0 && i2 == 1) {
                LIZJ.LJIIZILJ = true;
                LIZJ.LJIJ = j;
            }
            UAR.LIZIZ(LIZJ, "reply_invite", j - j2, str, ((Number) osz.getFirst()).longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIILLIIL = UC0.LJIILLIIL((Long) osz.getFirst(), (String) osz.getSecond(), str);
            LJIILLIIL.put("reply_status", ReplyStatus.Companion.replyStatusToString(i2));
            LJIILLIIL.put("source", str2);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "reply_invite", LJIILLIIL, j2, j);
            if (((Number) osz.getFirst()).longValue() == 0) {
                i = 1;
                if (i2 == 1) {
                    UAR.LIZLLL(LIZJ);
                }
            } else {
                i = 1;
            }
            if (((Number) osz.getFirst()).longValue() == 0 && i2 != i) {
                C77119UOl.LJJ(UA9.LJ(), LIZJ, i);
                UAR.LJFF(((Number) osz.getFirst()).longValue(), j, LIZJ, "reply_invite", str2, z);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
        }
    }

    public static final void run$0(ARunnableS0S4311300_13 aRunnableS0S4311300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4311300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4311300_13 aRunnableS0S4311300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4311300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x000f: IPUT (r10 I:long), (r0 I:Y.ARunnableS0S4311300_13) (LINE:218103823) Y.ARunnableS0S4311300_13.j11 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0011: IPUT (r12 I:java.lang.String), (r0 I:Y.ARunnableS0S4311300_13) (LINE:218103825) Y.ARunnableS0S4311300_13.s0 java.lang.String, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:java.lang.Object), (r0 I:Y.ARunnableS0S4311300_13) (LINE:218103817) Y.ARunnableS0S4311300_13.l5 java.lang.Object, block:B:1:0x0000 */
    public ARunnableS0S4311300_13(U66 u66, U66 u662, long j, OSZ<Long, String> osz, int i, long j2, long j3, String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4) {
        Object obj;
        long j4;
        String str5;
        this.$t = str4;
        this.l4 = u66;
        this.j9 = u662;
        this.l5 = obj;
        this.i8 = osz;
        this.j10 = i;
        this.j11 = j4;
        this.s0 = str5;
        this.l6 = str;
        this.s1 = jSONObject;
        this.z7 = str2;
        this.s2 = z;
        this.s3 = str3;
    }
}
