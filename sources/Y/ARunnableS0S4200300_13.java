package Y;

import X.C76786UBq;
import X.C77119UOl;
import X.CN1;
import X.OSZ;
import X.RunnableC76747UAd;
import X.U66;
import X.U7T;
import X.U85;
import X.UA9;
import X.UAO;
import X.UAR;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S4200300_13 implements Runnable {
    public final int $t;
    public long j6;
    public long j7;
    public long j8;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        UA9.LJFF().LIZIZ(new ARunnableS0S4310300_13((U66) this.l4, this.j6, this.j7, this.j8, this.s0, (OSZ) this.l5, UC0.LJIJI((U66) this.l4), this.s1, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.s2, this.s3, 0));
    }

    public final void LIZ$2() {
        UA9.LJFF().LIZIZ(new RunnableC76747UAd((U66) this.l4, this.j6, this.j7, this.j8, this.s0, (OSZ) this.l5, UC0.LJIJI((U66) this.l4), this.s1, this.s2, this.s3));
    }

    public final void LIZ$3() {
        UA9.LJFF().LIZIZ(new ARunnableS0S4310300_13((U66) this.l4, this.j6, this.j7, this.j8, this.s0, (OSZ) this.l5, UC0.LJIJI((U66) this.l4), this.s1, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.s2, this.s3, 1));
    }

    public final void LIZ$1() {
        UAS LIZ = UAO.LIZ(UA9.LIZLLL(), (U66) this.l4, this.s0, this.s1, U85.HANDLER, this.s2, null, this.s3, null, null, 0, 928);
        C76786UBq LJ = UA9.LJ();
        JSONObject jSONObject = (JSONObject) this.l5;
        UC0.LJJLIIIJJI(jSONObject, LIZ);
        C77119UOl.LJJII(LJ, LIZ, jSONObject, this.j6, this.j7);
        JSONObject jSONObject2 = (JSONObject) this.l5;
        UC0.LJJLIIIJJI(jSONObject2, LIZ);
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ.put("msg_id", this.j8);
        C77119UOl.LJJIFFI(LJ, LIZ, jSONObject2, "apply_message", LJIIZILJ, this.j6, this.j7);
        UA9.LJJJI(LIZ);
        UAR.LJ(LIZ, true, 0L);
    }

    public static final void run$0(ARunnableS0S4200300_13 aRunnableS0S4200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4200300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S4200300_13 aRunnableS0S4200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4200300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S4200300_13 aRunnableS0S4200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4200300_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S4200300_13 aRunnableS0S4200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S4200300_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S4200300_13(long j, long j2, long j3, U7T u7t, String str, String str2, String str3, OSZ osz, int i) {
        this.$t = i;
        this.l4 = u7t;
        this.j6 = j;
        this.j7 = j2;
        this.j8 = j3;
        this.s0 = str;
        this.l5 = osz;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = null;
    }

    public ARunnableS0S4200300_13(long j, long j2, long j3, Object obj, String str, String str2, String str3, String str4, Object obj2, int i) {
        this.$t = i;
        this.l4 = obj;
        this.j6 = j;
        this.j7 = j2;
        this.j8 = j3;
        this.s0 = str;
        this.l5 = obj2;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
