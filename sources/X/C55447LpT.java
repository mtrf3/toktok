package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LpT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55447LpT {
    public static boolean LIZ(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!C56209M4f.LIZ(microAppUrl)) {
            return false;
        }
        C38499F9b.LIZ.LIZIZ().openMiniApp(context, microAppUrl, new C227898wz());
        return true;
    }
}
