package X;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchMixUserCell;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JVM implements JZB {
    public final /* synthetic */ SearchMixUserCell LIZ;

    public JVM(SearchMixUserCell searchMixUserCell) {
        this.LIZ = searchMixUserCell;
    }

    @Override // X.JZB
    public final void LIZ(JVN jvn) {
        String keyword;
        String str;
        String str2;
        List<SearchUser> list;
        User user = jvn.LIZIZ;
        SearchResultParam searchResultParam = this.LIZ.LJLLI;
        if (searchResultParam == null) {
            keyword = "";
        } else {
            keyword = searchResultParam.getKeyword();
        }
        String str3 = jvn.LJFF;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = this.LIZ.LJLILLLLZI;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI == null) {
            str = "";
        } else {
            str = LJI.getSearchVideoModel().getGroupId();
        }
        HashMap hashMap = new HashMap();
        JQA jqa = this.LIZ.LJLJJLL;
        if (jqa != null) {
            hashMap.put("token_type", jqa.LJJIJ);
            hashMap.put("search_result_id", this.LIZ.LJLJJLL.LJJIJIIJI);
            hashMap.put("list_item_id", user.getUid());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C45804HyK.LJJIIJ(user));
            LIZ.append("");
            hashMap.put("relation_tag", X1D.LIZIZ(LIZ));
        }
        View view2 = jvn.LIZ;
        int i = jvn.LIZJ;
        String requestId = user.getRequestId();
        String uid = user.getUid();
        int i2 = this.LIZ.LJLLLL;
        String str4 = jvn.LIZLLL;
        HashMap hashMap2 = new HashMap();
        if (TextUtils.equals(str3, "aladdin_card")) {
            hashMap2.put("list_item_id", uid);
        }
        C49503Jbn.LIZ(view2, uid, i2, hashMap2);
        C7ZV c7zv = new C7ZV();
        c7zv.LIZLLL = JNW.LIZ(3);
        c7zv.LJJLIIIJL = requestId;
        int i3 = 0;
        c7zv.LJJLIIIIJ = 0;
        String rank = String.valueOf(i2);
        o.LJIIIZ(rank, "rank");
        c7zv.LJIIIZ = rank;
        c7zv.LJJLIIIJJIZ = uid;
        c7zv.LJLJJI = str4;
        c7zv.LJLLI = str;
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        if (LIZIZ.containsKey("search_result_id")) {
            hashMap.put("search_result_id", LIZIZ.get("search_result_id"));
        }
        c7zv.LIZ(hashMap);
        JNW.LIZJ(i, keyword, requestId, c7zv, 3, str3);
        JNW.LJFF(3, requestId, uid);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ.LJLIL, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", "general_search");
        buildRoute.withParam("previous_page", "general_search");
        buildRoute.withParam("extra_from_pre_page", "general_search");
        buildRoute.withParam("extra_from_event_enter_from", "general_search");
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("extra_previous_page_position", "main_head");
        buildRoute.withParam("enter_method", str3);
        SearchMixUserCell searchMixUserCell = this.LIZ;
        String uid2 = user.getUid();
        C49268JVg c49268JVg = searchMixUserCell.LJLLJ;
        if (c49268JVg != null && (list = c49268JVg.LIZIZ) != null) {
            Iterator<SearchUser> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SearchUser next = it.next();
                if (TextUtils.equals(next.user.getUid(), uid2)) {
                    i3 = next.cardType();
                    break;
                }
            }
        }
        buildRoute.withParam("general_search_card_type", i3);
        buildRoute.withParam("search_request_id", user.getRequestId());
        if (jvn.LJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        buildRoute.withParam("sticky_content", str2);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("rfevent_previous_page", this.LIZ.LJLLI.getSearchEnterFromPage());
        buildRoute.withParam("trackParams", c198517qh.LJ().toString());
        if (!TextUtils.isEmpty(jvn.LJ)) {
            buildRoute.withParam("from_scene", jvn.LJ);
        }
        C50948Jz6 LJJLIIIJLJLI = Z9N.LIZIZ.LJJLIIIJLJLI();
        if (LJJLIIIJLJLI != null && LJJLIIIJLJLI.getSourcePage() != null) {
            buildRoute.withParam("source_page", LJJLIIIJLJLI.getSourcePage());
        }
        buildRoute.open();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZ.LJLIL);
        if (LJJIFFI != null) {
            ((SurveyViewModel) ViewModelProviders.of(LJJIFFI).get(SurveyViewModel.class)).LJLJI.postValue(Boolean.TRUE);
        }
    }
}
