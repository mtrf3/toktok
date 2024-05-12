package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KRC implements JZB {
    public final /* synthetic */ SearchKeywordPresenter LIZ;
    public final /* synthetic */ KGR LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.JZB
    public final void LIZ(JVN jvn) {
        String str;
        String str2;
        User user = jvn.LIZIZ;
        Z9N z9n = Z9N.LIZIZ;
        int i = jvn.LIZJ;
        String str3 = this.LIZ.getKeyword().LJLIL;
        String requestId = user.getRequestId();
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        z9n.LJJLIIIJLLLLLLLZ(i, str3, requestId, uid, this.LIZ.getKeyword().LJLIL, C78857UxB.LJJIJIIJI(user).getTrackName());
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZIZ.getContext(), "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", "find_friends");
        buildRoute.withParam("extra_previous_page_position", "main_head");
        buildRoute.withParam("profile_enterprise_type", Z8A.LIZIZ.getEnterpriseType(user));
        buildRoute.withParam("extra_from_pre_page", "general_search");
        String str4 = "";
        if (!this.LIZJ) {
            str = "";
        } else {
            str = "now_find_friends_search";
        }
        buildRoute.withParam("source_page", str);
        if (this.LIZJ) {
            str2 = "now_find_friends_page";
        } else {
            str2 = "find_friends_page";
        }
        buildRoute.withParam("trackParams", new JSONObject(E2C.LIZJ("rfevent_previous_page", str2)).toString());
        if (user.getMatchedFriendStruct() != null) {
            EnumC57366MfK enumC57366MfK = EnumC57366MfK.RELATION_LABEL;
            String accurateRecType = user.getAccurateRecType();
            C57364MfI.Companion.getClass();
            EnumC199997t5 LIZ = C200007t6.LIZ(user);
            String uid2 = user.getUid();
            if (uid2 != null) {
                str4 = uid2;
            }
            String requestId2 = user.getRequestId();
            String friendTypeStr = user.getFriendTypeStr();
            if (friendTypeStr == null) {
                MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                if (matchedFriendStruct != null) {
                    friendTypeStr = matchedFriendStruct.getRelationType();
                } else {
                    friendTypeStr = null;
                }
            }
            String socialInfo = user.getSocialInfo();
            if (socialInfo == null) {
                MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
                if (matchedFriendStruct2 != null) {
                    socialInfo = matchedFriendStruct2.getSocialInfo();
                } else {
                    socialInfo = null;
                }
            }
            buildRoute.withParam("recommend_enter_profile_params", new C57364MfI("search_result", "search_result", enumC57366MfK, accurateRecType, LIZ, str4, null, null, requestId2, null, friendTypeStr, socialInfo, user.getMatchedFriendStruct(), null, null, null, false, null, null, null, null, false, null, false, 16769024, null));
        }
        buildRoute.open();
    }

    public KRC(SearchKeywordPresenter searchKeywordPresenter, KGR kgr, boolean z) {
        this.LIZ = searchKeywordPresenter;
        this.LIZIZ = kgr;
        this.LIZJ = z;
    }
}
