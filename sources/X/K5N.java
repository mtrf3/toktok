package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5N implements InterfaceC50547Jsd {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    public K5N(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC50547Jsd
    public final void LIZ(int i) {
        NextLiveData<Integer> iv0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.LIZ.ln(false, false);
                return;
            }
            this.LIZ.ln(false, false);
            return;
        }
        if (KB1.LIZ(JTO.LIZIZ(this.LIZ.mo49getActivity())) == EnumC51280KAq.FASHION.getValue()) {
            this.LIZ.ln(true, true);
            return;
        }
        if (C51242K9e.LIZ()) {
            K5R k5r = this.LIZ.LJLZ;
            String str = null;
            if (k5r != null) {
                str = k5r.LJI;
            }
            KAK kak = KAK.SHOP;
            if (o.LJ(str, kak.getTabName())) {
                this.LIZ.ln(true, true);
                return;
            }
            SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
            if (searchResultFragmentNew.LLIIII != null) {
                SearchStartViewModel searchStartViewModel = searchResultFragmentNew.LLFZ;
                if (searchStartViewModel == null || (iv0 = searchStartViewModel.iv0()) == null || iv0.getValue() == null) {
                    C50948Jz6 searchEnterParam = searchResultFragmentNew.LLIIII.getSearchEnterParam();
                    if (searchEnterParam != null && searchEnterParam.getTargetTab() == kak) {
                        searchResultFragmentNew.ln(true, true);
                    } else {
                        searchResultFragmentNew.ln(true, false);
                    }
                } else {
                    if (o.LJ(C50605JtZ.LJFF(searchResultFragmentNew.Vm()), kak.getTabName())) {
                        SearchResultParam mSearchParam = searchResultFragmentNew.LLIIII;
                        o.LJIIIIZZ(mSearchParam, "mSearchParam");
                        if (!searchResultFragmentNew.Al(mSearchParam).booleanValue()) {
                            searchResultFragmentNew.ln(true, true);
                        }
                    }
                    searchResultFragmentNew.ln(true, false);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            this.LIZ.ln(true, false);
            return;
        }
        this.LIZ.ln(true, false);
    }
}
