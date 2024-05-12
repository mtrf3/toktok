package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fpo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40180Fpo {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle, String url) {
        o.LJIIIZ(url, "url");
        java.util.Set<String> keySet = bundle.keySet();
        android.net.Uri originalUri = UriProtector.parse(url);
        Uri.Builder buildUpon = UriProtector.parse(UriProtector.getQueryParameter(originalUri, "fallback_url")).buildUpon();
        o.LJIIIIZZ(originalUri, "originalUri");
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(originalUri);
        o.LJIIIIZZ(queryParameterNames, "this.queryParameterNames");
        Uri.Builder clearQuery = originalUri.buildUpon().clearQuery();
        o.LJIIIIZZ(clearQuery, "this.buildUpon().clearQuery()");
        for (String str : queryParameterNames) {
            if (!o.LJ(str, "fallback_url")) {
                clearQuery.appendQueryParameter(str, UriProtector.getQueryParameter(originalUri, str));
            }
        }
        android.net.Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "newUri.build()");
        Uri.Builder buildUpon2 = build.buildUpon();
        for (String str2 : keySet) {
            String valueOf = String.valueOf(C16880lQ.LLJJIII(bundle, str2));
            buildUpon2.appendQueryParameter(str2, valueOf);
            buildUpon.appendQueryParameter(str2, valueOf);
        }
        buildUpon2.appendQueryParameter("fallback_url", android.net.Uri.decode(buildUpon.build().toString()));
        String uri = buildUpon2.build().toString();
        o.LJIIIIZZ(uri, "originalUriWithoutFallba…uilder.build().toString()");
        return uri;
    }
}
