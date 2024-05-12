package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NP8 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Context context) {
        if (context != null && C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), context) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        if (!NO5.LJ(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && UriProtector.getQueryParameter(uri, "url") != null && TextUtils.equals(UriProtector.parse(UriProtector.getQueryParameter(uri, "url")).getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "id"))) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Context context, android.net.Uri uri) {
        if (context == null || !o.LJ(uri.getScheme(), "market") || !LIZ(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        return NO5.LJIL(context, intent);
    }

    public static final boolean LJ(Context context, android.net.Uri uri) {
        if (context != null && uri != null) {
            if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
                return LIZJ(uri, "com.google.android.gms", context);
            }
            if (TextUtils.equals(uri.getHost(), "google.com") && UriProtector.getQueryParameter(uri, "url") != null && TextUtils.equals(UriProtector.parse(UriProtector.getQueryParameter(uri, "url")).getHost(), "play.app.goo.gl")) {
                android.net.Uri parse = UriProtector.parse(UriProtector.getQueryParameter(uri, "url"));
                o.LJIIIIZZ(parse, "parse(uri.getQueryParameter(\"url\"))");
                return LIZJ(parse, "com.google.android.gms", context);
            }
            if (TextUtils.equals(uri.getHost(), "play.google.com") && TextUtils.equals(uri.getPath(), "/store/apps/details") && !TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "id"))) {
                return LIZJ(uri, "com.android.vending", context);
            }
        }
        return false;
    }

    public static final boolean LIZJ(android.net.Uri uri, String str, Context context) {
        if (!LIZ(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        return NO5.LJIL(context, intent);
    }
}
