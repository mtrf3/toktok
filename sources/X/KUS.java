package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KUS implements KUU {
    public static final /* synthetic */ int LJII = 0;
    public final C73305Spp LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI;

    public final JSONObject LIZ() {
        Boolean bool;
        JSONObject jSONObject = new JSONObject();
        SY4 sy4 = (SY4) this.LIZ.LIZ(R.id.b1h);
        if (sy4 != null) {
            boolean z = sy4.LLII;
            sy4.LLII = false;
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            jSONObject.put("retry_method", "click_retry_button");
        } else {
            jSONObject.put("retry_method", "tap_to_retry");
        }
        long j = this.LIZJ - this.LIZLLL;
        this.LJ += j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = currentTimeMillis;
        jSONObject.put("retry_duration", currentTimeMillis - this.LIZJ).put("retry_wait", j);
        return jSONObject;
    }

    public final void LIZJ() {
        long j = 0;
        if (this.LJFF > 0) {
            try {
                JSONObject put = new JSONObject().put("retry_result", 0).put("retry_time_count", this.LIZIZ).put("stay_duration", System.currentTimeMillis() - this.LJFF);
                int i = this.LIZIZ;
                if (i != 0) {
                    j = this.LJ / i;
                }
                JSONObject put2 = put.put("retry_wait_avg", j);
                o.LJIIIIZZ(put2, "JSONObject()\n           …                        )");
                LIZIZ("prf_leave_network_error_page", put2);
            } catch (Exception unused) {
            }
        }
        LJ();
    }

    public final void LJ() {
        C73305Spp c73305Spp = this.LIZ;
        c73305Spp.getClass();
        c73305Spp.LJLLLL = KUT.LIZ;
        this.LIZIZ = 0;
        SY4 sy4 = (SY4) this.LIZ.LIZ(R.id.b1h);
        if (sy4 != null) {
            sy4.LLII = false;
        }
        this.LIZJ = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LIZLLL = 0L;
    }

    public KUS(C73305Spp view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LJI = C12460eI.LJFF();
    }

    public final void LIZLLL(boolean z) {
        long j = 0;
        try {
            if (z) {
                if (this.LJFF > 0) {
                    JSONObject put = LIZ().put("retry_result", 1);
                    o.LJIIIIZZ(put, "collectRetryMonitorParam…  .put(\"retry_result\", 1)");
                    LIZIZ("prf_network_error_page_retry", put);
                    JSONObject put2 = new JSONObject().put("retry_result", 1).put("retry_time_count", this.LIZIZ).put("stay_duration", System.currentTimeMillis() - this.LJFF);
                    int i = this.LIZIZ;
                    if (i != 0) {
                        j = this.LJ / i;
                    }
                    JSONObject put3 = put2.put("retry_wait_avg", j);
                    o.LJIIIIZZ(put3, "JSONObject()\n           …                        )");
                    LIZIZ("prf_leave_network_error_page", put3);
                    LJ();
                    return;
                }
                return;
            }
            if (this.LJFF > 0) {
                JSONObject put4 = LIZ().put("retry_result", 0);
                o.LJIIIIZZ(put4, "collectRetryMonitorParam…  .put(\"retry_result\", 0)");
                LIZIZ("prf_network_error_page_retry", put4);
            } else {
                LJ();
                long currentTimeMillis = System.currentTimeMillis();
                this.LJFF = currentTimeMillis;
                this.LIZLLL = currentTimeMillis;
                LIZIZ("prf_enter_network_error_page", new JSONObject());
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        if (this.LJI == null) {
            this.LJI = C12460eI.LJFF();
        }
        C208318Fn.LIZ(this.LIZ.getContext(), str, this.LJI, jSONObject);
    }
}
