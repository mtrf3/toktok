package X;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JxJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50837JxJ implements InterfaceC50670Juc, LEA {
    public static final java.util.Map<String, InterfaceC50670Juc> LJLJJLL = new ArrayMap(4);
    public final Gson LJLIL = new Gson();
    public final IAccountService LJLILLLLZI;
    public List<Pair<String, List<SearchHistory>>> LJLJI;
    public List<SearchHistory> LJLJJI;
    public final String LJLJJL;

    public static List<String> LJIIJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("recent_history_v2");
        arrayList.add("ecommerce_history");
        ECSearchEntranceData.Companion.getClass();
        Iterator it = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC51280KAq.FLASH_SALE.getValue()), Integer.valueOf(EnumC51280KAq.BRAND_BUDGET.getValue())).iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(intValue);
            LIZ.append("_ec_search_history");
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        return arrayList;
    }

    public final String LJII() {
        RBY LJFF = this.LJLILLLLZI.LJFF();
        if (LJFF.isLogin()) {
            return LJFF.getCurUserId();
        }
        return "FAKE_USER";
    }

    public final List<Pair<String, List<SearchHistory>>> LJIIIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getSearchHistoryInSp, currentUserId = ");
            LIZ.append(LJII());
            LIZ.append(", saveKey = ");
            LIZ.append(this.LJLJJL);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
            String LIZIZ = C1A7.LJIIZILJ().LIZIZ(this.LJLJJL, "");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getSearchHistoryInSp, history json = ");
            LIZ2.append(LIZIZ);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
            if (!TextUtils.isEmpty(LIZIZ)) {
                this.LJLJI = (List) this.LJLIL.LJII(LIZIZ, new C50839JxL().getType());
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getSearchHistoryInSp, *** exception = ");
            LIZ3.append(e.getMessage());
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
        }
        if (this.LJLJI == null) {
            this.LJLJI = new ArrayList();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", this.LJLJJL);
        c50840JxM.LJIIZILJ("operation", "get");
        c50840JxM.LJIIZILJ("type", "sp");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("getSearchHistoryInSp cost:");
        LIZ4.append(currentTimeMillis2);
        X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("getSearchHistoryInSp, allLocalHistory get from file = ");
        LIZ5.append(this.LJLJI);
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ5));
        return this.LJLJI;
    }

    public final void LJIILL() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateSearchHistoryInSp, currentUserId = ");
            LIZ.append(LJII());
            LIZ.append(", saveKey = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", allLocalHistory = ");
            LIZ.append(this.LJLJI);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
            String LJIILLIIL = this.LJLIL.LJIILLIIL(this.LJLJI, new C50838JxK().getType());
            C1A7.LJIIZILJ().LJFF(this.LJLJJL, LJIILLIIL);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateSearchHistoryInSp, history saved to file = ");
            LIZ2.append(LJIILLIIL);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateSearchHistoryInSp, *** exception = ");
            LIZ3.append(e.getMessage());
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C50840JxM c50840JxM = new C50840JxM();
        c50840JxM.LJIIZILJ("key", this.LJLJJL);
        c50840JxM.LJIIZILJ("type", "update");
        c50840JxM.LJIIZILJ("type", "sp");
        c50840JxM.LJJIII(currentTimeMillis2);
        c50840JxM.LJIILIIL();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("updateSearchHistoryInSp cost:");
        LIZ4.append(currentTimeMillis2);
        X1D.LIZIZ(LIZ4);
    }

    public static int LJIILJJIL() {
        if (Integer.MIN_VALUE == C50605JtZ.LJIIL()) {
            return 16;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LJIIIZ()) {
            return 17;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LJIIIIZZ()) {
            return 22;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LIZJ()) {
            return 18;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LJIILIIL()) {
            return 19;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LJIIJJI()) {
            return 20;
        }
        if (Integer.MIN_VALUE == C50605JtZ.LJ()) {
            return 21;
        }
        return 0;
    }

    @Override // X.InterfaceC50670Juc
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearSearchHistory, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", original =  ");
        LIZ.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLJJI).clear();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearSearchHistory, new =  ");
        LIZ2.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
        LJIILL();
        C2U8.LIZIZ(new IKS());
    }

    public final void LJI() {
        String LJII = LJII();
        Iterator<Pair<String, List<SearchHistory>>> it = this.LJLJI.iterator();
        this.LJLJJI = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<SearchHistory>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, LJII)) {
                ((ArrayList) this.LJLJJI).addAll((Collection) next.second);
                it.remove();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureCurrentUserLocalHistory, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", currentUserLocalHistory = ");
        LIZ.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        ListProtector.add(this.LJLJI, 0, new Pair(LJII, this.LJLJJI));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ensureCurrentUserLocalHistory, allLocalHistory = ");
        LIZ2.append(this.LJLJI);
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
        if (this.LJLJI.size() > 10) {
            ListProtector.remove(this.LJLJI, r1.size() - 1);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ensureCurrentUserLocalHistory, allLocalHistory = ");
            LIZ3.append(this.LJLJI);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
        }
        LJIILL();
    }

    @Override // X.InterfaceC50670Juc
    public final List<SearchHistory> LIZIZ() {
        return this.LJLJJI;
    }

    public C50837JxJ(String str) {
        this.LJLJJL = str;
        IAccountService LJIJ = AccountService.LJIJ();
        this.LJLILLLLZI = LJIJ;
        LJIJ.LJIILJJIL(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHistoryManager init, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", saveKey = ");
        LIZ.append(str);
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        this.LJLJI = LJIIIZ();
        LJI();
    }

    public static List LJIIIIZZ(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SearchHistory searchHistory = (SearchHistory) it.next();
            if (searchHistory != null) {
                arrayList2.add(searchHistory.keyword);
            }
        }
        return arrayList2;
    }

    public static InterfaceC50670Juc LJIILIIL(String str) {
        java.util.Map<String, InterfaceC50670Juc> map = LJLJJLL;
        InterfaceC50670Juc interfaceC50670Juc = (InterfaceC50670Juc) ((ArrayMap) map).get(str);
        if (interfaceC50670Juc == null) {
            synchronized (map) {
                interfaceC50670Juc = (InterfaceC50670Juc) ((ArrayMap) map).get(str);
                if (interfaceC50670Juc == null) {
                    interfaceC50670Juc = new C50837JxJ(str);
                    ((ArrayMap) map).put(str, interfaceC50670Juc);
                }
            }
        }
        return interfaceC50670Juc;
    }

    @Override // X.InterfaceC50670Juc
    public final void LIZJ(SearchHistory searchHistory) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recordSearchHistory, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", add history = ");
        LIZ.append(searchHistory.keyword);
        LIZ.append(", original =  ");
        LIZ.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        if (searchHistory.keyword.length() > 300) {
            searchHistory.keyword = searchHistory.keyword.substring(0, 300);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cut history if need, after history = ");
        C1FJ.LJFF(LIZ2, searchHistory.keyword, LIZ2, 4, "Search_history_manager");
        ((ArrayList) this.LJLJJI).remove(searchHistory);
        ListProtector.add(this.LJLJJI, 0, searchHistory);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("recordSearchHistory, new =  ");
        LIZ3.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
        if (((ArrayList) this.LJLJJI).size() > 40) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("recordSearchHistory, remove last one when exceed maxCacheNumber, original =  ");
            LIZ4.append(LJIIIIZZ(this.LJLJJI));
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ4));
            ListProtector.remove(this.LJLJJI, ((ArrayList) r1).size() - 1);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("recordSearchHistory, remove last one when exceed maxCacheNumber, new =  ");
            LIZ5.append(LJIIIIZZ(this.LJLJJI));
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ5));
        }
        LJIILL();
        C2U8.LIZIZ(new IKS());
    }

    @Override // X.InterfaceC50670Juc
    public final void LIZLLL(List<SearchHistory> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deleteSearchHistoryList, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", delete history size = ");
        LIZ.append(list.size());
        LIZ.append(", original = ");
        LIZ.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLJJI).removeAll(list);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("deleteSearchHistoryList, new = ");
        LIZ2.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
        LJIILL();
        C2U8.LIZIZ(new IKS());
    }

    @Override // X.InterfaceC50670Juc
    public final void LJ(SearchHistory searchHistory) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deleteSearchHistory, currentUserId = ");
        LIZ.append(LJII());
        LIZ.append(", delete history = ");
        LIZ.append(searchHistory.keyword);
        LIZ.append(", original = ");
        LIZ.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLJJI).remove(searchHistory);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("deleteSearchHistory, new = ");
        LIZ2.append(LJIIIIZZ(this.LJLJJI));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
        LJIILL();
        C2U8.LIZIZ(new IKS());
    }

    @Override // X.InterfaceC50670Juc
    public final List<SearchHistory> LJFF(int i) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.LJLJJI;
        if (list == null || ((ArrayList) list).size() <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getSearchHistoryByType, currentUserLocalHistory is null or empty, currentUserId = ");
            LIZ.append(LJII());
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
            return arrayList2;
        }
        try {
            arrayList = new ArrayList(this.LJLJJI);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getSearchHistoryByType, *** exception = ");
            LIZ2.append(e.getMessage());
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SearchHistory searchHistory = (SearchHistory) it.next();
            if (searchHistory != null && searchHistory.type == i) {
                arrayList2.add(searchHistory);
            }
            if (i == 0 && arrayList2.size() == 40) {
                break;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getSearchHistoryByType, currentUserId = ");
        LIZ3.append(LJII());
        LIZ3.append(", get history result = ");
        LIZ3.append(LJIIIIZZ(arrayList2));
        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
        return arrayList2;
    }

    public static String LJIIJJI(EnumC51281KAr enumC51281KAr, ECSearchEntranceData eCSearchEntranceData) {
        if (enumC51281KAr != null && KB1.LJI(enumC51281KAr)) {
            if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
                EnumC61742ba LJJIIJ = EcomSearchServiceImpl.LJJJJZI().LJJIIJ(eCSearchEntranceData);
                if (LJJIIJ.equals(EnumC61742ba.EC_SINGLE_ISOLATE) || LJJIIJ.equals(EnumC61742ba.EC_DOUBLE_ISOLATE)) {
                    if (!C1A7.LJIIZILJ().LIZJ("ecommerce_history_strategy_changed", false)) {
                        C1A7.LJIIZILJ().LJFF("ecommerce_history", C1A7.LJIIZILJ().LIZIZ("recent_history_v2", ""));
                        C1A7.LJIIZILJ().LJI("ecommerce_history_strategy_changed", true);
                    }
                    return "ecommerce_history";
                }
                if (LJJIIJ.equals(EnumC61742ba.ENTRANCE_ISOLATE)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(eCSearchEntranceData.getRootEnterFromType());
                    LIZ.append("_ec_search_history");
                    return X1D.LIZIZ(LIZ);
                }
                C1A7.LJIIZILJ().LJI("ecommerce_history_strategy_changed", false);
            } else {
                if (C50898JyI.LIZ() == EnumC50899JyJ.DOUBLE || C50898JyI.LIZ() == EnumC50899JyJ.SINGLE || TiktokEcSearchRegionConfigSettings.LIZ().specifyHistoryFromMall) {
                    if (!C1A7.LJIIZILJ().LIZJ("ecommerce_history_strategy_changed", false) && !TiktokEcSearchRegionConfigSettings.LIZ().specifyHistoryFromMall) {
                        C1A7.LJIIZILJ().LJFF("ecommerce_history", C1A7.LJIIZILJ().LIZIZ("recent_history_v2", ""));
                        C1A7.LJIIZILJ().LJI("ecommerce_history_strategy_changed", true);
                    }
                    return "ecommerce_history";
                }
                C1A7.LJIIZILJ().LJI("ecommerce_history_strategy_changed", false);
            }
        }
        return "recent_history_v2";
    }

    public static InterfaceC50670Juc LJIIL(EnumC51281KAr enumC51281KAr, ECSearchEntranceData eCSearchEntranceData) {
        return LJIILIIL(LJIIJJI(enumC51281KAr, eCSearchEntranceData));
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 2 || i == 1 || i == 3) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<SearchHistory>>> it = this.LJLJI.iterator();
                while (it.hasNext()) {
                    Pair<String, List<SearchHistory>> next = it.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, "FAKE_USER")) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("removeFakeUserHistory, remove history = : ");
                        LIZ.append(LJIIIIZZ((List) next.second));
                        C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ));
                        it.remove();
                    }
                }
                LJIILL();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAccountResult clear history, currentUserId = ");
            LIZ2.append(LJII());
            LIZ2.append(", original = ");
            LIZ2.append(this.LJLJI);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ2));
            this.LJLJI.clear();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onAccountResult clear history, new = ");
            LIZ3.append(this.LJLJI);
            C36922EeM.LIZLLL(4, "Search_history_manager", X1D.LIZIZ(LIZ3));
            this.LJLJI = LJIIIZ();
            LJI();
            C50773JwH c50773JwH = (C50773JwH) C50773JwH.LJFF.getValue();
            c50773JwH.getClass();
            if (i == 1 || i == 3) {
                c50773JwH.LIZ.remove("FAKE_USER");
                c50773JwH.LJIIIIZZ();
            }
            c50773JwH.LJ();
        }
    }
}
