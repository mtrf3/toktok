package Y;

import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U85;
import X.UA9;
import X.UAS;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1200200_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j3;
            long j2 = this.j4;
            String str = this.s0;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("remote_linkmic_id", str);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "first_remote_video_frame", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, this.s0, U85.APPLICANT);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j3;
            long j2 = this.j4;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_apply", UC0.LJIIZILJ(7, null, null), j, j2);
        }
    }

    public static final void run$0(ARunnableS0S1200200_13 aRunnableS0S1200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1200200_13 aRunnableS0S1200200_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S1200200_13.l1);
            C76762UAs c76762UAs = (C76762UAs) aRunnableS0S1200200_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1300200_13(aRunnableS0S1200200_13.j3, aRunnableS0S1200200_13.j4, (U66) aRunnableS0S1200200_13.l1, c76762UAs, aRunnableS0S1200200_13.s0, LJIJI, 4));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1200200_13 aRunnableS0S1200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1200200_13(Object obj, String str, Object obj2, long j, long j2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.j3 = j;
        this.j4 = j2;
    }
}
