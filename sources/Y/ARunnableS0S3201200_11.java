package Y;

import X.C16880lQ;
import X.C64009PAf;
import X.PAX;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS0S3201200_11 implements Runnable {
    public final int $t;
    public int i5;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C64009PAf c64009PAf = (C64009PAf) this.l4;
        long j = this.j6;
        long j2 = this.j7;
        String str = this.s0;
        String str2 = this.s1;
        String str3 = this.s2;
        int i = this.i5;
        JSONObject jSONObject = (JSONObject) this.l3;
        if (C64009PAf.LJIIIIZZ(str, c64009PAf.LJIIJ, c64009PAf.LJIIJJI) || !C16880lQ.LLLLIL(c64009PAf.LIZ)) {
            return;
        }
        JSONObject LJIILJJIL = c64009PAf.LJIILJJIL(i, "api_all", j, str, str2, j2, str3);
        C64009PAf.LJ(LJIILJJIL, jSONObject);
        if ((LJIILJJIL == null || !C64009PAf.LJIIIIZZ(str, c64009PAf.LJIIL, c64009PAf.LJIILIIL)) && c64009PAf.LJIIIZ == 0) {
            return;
        }
        try {
            LJIILJJIL.put("hit_rules", 1);
            c64009PAf.LIZJ(LJIILJJIL);
            PAX.LIZ.LIZIZ(LJIILJJIL, CastLongProtector.parseLong(c64009PAf.LJIJJLI));
        } catch (JSONException unused) {
        }
    }

    public final void LIZ$1() {
        C64009PAf c64009PAf = (C64009PAf) this.l4;
        long j = this.j6;
        long j2 = this.j7;
        String str = this.s0;
        String str2 = this.s1;
        String str3 = this.s2;
        int i = this.i5;
        JSONObject jSONObject = (JSONObject) this.l3;
        if (c64009PAf.LJIIIIZZ == 1 || C64009PAf.LJIIIIZZ(str, c64009PAf.LJIIJ, c64009PAf.LJIIJJI)) {
            return;
        }
        JSONObject LJIILJJIL = c64009PAf.LJIILJJIL(i, "api_error", j, str, str2, j2, str3);
        C64009PAf.LJ(LJIILJJIL, jSONObject);
        if (LJIILJJIL == null || LJIILJJIL.length() <= 0) {
            return;
        }
        c64009PAf.LIZJ(LJIILJJIL);
        PAX.LIZ.LIZIZ(LJIILJJIL, CastLongProtector.parseLong(c64009PAf.LJIJJLI));
    }

    public static final void run$0(ARunnableS0S3201200_11 aRunnableS0S3201200_11) {
        boolean LIZ;
        try {
            aRunnableS0S3201200_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3201200_11 aRunnableS0S3201200_11) {
        boolean LIZ;
        try {
            aRunnableS0S3201200_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3201200_11(C64009PAf c64009PAf, long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject, int i2) {
        this.$t = i2;
        this.l4 = c64009PAf;
        this.j6 = j;
        this.j7 = j2;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.i5 = i;
        this.l3 = jSONObject;
    }
}
