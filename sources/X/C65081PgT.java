package X;

import android.os.Build;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import java.io.IOException;
import okhttp3.Request;
import org.json.JSONObject;

/* renamed from: X.PgT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65081PgT extends AbstractC66646QDq {
    public final C64600PWy LJ;

    public static C64598PWw LIZLLL(C64587PWl c64587PWl) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", c64587PWl, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-8184576814415083372"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : c64587PWl.execute();
    }

    @Override // X.AbstractC66646QDq
    public final VMZ LIZ() {
        C39745Fin LIZJ = C39745Fin.LIZJ("application/json");
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJJZI("aid", this.LIZIZ.LIZ, jSONObject);
        HybridSettingInitConfig hybridSettingInitConfig = this.LIZIZ;
        String str = hybridSettingInitConfig.LIZ;
        C77123UOp.LJJJJZI("os", hybridSettingInitConfig.LIZJ, jSONObject);
        C77123UOp.LJJJJZI("os_version", this.LIZIZ.LIZLLL, jSONObject);
        this.LIZIZ.getClass();
        C77123UOp.LJJJJZI("install_id", null, jSONObject);
        C77123UOp.LJJJJZI("device_id", this.LIZIZ.LJ, jSONObject);
        C77123UOp.LJJJJZI("channel", this.LIZIZ.LJFF, jSONObject);
        C77123UOp.LJJJJZI("version_code", this.LIZIZ.LJI, jSONObject);
        C77123UOp.LJJJJZI("update_version_code", this.LIZIZ.LJII, jSONObject);
        C77123UOp.LJJJJZI("region", this.LIZIZ.LJIIIIZZ, jSONObject);
        C77123UOp.LJJJJZI("language", this.LIZIZ.LJIIIZ, jSONObject);
        C77123UOp.LJJJJZI("device_model", Build.MODEL, jSONObject);
        C77123UOp.LJJJJZI("sdk_version", "1.5.14-rc.16-oversea", jSONObject);
        C77123UOp.LJJJJZI("device_brand", Build.BRAND, jSONObject);
        PVJ LIZJ2 = PVP.LIZJ(LIZJ, jSONObject.toString());
        C64618PXq c64618PXq = new C64618PXq();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.LIZIZ);
        LIZ.append("/monitor_web/settings/hybrid-settings");
        c64618PXq.LJII(X1D.LIZIZ(LIZ));
        c64618PXq.LJ("POST", LIZJ2);
        c64618PXq.LIZJ.LIZ("Content-Type", "application/json");
        Request LIZIZ = c64618PXq.LIZIZ();
        try {
            C64600PWy c64600PWy = this.LJ;
            c64600PWy.getClass();
            return LIZJ(LIZLLL(C64587PWl.LIZJ(c64600PWy, LIZIZ, false)).LJLJL.string());
        } catch (IOException e) {
            C77117UOj.LJIILLIIL("startup_handle", e);
            return null;
        }
    }

    public C65081PgT(HybridSettingInitConfig hybridSettingInitConfig) {
        super(hybridSettingInitConfig);
        C64600PWy build;
        C64601PWz c64601PWz = new C64601PWz();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-8184576814415083372"));
        if (LIZJ.LIZ) {
            build = (C64600PWy) LIZJ.LIZIZ;
        } else {
            build = c64601PWz.build();
        }
        this.LJ = build;
    }
}
