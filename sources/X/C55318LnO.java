package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.LnO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55318LnO {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme, User user) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(aweme, "aweme");
        Boolean LIZ2 = SharePrefCache.inst().getCanCreateInsights().LIZ();
        o.LJIIIIZZ(LIZ2, "inst().canCreateInsights.cache");
        if (LIZ2.booleanValue() && ((user.getIsCreater() || user.getHasAnalyticsMetrics()) && AV1.LJIJI(aweme.getAuthorUid()))) {
            return true;
        }
        return false;
    }
}
