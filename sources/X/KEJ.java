package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.result.common.core.ui.EcDynamicSearchLiveFragment;
import com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchOrderFragment;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreFragmentNew;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KEJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreFragmentNew] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment] */
    public static SearchVisibilityDetectFragmentNew LIZ(SearchResultParam searchResultParam, int i, KEP ecomResultService) {
        int i2;
        EcSearchBaseRefactorFragment ecSearchBaseRefactorFragment;
        String str;
        String enterMethod;
        C50948Jz6 searchEnterParam;
        o.LJIIIZ(ecomResultService, "ecomResultService");
        if (i == C51214K8c.LJI()) {
            ?? dynamicSearchShopFragment = new DynamicSearchShopFragment();
            dynamicSearchShopFragment.LJLLI = ecomResultService;
            i2 = 1;
            ecSearchBaseRefactorFragment = dynamicSearchShopFragment;
        } else if (i == C51214K8c.LJII()) {
            ?? dynamicSearchStoreFragmentNew = new DynamicSearchStoreFragmentNew();
            dynamicSearchStoreFragmentNew.LJLLI = ecomResultService;
            i2 = 2;
            ecSearchBaseRefactorFragment = dynamicSearchStoreFragmentNew;
        } else if (i == C51214K8c.LIZLLL()) {
            EcSearchBaseRefactorFragment ecDynamicSearchLiveFragment = new EcDynamicSearchLiveFragment();
            ecDynamicSearchLiveFragment.LJLLI = ecomResultService;
            i2 = 3;
            ecSearchBaseRefactorFragment = ecDynamicSearchLiveFragment;
        } else if (i == ((ArrayList) C51214K8c.LIZIZ).indexOf(KAK.ORDER)) {
            EcSearchBaseRefactorFragment dynamicSearchOrderFragment = new DynamicSearchOrderFragment();
            dynamicSearchOrderFragment.LJLLI = ecomResultService;
            i2 = 4;
            ecSearchBaseRefactorFragment = dynamicSearchOrderFragment;
        } else {
            throw new IllegalStateException(KMP.LJ("Unknown Fragment position: ", i));
        }
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "shop_fragment_create");
        String str2 = "";
        if (searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (str = searchEnterParam.getEnterSearchFrom()) == null) {
            str = "";
        }
        LIZJ.put("enter_from", str);
        if (searchResultParam != null && (enterMethod = searchResultParam.getEnterMethod()) != null) {
            str2 = enterMethod;
        }
        LIZJ.put("enter_method", str2);
        LIZJ.put("tab_name", String.valueOf(i2));
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_key", searchResultParam);
        ecSearchBaseRefactorFragment.setArguments(bundle);
        return ecSearchBaseRefactorFragment;
    }
}
