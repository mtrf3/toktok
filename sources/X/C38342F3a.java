package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.F3a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38342F3a implements InterfaceC39467FeJ {
    public static final C38342F3a LJLIL = new C38342F3a();

    @Override // X.InterfaceC39467FeJ
    public final String LIZ(String str) {
        android.net.Uri parse;
        String queryParameter;
        if (str == null || (queryParameter = UriProtector.getQueryParameter((parse = UriProtector.parse(str)), "cid")) == null || queryParameter.length() == 0) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://challenge/detail/");
        LIZ.append(queryParameter);
        Uri.Builder buildUpon = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        o.LJIIIIZZ(queryParameterNames, "uri.queryParameterNames");
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(queryParameterNames), C38343F3b.LJLIL));
        while (c115524g8.hasNext()) {
            String str2 = (String) c115524g8.next();
            buildUpon.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
        }
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "clientUriBuilder.toString()");
        return builder;
    }
}
