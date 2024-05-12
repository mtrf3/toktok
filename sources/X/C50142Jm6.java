package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;

/* renamed from: X.Jm6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50142Jm6 implements InterfaceC50133Jlx {
    public final /* synthetic */ SearchFragment<Object> LIZ;

    public C50142Jm6(SearchFragment<Object> searchFragment) {
        this.LIZ = searchFragment;
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZ(C50287JoR c50287JoR) {
        NextLiveData<Boolean> jv0;
        this.LIZ.Zm(0, c50287JoR);
        SearchStartViewModel searchStartViewModel = this.LIZ.LLIILII;
        if (searchStartViewModel == null || (jv0 = searchStartViewModel.jv0()) == null) {
            return;
        }
        jv0.setValue(Boolean.valueOf(!c50287JoR.isDefaultOption()));
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZIZ(C50287JoR c50287JoR) {
        SearchFragment<Object> searchFragment = this.LIZ;
        searchFragment.getClass();
        searchFragment.LJLZ = "tab_search";
        SearchFragment<Object> searchFragment2 = this.LIZ;
        searchFragment2.LJLJI = c50287JoR;
        searchFragment2.Ql("tab_search");
        SearchResultParam searchResultParam = this.LIZ.LJLLILLLL;
        if (searchResultParam == null) {
            return;
        }
        searchResultParam.setGeneralSearchSortType(1);
    }
}
