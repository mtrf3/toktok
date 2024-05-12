package com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor;

import X.C16880lQ;
import X.C50948Jz6;
import X.C51214K8c;
import X.C51253K9p;
import X.C51256K9s;
import X.C51258K9u;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C78404Ups;
import X.C78983UzD;
import X.EV6;
import X.InterfaceC214228aw;
import X.KA7;
import X.KAK;
import X.KAP;
import X.KBW;
import X.KC4;
import X.ORZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SuggestAssemViewModel extends AssemViewModel<KBW> {
    public KA7 LJLILLLLZI;
    public ISearchSuggestContextAbilityNew LJLJJI;
    public C51256K9s LJLJJLL;
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(KC4.class));
    public boolean LJLJI = true;
    public final Gson LJLJJL = GsonHolder.LIZLLL().LIZ();
    public int LJLJL = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final KBW defaultState() {
        return new KBW(null, null);
    }

    public final InterfaceC214228aw<KAP> jv0() {
        return (InterfaceC214228aw) this.LJLIL.getValue();
    }

    public final Map<String, Object> gv0() {
        int i;
        String str;
        C50948Jz6 c50948Jz6;
        List<Map<String, Object>> hv0 = hv0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("historyList", hv0);
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LJLJJI;
        if (iSearchSuggestContextAbilityNew != null) {
            i = iSearchSuggestContextAbilityNew.LLLZLL();
        } else {
            i = -1;
        }
        if (i >= 0) {
            linkedHashMap.put("current_tab_name", C51214K8c.LJ(i));
        } else {
            linkedHashMap.put("current_tab_name", KAK.SHOP.getTabName());
        }
        int i2 = 0;
        if (hv0 != null && ((ArrayList) hv0).isEmpty()) {
            i2 = 1;
        }
        linkedHashMap.put("is_force", Integer.valueOf(i2));
        KA7 ka7 = this.LJLILLLLZI;
        if (ka7 != null && (c50948Jz6 = ka7.LIZ) != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        linkedHashMap.put("enter_from", str);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> hv0() {
        ECSearchEntranceData eCSearchEntranceData;
        C50948Jz6 c50948Jz6;
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        KA7 ka7 = this.LJLILLLLZI;
        if (ka7 != null && (c50948Jz6 = ka7.LIZ) != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        if (LJJIJL.LJIILL(eCSearchEntranceData)) {
            return new ArrayList();
        }
        KA7 ka72 = this.LJLILLLLZI;
        if (ka72 == null) {
            return null;
        }
        List<SearchHistory> LJJIIZI = jv0().getOperator().LJJIIZI(ka72);
        ArrayList arrayList = new ArrayList();
        for (SearchHistory searchHistory : LJJIIZI) {
            HashMap hashMap = new HashMap();
            hashMap.put("word", searchHistory.keyword);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final TemplateData iv0(String str) {
        Map<?, ?> map;
        String str2;
        int i;
        Object obj;
        Integer num;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2;
        C50948Jz6 c50948Jz6;
        try {
            map = (Map) this.LJLJJL.LJI(str, HashMap.class);
        } catch (Throwable unused) {
            map = null;
        }
        KA7 ka7 = this.LJLILLLLZI;
        if (ka7 == null || (c50948Jz6 = ka7.LIZ) == null || (str2 = c50948Jz6.getEnterSearchFrom()) == null) {
            str2 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("performance_params", C51253K9p.LIZ(Boolean.valueOf(!C51258K9u.LIZJ)));
        linkedHashMap.put("isCachedSuggestWords", 0);
        linkedHashMap.put("enter_from", str2);
        if (map == null || map.isEmpty()) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_force", Integer.valueOf(i));
        linkedHashMap.put("is_ecommerce_cache", Integer.valueOf(C51258K9u.LIZJ ? 1 : 0));
        linkedHashMap.put("guessSearchData", map);
        if (map != null) {
            obj = map.get("qrec_virtual_enable");
        } else {
            obj = null;
        }
        if (o.LJ(obj, "1") && (iSearchSuggestContextAbilityNew2 = this.LJLJJI) != null) {
            iSearchSuggestContextAbilityNew2.dI(map);
        }
        KA7 ka72 = this.LJLILLLLZI;
        if (ka72 != null && (num = ka72.LIZLLL) != null && num.intValue() == 2 && (iSearchSuggestContextAbilityNew = this.LJLJJI) != null && iSearchSuggestContextAbilityNew.B3()) {
            linkedHashMap.put("is_from_outside", 1);
        }
        try {
            TemplateData LJ = TemplateData.LJ(linkedHashMap);
            LJ.LIZLLL = "guessSearchDataProcess";
            return LJ;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void kv0(String str) {
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        Word word;
        try {
            SuggestWordResponse suggestWordResponse = (SuggestWordResponse) GsonHolder.LIZLLL().LIZ().LJI(str, SuggestWordResponse.class);
            if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) ORZ.LJLLLL(list)) != null && (list2 = typeWords.words) != null && (!list2.isEmpty()) && (word = (Word) ORZ.LJLLLL(list2)) != null) {
                String str2 = suggestWordResponse.logId;
                if (str2 == null) {
                    str2 = "";
                }
                word.setImplId(str2);
                setState(new AqS174S0100000_8(word, 34));
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }
}
