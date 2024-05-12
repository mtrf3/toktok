package X;

import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONObject;

/* renamed from: X.3EA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EA {
    public static final void LIZ(String str) {
        String queryParameter;
        if (str == null) {
            return;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : queryParameterNames) {
                    if (str2 != null && (queryParameter = UriProtector.getQueryParameter(parse, str2)) != null) {
                        jSONObject.put(str2, queryParameter);
                    }
                }
                if (jSONObject.length() <= 0) {
                    return;
                }
                C40515FvD LIZJ = C40515FvD.LIZJ();
                String path = parse.getPath();
                LIZJ.getClass();
                C40515FvD.LJI(path, jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
