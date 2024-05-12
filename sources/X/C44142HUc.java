package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.HUc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44142HUc extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "feed");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
        String queryParameter = UriProtector.getQueryParameter(uri, "tab");
        if (queryParameter == null) {
            queryParameter = "";
        }
        try {
            int parseInt = CastIntegerProtector.parseInt(queryParameter);
            intent.putExtra("tab", parseInt);
            if (parseInt != 1) {
                if (parseInt == 2) {
                    M62.LIZIZ.LIZIZ(uri, "homepage_fresh", z);
                }
            } else {
                M62.LIZIZ.LIZIZ(uri, "homepage_hot", z);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return intent;
    }
}
