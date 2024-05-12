package X;

import Y.ACallableS31S1100000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7MK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7MK {
    public static final int LIZ(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static final String LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        if (AV1.LJIJ(aweme.getAuthor())) {
            return "self";
        }
        if (C80S.LIZLLL(aweme)) {
            return "friends";
        }
        C196367nE.LIZ.getClass();
        if (C196367nE.LJ(aweme)) {
            return "follower_maf";
        }
        if (C196367nE.LJFF(aweme)) {
            return "no_follow_maf";
        }
        if (C80S.LIZIZ(aweme)) {
            return "following";
        }
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo != null && nowPostInfo.getNowPostSource() == 3) {
            return "popular";
        }
        return "others";
    }

    public static final int LIZJ(AbstractC193947jK abstractC193947jK, Aweme aweme) {
        o.LJIIIZ(abstractC193947jK, "<this>");
        o.LJIIIZ(aweme, "aweme");
        return abstractC193947jK instanceof C193887jE ? 1 : 0;
    }

    public static final String LIZLLL(String feedHierarchyEnterFrom, C7ML item) {
        o.LJIIIZ(feedHierarchyEnterFrom, "feedHierarchyEnterFrom");
        o.LJIIIZ(item, "item");
        String l = item.l();
        if (l == null) {
            if (item.z() == 1) {
                return "now_explore_page";
            }
            return feedHierarchyEnterFrom;
        }
        return l;
    }

    public static final String LJ(String str, C7ML item) {
        o.LJIIIZ(item, "item");
        String LLFFF = item.LLFFF();
        if (LLFFF == null) {
            return str;
        }
        return LLFFF;
    }

    public static final String LJFF(String str, AbstractC193937jJ abstractC193937jJ) {
        if (abstractC193937jJ != null && o.LJ(abstractC193937jJ, C194137jd.LIZ)) {
            return "now_inflow_page";
        }
        if (o.LJ(str, "homepage_hot")) {
            return "homepage_hot_post";
        }
        if (o.LJ(str, "homepage_friends")) {
            return "homepage_friends_post";
        }
        return "homepage_now_post";
    }

    public static final void LJI(String str, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        JSONObject jSONObject = new JSONObject();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(jSONObject);
        }
        FMX.LJIILJJIL(str, jSONObject);
    }

    public static final void LJII(String eventName, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(eventName, "eventName");
        JSONObject jSONObject = new JSONObject();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(jSONObject);
        }
        C10K.LIZJ(new ACallableS31S1100000_3(jSONObject, eventName, 0));
    }
}
