package X;

import Y.ARunnableS44S0100000_8;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.JtZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50605JtZ {
    public static final List<KAK> LIZ;
    public static final List<KAK> LIZIZ;
    public static SearchResultParam LIZJ;

    static {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (((Number) C34118DaE.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            copyOnWriteArrayList.addAll(C47261Igj.LJJIJIIJI(KAK.TOP, KAK.VIDEO, KAK.USER, KAK.SOUND, KAK.SHOP, KAK.LIVE, KAK.PLACE, KAK.HASHTAG));
        } else {
            copyOnWriteArrayList.addAll(C47261Igj.LJJIJIIJI(KAK.TOP, KAK.USER, KAK.VIDEO, KAK.SOUND, KAK.SHOP, KAK.LIVE, KAK.PLACE, KAK.HASHTAG));
        }
        LIZ = copyOnWriteArrayList;
        LIZIZ = ORZ.LLJILJILJ(LIZ(null));
    }

    public static int LIZJ() {
        return LJIIJ(KAK.HASHTAG);
    }

    public static int LJ() {
        return LJIIJ(KAK.LIVE);
    }

    public static final int LJI() {
        return LJIIJ(KAK.PLACE);
    }

    public static int LJIIIIZZ() {
        return LJIIJ(KAK.SHOP);
    }

    public static int LJIIIZ() {
        return LJIIJ(KAK.SOUND);
    }

    public static final int LJIIJJI() {
        return LJIIJ(KAK.TOP);
    }

    public static int LJIIL() {
        return LJIIJ(KAK.USER);
    }

    public static int LJIILIIL() {
        return LJIIJ(KAK.VIDEO);
    }

    public static List LIZ(SearchResultParam searchResultParam) {
        int value;
        List<KAK> list;
        String singleTabType;
        C50948Jz6 c50948Jz6;
        C50948Jz6 searchEnterParam;
        List<KAK> list2 = LIZ;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            value = searchEnterParam.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        if (KB1.LJII(value)) {
            list = list2;
        } else {
            list = null;
        }
        List<KAK> list3 = list2;
        if (list != null) {
            if (searchResultParam != null && (singleTabType = searchResultParam.getSingleTabType()) != null) {
                KAK kak = KAK.SHOP;
                if (o.LJ(singleTabType, kak.getTabName())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(kak);
                    list3 = arrayList;
                }
            }
            FHD.LIZLLL().getClass();
            Integer valueOf = Integer.valueOf(FHD.LJ(-1, 0, "TTK_mall_search_shop_tab_index", true));
            list3 = list2;
            if (valueOf.intValue() >= 0) {
                int intValue = valueOf.intValue();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
                int size = copyOnWriteArrayList.size();
                if (intValue > size) {
                    intValue = size;
                }
                KAK kak2 = KAK.SHOP;
                int indexOf = copyOnWriteArrayList.indexOf(kak2);
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                copyOnWriteArrayList2.addAll(copyOnWriteArrayList);
                copyOnWriteArrayList2.remove(indexOf);
                copyOnWriteArrayList2.add(Math.min(intValue, copyOnWriteArrayList2.size()), kak2);
                list3 = copyOnWriteArrayList2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (KAK kak3 : list3) {
            switch (C50606Jta.LIZ[kak3.ordinal()]) {
                case 1:
                    if (C00F.LIZ(31744, 0, "bellagio_disabled_general_tab", true) != 1 && !SearchServiceImpl.LLLZI().LJLIL().disableGeneralTab) {
                        break;
                    }
                    break;
                case 2:
                    if (C00F.LIZ(31744, 0, "bellagio_disabled_video_tab", true) != 1 && !SearchServiceImpl.LLLZI().LJLIL().disableVideoTab) {
                        break;
                    }
                    break;
                case 3:
                    if (C49445Jar.LIZ() && !SearchServiceImpl.LLLZI().LJLIL().disableLiveTab) {
                        break;
                    }
                    break;
                case 4:
                    if (searchResultParam != null) {
                        c50948Jz6 = searchResultParam.getSearchEnterParam();
                    } else {
                        c50948Jz6 = null;
                    }
                    if (KB1.LJII(KB1.LIZ(c50948Jz6))) {
                        break;
                    } else if (C00F.LIZ(31744, 0, "show_vertical_search_shop_tab", true) == 1 && !SearchServiceImpl.LLLZI().LJLIL().disableEcomTab) {
                        break;
                    }
                    break;
                case 5:
                    if (C00F.LIZ(31744, 0, "search_remove_hashtag_tab", true) == 0 && !SearchServiceImpl.LLLZI().LJLIL().disableHashtagTab) {
                        break;
                    }
                    break;
                case 6:
                    if (SearchServiceImpl.LLLZI().LJLIL().disableUserTab) {
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (SearchServiceImpl.LLLZI().LJLIL().disableMusicTab) {
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (((Number) C50610Jte.LIZ.getValue()).intValue() == 1 && !PoiServiceImpl.LIZIZ().LJJIJ() && !SearchServiceImpl.LLLZI().LJLIL().disablePoiTab && !PoiServiceImpl.LIZIZ().LJJJJZI()) {
                        break;
                    }
                    break;
            }
            arrayList2.add(kak3);
        }
        if (arrayList2.isEmpty()) {
            return C47261Igj.LJJIJ(KAK.TOP);
        }
        return arrayList2;
    }

    public static final String LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return "";
        }
        Integer value = ((SearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStartViewModel.class)).iv0().getValue();
        int LJIIJJI = LJIIJJI();
        if (value == null || value.intValue() != LJIIJJI) {
            int LJI = LJI();
            if (value == null || value.intValue() != LJI) {
                return "search_result";
            }
            return "search_places";
        }
        return "general_search";
    }

    public static final int LIZLLL(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        List<KAK> list = LIZIZ;
        KAK.Companion.getClass();
        return ORZ.LJZ(C51298KBi.LIZ(tabName), list);
    }

    public static final String LJFF(int i) {
        KAK kak;
        String tabName;
        if (i < 0) {
            return "";
        }
        List<KAK> list = LIZIZ;
        if (i >= ((ArrayList) list).size() || (kak = (KAK) ORZ.LJLLLLLL(i, list)) == null || (tabName = kak.getTabName()) == null) {
            return "";
        }
        return tabName;
    }

    public static final String LJII(int i) {
        if (i < 0) {
            return KAK.TOP.getTabName();
        }
        if (i == LJIIJJI()) {
            return KAK.TOP.getTabName();
        }
        if (i == LJIIL()) {
            return KAK.USER.getTabName();
        }
        if (i == LJIILIIL()) {
            return KAK.VIDEO.getTabName();
        }
        if (i == LJIIIZ()) {
            return KAK.SOUND.getTabName();
        }
        if (i == LJ()) {
            return KAK.LIVE.getTabName();
        }
        if (i == LJIIIIZZ()) {
            return KAK.SHOP.getTabName();
        }
        if (i == LJI()) {
            return KAK.PLACE.getTabName();
        }
        if (i == LIZJ()) {
            return "challenge";
        }
        return KAK.TOP.getTabName();
    }

    public static int LJIIJ(KAK kak) {
        SearchResultParam searchResultParam;
        int indexOf = ((ArrayList) LIZIZ).indexOf(kak);
        if (indexOf == -1 && DYZ.LJLILLLLZI.LJJII() && (searchResultParam = LIZJ) != null && !C78840Uwu.LJJI(searchResultParam)) {
            return LIZ(LIZJ).indexOf(kak);
        }
        return indexOf;
    }

    public static void LJIILJJIL(SearchResultParam searchResultParam) {
        if (DYZ.LJLILLLLZI.LJJII() && !C78840Uwu.LJJI(searchResultParam)) {
            LIZJ = searchResultParam;
            C38995FSd.LIZJ().execute(new ARunnableS44S0100000_8(searchResultParam, 203));
        } else {
            ArrayList arrayList = (ArrayList) LIZIZ;
            arrayList.clear();
            arrayList.addAll(LIZ(searchResultParam));
        }
    }
}
