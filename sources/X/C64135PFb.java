package X;

import org.json.JSONObject;

/* renamed from: X.PFb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64135PFb implements PCW {
    public final /* synthetic */ C64136PFc LIZ;

    public C64135PFb(C64136PFc c64136PFc) {
        this.LIZ = c64136PFc;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        C64136PFc c64136PFc = this.LIZ;
        c64136PFc.getClass();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseConfig:");
            LIZ.append(optJSONObject2);
            C64028PAy.LIZ("APM-FD", X1D.LIZIZ(LIZ));
        }
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("fd")) == null) {
            return;
        }
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseConfig:");
            LIZ2.append(optJSONObject);
            C64028PAy.LIZ("APM-FD", X1D.LIZIZ(LIZ2));
        }
        if (optJSONObject.optInt("enable_upload", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        long optInt = optJSONObject.optInt("fd_count_threshold", 800);
        long optLong = optJSONObject.optLong("collect_interval", 10L) * 60000;
        if (optLong < 10) {
            optLong = 600000;
        }
        C64134PFa c64134PFa = new C64134PFa(optInt, optLong, z);
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("parseConfig:");
            LIZ3.append(c64134PFa);
            C64028PAy.LIZ("APM-FD", X1D.LIZIZ(LIZ3));
        }
        c64136PFc.LIZ = c64134PFa;
        PFX.LJI.LIZIZ(c64134PFa);
    }
}
