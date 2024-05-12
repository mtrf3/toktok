package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KE1 {
    public final KE0 LIZ;
    public final KEP LIZIZ;

    public KE1(KE0 ke0, KEP kep) {
        this.LIZ = ke0;
        this.LIZIZ = kep;
    }

    public final void LIZ(SearchApiResult searchApiResult, SearchResultParam searchResultParam) {
        InterfaceC51365KDx LIZ;
        String imprId;
        String imprId2;
        String str;
        KE0 ke0;
        InterfaceC51365KDx LIZ2;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        KEP kep = this.LIZIZ;
        String str5 = "";
        Long l = null;
        if (kep != null && (LIZ2 = kep.LIZ()) != null) {
            String keyword = searchResultParam.getKeyword();
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig != null) {
                str3 = globalDoodleConfig.getSearchChannel();
            } else {
                str3 = null;
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                str4 = globalDoodleConfig2.getNewSource();
            } else {
                str4 = null;
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
            if (serverTimeExtra != null) {
                l = Long.valueOf(serverTimeExtra.now);
            }
            LIZ2.LJ(new LastSearch(keyword, str2, str3, str4, l));
        }
        GlobalDoodleConfig globalDoodleConfig3 = searchApiResult.globalDoodleConfig;
        if (globalDoodleConfig3 != null && (ke0 = this.LIZ) != null) {
            ke0.LJIIIIZZ(globalDoodleConfig3);
        }
        LogPbBean logPbBean2 = searchApiResult.logPb;
        if (logPbBean2 != null && (imprId2 = logPbBean2.getImprId()) != null) {
            KE0 ke02 = this.LIZ;
            if (ke02 != null) {
                ke02.LIZJ(searchResultParam, imprId2);
            }
            ISearchService LLLZI = SearchServiceImpl.LLLZI();
            KE0 ke03 = this.LIZ;
            if (ke03 == null || (str = ke03.LJFF()) == null) {
                str = imprId2;
            }
            LLLZI.LLIIIJ(str);
            C3A5.LIZ.LJFF(imprId2, searchApiResult.logPb);
        }
        KE0 ke04 = this.LIZ;
        if (ke04 != null) {
            ke04.LJIIJ();
        }
        LogPbBean logPbBean3 = searchApiResult.logPb;
        if (logPbBean3 != null && (imprId = logPbBean3.getImprId()) != null) {
            str5 = imprId;
        }
        KEP kep2 = this.LIZIZ;
        if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
            LIZ.LJIIIZ(searchResultParam, str5, KAK.ECOM_LIVE);
        }
    }
}
