package X;

import com.google.android.gms.common.ConnectionResult;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IUW implements IUX {
    public static final void LIZ(int i, String str, String str2) {
        if (IZ8.LJIIIZ()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("video_cache_error_code", i);
            if (str.length() > 1500) {
                str = str.substring(0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            }
            jSONObject.put("video_cache_msg", str);
            jSONObject.put("video_cache_use_ttnet", C47455Ijr.LJIIIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append(jSONObject.toString());
            C46474ILu.LIZ(str2, X1D.LIZIZ(LIZ));
            C46982IcE.LJI().monitorCommonLog("video_cache_error_report", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
