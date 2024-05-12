package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class OZ0 extends M6P {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0178, code lost:
    
        if (LJ(r16) == 16) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZJ(android.net.Uri r16) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZ0.LIZJ(android.net.Uri):android.net.Uri");
    }

    public static int LJ(android.net.Uri uri) {
        uri.getHost();
        String LJIILIIL = C30591Hz.LJIILIIL(uri.toString(), "schema_type");
        if (!TextUtils.isEmpty(LJIILIIL)) {
            try {
                return CastIntegerProtector.parseInt(LJIILIIL);
            } catch (NumberFormatException unused) {
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (C79004UzY.LJJIFFI(pathSegments) || pathSegments.size() < 3 || !TextUtils.equals("share", (String) ListProtector.get(pathSegments, 0))) {
            return 0;
        }
        String str = (String) ListProtector.get(pathSegments, 1);
        ListProtector.get(pathSegments, 2);
        return OZ1.LIZIZ.LJI(str);
    }

    @Override // X.M6P
    public final android.net.Uri LIZ(android.net.Uri uri) {
        boolean z;
        android.net.Uri LIZJ;
        try {
            if (uri.toString().contains("microapp") || uri.toString().contains("microgame")) {
                String code = uri.toString();
                o.LJIIIZ(code, "code");
                if (TextUtils.isEmpty(code)) {
                    code = "";
                } else {
                    if (s.LJJJLZIJ(code, "microapp", false) || s.LJJJLZIJ(code, "microgame", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        android.net.Uri parse = UriProtector.parse(code);
                        String queryParameter = UriProtector.getQueryParameter(parse, "android_scheme");
                        if (TextUtils.isEmpty(queryParameter)) {
                            queryParameter = UriProtector.getQueryParameter(parse, "ios_scheme");
                        }
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                String decode = URLDecoder.decode(code, "UTF8");
                                o.LJIIIIZZ(decode, "decode(code, \"UTF8\")");
                                parse = UriProtector.parse(decode);
                            } catch (UnsupportedEncodingException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            code = queryParameter + "&app_id=" + UriProtector.getQueryParameter(parse, "app_id") + "&token=" + UriProtector.getQueryParameter(parse, "token") + "&channel=" + UriProtector.getQueryParameter(parse, "channel") + "&iid=" + UriProtector.getQueryParameter(parse, "iid");
                        }
                    }
                }
                if (!TextUtils.isEmpty(code) && !TextUtils.equals(uri.toString(), code)) {
                    android.net.Uri parse2 = UriProtector.parse(code);
                    if (uri.getBooleanQueryParameter("backurl", false)) {
                        Uri.Builder buildUpon = parse2.buildUpon();
                        buildUpon.appendQueryParameter("backurl", UriProtector.getQueryParameter(uri, "backurl"));
                        return buildUpon.build();
                    }
                    return parse2;
                }
                LIZJ = LIZJ(uri);
            } else {
                if (!TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "redirect_url"))) {
                    try {
                        return UriProtector.parse(UriProtector.getQueryParameter(uri, "redirect_url"));
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        return null;
                    }
                }
                if (C56243M5n.LIZIZ(uri.getScheme())) {
                    return uri;
                }
                LIZJ = LIZJ(uri);
            }
            return LIZJ;
        } catch (Exception unused) {
        }
    }

    public static String LIZLLL(android.net.Uri uri, String str) {
        String path = uri.getPath();
        int length = str.length() + path.indexOf(str);
        return path.substring(length, path.indexOf("/", length));
    }
}
