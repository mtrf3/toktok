package com.ss.android.ugc.aweme.result.common.core.viewmodel;

import X.C35651Dyx;
import X.C36012EBk;
import X.C36036ECi;
import X.C51366KDy;
import X.InterfaceC50037JkP;
import X.KE1;
import X.KFQ;
import X.KFT;
import X.XKQ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.result.common.core.model.EComCreatorSearchStruct;
import com.ss.android.ugc.aweme.result.common.core.model.EComMallLiveTabCardStruct;
import com.ss.android.ugc.aweme.result.common.core.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcSearchResultLiveViewModel extends AssemViewModel<C35651Dyx> {
    public final C51366KDy LJLIL;
    public final C36036ECi LJLILLLLZI;
    public final KE1 LJLJI;
    public final KFQ LJLJJI;
    public final Gson LJLJJL;
    public final List<Aweme> LJLJJLL;
    public Boolean LJLJL;
    public InterfaceC50037JkP LJLJLJ;
    public final Map<String, String> LJLJLLL;
    public long LJLL;
    public List<Aweme> LJLLI;
    public HashMap<String, String> LJLLILLLL;
    public String LJLLJ;
    public XKQ LJLLL;
    public final KFT LJLLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35651Dyx defaultState() {
        return new C35651Dyx(0);
    }

    public final List<Aweme> gv0(List<EComMallLiveTabCardStruct> list) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EComMallLiveTabCardStruct eComMallLiveTabCardStruct : list) {
                EComCreatorSearchStruct eComCreatorSearchStruct = eComMallLiveTabCardStruct.creatorCardInfo;
                Aweme aweme2 = null;
                if (eComCreatorSearchStruct != null) {
                    aweme = eComCreatorSearchStruct.liveEntity;
                } else {
                    aweme = null;
                }
                EComShopCardStruct eComShopCardStruct = eComMallLiveTabCardStruct.shopCardInfo;
                if (eComShopCardStruct != null) {
                    aweme2 = eComShopCardStruct.liveEntity;
                }
                if (aweme != null) {
                    arrayList.add(aweme);
                    String str = eComMallLiveTabCardStruct.searchResultId;
                    if (str != null) {
                        Map<String, String> map = this.LJLJLLL;
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "it.aid");
                        map.put(aid, str);
                    }
                }
                if (aweme2 != null) {
                    arrayList.add(aweme2);
                    String str2 = eComMallLiveTabCardStruct.searchResultId;
                    if (str2 != null) {
                        Map<String, String> map2 = this.LJLJLLL;
                        String aid2 = aweme2.getAid();
                        o.LJIIIIZZ(aid2, "it.aid");
                        map2.put(aid2, str2);
                    }
                }
            }
        }
        this.LJLLI = arrayList;
        ((ArrayList) this.LJLJJLL).addAll(arrayList);
        return arrayList;
    }

    public final void hv0(SearchResultParam searchResultParam) {
        ((ArrayList) this.LJLJJLL).clear();
        ((LinkedHashMap) this.LJLJLLL).clear();
        KFQ kfq = this.LJLJJI;
        if (kfq != null) {
            kfq.LJ("request_start");
        }
        XKQ xkq = this.LJLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLLL = XKX.LIZLLL(getAssemVMScope(), null, null, new C36012EBk(this, searchResultParam, null), 3);
    }

    public EcSearchResultLiveViewModel(C51366KDy buildFeInitParamsUseCase, C36036ECi buildSearchRequestParamsUseCase, KE1 handleNativeFetchResultUseCase, KFQ kfq) {
        o.LJIIIZ(buildFeInitParamsUseCase, "buildFeInitParamsUseCase");
        o.LJIIIZ(buildSearchRequestParamsUseCase, "buildSearchRequestParamsUseCase");
        o.LJIIIZ(handleNativeFetchResultUseCase, "handleNativeFetchResultUseCase");
        this.LJLIL = buildFeInitParamsUseCase;
        this.LJLILLLLZI = buildSearchRequestParamsUseCase;
        this.LJLJI = handleNativeFetchResultUseCase;
        this.LJLJJI = kfq;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLJJL = LIZ;
        this.LJLJJLL = new ArrayList();
        this.LJLJL = Boolean.TRUE;
        this.LJLJLLL = new LinkedHashMap();
        this.LJLLI = new ArrayList();
        this.LJLLLL = new KFT(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0 A[Catch: Exception -> 0x0117, TryCatch #4 {Exception -> 0x0117, blocks: (B:13:0x00d9, B:14:0x00dc, B:16:0x00e0, B:18:0x00e4, B:20:0x00ea, B:21:0x00ee, B:23:0x00f5, B:25:0x0107, B:26:0x010c, B:30:0x0111, B:31:0x0116), top: B:12:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[Catch: Exception -> 0x0117, TryCatch #4 {Exception -> 0x0117, blocks: (B:13:0x00d9, B:14:0x00dc, B:16:0x00e0, B:18:0x00e4, B:20:0x00ea, B:21:0x00ee, B:23:0x00f5, B:25:0x0107, B:26:0x010c, B:30:0x0111, B:31:0x0116), top: B:12:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad A[Catch: Exception -> 0x011a, TryCatch #3 {Exception -> 0x011a, blocks: (B:41:0x00a9, B:43:0x00ad, B:45:0x00b0, B:53:0x008a, B:54:0x008d), top: B:52:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[Catch: Exception -> 0x011a, TryCatch #3 {Exception -> 0x011a, blocks: (B:41:0x00a9, B:43:0x00ad, B:45:0x00b0, B:53:0x008a, B:54:0x008d), top: B:52:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rk0(java.lang.String r19, X.KFN r20, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.InterfaceC36553EWf> r21, X.InterfaceC67352kd<? super X.C76800UCe> r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel.rk0(java.lang.String, X.KFN, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.2kd):java.lang.Object");
    }
}
