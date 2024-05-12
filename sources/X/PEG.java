package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class PEG implements InterfaceC64036PBg {
    public JSONObject LIZ;

    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return "performance_monitor";
    }

    public abstract JSONObject LJ();

    public abstract JSONObject LJFF();

    public abstract JSONObject LJI();

    public abstract String LJII();

    @Override // X.InterfaceC64036PBg
    public final JSONObject LIZ() {
        try {
            if (this.LIZ == null) {
                this.LIZ = LIZLLL();
            }
            this.LIZ.put("log_type", "performance_monitor");
            this.LIZ.put("service", LJII());
            JSONObject LJFF = LJFF();
            if (!C64055PBz.LIZIZ(LJFF)) {
                this.LIZ.put("extra_values", LJFF);
            }
            JSONObject LJ = LJ();
            if (!C64055PBz.LIZIZ(LJ)) {
                this.LIZ.put("extra_status", LJ);
            }
            JSONObject LJI = LJI();
            if (!C64055PBz.LIZIZ(LJI)) {
                this.LIZ.put("filters", LJI);
            }
            return this.LIZ;
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject LIZLLL() {
        return new JSONObject();
    }
}
