package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;

/* renamed from: X.Jtq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50622Jtq implements InterfaceC51365KDx {
    public final /* synthetic */ SearchContainerFragment LIZ;

    @Override // X.InterfaceC51365KDx
    public final String LIZIZ() {
        return "normal";
    }

    @Override // X.InterfaceC51365KDx
    public final void LIZLLL() {
        C50139Jm3.LIZ = false;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIIZ(SearchResultParam searchResultParam, String str, KAK kak) {
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILJJIL() {
        return C50236Jnc.LIZ().LIZ();
    }

    @Override // X.InterfaceC51365KDx
    public final String LIZ() {
        return K56.LIZ(this.LIZ.mo49getActivity());
    }

    @Override // X.InterfaceC51365KDx
    public final String LIZJ() {
        C50650JuI fetchOwnImmutableData = C50652JuK.fetchOwnImmutableData(this.LIZ);
        if (fetchOwnImmutableData != null) {
            return fetchOwnImmutableData.getSingleSearchEcommerceModel().getOriginIsMallTab();
        }
        return null;
    }

    @Override // X.InterfaceC51365KDx
    public final String LJFF() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LJLLLL;
        if (searchStartViewModel != null && searchStartViewModel.LJLJJI) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC51365KDx
    public final String LJI() {
        SearchResultParam searchResultParam = this.LIZ.LJLIL;
        if (searchResultParam != null && searchResultParam.getSearchEnterParam() != null) {
            return this.LIZ.LJLIL.getSearchEnterParam().getEcSearchSessionId();
        }
        return null;
    }

    @Override // X.InterfaceC51365KDx
    public final Object LJIILIIL() {
        return this.LIZ.LLD;
    }

    @Override // X.InterfaceC51365KDx
    public final C50948Jz6 ha() {
        return this.LIZ.LLD.LJLIL;
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJIIIIZZ() {
        return C50139Jm3.LIZ;
    }

    public C50622Jtq(SearchContainerFragment searchContainerFragment) {
        this.LIZ = searchContainerFragment;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJ(LastSearch lastSearch) {
        C50236Jnc.LIZ().LIZJ(lastSearch);
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJII(KE6 ke6) {
        int i = KE8.LIZ[ke6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    return C49503Jbn.LIZJ;
                }
                return C49503Jbn.LIZIZ;
            }
            return C49503Jbn.LJIIIZ;
        }
        return C49503Jbn.LIZLLL;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJJI(KE6 ke6) {
        int i = KE8.LIZ[ke6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C49503Jbn.LIZJ = false;
                    return;
                }
                C49503Jbn.LIZIZ = false;
                return;
            }
            C49503Jbn.LJIIIZ = false;
            return;
        }
        C49503Jbn.LIZLLL = false;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIL(String str) {
        SearchStartViewModel searchStartViewModel = this.LIZ.LJLLLL;
        if (searchStartViewModel != null) {
            searchStartViewModel.LJLLLL = str;
        }
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJ(Context context, SearchResultParam searchResultParam) {
        C50642JuA.LIZ(context, searchResultParam);
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILL(ActivityC45651qj activityC45651qj, SearchResultParam searchResultParam) {
        return C50589JtJ.LIZ(activityC45651qj, searchResultParam);
    }
}
