package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.UA9;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S2200200_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
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
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l2, this.s0, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = (JSONObject) this.l3;
            long j = this.j4;
            long j2 = this.j5;
            String str = this.s1;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("source", str);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "kick_out_all", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$1() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l2, this.s0, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = (JSONObject) this.l3;
            long j = this.j4;
            long j2 = this.j5;
            String str = this.s1;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("source", str);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "kick_out", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S2200200_13 aRunnableS0S2200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S2200200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2200200_13 aRunnableS0S2200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S2200200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2200200_13(U66 u66, String str, JSONObject jSONObject, long j, long j2, String str2, int i) {
        this.$t = i;
        this.l2 = u66;
        this.s0 = str;
        this.l3 = jSONObject;
        this.j4 = j;
        this.j5 = j2;
        this.s1 = str2;
    }
}
