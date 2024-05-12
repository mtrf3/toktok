package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E98 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri LIZ(android.net.Uri r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r2 = r4.getScheme()
            if (r2 == 0) goto L1e
            int r1 = r2.hashCode()
            r0 = -1377934078(0xffffffffadde6502, float:-2.5283334E-11)
            if (r1 == r0) goto L79
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L41
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 == r0) goto L38
        L1e:
            r3 = 0
        L1f:
            java.lang.String r2 = r4.getHost()
            r1 = 0
            if (r2 == 0) goto L33
            java.lang.String r0 = "echybrid"
            boolean r1 = ujb.s.LJJJLZIJ(r2, r0, r1)
            r0 = 1
            if (r1 != r0) goto L33
            android.net.Uri r3 = LIZIZ(r4, r5)
        L33:
            if (r3 != 0) goto L36
        L35:
            return r4
        L36:
            r4 = r3
            goto L35
        L38:
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4a
            goto L1e
        L41:
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4a
            goto L1e
        L4a:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r1 = r0.scheme(r5)
            java.lang.String r0 = "webview"
            android.net.Uri$Builder r2 = r1.authority(r0)
            java.lang.String r1 = "url"
            java.lang.String r0 = r4.toString()
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r4)
            java.lang.String r1 = "use_spark"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L74
            java.lang.String r0 = "1"
            r2.appendQueryParameter(r1, r0)
        L74:
            android.net.Uri r3 = r2.build()
            goto L1f
        L79:
            java.lang.String r0 = "bullet"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1e
            android.net.Uri r3 = LIZIZ(r4, r5)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E98.LIZ(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static final android.net.Uri LIZIZ(android.net.Uri uri, String prefix) {
        android.net.Uri uri2;
        o.LJIIIZ(prefix, "prefix");
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter == null) {
            return null;
        }
        try {
            uri2 = UriProtector.parse(queryParameter);
        } catch (Exception unused) {
            uri2 = null;
        }
        if (uri2 == null) {
            return null;
        }
        Uri.Builder LIZ = C0F1.LIZ(prefix);
        if (o.LJ(uri2.getScheme(), "http") || o.LJ(uri2.getScheme(), "https")) {
            LIZ.authority("webview");
            LIZ.encodedQuery(uri.getEncodedQuery());
        } else {
            LIZ.authority(uri2.getScheme());
            LIZ.encodedQuery(uri2.getEncodedQuery());
        }
        if (!UriProtector.getQueryParameterNames(uri).contains("use_spark")) {
            LIZ.appendQueryParameter("use_spark", "1");
        }
        return LIZ.build();
    }
}
