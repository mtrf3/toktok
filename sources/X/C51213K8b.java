package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* renamed from: X.K8b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51213K8b implements InterfaceC51365KDx {
    public final /* synthetic */ EcSearchContainerFragment LIZ;

    @Override // X.InterfaceC51365KDx
    public final String LIZIZ() {
        return "simple";
    }

    @Override // X.InterfaceC51365KDx
    public final void LIZLLL() {
        C51210K7y.LIZ = false;
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILJJIL() {
        return C51233K8v.LIZ().LIZIZ();
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
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLLILLLL;
        if (ecSearchStartViewModel != null && ecSearchStartViewModel.LJLJI) {
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
        return this.LIZ.LJLLLL;
    }

    @Override // X.InterfaceC51365KDx
    public final C50948Jz6 ha() {
        return this.LIZ.LJLLLL.LJLIL;
    }

    @Override // X.InterfaceC51365KDx
    public final String LIZ() {
        return C51307KBr.LIZ;
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJIIIIZZ() {
        return C51210K7y.LIZ;
    }

    public C51213K8b(EcSearchContainerFragment ecSearchContainerFragment) {
        this.LIZ = ecSearchContainerFragment;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJ(LastSearch lastSearch) {
        C51233K8v.LIZ().LIZJ(lastSearch);
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJII(KE6 ke6) {
        int i = KE7.LIZ[ke6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    return C50990Jzm.LIZJ;
                }
                return C50990Jzm.LIZIZ;
            }
            return C50990Jzm.LJ;
        }
        return C50990Jzm.LIZLLL;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJJI(KE6 ke6) {
        int i = KE7.LIZ[ke6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C50990Jzm.LIZJ = false;
                    return;
                }
                C50990Jzm.LIZIZ = false;
                return;
            }
            C50990Jzm.LJ = false;
            return;
        }
        C50990Jzm.LIZLLL = false;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIL(String str) {
        EcSearchStartViewModel ecSearchStartViewModel = this.LIZ.LJLLILLLL;
        if (ecSearchStartViewModel != null) {
            ecSearchStartViewModel.LJLLJ = str;
        }
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJ(Context context, SearchResultParam searchResultParam) {
        C51221K8j.LIZ(context, searchResultParam);
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILL(ActivityC45651qj activityC45651qj, SearchResultParam searchResultParam) {
        return C50590JtK.LIZ(activityC45651qj, searchResultParam);
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIIZ(SearchResultParam searchResultParam, String str, KAK kak) {
        K9C LIZ = K8T.LIZ(C55230Lly.LJFF(this.LIZ, null));
        if (LIZ != null) {
            KAJ kaj = KAJ.SHOP;
            if (kak == KAK.ECOM_LIVE) {
                kaj = KAJ.ECOM_LIVE;
            } else if (kak == KAK.STORE) {
                kaj = KAJ.STORE;
            }
            LIZ.LIZIZ(new K9A(kaj, str));
        }
    }
}
