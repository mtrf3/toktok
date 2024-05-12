package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.2nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69382nu {
    public static String LIZ(String str, String str2) {
        String queryParameter;
        android.net.Uri parse = UriProtector.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        if (queryParameterNames.contains("abr_pts")) {
            buildUpon.clearQuery();
            for (String str3 : queryParameterNames) {
                if (TextUtils.equals(str3, "abr_pts")) {
                    queryParameter = str2;
                } else {
                    queryParameter = UriProtector.getQueryParameter(parse, str3);
                }
                buildUpon.appendQueryParameter(str3, queryParameter);
            }
        } else {
            buildUpon.appendQueryParameter("abr_pts", str2);
        }
        return buildUpon.build().toString();
    }
}
