package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K7V implements InterfaceC51113K4f {
    public final /* synthetic */ EcSearchResultFragmentNew LIZ;

    @Override // X.InterfaceC51113K4f
    public final HashMap<String, Long> LIZIZ() {
        HashMap<String, Long> hashMap;
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null || (hashMap = ecSearchStartViewModel.LJZI) == null) {
            return new HashMap<>();
        }
        return hashMap;
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LIZJ() {
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel != null) {
            return ecSearchStartViewModel.LJLILLLLZI;
        }
        return false;
    }

    @Override // X.InterfaceC51113K4f
    public final void LIZLLL() {
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel == null) {
            return;
        }
        ecSearchStartViewModel.LJLJJI = true;
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LJ() {
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLZ;
        if (ecSearchStartViewModel != null) {
            return ecSearchStartViewModel.LJLJJL;
        }
        return false;
    }

    public K7V(EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.LIZ = ecSearchResultFragmentNew;
    }

    @Override // X.InterfaceC51113K4f
    public final void LIZ(SearchResultParam searchResultParam) {
        String str;
        String str2;
        boolean isSearchIntermediate = SearchStateViewModel.isSearchIntermediate(this.LIZ.Hl());
        boolean isEmpty = TextUtils.isEmpty(searchResultParam.getKeyword());
        if (!isSearchIntermediate) {
            str = "openSearchErrorState";
        } else if (isEmpty) {
            str = "openSearchEmpty";
        } else {
            str = "openSearch";
        }
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, str);
        LIZJ.put("enter_method", searchResultParam.getEnterMethod());
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            str2 = searchEnterParam.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        LIZJ.put("enter_from", str2);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
        if (isSearchIntermediate && !isEmpty) {
            this.LIZ.wl(searchResultParam);
            this.LIZ.fm(searchResultParam, false);
        }
    }
}
