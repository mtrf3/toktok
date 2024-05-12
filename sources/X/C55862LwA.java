package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.LwA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55862LwA extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "personal_homepage";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        if (!SC5.LIZIZ(str, "host", str2, "path", "mine", str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(str2);
            if (!o.LJ(X1D.LIZIZ(LIZ), "user/homepage")) {
                return false;
            }
        }
        return true;
    }

    @Override // X.M56
    public final Intent LIZIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Intent LJIJI = C51029K0z.LJIJI(activity);
            LJIJI.putExtra("extra_from_deeplink", true);
            return LJIJI;
        }
        Intent LJIJI2 = C51029K0z.LJIJI(activity);
        LJIJI2.putExtra("extra_from_deeplink", true);
        LJIJI2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
        String queryParameter = UriProtector.getQueryParameter(uri, "profile_from_scene");
        if (queryParameter != null) {
            LJIJI2.putExtra("profile_from_scene", queryParameter);
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "shoot_from");
        if (queryParameter2 != null) {
            LJIJI2.putExtra("shoot_from", queryParameter2);
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "launchFlag");
        if (queryParameter3 != null) {
            try {
                Integer flag = Integer.decode(queryParameter3);
                o.LJIIIIZZ(flag, "flag");
                o.LJIIIIZZ(LJIJI2.addFlags(flag.intValue()), "{\n                      …ag)\n                    }");
            } catch (Exception unused) {
            }
        }
        M62.LIZIZ.LIZIZ(uri, "mine", z);
        return LJIJI2;
    }
}
