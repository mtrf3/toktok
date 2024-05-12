package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Lw2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55854Lw2 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", "modern_feed", str);
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent LJIJI = C51029K0z.LJIJI(activity);
        LJIJI.putExtra("extra_from_deeplink", true);
        LJIJI.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
        C55839Lvn.LIZIZ(uri, LJIJI, z);
        return LJIJI;
    }
}
