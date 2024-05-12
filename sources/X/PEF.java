package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEF implements InterfaceC64090PDi {
    public String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "performance_monitor";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        try {
            if (this.LJI == null) {
                this.LJI = new JSONObject();
            }
            this.LJI.put("log_type", "performance_monitor");
            this.LJI.put("service", this.LIZ);
            if (!C43001GuD.LJIILIIL(this.LIZLLL)) {
                this.LJI.put("extra_values", this.LIZLLL);
            }
            if (TextUtils.equals("start", this.LIZ) && TextUtils.equals("from", this.LJI.optString("monitor-plugin"))) {
                if (this.LJ == null) {
                    this.LJ = new JSONObject();
                }
                this.LJ.put("start_mode", C09970aH.LJIIJ);
            }
            if (!C43001GuD.LJIILIIL(this.LJ)) {
                this.LJI.put("extra_status", this.LJ);
            }
            if (!C43001GuD.LJIILIIL(this.LJFF)) {
                this.LJI.put("filters", this.LJFF);
            }
            return this.LJI;
        } catch (JSONException unused) {
            return null;
        }
    }

    public PEF() {
    }

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return this.LIZ;
    }

    public PEF(JSONObject jSONObject) {
        this("thread", "", null, null, jSONObject, 0);
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        boolean LIZIZ;
        JSONObject optJSONObject;
        if ("fps".equals(this.LIZ) || "fps_drop".equals(this.LIZ)) {
            LIZIZ = C64099PDr.LIZIZ(this.LIZ, this.LIZIZ);
        } else if ("temperature".equals(this.LIZ)) {
            LIZIZ = C64099PDr.LIZJ(this.LIZ);
        } else {
            if (!"battery".equals(this.LIZ)) {
                if ("start".equals(this.LIZ)) {
                    if (!C64099PDr.LIZ(this.LIZ)) {
                        if (!C64099PDr.LIZ.LJIIZILJ(this.LIZIZ)) {
                            LIZIZ = false;
                        }
                    }
                } else if ("start_trace".equals(this.LIZ)) {
                    if (jSONObject != null) {
                        if (!C64099PDr.LIZJ("enable_perf_data_collect")) {
                            jSONObject.remove("perf_data");
                        }
                        if (!C64099PDr.LIZ(this.LIZ) && (optJSONObject = jSONObject.optJSONObject("trace")) != null) {
                            optJSONObject.remove("spans");
                        }
                    }
                    LIZIZ = C64099PDr.LIZ(this.LIZ);
                } else if ("traffic".equals(this.LIZ)) {
                    if (jSONObject != null && jSONObject.optBoolean("exception", false)) {
                        LIZIZ = C64099PDr.LIZJ("enable_exception_upload");
                    } else {
                        LIZIZ = C64099PDr.LIZ(this.LIZ);
                    }
                } else {
                    LIZIZ = C64099PDr.LIZ(this.LIZ);
                }
            }
            LIZIZ = true;
        }
        if (this.LIZJ || LIZIZ) {
            return true;
        }
        return false;
    }

    public PEF(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, jSONObject, jSONObject2, jSONObject3, 0);
    }

    public PEF(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = false;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJI = jSONObject3;
    }
}
