package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M54 extends M56 {
    public static android.net.Uri LJII(android.net.Uri uri, String str) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        ArrayList arrayList = new ArrayList();
        for (String str2 : queryParameterNames) {
            if (!o.LJ(str2, str)) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            clearQuery.appendQueryParameter(str3, UriProtector.getQueryParameter(uri, str3));
        }
        android.net.Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "builder.build()");
        return build;
    }

    @Override // X.M56
    public final boolean LJ(android.net.Uri uri, String scheme, String host, String path) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(scheme, "scheme");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        if (!o.LJ("ec", host)) {
            return false;
        }
        switch (path.hashCode()) {
            case -1969576470:
                if (!path.equals("/fashion_mall")) {
                    return false;
                }
                return true;
            case -685527820:
                if (!path.equals("/address/edit")) {
                    return false;
                }
                return true;
            case -685314168:
                if (!path.equals("/address/list")) {
                    return false;
                }
                return true;
            case -335200235:
                if (!path.equals("/order_center")) {
                    return false;
                }
                return true;
            case 1511021:
                if (!path.equals("/pdp")) {
                    return false;
                }
                return true;
            case 43085793:
                if (!path.equals("/order/detail")) {
                    return false;
                }
                return true;
            case 46749379:
                if (!path.equals("/mall")) {
                    return false;
                }
                return true;
            case 137278424:
                if (!path.equals("/order_submit")) {
                    return false;
                }
                return true;
            case 852758595:
                if (!path.equals("/order_submit_v2")) {
                    return false;
                }
                return true;
            case 1315188432:
                if (!path.equals("/bind_result")) {
                    return false;
                }
                return true;
            case 1455341074:
                if (!path.equals("/store")) {
                    return false;
                }
                return true;
            case 1923799401:
                if (!path.equals("/order/middle_page")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (o.LJ(uri.getPath(), "/pdp")) {
            String queryParameter = UriProtector.getQueryParameter(uri, "fullScreen");
            if (queryParameter == null) {
                queryParameter = "false";
            }
            if (!o.LJ(queryParameter, "true")) {
                uri = LJII(uri, "fullScreen").buildUpon().appendQueryParameter("fullScreen", "true").build();
                o.LJIIIIZZ(uri, "uri.removeQueryParam(\"fu…lScreen\", \"true\").build()");
            }
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "fallback");
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
        return SmartRouter.buildRoute(activity, LJII(uri, "fallback").buildUpon().scheme("aweme").build().toString()).buildIntent();
    }
}
