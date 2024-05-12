package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS125S0300000_8;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.IDqS37S0300000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KSz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51757KSz {
    public static List LIZLLL(String str) {
        C50409JqP.LIZ.getClass();
        return C50409JqP.LIZ(str);
    }

    public static void LIZIZ(View itemView, JYG jyg) {
        o.LJIIIZ(itemView, "itemView");
        if (!AccountService.LJIJ().LJFF().isLogin()) {
            return;
        }
        Context context = itemView.getContext();
        if (jyg != null) {
            LJ(jyg, C17N.LJJJJLL(), "open");
            itemView.performHapticFeedback(0, 2);
            LJFF(itemView, true);
            SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = new SearchFeedbackOptionalFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("search_feedback_model", jyg);
            searchFeedbackOptionalFragment.setArguments(bundle);
            searchFeedbackOptionalFragment.LJLLI = new IDqS37S0300000_8(context, searchFeedbackOptionalFragment, jyg, 1);
            searchFeedbackOptionalFragment.LJLLILLLL = new AqS125S0300000_8(context, searchFeedbackOptionalFragment, jyg, 3);
            Context context2 = itemView.getContext();
            ASL LIZ = C249109q6.LIZ(1);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLLILLLL = searchFeedbackOptionalFragment;
            tuxSheet.LJZI = false;
            LIZ.LJFF(16);
            ActivityC45651qj LJJIJIL = C30581Hy.LJJIJIL(itemView);
            ISettingService LIZ2 = SettingServiceImpl.LIZ();
            o.LJI(LJJIJIL);
            if (o.LJ(LIZ2.getTheme(LJJIJIL.hashCode()), "dark")) {
                LIZ.LIZLLL(R.style.vo);
            }
            KT0 kt0 = new KT0(context2, itemView, jyg);
            TuxSheet tuxSheet2 = LIZ.LIZ;
            tuxSheet2.LJLILLLLZI = kt0;
            Activity LIZ3 = C27740Aue.LIZ(context);
            o.LJII(LIZ3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1DG.LJII((ActivityC45651qj) LIZ3, "ViewUtils.getActivity(co…y).supportFragmentManager", tuxSheet2, "searchFeedbackOption");
        }
    }

    public static java.util.Map LIZJ(JYG jyg, ISearchContextAbility iSearchContextAbility) {
        String str;
        String str2;
        String str3;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        String str4;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> logParams = jyg.getLogParams();
        if (logParams != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry : logParams.entrySet()) {
                if (!o.LJ(entry.getKey(), "enter_from")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        java.util.Map<String, String> logParams2 = jyg.getLogParams();
        if (logParams2 != null) {
            str = logParams2.get("enter_from");
        } else {
            str = null;
        }
        String str5 = "";
        if (o.LJ(str, "general_search")) {
            str2 = "general_search_list";
        } else if (!o.LJ(str, "search_result")) {
            str2 = "";
        } else {
            str2 = "search_result_list";
        }
        linkedHashMap.put("enter_from", str2);
        if (iSearchContextAbility == null || (If2 = iSearchContextAbility.If()) == null || (LIZJ2 = If2.LIZJ()) == null || (str3 = LIZJ2.LJLJI) == null) {
            str3 = "";
        }
        linkedHashMap.put("search_id", str3);
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null && (str4 = LIZJ.LJLJJI) != null) {
            str5 = str4;
        }
        linkedHashMap.put("search_keyword", str5);
        return linkedHashMap;
    }

    public static void LJFF(View view, boolean z) {
        ActivityC45651qj LJJIJIL = C30581Hy.LJJIJIL(view);
        if (LJJIJIL == null) {
            return;
        }
        ((SearchStateViewModel) ViewModelProviders.of(LJJIJIL).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(z);
    }

    public static void LJ(JYG jyg, ISearchContextAbility iSearchContextAbility, String str) {
        String str2;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        String str3;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ2;
        java.util.Map<String, String> logParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jyg != null && (logParams = jyg.getLogParams()) != null) {
            linkedHashMap.putAll(logParams);
        }
        String str4 = "";
        if (iSearchContextAbility == null || (If2 = iSearchContextAbility.If()) == null || (LIZJ2 = If2.LIZJ()) == null || (str2 = LIZJ2.LJLJI) == null) {
            str2 = "";
        }
        linkedHashMap.put("search_id", str2);
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null && (str3 = LIZJ.LJLJJI) != null) {
            str4 = str3;
        }
        linkedHashMap.put("search_keyword", str4);
        linkedHashMap.put("action_type", str);
        FMX.LJIIL("search_result_feedback", linkedHashMap);
    }

    public static void LIZ(Context context, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, JYG jyg, FeedbackMultipleChoice choice, int i, boolean z) {
        o.LJIIIZ(choice, "choice");
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = new SearchFeedbackOptionalDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("param_feedback_choice", choice);
        bundle.putInt("param_feedback_rank", i);
        bundle.putBoolean("param_feedback_require_content", z);
        searchFeedbackOptionalDetailFragment.setArguments(bundle);
        View view = searchFeedbackOptionalFragment.LJLILLLLZI;
        java.util.Map<String, String> map = null;
        if (view != null) {
            searchFeedbackOptionalDetailFragment.LJLILLLLZI = view.getMeasuredHeight();
            if (jyg != null) {
                map = jyg.getLogParams();
            }
            searchFeedbackOptionalDetailFragment.LJLJJLL = map;
            searchFeedbackOptionalDetailFragment.LJLJLLL = new AqS155S0200000_8(context, searchFeedbackOptionalDetailFragment, 31);
            ASQ.LJIILIIL(searchFeedbackOptionalFragment, searchFeedbackOptionalDetailFragment, true);
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
