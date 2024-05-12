package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEE implements InterfaceC64090PDi {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject != null) {
            try {
                jSONObject.put("timestamp", this.LIZLLL);
                this.LIZIZ.put("crash_time", this.LIZLLL);
                this.LIZIZ.put("is_main_process", C09970aH.LJIIIIZZ());
                this.LIZIZ.put("process_name", C09970aH.LIZIZ());
                this.LIZIZ.put("log_type", this.LIZ);
            } catch (JSONException unused) {
            }
            if (C09970aH.LJIILIIL <= C09970aH.LJFF()) {
                long j = C09970aH.LJIILIIL;
                if (j != 0) {
                    this.LIZIZ.put("app_launch_start_time", j);
                    return this.LIZIZ;
                }
            }
            this.LIZIZ.put("app_launch_start_time", C09970aH.LJFF());
            return this.LIZIZ;
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExceptionLogData{eventType='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", logJson=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", forceSampled=");
        LIZ.append(this.LIZJ);
        LIZ.append(", time=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        if (this.LIZJ || C64099PDr.LIZJ(this.LIZ)) {
            return true;
        }
        return false;
    }

    public PEE(String str, JSONObject jSONObject) {
        this(str, System.currentTimeMillis(), jSONObject);
    }

    public PEE(String str, long j, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
        this.LIZLLL = j;
    }
}
