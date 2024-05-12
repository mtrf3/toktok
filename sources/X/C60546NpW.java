package X;

import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NpW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60546NpW extends C59314NPq {
    public static String LIZ(android.net.Uri uri, String str) {
        if (uri.isHierarchical()) {
            return UriProtector.getQueryParameter(uri, str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        VMI vmi = VMI.LJ;
        C79605VMb c79605VMb = new C79605VMb("INVALID_QUERY_URI");
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LIZIZ(0);
        vmi.LJIILL(null, c79605VMb.LIZ());
        return "";
    }
}
