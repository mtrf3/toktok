package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.IoQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47738IoQ implements InterfaceC47747IoZ {
    public final WeakReference<C47736IoO> LIZ;
    public final /* synthetic */ C47736IoO LIZIZ;

    public C47738IoQ(C47736IoO c47736IoO, C47736IoO c47736IoO2) {
        this.LIZIZ = c47736IoO;
        this.LIZ = new WeakReference<>(c47736IoO2);
    }

    public final void LIZ(int i, String str, String str2, String str3, JSONObject jSONObject) {
        C47736IoO c47736IoO = this.LIZ.get();
        if (c47736IoO == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh settings: code ");
        LIZ.append(i);
        LIZ.append(", message = ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (i != 0) {
            UC7.LIZLLL("refresh data fail. code = ", i);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("general_settings");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("config_version");
            C47739IoR c47739IoR = c47736IoO.LIZLLL;
            if (optLong < 1) {
                c47739IoR.getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("set config version fail. version = ");
                LIZ2.append(optLong);
                X1D.LIZIZ(LIZ2);
            } else {
                c47739IoR.LIZJ = optLong;
            }
            C47737IoP c47737IoP = this.LIZIZ.LJ.get("common");
            c47737IoP.LJ("config_version", optLong);
            int optInt = optJSONObject.optInt("fetch_interval");
            if (optInt > 0 && optInt != c47737IoP.LIZ("fetch_interval", -1)) {
                c47737IoP.LIZLLL("fetch_interval", optInt);
                c47736IoO.LIZLLL.getClass();
                this.LIZIZ.LIZJ(optInt);
            }
            long optLong2 = optJSONObject.optLong("local_cache_expire");
            if (optLong2 > 0) {
                c47737IoP.LJ("local_cache_expire", (optLong2 * 1000) + System.currentTimeMillis());
            }
            boolean optBoolean = optJSONObject.optBoolean("use_local_cache");
            c47737IoP.LIZLLL("use_local_cache", optBoolean ? 1 : 0);
            if (!optBoolean) {
                this.LIZIZ.LJ.get("vod").LJFF();
                this.LIZIZ.LJ.get("mdl").LJFF();
                this.LIZIZ.LJ.get("upload").LJFF();
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_settings");
        if (optJSONObject2 != null) {
            if (str2 != null && !str2.equals("all")) {
                this.LIZIZ.LIZLLL(str2, str3, optJSONObject2.optJSONObject(str2));
                return;
            }
            this.LIZIZ.LIZLLL("vod", str3, optJSONObject2.optJSONObject("vod"));
            this.LIZIZ.LIZLLL("mdl", str3, optJSONObject2.optJSONObject("mdl"));
            this.LIZIZ.LIZLLL("upload", str3, optJSONObject2.optJSONObject("upload"));
        }
    }
}
