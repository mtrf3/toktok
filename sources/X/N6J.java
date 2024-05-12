package X;

import Y.AfS62S0100000_10;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6J {
    public static final int LIZ(N6K n6k) {
        C79863Bm LIZIZ;
        N6I n6i;
        if (n6k != null && (LIZIZ = n6k.LIZIZ()) != null && (n6i = (N6I) LIZIZ.getValue()) != null) {
            return n6i.LJLILLLLZI;
        }
        return 0;
    }

    public static final void LIZLLL(C58824N6u c58824N6u) {
        c58824N6u.LIZ(N6I.L((N6I) c58824N6u.LIZLLL.getValue(), false, 0, false, 1, 75));
    }

    public static final void LIZJ(C58824N6u c58824N6u, Aweme aweme) {
        User author;
        String uid;
        User author2;
        String secUid;
        if (aweme == null || !C1DF.LJIL(aweme) || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null || (author2 = aweme.getAuthor()) == null || (secUid = author2.getSecUid()) == null) {
            return;
        }
        SearchAdMainService.LJIIJJI().LJFF(uid, secUid, new AfS62S0100000_10(c58824N6u, 42), new AfS62S0100000_10(c58824N6u, 43));
    }

    public static final void LIZIZ(InterfaceC58799N5v interfaceC58799N5v, ActivityC45651qj activityC45651qj, java.util.Map map) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(interfaceC58799N5v, "<this>");
        if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new NE9(activityC45651qj, interfaceC58799N5v, map, null), 3);
        }
    }

    public static final void LJ(C58825N6v c58825N6v, N62 state, Context context) {
        ActivityC45651qj LJJIFFI;
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(c58825N6v, "<this>");
        o.LJIIIZ(state, "state");
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new NEQ(c58825N6v, state, null), 3);
        }
    }

    public static final void LJFF(SearchAdEventLogger searchAdEventLogger, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(searchAdEventLogger, "<this>");
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJ(C58777N4z.LIZIZ, new AqS33S1000000_10(str, 10));
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            UrlModel trackUrlList = awemeRawAd.getTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AqS192S0100000_10(awemeRawAd, 59);
            O8Y.LIZ("show", trackUrlList, creativeId, logExtra);
        }
    }
}
