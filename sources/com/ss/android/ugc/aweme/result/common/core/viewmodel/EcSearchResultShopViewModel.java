package com.ss.android.ugc.aweme.result.common.core.viewmodel;

import X.C10K;
import X.C221108m2;
import X.C2SB;
import X.C35650Dyw;
import X.C36036ECi;
import X.C50287JoR;
import X.C51366KDy;
import X.C62822Ol8;
import X.C65314PkE;
import X.C76542zS;
import X.KE0;
import X.KE1;
import X.KEP;
import X.KFN;
import X.KFQ;
import Y.AgS109S0200000_6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.search.ab.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchResultShopViewModel extends AssemViewModel<C35650Dyw> {
    public final C51366KDy LJLIL;
    public final C36036ECi LJLILLLLZI;
    public final KE1 LJLJI;
    public final KFQ LJLJJI;
    public final KEP LJLJJL;
    public final KE0 LJLJJLL;
    public final Gson LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35650Dyw defaultState() {
        return new C35650Dyw(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gv0(KFN kfn, SearchResultParam searchResultParam) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        String obj = ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString();
        String str = EcSearchApi.LIZ;
        o.LJIIIIZZ(str, "EcSearchApi.SEARCH_HOST");
        String searchChannel = kfn.getSearchChannel();
        if (searchChannel == null) {
            searchChannel = "tiktok_ecom";
        }
        long cursor = kfn.getCursor();
        String keyword = kfn.getKeyword();
        String enterFrom = kfn.getEnterFrom();
        int count = kfn.getCount();
        int hotSearch = kfn.getHotSearch();
        String searchId = kfn.getSearchId();
        String lastSearchId = kfn.getLastSearchId();
        String source = kfn.getSource();
        String searchSource = kfn.getSearchSource();
        int correctType = kfn.getCorrectType();
        C50287JoR filterOption = kfn.getFilterOption();
        if (filterOption != null) {
            z = filterOption.isDefaultOption();
        } else {
            z = 1;
        }
        int i3 = !z;
        C50287JoR filterOption2 = kfn.getFilterOption();
        if (filterOption2 != null) {
            i = filterOption2.getFilterBy();
        } else {
            i = 0;
        }
        C50287JoR filterOption3 = kfn.getFilterOption();
        if (filterOption3 != null) {
            i2 = filterOption3.getSortType();
        } else {
            i2 = 0;
        }
        C50287JoR filterOption4 = kfn.getFilterOption();
        if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C10K LJIILIIL = C65314PkE.LJIILIIL(obj, str, searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i3, i, i2, linkedHashMap, kfn.getSearchContext(), kfn.getSugTagText(), kfn.getSugType(), kfn.getSugQueryState(), kfn.getSugCreatorId(), kfn.getAttachProducts(), kfn.getTrafficSourceList(), kfn.getCmplEnc(), kfn.getOriginIsMallTab(), kfn.getEcSearchSessionId(), kfn.getSugShopId(), kfn.getUserRtActs(), kfn.getApiVersion(), kfn.getSearchSessionId(), kfn.getUserActions());
        System.currentTimeMillis();
        hv0(0, null);
        if (LJIILIIL != null) {
            LJIILIIL.LJFF(new AgS109S0200000_6(this, searchResultParam, 2));
        }
    }

    public final void hv0(int i, m mVar) {
        int i2;
        if (mVar != null) {
            try {
                if (mVar.LJJIJ("chunk_meta") != null) {
                    j LJJIJ = mVar.LJJIJ("chunk_meta");
                    o.LJII(LJJIJ, "null cannot be cast to non-null type com.google.gson.JsonObject");
                    m mVar2 = (m) LJJIJ;
                    j LJJIJ2 = mVar2.LJJIJ("cursor");
                    int i3 = 0;
                    if (LJJIJ2 != null) {
                        i2 = LJJIJ2.LJIILJJIL();
                    } else {
                        i2 = 0;
                    }
                    j LJJIJ3 = mVar2.LJJIJ("items_count");
                    if (LJJIJ3 != null) {
                        i3 = LJJIJ3.LJIILJJIL();
                    }
                    iv0(i2, i3, i);
                    return;
                }
            } catch (Exception unused) {
                iv0(-2, -2, i);
                return;
            }
        }
        iv0(-1, -1, i);
    }

    public final void iv0(int i, int i2, int i3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        linkedHashMap.put("chunk_cursor", Integer.valueOf(i));
        linkedHashMap.put("chunk_count", Integer.valueOf(i2));
        linkedHashMap.put("step", Integer.valueOf(i3));
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }

    public EcSearchResultShopViewModel(C51366KDy buildFeInitParamsUseCase, C36036ECi buildSearchRequestParamsUseCase, KE1 handleNativeFetchResultUseCase, KFQ kfq, KE0 ke0, KEP kep) {
        o.LJIIIZ(buildFeInitParamsUseCase, "buildFeInitParamsUseCase");
        o.LJIIIZ(buildSearchRequestParamsUseCase, "buildSearchRequestParamsUseCase");
        o.LJIIIZ(handleNativeFetchResultUseCase, "handleNativeFetchResultUseCase");
        this.LJLIL = buildFeInitParamsUseCase;
        this.LJLILLLLZI = buildSearchRequestParamsUseCase;
        this.LJLJI = handleNativeFetchResultUseCase;
        this.LJLJJI = kfq;
        this.LJLJJL = kep;
        this.LJLJJLL = ke0;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLJL = LIZ;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 478));
        C221108m2.LIZIZ(C2SB.LJLIL);
    }
}
