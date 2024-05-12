package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGF implements PCW {
    public final /* synthetic */ C64153PFt LIZ;

    public PGF(C64153PFt c64153PFt) {
        this.LIZ = c64153PFt;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        JSONObject optJSONObject;
        C64153PFt c64153PFt = this.LIZ;
        c64153PFt.getClass();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("disk")) == null) {
            return;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseConfig:");
            LIZ.append(optJSONObject);
            C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ));
        }
        PGG pgg = new PGG();
        boolean z = false;
        pgg.LIZ = optJSONObject.optBoolean("enable_collect_apm6", false);
        if (optJSONObject.optInt("enable_upload", 0) == 1) {
            z = true;
        }
        pgg.LJIIL = z;
        if (optJSONObject.optInt("dump_threshold") > 0) {
            pgg.LIZIZ = optJSONObject.optInt("dump_threshold") * 1024 * 1024;
        }
        if (optJSONObject.optInt("abnormal_folder_size") > 0) {
            pgg.LIZJ = optJSONObject.optInt("abnormal_folder_size") * 1024 * 1024;
        }
        pgg.LIZLLL = optJSONObject.optInt("abnormal_file_size", 100) * 1024;
        if (optJSONObject.optInt("dump_top_count") > 0) {
            pgg.LJ = optJSONObject.optInt("dump_top_count");
        }
        pgg.LJFF = optJSONObject.optInt("dump_outdated_count", 50);
        pgg.LJI = optJSONObject.optInt("dump_top_file_count", 20);
        pgg.LJII = optJSONObject.optInt("dump_exception_dir_count", 50);
        if (optJSONObject.optInt("outdated_days") > 0) {
            pgg.LJIIIIZZ = optJSONObject.optInt("outdated_days") * 86400000;
        }
        pgg.LJIIIZ = V3N.LJJIIZ("disk_customed_paths", optJSONObject);
        pgg.LJIIJ = V3N.LJJIIJZLJL("ignored_relative_paths", optJSONObject);
        pgg.LJIIJJI = V3N.LJJIIJZLJL("compliance_relative_paths", optJSONObject);
        c64153PFt.LIZ = pgg;
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseConfig:");
            LIZ2.append(optJSONObject);
            C64028PAy.LIZ("APM-Disk", X1D.LIZIZ(LIZ2));
        }
        PGE.LJ.LIZIZ(c64153PFt.LIZ);
    }
}
