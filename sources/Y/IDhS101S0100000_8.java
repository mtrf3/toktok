package Y;

import X.AbstractC73672Svk;
import X.C23930wn;
import X.C26180APg;
import X.C36922EeM;
import X.C49164JRg;
import X.C50031JkJ;
import X.C67623QgN;
import X.C67624QgO;
import X.C67625QgP;
import X.C74002T2o;
import X.C75792yF;
import X.C76800UCe;
import X.InterfaceC197777pV;
import X.InterfaceC37286EkE;
import X.InterfaceC46811IYt;
import X.InterfaceC48038ItG;
import X.JBQ;
import X.JRJ;
import X.KO1;
import X.OSZ;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.legacy.network.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.LynxSearchHorizontalCardData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDhS101S0100000_8 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            default:
                return null;
        }
    }

    public IDhS101S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS101S0100000_8 iDhS101S0100000_8, Object obj) {
        SearchMixFeedList it = (SearchMixFeedList) obj;
        o.LJIIIZ(it, "it");
        List<SearchMixFeed> list = it.mItems;
        String str = ((C50031JkJ) iDhS101S0100000_8.l0).LJI;
        if (str == null) {
            str = "";
        }
        return new OSZ(list, new C74002T2o(str, it.hasMore, it.cursor, it));
    }

    public static final Object apply$1(IDhS101S0100000_8 iDhS101S0100000_8, Object it) {
        o.LJIIIZ(it, "it");
        Object value = SuggestWordsApi.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-S_API>(...)");
        SuggestWordsApi.SuggestApi suggestApi = (SuggestWordsApi.SuggestApi) value;
        String str = ((KO1) iDhS101S0100000_8.l0).LIZ;
        String LJJIFFI = CommonFeedApiService.LIZ().LJJIFFI();
        if (LJJIFFI == null || LJJIFFI.length() == 0) {
            LJJIFFI = "";
        }
        AbstractC73672Svk<SuggestWordResponse> fetchSuggestWords = suggestApi.fetchSuggestWords(str, LJJIFFI, ((KO1) iDhS101S0100000_8.l0).LIZIZ, SearchServiceImpl.LLLZI().LLLLIIIILLL(), ((KO1) iDhS101S0100000_8.l0).LIZJ);
        SuggestWordsApi.LIZIZ.set(true);
        return fetchSuggestWords;
    }

    public static final Object apply$2(IDhS101S0100000_8 iDhS101S0100000_8, Object it) {
        o.LJIIIZ(it, "it");
        C36922EeM.LIZLLL(2, "clear-cache", "start clear temp cache with disk manager");
        List<InterfaceC37286EkE> LJIIL = ((C67624QgO) iDhS101S0100000_8.l0).LJIIL();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC37286EkE interfaceC37286EkE : LJIIL) {
            InterfaceC37286EkE interfaceC37286EkE2 = interfaceC37286EkE;
            boolean LJ = o.LJ("CACHE", interfaceC37286EkE2.LJ());
            if ((C23930wn.LIZ() && o.LJ(interfaceC37286EkE2.LJ(), "GECKO")) || LJ) {
                arrayList.add(interfaceC37286EkE);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC37286EkE) it2.next()).LIZJ();
        }
        C36922EeM.LIZLLL(2, "clear-cache", "finish clear temp cache with disk manager");
        return "";
    }

    public static final Object apply$3(IDhS101S0100000_8 iDhS101S0100000_8, Object it) {
        o.LJIIIZ(it, "it");
        C36922EeM.LIZLLL(2, "clear-cache", "start clear resource cache with disk manager");
        List<InterfaceC37286EkE> LJIIL = ((C67623QgN) iDhS101S0100000_8.l0).LJIIL();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC37286EkE interfaceC37286EkE : LJIIL) {
            if (o.LJ("RESOURCE", interfaceC37286EkE.LJ())) {
                arrayList.add(interfaceC37286EkE);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC37286EkE) it2.next()).LIZJ();
        }
        C36922EeM.LIZLLL(2, "clear-cache", "finish clear resource cache with disk manager");
        return "";
    }

    public static final Object apply$4(IDhS101S0100000_8 iDhS101S0100000_8, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        List<InterfaceC37286EkE> LJIIL = ((C67625QgP) iDhS101S0100000_8.l0).LJIIL();
        if (LJIIL != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC37286EkE interfaceC37286EkE : LJIIL) {
                InterfaceC37286EkE interfaceC37286EkE2 = interfaceC37286EkE;
                if (interfaceC37286EkE2 != null) {
                    str = interfaceC37286EkE2.LJ();
                } else {
                    str = null;
                }
                if (o.LJ("GECKO", str)) {
                    arrayList.add(interfaceC37286EkE);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC37286EkE) it2.next()).LIZJ();
            }
            return "";
        }
        return "";
    }

    public static final Object apply$5(IDhS101S0100000_8 iDhS101S0100000_8, Object obj) {
        ReadableMap it = (ReadableMap) obj;
        o.LJIIIZ(it, "it");
        ArrayList arrayList = new ArrayList();
        ReadableMap map = it.getMap("common_data");
        if (it.hasKey("card_list")) {
            Iterator<Object> it2 = it.getArray("card_list").toArrayList().iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof JavaOnlyMap) {
                    JavaOnlyMap javaOnlyMap = (JavaOnlyMap) next;
                    ((JRJ) iDhS101S0100000_8.l0).LJ(javaOnlyMap);
                    C49164JRg c49164JRg = new C49164JRg((LynxSearchHorizontalCardData) C75792yF.LIZ(C75792yF.LIZJ(javaOnlyMap), LynxSearchHorizontalCardData.class));
                    c49164JRg.LIZIZ = map;
                    arrayList.add(c49164JRg);
                }
            }
        }
        return arrayList;
    }

    public static final Object apply$6(IDhS101S0100000_8 iDhS101S0100000_8, Object obj) {
        InterfaceC46811IYt playRequest = (InterfaceC46811IYt) obj;
        o.LJIIIZ(playRequest, "playRequest");
        ((InterfaceC197777pV) ((JBQ) iDhS101S0100000_8.l0).LJLJJLL.getValue()).LIZ(playRequest);
        C26180APg.LIZIZ = true;
        return C76800UCe.LIZ;
    }
}
