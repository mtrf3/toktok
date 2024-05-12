package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes10.dex */
public final class M6N extends M6P {
    public static final M6O LIZ = new M6O();

    @Override // X.M6P
    public final android.net.Uri LIZ(android.net.Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        Iterator<String> it = ((M6Q) M6Q.LIZIZ.getValue()).LIZ.keySet().iterator();
        while (it.hasNext()) {
            LIZ.put(it.next(), 35);
        }
        String[] LIZ2 = M5L.LIZ();
        int i = 0;
        int i2 = 0;
        while (true) {
            str = "";
            if (i2 >= LIZ2.length) {
                str2 = "";
                break;
            }
            if (TextUtils.equals(LIZ2[i2], uri.getHost())) {
                str2 = LIZ2[i2];
                break;
            }
            i2++;
        }
        if (str2.isEmpty()) {
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.equals(uri.getPath(), "/") && UriProtector.getQueryParameterNames(uri).isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("musically");
            LIZ3.append("://feed");
            return UriProtector.parse(X1D.LIZIZ(LIZ3));
        }
        if (TextUtils.isEmpty(uri.getPath()) && UriProtector.getQueryParameterNames(uri).isEmpty()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("musically");
            LIZ4.append("://feed");
            return UriProtector.parse(X1D.LIZIZ(LIZ4));
        }
        if (PatternProtector.compile("@([\\w\\.]+)/live").matcher(uri.toString()).find()) {
            return M6P.LIZIZ(18, uri, (String) ListProtector.get(uri.getPathSegments(), 0), "");
        }
        if (!PatternProtector.compile("(?:share/)?discover/([^/?]+)").matcher(uri.toString()).find()) {
            boolean find = PatternProtector.compile("(?:share/)?discover(?:/)?$").matcher(M5K.LIZ(uri.toString())).find();
            boolean LJFF = C55837Lvl.LJFF(uri, "should_enter_middle_page", "1");
            if (!find || !LJFF) {
                if (PatternProtector.compile("api/social/invitation/redirect/").matcher(uri.toString()).find() || (PatternProtector.compile("(?:share/)?@([\\w\\.]+)/?($|\\?.*)").matcher(uri.toString()).find() && !TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "invitation_code")))) {
                    return M6P.LIZIZ(22, uri, "", "");
                }
                String LIZ5 = M5K.LIZ(uri2);
                Iterator it2 = LIZ.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str4 = "";
                        break;
                    }
                    str4 = (String) it2.next();
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("https://");
                    LIZ6.append(str2);
                    LIZ6.append("/");
                    LIZ6.append(str4);
                    Matcher matcher = PatternProtector.compile(X1D.LIZIZ(LIZ6)).matcher(LIZ5);
                    if (matcher.find()) {
                        if (matcher.groupCount() >= 1) {
                            str = matcher.group(1);
                        }
                        i = ((Integer) LIZ.get(str4)).intValue();
                    }
                }
                return M6P.LIZIZ(i, uri, str, str4);
            }
        }
        if (PatternProtector.compile("(?:share/)?discover/([^/?]+)").matcher(uri.toString()).find()) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null || pathSegments.size() <= 1) {
                str3 = "";
            } else {
                str3 = (String) ListProtector.get(pathSegments, 1);
            }
            return M6P.LIZIZ(24, uri, str3, "");
        }
        return M6P.LIZIZ(37, uri, "", "");
    }
}
