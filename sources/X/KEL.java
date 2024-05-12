package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEL implements KE0 {
    public final /* synthetic */ KE2 LIZ;
    public final /* synthetic */ HalfDynamicSearchShopFragment LIZIZ;

    @Override // X.KE0
    public final Integer LIZIZ() {
        return null;
    }

    @Override // X.KE0
    public final void LIZJ(SearchResultParam searchResultParam, String str) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
    }

    @Override // X.KE0
    public final String LIZLLL() {
        return null;
    }

    @Override // X.KE0
    public final String LJ() {
        return null;
    }

    @Override // X.KE0
    public final String LJFF() {
        return null;
    }

    @Override // X.KE0
    public final void LJIIIIZZ(GlobalDoodleConfig globalDoodleConfig) {
    }

    @Override // X.KE0
    public final String LJIIIZ() {
        return "";
    }

    @Override // X.KE0
    public final void LJIIJ() {
    }

    @Override // X.KE0
    public final String LJIIJJI() {
        return null;
    }

    @Override // X.KE0
    public final Object LJIIL() {
        return null;
    }

    @Override // X.KE0
    public final void LJIILIIL() {
    }

    @Override // X.KE0
    public final Integer LJIILL() {
        return null;
    }

    @Override // X.KE0
    public final String LJIILLIIL() {
        return "";
    }

    @Override // X.KE0
    public final String LJIIZILJ() {
        return null;
    }

    @Override // X.KE0
    public final String LJIJ() {
        return "";
    }

    @Override // X.KE0
    public final String LJIJJ() {
        return null;
    }

    @Override // X.KE0
    public final ECSearchEntranceData LJI() {
        SearchResultParam searchResultParam;
        C50948Jz6 searchEnterParam;
        KE2 ke2 = this.LIZIZ.LJLJJI;
        if (ke2 != null && (searchResultParam = ke2.getSearchResultParam()) != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            return searchEnterParam.getEcSearchEntranceData();
        }
        return null;
    }

    @Override // X.KE0
    public final int LJII() {
        C50948Jz6 searchEnterParam;
        SearchResultParam searchResultParam = this.LIZ.getSearchResultParam();
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            return searchEnterParam.getEcSearchEntranceValue();
        }
        return EnumC51281KAr.DEFAULT.getValue();
    }

    @Override // X.KE0
    public final String LJIILJJIL() {
        C50948Jz6 searchEnterParam;
        SearchResultParam searchResultParam = this.LIZ.getSearchResultParam();
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            return searchEnterParam.getEnterSearchFrom();
        }
        return null;
    }

    @Override // X.KE0
    public final Integer LJIJI() {
        return Integer.valueOf(EnumC51280KAq.HALF_SHOP.getValue());
    }

    @Override // X.KE0
    public final String LIZ() {
        String LJJIFFI;
        ICommonFeedApiService LIZ = CommonFeedApiService.LIZ();
        if (LIZ != null && (LJJIFFI = LIZ.LJJIFFI()) != null) {
            return LJJIFFI;
        }
        return "";
    }

    @Override // X.KE0
    public final String getGroupId() {
        String LJJIFFI;
        ICommonFeedApiService LIZ = CommonFeedApiService.LIZ();
        if (LIZ != null && (LJJIFFI = LIZ.LJJIFFI()) != null) {
            return LJJIFFI;
        }
        return "";
    }

    public KEL(KE2 ke2, HalfDynamicSearchShopFragment halfDynamicSearchShopFragment) {
        this.LIZ = ke2;
        this.LIZIZ = halfDynamicSearchShopFragment;
    }
}
