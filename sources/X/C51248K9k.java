package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.model.EcommerceDynamicData;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.K9k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51248K9k {
    public static WeakReference<C50863Jxj> LIZ;
    public static KAY LIZIZ = KAY.NONE;
    public static boolean LIZJ = true;

    public static OSZ LIZ() {
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        KAO kao = C51253K9p.LIZIZ;
        if (kao != null) {
            kao.LJIIJJI = System.currentTimeMillis();
        }
        C50863Jxj c50863Jxj = new C50863Jxj(context, null);
        KAO kao2 = C51253K9p.LIZIZ;
        if (kao2 != null && kao2.LJIIJJI != 0) {
            kao2.LJIIL = System.currentTimeMillis() - kao2.LJIIJJI;
        }
        return new OSZ(c50863Jxj, Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static OSZ LIZLLL() {
        ?? r5;
        C50863Jxj c50863Jxj;
        ViewGroup viewGroup;
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        WeakReference<C50863Jxj> weakReference = LIZ;
        if (weakReference != null && weakReference.get() != null) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        SearchMiddleForEcService.LJJJJLI();
        if (r5 != 1) {
            KAO kao = C51253K9p.LIZIZ;
            if (kao != null) {
                kao.LIZIZ = r5;
            }
            KAO kao2 = C51253K9p.LIZIZ;
            if (kao2 != null) {
                kao2.LJIIJJI = System.currentTimeMillis();
            }
            c50863Jxj = new C50863Jxj(context, null);
            KAO kao3 = C51253K9p.LIZIZ;
            if (kao3 != null && kao3.LJIIJJI != 0) {
                kao3.LJIIL = System.currentTimeMillis() - kao3.LJIIJJI;
            }
        } else {
            WeakReference<C50863Jxj> weakReference2 = LIZ;
            if (weakReference2 == null || (c50863Jxj = weakReference2.get()) == null) {
                return null;
            }
        }
        ViewParent parent = c50863Jxj.LJIIJ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeAllViews();
        }
        LIZ = new WeakReference<>(c50863Jxj);
        return new OSZ(c50863Jxj, Boolean.valueOf((boolean) r5));
    }

    public static String LIZIZ(ActivityC45651qj activityC45651qj) {
        ECSearchEntranceData eCSearchEntranceData;
        String str;
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        Integer valueOf = Integer.valueOf(KB1.LIZ(JTO.LIZIZ(activityC45651qj)));
        C50948Jz6 LIZIZ2 = JTO.LIZIZ(activityC45651qj);
        if (LIZIZ2 != null) {
            eCSearchEntranceData = LIZIZ2.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        List<SearchHistory> LJFF = LLLZI.LJJLJLI(eCSearchEntranceData, valueOf).LJFF(0);
        o.LJIIIIZZ(LJFF, "historyManager.getSearchHistoryByType(0)");
        List<SearchHistory> LLILLL = ORZ.LLILLL(LJFF, 20);
        C50948Jz6 LIZIZ3 = JTO.LIZIZ(activityC45651qj);
        if (LIZIZ3 == null || (str = LIZIZ3.getEnterSearchFrom()) == null) {
            str = "";
        }
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : LLILLL) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory.keyword);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("historyList", jSONArray);
        jSONObject2.put("current_tab_name", KAK.SHOP.getTabName());
        jSONObject2.put("enter_from", str);
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "ret.toString()");
        return jSONObject3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(C50863Jxj c50863Jxj, ActivityC45651qj activityC45651qj) {
        Integer num;
        int i;
        String str;
        HashMap hashMap;
        ECSearchEntranceData ecSearchEntranceData;
        String historyMaxCount;
        List<EcommerceDynamicData> LIZ2 = EcommerceSearchIntermediateCardsConfig.LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ2, 10));
        for (EcommerceDynamicData ecommerceDynamicData : LIZ2) {
            arrayList.add(new DynamicData(ecommerceDynamicData.cardType, ecommerceDynamicData.dynamicPatch));
        }
        C37831Et1.LIZIZ(K8K.class, null, 6);
        C37831Et1.LIZIZ(K0W.class, null, 6);
        C37831Et1.LIZIZ(C51541KKr.class, null, 6);
        LIZIZ(activityC45651qj);
        if (!arrayList.isEmpty()) {
            boolean z = false;
            DynamicPatch dynamicPatch = ((DynamicData) ListProtector.get(arrayList, 0)).dynamicPatch;
            if ((KL8.LIZ() == 2 || KL8.LIZ() == 3 || KL8.LIZ() == 4) && !C51272KAi.LIZ()) {
                c50863Jxj.LJIILJJIL(dynamicPatch, LIZIZ(activityC45651qj));
                return;
            }
            if (C51272KAi.LIZ()) {
                if (LIZIZ != KAY.NONE) {
                    return;
                }
                LIZIZ = KAY.PRELOAD;
                InterfaceC50670Juc LJJLJLI = SearchServiceImpl.LLLZI().LJJLJLI(new ECSearchEntranceData(EnumC51280KAq.MALL.getValue(), null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, z, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 0L, 268435454, null == true ? 1 : 0), Integer.valueOf(EnumC51281KAr.MALL.getValue()));
                C50948Jz6 LIZIZ2 = JTO.LIZIZ(activityC45651qj);
                if (LIZIZ2 != null && (ecSearchEntranceData = LIZIZ2.getEcSearchEntranceData()) != null && (historyMaxCount = ecSearchEntranceData.getHistoryMaxCount()) != null) {
                    num = C38350F3i.LJJIL(historyMaxCount);
                } else {
                    num = null;
                }
                List<SearchHistory> LJFF = LJJLJLI.LJFF(0);
                o.LJIIIIZZ(LJFF, "historyManager.getSearchHistoryByType(0)");
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 20;
                }
                List<SearchHistory> LLILLL = ORZ.LLILLL(LJFF, i);
                C50948Jz6 LIZIZ3 = JTO.LIZIZ(activityC45651qj);
                if (LIZIZ3 == null || (str = LIZIZ3.getEnterSearchFrom()) == null) {
                    str = "";
                }
                ArrayList arrayList2 = new ArrayList();
                for (SearchHistory searchHistory : LLILLL) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("word", searchHistory.keyword);
                    arrayList2.add(hashMap2);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Gson LIZ3 = GsonHolder.LIZLLL().LIZ();
                    EcIntermediatePreload.Companion.getClass();
                    String str2 = EcIntermediatePreload.suggestPreResponseStr;
                    if (str2 != null && str2.length() > 0 && LIZJ) {
                        hashMap = (HashMap) LIZ3.LJI(EcIntermediatePreload.suggestPreResponseStr, HashMap.class);
                    } else {
                        String string = Keva.getRepo("ecommerce_search_repo").getString("ecommerce_suggest_words", "");
                        o.LJIIIIZZ(string, "getRepo(ECommerceSearchC…MMERCE_SUGGEST_WORDS, \"\")");
                        hashMap = (HashMap) LIZ3.LJI(string, HashMap.class);
                    }
                    linkedHashMap.put("guessSearchData", hashMap);
                } catch (Exception unused) {
                }
                linkedHashMap.put("historyList", arrayList2);
                linkedHashMap.put("is_ecommerce_cache", Integer.valueOf(C51258K9u.LIZJ ? 1 : 0));
                linkedHashMap.put("should_end_refresh_data", 0);
                linkedHashMap.put("isSuggestHistory", 0);
                linkedHashMap.put("current_tab_name", KAK.SHOP.getTabName());
                linkedHashMap.put("is_force", Integer.valueOf(LLILLL.isEmpty() ? 1 : 0));
                linkedHashMap.put("enter_from", str);
                c50863Jxj.LJIILL(dynamicPatch, C27739Aud.LJI(linkedHashMap));
                return;
            }
            c50863Jxj.LJIILIIL(dynamicPatch, C50845JxR.LIZ());
        }
    }
}
