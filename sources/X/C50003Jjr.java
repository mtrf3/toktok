package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.ui.SearchChallengeFragment;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.DynamicSearchLiveFragment;
import com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.ui.DynamicSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.ui.DynamicSearchPlaceFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;
import com.ss.android.ugc.aweme.search.pages.result.usersearch.core.ui.SearchUserFragment;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Jjr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50003Jjr {
    public static final /* synthetic */ int LIZ = 0;

    public static AbsSearchBaseFragment LIZ(ActivityC45651qj activity, SearchResultParam searchResultParam, int i, KEP ecomResultService) {
        AbsSearchBaseFragment dynamicSearchPlaceFragment;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ecomResultService, "ecomResultService");
        if (i == C50605JtZ.LJIIJJI()) {
            String hv0 = ((SearchGlobalViewModel) ViewModelProviders.of(activity).get(SearchGlobalViewModel.class)).hv0(true);
            int hashCode = hv0.hashCode();
            if (hashCode != -348350588) {
                if (hashCode != 3005871) {
                    if (hashCode == 1777232685 && hv0.equals("single_column")) {
                        dynamicSearchPlaceFragment = new TopFeedFragment();
                    }
                    dynamicSearchPlaceFragment = new SearchJediMixFeedFragment();
                } else {
                    if (hv0.equals("auto")) {
                        dynamicSearchPlaceFragment = new TopProxyFragment();
                    }
                    dynamicSearchPlaceFragment = new SearchJediMixFeedFragment();
                }
            } else {
                if (hv0.equals("double_column")) {
                    dynamicSearchPlaceFragment = new SearchJediMixFeedFragment();
                }
                dynamicSearchPlaceFragment = new SearchJediMixFeedFragment();
            }
        } else if (i == C50605JtZ.LJIIIZ()) {
            dynamicSearchPlaceFragment = new DynamicSearchMusicFragment();
        } else if (i == C50605JtZ.LJIIL()) {
            dynamicSearchPlaceFragment = new SearchUserFragment();
        } else if (i == C50605JtZ.LJIIIIZZ()) {
            if (e1.LIZ(31744, "ec_search_result_refactor", true, false)) {
                dynamicSearchPlaceFragment = EcomSearchServiceImpl.LJJJJZI().LJJIFFI(ecomResultService);
            } else {
                dynamicSearchPlaceFragment = EcomSearchServiceImpl.LJJJJZI().LJJJJI(ecomResultService);
            }
        } else if (i == C50605JtZ.LIZJ()) {
            dynamicSearchPlaceFragment = new SearchChallengeFragment();
        } else if (i == C50605JtZ.LJIILIIL()) {
            dynamicSearchPlaceFragment = new SearchFeedFragment();
        } else if (i == C50605JtZ.LJ()) {
            dynamicSearchPlaceFragment = new DynamicSearchLiveFragment();
        } else if (i == C50605JtZ.LJI()) {
            dynamicSearchPlaceFragment = new DynamicSearchPlaceFragment();
        } else {
            throw new IllegalStateException(KMP.LJ("Unknown Fragment position: ", i));
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_key", searchResultParam);
        dynamicSearchPlaceFragment.setArguments(bundle);
        return dynamicSearchPlaceFragment;
    }
}
