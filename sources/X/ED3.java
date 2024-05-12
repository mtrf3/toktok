package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ED3 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(android.net.Uri r4) {
        /*
            java.lang.String r2 = ""
            if (r4 == 0) goto La
            boolean r0 = r4.isOpaque()
            if (r0 == 0) goto Lb
        La:
            return r2
        Lb:
            boolean r0 = r4.isOpaque()
            java.lang.String r3 = "{\n            try {\n    …\"\n            }\n        }"
            if (r0 == 0) goto L3c
        L13:
            r1 = r2
        L14:
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L21
            boolean r0 = r4.isOpaque()
            if (r0 == 0) goto L22
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r0 = "url"
            java.lang.String r1 = LJ(r4, r0)
            boolean r0 = ujb.o.LJJJJJL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L38
        L38:
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r3)
            goto L20
        L3c:
            java.lang.String r0 = "surl"
            java.lang.String r1 = LJ(r4, r0)
            boolean r0 = ujb.o.LJJJJJL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L13
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r1 = r2
        L54:
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ED3.LIZLLL(android.net.Uri):java.lang.String");
    }

    public static android.net.Uri LIZ(android.net.Uri uri, List keys) {
        o.LJIIIZ(keys, "keys");
        if (uri == null || uri.isOpaque()) {
            return uri;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!ujb.o.LJJJJJL(LJ(uri, str))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return uri;
        }
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (!keys.contains(str2)) {
                    Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                    while (it2.hasNext()) {
                        buildUpon.appendQueryParameter(str2, it2.next());
                    }
                }
            }
            uri = buildUpon.build();
            return uri;
        } catch (Throwable unused) {
            return uri;
        }
    }

    public static android.net.Uri LIZJ(android.net.Uri uri, java.util.Map map) {
        if (uri == null || uri.isOpaque()) {
            return uri;
        }
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            java.util.Set keySet = map.keySet();
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                if (!keySet.contains(str)) {
                    Iterator<String> it = UriProtector.getQueryParameters(uri, str).iterator();
                    while (it.hasNext()) {
                        buildUpon.appendQueryParameter(str, it.next());
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            uri = buildUpon.build();
            return uri;
        } catch (Throwable unused) {
            return uri;
        }
    }

    public static String LJ(android.net.Uri uri, String key) {
        o.LJIIIZ(key, "key");
        if (uri != null && !uri.isOpaque() && !ujb.o.LJJJJJL(key)) {
            try {
                return ED2.LIZ(UriProtector.getQueryParameter(uri, key));
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static android.net.Uri LIZIZ(android.net.Uri uri, String str, String value) {
        o.LJIIIZ(value, "value");
        if (uri == null || uri.isOpaque()) {
            return uri;
        }
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            if (UriProtector.getQueryParameter(uri, str) != null) {
                buildUpon.clearQuery();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    if (!o.LJ(str2, str)) {
                        Iterator<String> it = UriProtector.getQueryParameters(uri, str2).iterator();
                        while (it.hasNext()) {
                            buildUpon.appendQueryParameter(str2, it.next());
                        }
                    }
                }
            }
            uri = buildUpon.appendQueryParameter(str, value).build();
            return uri;
        } catch (Throwable unused) {
            return uri;
        }
    }
}
