package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.AgZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26867AgZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String schema, java.util.Map map) {
        String str;
        o.LJIIIZ(schema, "schema");
        android.net.Uri baseUri = UriProtector.parse(schema);
        android.net.Uri uri = null;
        if (baseUri != null) {
            str = UriProtector.getQueryParameter(baseUri, "url");
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!o.LJ(value, "") && value != null) {
                    if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                        buildUpon.appendQueryParameter(str2, value.toString());
                    } else {
                        buildUpon.appendQueryParameter(str2, C27739Aud.LJI(value));
                    }
                }
            }
            o.LJIIIIZZ(baseUri, "baseUri");
            if (buildUpon != null) {
                uri = buildUpon.build();
            }
            String valueOf = String.valueOf(uri);
            Uri.Builder buildUpon2 = baseUri.buildUpon();
            buildUpon2.clearQuery();
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(baseUri);
            o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
            for (String str3 : queryParameterNames) {
                if (!o.LJ(str3, "url")) {
                    buildUpon2.appendQueryParameter(str3, UriProtector.getQueryParameter(baseUri, str3));
                } else {
                    buildUpon2.appendQueryParameter("url", valueOf);
                }
            }
            android.net.Uri replaceUriParameter = buildUpon2.build();
            o.LJIIIIZZ(replaceUriParameter, "replaceUriParameter");
            String uri2 = replaceUriParameter.toString();
            o.LJIIIIZZ(uri2, "baseUri.replaceUriParame…().toString()).toString()");
            return uri2;
        }
        String uri3 = baseUri.toString();
        o.LJIIIIZZ(uri3, "baseUri.toString()");
        return uri3;
    }

    public static Uri.Builder LIZJ(String url, java.util.Map queryParams) {
        String str;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(queryParams, "queryParams");
        Uri.Builder builder = UriProtector.parse(url).buildUpon();
        for (Map.Entry entry : queryParams.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                builder.appendQueryParameter(str2, value.toString());
            } else {
                if (value != null) {
                    str = C27739Aud.LJI(value);
                } else {
                    str = "";
                }
                builder.appendQueryParameter(str2, str);
            }
        }
        o.LJIIIIZZ(builder, "builder");
        return builder;
    }

    public static Uri.Builder LIZLLL(String url, java.util.Map map) {
        o.LJIIIZ(url, "url");
        Uri.Builder builder = UriProtector.parse(url).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!o.LJ(value, "") && value != null) {
                if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                    builder.appendQueryParameter(str, value.toString());
                } else {
                    builder.appendQueryParameter(str, C27739Aud.LJI(value));
                }
            }
        }
        o.LJIIIIZZ(builder, "builder");
        return builder;
    }

    public static SmartRoute LIZIZ(Context context, String url, java.util.Map queryParams, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(queryParams, "queryParams");
        Uri.Builder LIZJ = LIZJ(url, queryParams);
        if (z) {
            LIZJ.appendQueryParameter("fallback", null);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, LIZJ.toString());
        o.LJIIIIZZ(buildRoute, "buildRoute(context, builder.toString())");
        return buildRoute;
    }
}
