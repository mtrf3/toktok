package Y;

import X.C2NU;
import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.CN1;
import X.OSZ;
import X.U66;
import X.UAG;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1310300_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
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
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new UAG(c76762UAs, (U66) this.l1, this.j5, this.j6, LJIJI, (OSZ) this.l3, this.s0, this.z4, z, currentTimeMillis, this.j7));
    }

    public final void LIZ$1() {
        UAS LIZIZ = ((C76762UAs) this.l1).LIZIZ.LIZIZ((U66) this.l2, this.s0, null);
        if (LIZIZ != null) {
            String str = this.s0;
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject = (JSONObject) this.l3;
            long j = this.j5;
            long j2 = this.j6;
            long j3 = this.j7;
            U66 u66 = (U66) this.l2;
            boolean z = this.z4;
            if (!o.LJ(LIZIZ.LIZ, str)) {
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ.put("reason", j3);
                C77119UOl.LJJIFFI(c76786UBq, LIZIZ, jSONObject, "rtc_user_leaved", LJIIZILJ, j, j2);
                C77119UOl.LJJ(c76786UBq, LIZIZ, 2);
                UC0.LJJJJLI("rtc_user_leaved", String.valueOf(j3), 0L, c76762UAs.LIZIZ.LIZLLL(u66), j, z);
                c76762UAs.LIZIZ.LJFF(LIZIZ.LIZIZ());
            }
        }
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs2 = (C76762UAs) this.l1;
            JSONObject jSONObject2 = (JSONObject) this.l3;
            long j4 = this.j5;
            long j5 = this.j6;
            long j6 = this.j7;
            C76786UBq c76786UBq2 = c76762UAs2.LIZJ;
            JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ2.put("reason", j6);
            C77119UOl.LJJI(c76786UBq2, LIZ, jSONObject2, "rtc_user_leaved", LJIIZILJ2, j4, j5);
        }
    }

    public static final void run$0(ARunnableS0S1310300_13 aRunnableS0S1310300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1310300_13 aRunnableS0S1310300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1310300_13(Object obj, Object obj2, long j, long j2, Object obj3, String str, boolean z, long j3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.j5 = j;
        this.j6 = j2;
        this.l3 = obj3;
        this.s0 = str;
        this.z4 = z;
        this.j7 = j3;
    }
}
