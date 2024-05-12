package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Fpn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40179Fpn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle, String url) {
        o.LJIIIZ(url, "url");
        if (TextUtils.isEmpty(url)) {
            return url;
        }
        java.util.Set<String> keySet = bundle.keySet();
        if (keySet.isEmpty()) {
            return url;
        }
        android.net.Uri originalUri = UriProtector.parse(url);
        String queryParameter = UriProtector.getQueryParameter(originalUri, "fallback_url");
        if (!TextUtils.isEmpty(queryParameter)) {
            Uri.Builder buildUpon = UriProtector.parse(queryParameter).buildUpon();
            o.LJIIIIZZ(originalUri, "originalUri");
            Uri.Builder buildUpon2 = C44384HbQ.LLIIJI(originalUri, "fallback_url").buildUpon();
            for (String str : keySet) {
                String valueOf = String.valueOf(C16880lQ.LLJJIII(bundle, str));
                buildUpon2.appendQueryParameter(str, valueOf);
                buildUpon.appendQueryParameter(str, valueOf);
            }
            buildUpon2.appendQueryParameter("fallback_url", android.net.Uri.decode(buildUpon.build().toString()));
            String uri = buildUpon2.build().toString();
            o.LJIIIIZZ(uri, "originalUriWithoutFallba…uilder.build().toString()");
            return uri;
        }
        Uri.Builder buildUpon3 = originalUri.buildUpon();
        for (String str2 : keySet) {
            buildUpon3.appendQueryParameter(str2, String.valueOf(C16880lQ.LLJJIII(bundle, str2)));
        }
        String uri2 = buildUpon3.build().toString();
        o.LJIIIIZZ(uri2, "originalUriBuilder.build().toString()");
        return uri2;
    }
}
