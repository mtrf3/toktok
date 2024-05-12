package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.9gL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243059gL {
    public static final /* synthetic */ int LIZ = 0;

    public static android.net.Uri LIZ(android.net.Uri uri, String str, String newValue) {
        String queryParameter;
        o.LJIIIZ(newValue, "newValue");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.contains(str)) {
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (o.LJ(str2, str)) {
                    queryParameter = newValue;
                } else {
                    queryParameter = UriProtector.getQueryParameter(uri, str2);
                }
                clearQuery.appendQueryParameter(str2, queryParameter);
            }
        } else {
            clearQuery.appendQueryParameter(str, newValue);
        }
        android.net.Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "newUri.build()");
        return build;
    }
}
