package X;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCR extends QKR {
    public PCR() {
        super(true, false);
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        Object obj;
        jSONObject.put("os", "Android");
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("os_api", Build.VERSION.SDK_INT);
        String str = Build.BRAND;
        if (str.equals("Pico")) {
            obj = PCK.LIZ();
        } else {
            obj = Build.MODEL;
        }
        jSONObject.put("device_model", obj);
        jSONObject.put("device_brand", str);
        jSONObject.put("device_manufacturer", Build.MANUFACTURER);
        jSONObject.put("cpu_abi", Build.CPU_ABI);
        return true;
    }
}
