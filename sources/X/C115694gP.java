package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115694gP {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String url) {
        o.LJIIIZ(url, "url");
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(url), "url");
        if (queryParameter == null) {
            queryParameter = UriProtector.getQueryParameter(UriProtector.parse(url), "surl");
        }
        if (LIZIZ(queryParameter).length() > 0) {
            return LIZIZ(queryParameter);
        }
        if (queryParameter != null && queryParameter.length() != 0) {
            OJD ojd = new OJD("view/([^/]+)/index\\.html");
            if (ojd.containsMatchIn(queryParameter)) {
                InterfaceC59973NgH find$default = OJD.find$default(ojd, queryParameter, 0, 2, null);
                o.LJI(find$default);
                List LJLJJL = s.LJLJJL(find$default.getValue(), new String[]{"/"}, 0, 6);
                if (LJLJJL.size() > 1) {
                    return (String) ListProtector.get(LJLJJL, 1);
                }
            }
        }
        return "";
    }

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0 && ujb.o.LJJJJ(str, ".js", false) && s.LJJJLZIJ(str, "byte-gurd-source-sg", false)) {
            String substring = str.substring(s.LJJLIIIJL(str, "byte-gurd-source-sg", 0, false, 6));
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            List LJLJJL = s.LJLJJL(substring, new String[]{"/"}, 0, 6);
            if (LJLJJL.size() > 4) {
                return (String) ListProtector.get(LJLJJL, 4);
            }
        }
        return "";
    }
}
