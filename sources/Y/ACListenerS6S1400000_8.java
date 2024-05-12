package Y;

import X.AnonymousClass030;
import X.C15280iq;
import X.C50646JuE;
import X.C50650JuI;
import X.C50699Jv5;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public class ACListenerS6S1400000_8 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS6S1400000_8 aCListenerS6S1400000_8, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View view2 = (View) aCListenerS6S1400000_8.l1;
        Map map = (Map) aCListenerS6S1400000_8.l2;
        Map map2 = (Map) aCListenerS6S1400000_8.l3;
        String str = aCListenerS6S1400000_8.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS6S1400000_8.l4;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIIJ(view2, map, map2, str, searchSugWordResponse);
    }

    public static final void onClick$1(ACListenerS6S1400000_8 aCListenerS6S1400000_8, View view) {
        String str;
        String str2;
        String str3;
        List<SearchSugInfo> list;
        SearchSugInfo searchSugInfo;
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View view2 = (View) aCListenerS6S1400000_8.l1;
        Map map = (Map) aCListenerS6S1400000_8.l2;
        Map map2 = (Map) aCListenerS6S1400000_8.l3;
        String str4 = aCListenerS6S1400000_8.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS6S1400000_8.l4;
        detailFeedSearchHelper.getClass();
        if (view2.getAlpha() == 0.0f) {
            C15280iq.LIZIZ("DetailFeedSearchHelper", "search bar is not visiable, alpha = 0, disable nativate action");
            return;
        }
        if (a.LJIIIZ().LIZJ()) {
            AnonymousClass030.LJ(view2, R.string.g9g);
            return;
        }
        C50646JuE c50646JuE = new C50646JuE();
        c50646JuE.LJIIZILJ("search_position", DetailFeedSearchHelper.LIZJ(map));
        c50646JuE.LJIIZILJ("words_source", "search_bar_outer");
        DetailFeedSearchHelper.LIZ(c50646JuE, map);
        Boolean bool = Boolean.TRUE;
        if (o.LJ(bool, bool)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c50646JuE.LJIIZILJ("is_from_outside", str);
        c50646JuE.LJJIIJZLJL(0);
        c50646JuE.LJIIZILJ("words_source", "search_bar_outer");
        c50646JuE.LJIIZILJ("words_content", str4);
        String str5 = null;
        if (searchSugWordResponse != null && (list = searchSugWordResponse.sugWordList) != null && (searchSugInfo = (SearchSugInfo) ListProtector.get(list, 0)) != null) {
            str2 = searchSugInfo.groupId;
        } else {
            str2 = null;
        }
        c50646JuE.LJIIZILJ("group_id", str2);
        if (searchSugWordResponse != null) {
            str5 = searchSugWordResponse.LJ();
        }
        c50646JuE.LJIIZILJ("impr_id", str5);
        String str6 = (String) map.get("is_from_photo");
        if (str6 != null) {
            if (o.LJ(str6, "1")) {
                c50646JuE.LIZLLL("is_from_video", (String) map.get("is_from_video"));
            }
            c50646JuE.LIZLLL("is_from_photo", str6);
        }
        c50646JuE.LJIILIIL();
        C50699Jv5 c50699Jv5 = new C50699Jv5(new C50650JuI(null, null, null, null, null, null, null, 127, null));
        if (searchSugWordResponse != null) {
            str3 = searchSugWordResponse.LJ();
        } else {
            str3 = "";
        }
        c50699Jv5.LJII(str3);
        SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "//search");
        buildRoute.withParam(DetailFeedSearchHelper.LJFF(map, map2, str4, searchSugWordResponse));
        buildRoute.open();
    }

    public static final void onClick$2(ACListenerS6S1400000_8 aCListenerS6S1400000_8, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View view2 = (View) aCListenerS6S1400000_8.l1;
        Map map = (Map) aCListenerS6S1400000_8.l2;
        Map map2 = (Map) aCListenerS6S1400000_8.l3;
        String str = aCListenerS6S1400000_8.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS6S1400000_8.l4;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIIJ(view2, map, map2, str, searchSugWordResponse);
    }

    public static final void onClick$3(ACListenerS6S1400000_8 aCListenerS6S1400000_8, View view) {
        DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
        View view2 = (View) aCListenerS6S1400000_8.l1;
        Map map = (Map) aCListenerS6S1400000_8.l2;
        Map map2 = (Map) aCListenerS6S1400000_8.l3;
        String str = aCListenerS6S1400000_8.s0;
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) aCListenerS6S1400000_8.l4;
        detailFeedSearchHelper.getClass();
        DetailFeedSearchHelper.LJIIJ(view2, map, map2, str, searchSugWordResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS6S1400000_8(View view, View view2, Map<String, String> map, Map<String, Boolean> map2, String str, SearchSugWordResponse searchSugWordResponse) {
        this.$t = searchSugWordResponse;
        this.l1 = view;
        this.l2 = view2;
        this.l3 = map;
        this.s0 = map2;
        this.l4 = str;
    }
}
