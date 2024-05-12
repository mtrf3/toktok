package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class K5J implements InterfaceC51113K4f {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC51113K4f
    public final HashMap<String, Long> LIZIZ() {
        HashMap<String, Long> hashMap;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (hashMap = searchStartViewModel.LLFF) == null) {
            return new HashMap<>();
        }
        return hashMap;
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LIZJ() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel != null) {
            return searchStartViewModel.LJLJI;
        }
        return false;
    }

    @Override // X.InterfaceC51113K4f
    public final void LIZLLL() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null) {
            return;
        }
        searchStartViewModel.LJLJJL = true;
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LJ() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel != null) {
            return searchStartViewModel.LJLJJLL;
        }
        return false;
    }

    public K5J(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC51113K4f
    public final void LIZ(SearchResultParam searchResultParam) {
        if (SearchStateViewModel.isSearchIntermediate(this.LIZ.Jl()) && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            if (this.LIZ.Al(searchResultParam).booleanValue()) {
                this.LIZ.Nm();
            }
            if (((Number) K5K.LIZ.getValue()).intValue() != 0) {
                C49921JiX.LJFF(0, searchResultParam);
            }
            C49922JiY.LJ(0, searchResultParam);
            SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
            SearchStartViewModel searchStartViewModel = searchResultFragmentNew.LLFZ;
            if (searchStartViewModel != null) {
                searchStartViewModel.LLD = searchResultParam;
            }
            searchResultFragmentNew.ym(searchResultParam, false);
        }
    }
}
