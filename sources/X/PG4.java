package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PG4 implements PCW {
    public final /* synthetic */ PG3 LIZ;

    public PG4(PG3 pg3) {
        this.LIZ = pg3;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        PG3 pg3 = this.LIZ;
        pg3.getClass();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("memory")) == null) {
            return;
        }
        long optLong = optJSONObject.optLong("collect_interval", 120L);
        double optDouble = optJSONObject.optDouble("reach_top_memory_rate", 0.8d);
        boolean z2 = true;
        if (optJSONObject.optInt("enable_upload", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (optJSONObject.optInt("close_memory_collect") == 1) {
            z2 = false;
        }
        pg3.LIZ = new PG6(optLong, optDouble, z, z2);
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parsed MemoryConfig=");
            LIZ.append(pg3.LIZ);
            C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ));
        }
        C38467F7v.LIZ.LIZJ(pg3.getConfig());
    }
}
