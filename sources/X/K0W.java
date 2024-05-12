package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K0W extends K8N {
    public static List LJII(InterfaceC50670Juc interfaceC50670Juc) {
        ArrayList arrayList = new ArrayList();
        List<SearchHistory> LIZIZ = interfaceC50670Juc.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "model.searchHistory");
        arrayList.addAll(ORZ.LLILLL(LIZIZ, 20));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SearchHistory searchHistory = (SearchHistory) it.next();
            XBaseModel LIZJ = ED5.LIZJ(K8V.class, null);
            ((K8V) LIZJ).setWord(searchHistory.keyword);
            arrayList2.add(LIZJ);
        }
        return arrayList2;
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        ECSearchEntranceData eCSearchEntranceData;
        EnumC61742ba enumC61742ba;
        EnumC61742ba enumC61742ba2;
        K8Q k8q = (K8Q) xBaseParamModel;
        String str = "";
        o.LJIIIZ(type, "type");
        try {
            Number type2 = k8q.getType();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            EnumC51281KAr enumC51281KAr = EnumC51281KAr.DEFAULT;
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                C50948Jz6 LIZIZ = JTO.LIZIZ((ActivityC45651qj) LJIIIIZZ);
                C51282KAs c51282KAs = EnumC51281KAr.Companion;
                int LIZ = KB1.LIZ(LIZIZ);
                c51282KAs.getClass();
                enumC51281KAr = C51282KAs.LIZIZ(LIZ);
                if (LIZIZ != null) {
                    eCSearchEntranceData = LIZIZ.getEcSearchEntranceData();
                } else {
                    eCSearchEntranceData = null;
                }
            } else {
                eCSearchEntranceData = null;
            }
            InterfaceC50670Juc LJJLJLI = SearchServiceImpl.LLLZI().LJJLJLI(eCSearchEntranceData, Integer.valueOf(enumC51281KAr.getValue()));
            if (o.LJ(type2, 0)) {
                Z9N.LIZIZ.LLJI(C61878OQg.INSTANCE, true, LJIIIIZZ);
                if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
                    IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                    if (LJJJJZI != null) {
                        enumC61742ba2 = LJJJJZI.LJJIIJ(eCSearchEntranceData);
                    } else {
                        enumC61742ba2 = null;
                    }
                    if (enumC61742ba2 == EnumC61742ba.EC_SINGLE_ISOLATE) {
                        InterfaceC50670Juc LJJLJLI2 = SearchServiceImpl.LLLZI().LJJLJLI(null, null);
                        Iterator<SearchHistory> it = LJJLJLI.LIZIZ().iterator();
                        while (it.hasNext()) {
                            LJJLJLI2.LJ(it.next());
                        }
                    }
                } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                    InterfaceC50670Juc LJJLJLI3 = SearchServiceImpl.LLLZI().LJJLJLI(null, null);
                    Iterator<SearchHistory> it2 = LJJLJLI.LIZIZ().iterator();
                    while (it2.hasNext()) {
                        LJJLJLI3.LJ(it2.next());
                    }
                }
                LJJLJLI.LIZ();
                XBaseModel LIZJ = ED5.LIZJ(K8P.class, null);
                ((K8P) LIZJ).setHistoryList(LJII(LJJLJLI));
                c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
                return;
            }
            if (o.LJ(type2, 1)) {
                String keyword = k8q.getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                Z9N.LIZIZ.LLJI(C47261Igj.LJJIJ(keyword), false, LJIIIIZZ);
                LJJLJLI.LJ(new SearchHistory(keyword, 0));
                if (eCSearchEntranceData == null || !eCSearchEntranceData.isEC()) {
                    if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                        SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(keyword, 0));
                    }
                } else {
                    IEcomSearchService LJJJJZI2 = EcomSearchServiceImpl.LJJJJZI();
                    if (LJJJJZI2 != null) {
                        enumC61742ba = LJJJJZI2.LJJIIJ(eCSearchEntranceData);
                    } else {
                        enumC61742ba = null;
                    }
                    if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                        SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(keyword, 0));
                    }
                }
                XBaseModel LIZJ2 = ED5.LIZJ(K8P.class, null);
                ((K8P) LIZJ2).setHistoryList(LJII(LJJLJLI));
                c37356ElM.onSuccess((XBaseResultModel) LIZJ2, "");
            }
        } catch (Exception e) {
            IGE.LIZ(e, "DeleteSearchHistoryMethod");
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C31626Cb8.LIZ(c37356ElM, -1, str, 4);
            C16880lQ.LLLLIIL(e);
        }
    }
}
