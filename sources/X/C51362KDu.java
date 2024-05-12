package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.KDu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51362KDu implements InterfaceC51365KDx {
    public final /* synthetic */ KE2 LIZ;

    @Override // X.InterfaceC51365KDx
    public final String LIZ() {
        return "";
    }

    @Override // X.InterfaceC51365KDx
    public final String LIZIZ() {
        return "half_shop";
    }

    @Override // X.InterfaceC51365KDx
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC51365KDx
    public final String LJFF() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJII(KE6 type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.InterfaceC51365KDx
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIIZ(SearchResultParam searchResultParam, String str, KAK searchTab) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        o.LJIIIZ(searchTab, "searchTab");
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJ(Context context, SearchResultParam param) {
        o.LJIIIZ(param, "param");
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIJJI(KE6 type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.InterfaceC51365KDx
    public final void LJIIL(String str) {
    }

    @Override // X.InterfaceC51365KDx
    public final Object LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILJJIL() {
        return C51233K8v.LIZ().LIZIZ();
    }

    @Override // X.InterfaceC51365KDx
    public final String LJIILL(ActivityC45651qj activityC45651qj, SearchResultParam searchResultParam) {
        return null;
    }

    @Override // X.InterfaceC51365KDx
    public final String LJI() {
        return this.LIZ.getEcSearchSessionId();
    }

    public final SearchResultParam LJIILLIIL() {
        return this.LIZ.getSearchResultParam();
    }

    @Override // X.InterfaceC51365KDx
    public final C50948Jz6 ha() {
        SearchResultParam searchResultParam = this.LIZ.getSearchResultParam();
        if (searchResultParam != null) {
            return searchResultParam.getSearchEnterParam();
        }
        return null;
    }

    @Override // X.InterfaceC51365KDx
    public final String LIZJ() {
        String LJIIIIZZ = EcomSearchServiceImpl.LJJJJZI().LJIIIIZZ("origin_is_mall_tab");
        if (LJIIIIZZ == null) {
            return "";
        }
        return LJIIIIZZ;
    }

    public C51362KDu(KE2 ke2) {
        this.LIZ = ke2;
    }

    @Override // X.InterfaceC51365KDx
    public final void LJ(LastSearch lastSearch) {
        C51233K8v.LIZ().LIZJ(lastSearch);
    }
}
