package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55843Lvr extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "nearby";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", "nearby", str);
    }

    @Override // X.M56
    public final Intent LIZIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        int i;
        Integer num;
        Integer LJJIL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent LJIJI = C51029K0z.LJIJI(activity);
        LJIJI.putExtra("extra_from_deeplink", true);
        LJIJI.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
        String queryParameter = UriProtector.getQueryParameter(uri, "feed_type");
        if (queryParameter != null && (LJJIL = C38350F3i.LJJIL(queryParameter)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        LJIJI.putExtra("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i);
        String queryParameter2 = UriProtector.getQueryParameter(uri, "insert_fresh_aweme_ids");
        String queryParameter3 = UriProtector.getQueryParameter(uri, "insert_fresh_type");
        if (queryParameter3 != null) {
            num = C38350F3i.LJJIL(queryParameter3);
        } else {
            num = null;
        }
        if (!TextUtils.isEmpty(queryParameter2) && num != null) {
            LJIJI.putExtra("insert_aweme_ids", queryParameter2);
            LJIJI.putExtra("insert_type", num.intValue());
        }
        return LJIJI;
    }
}
