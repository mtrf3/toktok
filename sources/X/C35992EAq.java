package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.EAq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35992EAq {
    public static final /* synthetic */ int LIZ = 0;

    public static C35991EAp LIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String builder = uri.buildUpon().clearQuery().toString();
            o.LJIIIIZZ(builder, "uri.buildUpon().clearQuery().toString()");
            if (ujb.o.LJJJLIIL(builder, "/data/", false) || ujb.o.LJJJLIIL(builder, "local_file://", false)) {
                java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
                return new C35991EAp(builder, null, queryParameterNames);
            }
            String str = "";
            if (uri.getScheme() == null && uri.getHost() == null) {
                java.util.Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uri);
                o.LJIIIIZZ(queryParameterNames2, "uri.queryParameterNames");
                return new C35991EAp(builder, "", queryParameterNames2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            LIZ2.append(scheme);
            LIZ2.append("://");
            String host = uri.getHost();
            if (host != null) {
                str = host;
            }
            LIZ2.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            String path = uri.getPath();
            java.util.Set<String> queryParameterNames3 = UriProtector.getQueryParameterNames(uri);
            o.LJIIIIZZ(queryParameterNames3, "uri.queryParameterNames");
            return new C35991EAp(LIZIZ, path, queryParameterNames3);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }
}
