package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.usersearch.core.ui.SearchUserFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JZU implements JZB {
    public final /* synthetic */ SearchUserFragment LIZ;

    public JZU(SearchUserFragment searchUserFragment) {
        this.LIZ = searchUserFragment;
    }

    @Override // X.JZB
    public final void LIZ(JVN jvn) {
        String str;
        C50469JrN searchVideoModel;
        User user = jvn.LIZIZ;
        C50468JrM LIZJ = C17N.LJJJJJL(this.LIZ).pE().LIZJ();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        SearchUserFragment searchUserFragment = this.LIZ;
        c50651JuJ.getClass();
        TMC.LJIIJ(C50651JuJ.LJIIJ(searchUserFragment), LIZJ, "SearchUserFragment 148");
        if (user != null) {
            SearchUserFragment searchUserFragment2 = this.LIZ;
            View view = searchUserFragment2.getView();
            int i = jvn.LIZJ;
            String Kl = searchUserFragment2.Kl();
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String LIZIZ = JNW.LIZIZ(searchUserFragment2.Kl());
            String str2 = jvn.LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String uid2 = user.getUid();
            o.LJIIIIZZ(uid2, "user.uid");
            linkedHashMap.put("search_result_id", uid2);
            linkedHashMap.put("previous_page", "search_result");
            C50650JuI LJII = C50651JuJ.LJII(searchUserFragment2);
            if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null) {
                str = searchVideoModel.getGroupId();
            } else {
                str = null;
            }
            ActivityC45651qj mo49getActivity = searchUserFragment2.mo49getActivity();
            C49503Jbn.LIZ(view, uid, i, null);
            String LIZ = K56.LIZ(mo49getActivity);
            C50948Jz6 LIZIZ2 = JTO.LIZIZ(mo49getActivity);
            if (LIZIZ2 != null) {
                boolean LJII2 = KB1.LJII(LIZIZ2.getEcSearchEntranceValue());
                C51141K5h.LIZ.getClass();
                if (C51141K5h.LIZIZ() && LJII2) {
                    LIZ = MiddleForSearchFromEC.LJIILIIL().LIZ();
                }
            }
            C7ZV c7zv = new C7ZV();
            c7zv.LIZLLL = JNW.LIZ(0);
            c7zv.LJJLIIIJL = requestId;
            c7zv.LJJLIIIIJ = 0;
            String rank = String.valueOf(i);
            o.LJIIIZ(rank, "rank");
            c7zv.LJIIIZ = rank;
            c7zv.LJJLIIIJJIZ = uid;
            c7zv.LJLL = LIZ;
            c7zv.LJLJJI = str2;
            c7zv.LJLLI = str;
            c7zv.LIZ(linkedHashMap);
            JNW.LIZJ(i, Kl, requestId, c7zv, 0, LIZIZ);
            JNW.LJFF(0, requestId, uid);
            SmartRoute buildRoute = SmartRouter.buildRoute(searchUserFragment2.mo49getActivity(), "//user/profile");
            buildRoute.withParam("uid", user.getUid());
            buildRoute.withParam("sec_user_id", user.getSecUid());
            buildRoute.withParam("enter_from", "search_result");
            buildRoute.withParam("previous_page", "search_result");
            buildRoute.withParam("extra_from_pre_page", "search_result");
            buildRoute.withParam("extra_from_event_enter_from", "search_result");
            buildRoute.withParam("profile_enterprise_type", user.getCommerceUserLevel());
            buildRoute.withParam("extra_previous_page_position", "main_head");
            buildRoute.withParam("search_request_id", user.getRequestId());
            buildRoute.withParam("trackParams", new JSONObject(E2C.LIZJ("rfevent_previous_page", jvn.LJII)).toString());
            buildRoute.open();
        }
    }
}
