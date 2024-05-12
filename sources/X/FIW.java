package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class FIW {
    public static Context LIZIZ;
    public static final FIX LIZJ = new FIX();
    public FIV LIZ;

    public static FIW LIZ(Context context) {
        LIZIZ = C16880lQ.LLLLL(context);
        return (FIW) LIZJ.LIZJ();
    }

    public static java.util.Map LIZIZ(android.net.Uri uri) {
        android.net.Uri parse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uri != null) {
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                if (!TextUtils.isEmpty(str)) {
                    linkedHashMap.put(str, UriProtector.getQueryParameter(uri, str));
                }
            }
            String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
            if (!TextUtils.isEmpty(queryParameter) && (parse = UriProtector.parse(queryParameter)) != null) {
                for (String str2 : UriProtector.getQueryParameterNames(parse)) {
                    if (!TextUtils.isEmpty(str2)) {
                        linkedHashMap.put(str2, UriProtector.getQueryParameter(parse, str2));
                    }
                }
            }
            linkedHashMap.put("launchlog_protocol", uri.getScheme());
            linkedHashMap.put("launchlog_authority", uri.getAuthority());
            linkedHashMap.put("launchlog_path", uri.getPath());
        }
        return linkedHashMap;
    }

    public final void LIZJ(android.net.Uri uri) {
        int i;
        try {
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
            try {
                i = F9J.LIZIZ(LIZIZ, 0, "KEY_NEED_UPLOAD_LAUNCHLOG").getInt("json_data", 0);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                i = 0;
            }
            if (booleanQueryParameter && i > 0) {
                java.util.Map<String, String> LIZIZ2 = LIZIZ(uri);
                FIV fiv = this.LIZ;
                if (fiv != null) {
                    fiv.onEvent(LIZIZ2);
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
