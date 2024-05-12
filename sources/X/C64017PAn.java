package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PAn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64017PAn {
    public static C64009PAf LIZ() {
        try {
            return SDKMonitorUtils.LIZIZ("1357");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static void LIZIZ(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128).versionName);
            } catch (PackageManager.NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:15.0.0.74");
            }
            jSONObject.put("ve_version", "15.0.0.74");
            jSONObject.put("effect_version", "15.0.0_rel_1_mt_202309080724_1f73e5ecb5");
            jSONObject.put("model", Build.MODEL);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("15.0.0.74");
            LIZ.append("-");
            LIZ.append("mt");
            jSONObject.put("channel", X1D.LIZIZ(LIZ));
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SDKMonitorUtils.LIZJ(context, "1357", jSONObject, new C64019PAp());
    }
}
