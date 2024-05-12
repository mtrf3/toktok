package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes11.dex */
public final class OZ2 extends AbstractC62121OZp {
    public OZ2(C62116OZk c62116OZk) {
        super(c62116OZk);
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        Activity LJIIIIZZ;
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (!TextUtils.equals("snssdk1180.onelink.me", parse.getHost()) && !TextUtils.equals("snssdk1233.onelink.me", parse.getHost())) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(parse, "af_dp");
        if (!C40680Fxs.LIZIZ(queryParameter) || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return false;
        }
        new C57426MgI().LIZ(LJIIIIZZ, queryParameter);
        return true;
    }
}
