package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.K9t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51257K9t extends KAV {
    @Override // X.KAV, X.InterfaceC51346KDe
    public final void LJJIL(SearchResultParam searchResultParam) {
        int i;
        String str;
        KAU Jc0;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.LJJIL(searchResultParam);
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "mall_skeleton_search");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LJIIJJI;
        if (iPageSearchSubPageAbility != null && (Jc0 = iPageSearchSubPageAbility.Jc0()) != null) {
            i = Jc0.ordinal();
        } else {
            i = -1;
        }
        LIZJ.put("is_native_request", i);
        LIZJ.put("enter_method", searchResultParam.getEnterMethod());
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            str = searchEnterParam.getEnterSearchFrom();
        } else {
            str = null;
        }
        LIZJ.put("enter_from", str);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
    }

    public C51257K9t(KA8 ka8, AqS158S0100000_8 aqS158S0100000_8, AqS158S0100000_8 aqS158S0100000_82, AqS158S0100000_8 aqS158S0100000_83, AqS158S0100000_8 aqS158S0100000_84) {
        super(ka8, aqS158S0100000_8, aqS158S0100000_82, aqS158S0100000_83, aqS158S0100000_84, C47261Igj.LJJIJIL(KAU.SUGGEST, KAU.SUG, KAU.RESULT));
    }
}
