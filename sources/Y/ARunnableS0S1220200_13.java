package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.U94;
import X.UA9;
import X.UAR;
import X.UAS;
import X.UC0;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes14.dex */
public class ARunnableS0S1220200_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

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
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, null);
        if (LIZIZ != null) {
            U66 u66 = (U66) this.l1;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j5;
            long j2 = this.j6;
            String str = this.s0;
            boolean z = this.z3;
            boolean z2 = this.z4;
            String LLZLL = u66.LLZLL();
            if (LLZLL != null && !s.LJJJLZIJ(LIZIZ.LIZ, "_", false) && LLZLL.length() > 0) {
                LIZIZ.LIZJ(LLZLL);
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("remote_linkmic_id", str);
            if (z) {
                LJIIZILJ.put("has_bluetooth_connect_permission", z2);
            }
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "first_remote_audio", LJIIZILJ, j, j2);
            if (UC0.LJIILIIL(u66.getScene()) == U94.MULTI_GUEST && !LIZIZ.LJII) {
                C77119UOl.LJJ(UA9.LJ(), LIZIZ, 1);
                LIZIZ.LJII = true;
                LIZIZ.LJIJJ = j;
                UAR.LIZJ(LIZIZ);
                C76786UBq LJ2 = UA9.LJ();
                UC0.LJJLIIIJJI(jSONObject, LIZIZ);
                C77119UOl.LJJII(LJ2, LIZIZ, jSONObject, j, j2);
                UC0.LJJLIIIJJI(jSONObject, LIZIZ);
                JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ2.put("remote_linkmic_id", str);
                if (z) {
                    LJIIZILJ2.put("has_bluetooth_connect_permission", z2);
                }
                C77119UOl.LJJIFFI(LJ2, LIZIZ, jSONObject, "first_remote_audio", LJIIZILJ2, j, j2);
            }
        }
    }

    public final void LIZ$1() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, null);
        if (LIZIZ != null) {
            U66 u66 = (U66) this.l1;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j5;
            long j2 = this.j6;
            String str = this.s0;
            boolean z = this.z3;
            boolean z2 = this.z4;
            String LLZLL = u66.LLZLL();
            if (LLZLL != null && !s.LJJJLZIJ(LIZIZ.LIZ, "_", false) && LLZLL.length() > 0) {
                LIZIZ.LIZJ(LLZLL);
            }
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("remote_linkmic_id", str);
            if (z) {
                LJIIZILJ.put("has_bluetooth_connect_permission", z2);
            }
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "first_remote_video_frame_render", LJIIZILJ, j, j2);
            if (!LIZIZ.LJII) {
                C77119UOl.LJJ(UA9.LJ(), LIZIZ, 1);
                LIZIZ.LJII = true;
                LIZIZ.LJIJJ = j;
                UAR.LIZJ(LIZIZ);
                C76786UBq LJ2 = UA9.LJ();
                UC0.LJJLIIIJJI(jSONObject, LIZIZ);
                C77119UOl.LJJII(LJ2, LIZIZ, jSONObject, j, j2);
                UC0.LJJLIIIJJI(jSONObject, LIZIZ);
                JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
                if (z) {
                    LJIIZILJ2.put("has_bluetooth_connect_permission", z2);
                }
                C77119UOl.LJJIFFI(LJ2, LIZIZ, jSONObject, "first_remote_video_frame_render", LJIIZILJ2, j, j2);
            }
        }
    }

    public static final void run$0(ARunnableS0S1220200_13 aRunnableS0S1220200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1220200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1220200_13 aRunnableS0S1220200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1220200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1220200_13(U66 u66, String str, JSONObject jSONObject, long j, long j2, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l1 = u66;
        this.s0 = str;
        this.l2 = jSONObject;
        this.j5 = j;
        this.j6 = j2;
        this.z3 = z;
        this.z4 = z2;
    }
}
