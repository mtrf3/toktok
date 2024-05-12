package X;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J9R {
    public static final String LIZ;

    static {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pf", "android");
            jSONObject.put("osv", Build.VERSION.RELEASE + ";" + Build.VERSION.SDK_INT);
            jSONObject.put("bd", Build.BRAND);
            jSONObject.put("mf", Build.MANUFACTURER);
            jSONObject.put("md", Build.MODEL);
            LIZ = jSONObject.toString();
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("{\"pf\":\"android\",\"osv\":\"");
            sb.append(Build.VERSION.RELEASE);
            sb.append(";");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\",\"bd\":\"");
            sb.append(Build.BRAND);
            sb.append("\",\"mf\":\"");
            sb.append(Build.MANUFACTURER);
            sb.append("\",\"md\":\"");
            LIZ = AnonymousClass073.LIZIZ(sb, Build.MODEL, "\"}");
        }
    }
}
