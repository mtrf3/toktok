package Y;

import X.C1HQ;
import X.C227768wm;
import X.C46256IDk;
import X.C50293JoX;
import X.C50837JxJ;
import X.C50898JyI;
import X.C50948Jz6;
import X.C51259K9v;
import X.C51260K9w;
import X.C51282KAs;
import X.C68322mC;
import X.C76800UCe;
import X.EnumC50899JyJ;
import X.EnumC51281KAr;
import X.EnumC61742ba;
import X.FMX;
import X.IPH;
import X.InterfaceC50670Juc;
import X.JTO;
import X.KB1;
import X.KBZ;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultFragmentNew;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACallableS57S0300000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS57S0300000_8 aCallableS57S0300000_8) {
        String str;
        C46256IDk c46256IDk = new C46256IDk((IPH) aCallableS57S0300000_8.l0, (Aweme) aCallableS57S0300000_8.l1, (Aweme) aCallableS57S0300000_8.l2);
        C1HQ c1hq = new C1HQ();
        Aweme aweme = c46256IDk.LIZIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (str == null) {
            str = "be_null";
        }
        c1hq.put("current_aweme_id", str);
        c1hq.put("player_aweme_id", c46256IDk.LIZ.LIZ);
        c1hq.put("current_aweme_order", C227768wm.LJIIL(0, c46256IDk.LIZIZ));
        String str2 = "1";
        if (c46256IDk.LIZJ != null) {
            c1hq.put("player_aweme_find_in_cache", "1");
            c1hq.put("player_aweme_order", C227768wm.LJIIL(0, c46256IDk.LIZJ));
        } else {
            c1hq.put("player_aweme_find_in_cache", CardStruct.IStatusCode.DEFAULT);
            c1hq.put("player_aweme_order", "be_null");
        }
        if (!o.LJ(c1hq.getOrDefault("current_aweme_id", null), c1hq.getOrDefault("player_aweme_id", null))) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_synchronize", str2);
        FMX.LJIIL("compare_event_and_video", c1hq);
        return null;
    }

    public static final Object call$1(ACallableS57S0300000_8 aCallableS57S0300000_8) {
        String str;
        SearchSugResponse searchSugResponse = (SearchSugResponse) aCallableS57S0300000_8.l0;
        List<SearchSugEntity> filteredList = searchSugResponse.sugList;
        if (o.LJ("1", searchSugResponse.sugVirtualEnable)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<SearchSugEntity> list = ((SearchSugResponse) aCallableS57S0300000_8.l0).sugList;
            o.LJIIIIZZ(list, "response.sugList");
            for (SearchSugEntity searchSugEntity : list) {
                if (searchSugEntity.sugExtraInfo.isRichSug()) {
                    str = "enrich_sug";
                } else {
                    str = "normal_sug";
                }
                arrayList2.add(str);
                String str2 = searchSugEntity.content;
                o.LJIIIIZZ(str2, "entity.content");
                arrayList.add(str2);
            }
            C50293JoX.LIZJ.add(arrayList2);
            C50293JoX.LIZIZ.add(arrayList);
            C50293JoX.LJFF = true;
        }
        o.LJIIIIZZ(filteredList, "filteredList");
        if (!filteredList.isEmpty()) {
            ((AbstractSearchIntermediateFragmentNew) aCallableS57S0300000_8.l1).Pl();
            int size = ((SearchSugResponse) aCallableS57S0300000_8.l0).sugList.size();
            for (int i = 0; i < size; i++) {
                ((SearchSugEntity) ListProtector.get(((SearchSugResponse) aCallableS57S0300000_8.l0).sugList, i)).LIZLLL = (Map) aCallableS57S0300000_8.l2;
            }
        }
        return filteredList;
    }

    public static final Object call$2(ACallableS57S0300000_8 aCallableS57S0300000_8) {
        try {
            ((C51260K9w) aCallableS57S0300000_8.l0).LJJJLL((C51259K9v) aCallableS57S0300000_8.l1, (KBZ) aCallableS57S0300000_8.l2);
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                ((C51260K9w) aCallableS57S0300000_8.l0).LJLJI.onFail();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS57S0300000_8 r32) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS57S0300000_8.call$3(Y.ACallableS57S0300000_8):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$4(ACallableS57S0300000_8 aCallableS57S0300000_8) {
        String str;
        ECSearchEntranceData ecSearchEntranceData;
        EnumC61742ba enumC61742ba;
        if (!TextUtils.isEmpty(((SearchResultParam) aCallableS57S0300000_8.l0).getKeyword())) {
            str = ((SearchResultParam) aCallableS57S0300000_8.l0).getKeyword();
        } else {
            str = (String) ((C68322mC) aCallableS57S0300000_8.l1).element;
        }
        boolean z = true;
        if (((SearchResultParam) aCallableS57S0300000_8.l0).getShouldRecordInHistory() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(str) && z) {
            SearchResultFragmentNew searchResultFragmentNew = (SearchResultFragmentNew) aCallableS57S0300000_8.l2;
            searchResultFragmentNew.getClass();
            C50948Jz6 c50948Jz6 = JTO.LIZ(searchResultFragmentNew.mo49getActivity()).LJLIL;
            C51282KAs c51282KAs = EnumC51281KAr.Companion;
            int LIZ = KB1.LIZ(c50948Jz6);
            c51282KAs.getClass();
            InterfaceC50670Juc LJIIL = C50837JxJ.LJIIL(C51282KAs.LIZIZ(LIZ), searchResultFragmentNew.Ll());
            o.LJIIIIZZ(LJIIL, "inst(ecSearchEntrance, ecSearchEntranceData)");
            LJIIL.LIZJ(new SearchHistory(str, 0));
            C50948Jz6 LIZIZ = JTO.LIZIZ(((SearchResultFragmentNew) aCallableS57S0300000_8.l2).mo49getActivity());
            if (KB1.LJII(KB1.LIZ(LIZIZ))) {
                if (LIZIZ != null && (ecSearchEntranceData = LIZIZ.getEcSearchEntranceData()) != null && ecSearchEntranceData.isEC()) {
                    IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                    if (LJJJJZI != null) {
                        enumC61742ba = LJJJJZI.LJJIIJ(ecSearchEntranceData);
                    } else {
                        enumC61742ba = null;
                    }
                    if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                        C50837JxJ.LJIIL(null, null).LIZJ(new SearchHistory(str, 0));
                    }
                } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                    C50837JxJ.LJIIL(null, null).LIZJ(new SearchHistory(str, 0));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$5(Y.ACallableS57S0300000_8 r30) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS57S0300000_8.call$5(Y.ACallableS57S0300000_8):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$6(ACallableS57S0300000_8 aCallableS57S0300000_8) {
        String str;
        Integer num;
        ECSearchEntranceData eCSearchEntranceData;
        ECSearchEntranceData ecSearchEntranceData;
        EnumC61742ba enumC61742ba;
        if (!TextUtils.isEmpty(((SearchResultParam) aCallableS57S0300000_8.l0).getKeyword())) {
            str = ((SearchResultParam) aCallableS57S0300000_8.l0).getKeyword();
        } else {
            str = (String) ((C68322mC) aCallableS57S0300000_8.l1).element;
        }
        boolean z = true;
        if (((SearchResultParam) aCallableS57S0300000_8.l0).getShouldRecordInHistory() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(str) && z) {
            EcSearchResultFragmentNew ecSearchResultFragmentNew = (EcSearchResultFragmentNew) aCallableS57S0300000_8.l2;
            ecSearchResultFragmentNew.getClass();
            ISearchService LLLZI = SearchServiceImpl.LLLZI();
            C50948Jz6 c50948Jz6 = JTO.LIZ(ecSearchResultFragmentNew.mo49getActivity()).LJLIL;
            if (c50948Jz6 != null) {
                num = Integer.valueOf(KB1.LIZ(c50948Jz6));
            } else {
                num = null;
            }
            C50948Jz6 c50948Jz62 = JTO.LIZ(ecSearchResultFragmentNew.mo49getActivity()).LJLIL;
            if (c50948Jz62 != null) {
                eCSearchEntranceData = c50948Jz62.getEcSearchEntranceData();
            } else {
                eCSearchEntranceData = null;
            }
            LLLZI.LJJLJLI(eCSearchEntranceData, num).LIZJ(new SearchHistory(str, 0));
            C50948Jz6 c50948Jz63 = JTO.LIZ(((EcSearchResultFragmentNew) aCallableS57S0300000_8.l2).mo49getActivity()).LJLIL;
            if (c50948Jz63 != null && (ecSearchEntranceData = c50948Jz63.getEcSearchEntranceData()) != null && ecSearchEntranceData.isEC()) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                if (LJJJJZI != null) {
                    enumC61742ba = LJJJJZI.LJJIIJ(ecSearchEntranceData);
                } else {
                    enumC61742ba = null;
                }
                if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                    SearchServiceImpl.LLLZI().LJJLJLI(null, null).LIZJ(new SearchHistory(str, 0));
                }
            } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                SearchServiceImpl.LLLZI().LJJLJLI(null, null).LIZJ(new SearchHistory(str, 0));
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS57S0300000_8(Object obj, SearchResultParam searchResultParam, C68322mC<String> c68322mC, EcSearchResultFragmentNew ecSearchResultFragmentNew) {
        this.$t = ecSearchResultFragmentNew;
        this.l0 = obj;
        this.l1 = searchResultParam;
        this.l2 = c68322mC;
    }
}
