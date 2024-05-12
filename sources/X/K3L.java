package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes9.dex */
public final class K3L implements InterfaceC44306HaA {
    public static String LIZJ;
    public static boolean LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJIIJ;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final K3L LIZ = new K3L();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("effect", "video");
    public static final java.util.Map<String, K3N> LJI = new LinkedHashMap();
    public static final java.util.Map<String, K3N> LJII = new LinkedHashMap();
    public static final ArrayList<String> LJIIIIZZ = new ArrayList<>();
    public static final java.util.Map<String, String> LJIIIZ = new LinkedHashMap();
    public static final HashMap<String, String> LJIIJJI = new HashMap<>();
    public static final HashMap<String, String> LJIIL = new HashMap<>();
    public static String LJIILIIL = "";
    public static String LJIILJJIL = "";

    @Override // X.InterfaceC44306HaA
    public final void LJIIJJI() {
        LIZLLL = true;
    }

    @Override // X.InterfaceC44306HaA
    public final void clear() {
        LIZJ = null;
        LIZLLL = false;
        LJ = null;
        LJFF = null;
        ((LinkedHashMap) LJI).clear();
        ((LinkedHashMap) LJII).clear();
        LJIIIIZZ.clear();
        LJIIJJI.clear();
    }

    @Override // X.InterfaceC44306HaA
    public final String LIZ() {
        return LJ;
    }

    @Override // X.InterfaceC44306HaA
    public final boolean LIZIZ() {
        return LJIILL;
    }

    @Override // X.InterfaceC44306HaA
    public final String LJIIJ() {
        return LJIILIIL;
    }

    @Override // X.InterfaceC44306HaA
    public final boolean LJIILL() {
        return LJIIZILJ;
    }

    @Override // X.InterfaceC44306HaA
    public final boolean LJIILLIIL() {
        return LJIILLIIL;
    }

    @Override // X.InterfaceC44306HaA
    public final String LJIJ() {
        return LJIILJJIL;
    }

    @Override // X.InterfaceC44306HaA
    public final String LJIJJLI() {
        return LIZJ;
    }

    @Override // X.InterfaceC44306HaA
    public final void LIZJ(List<? extends Effect> list) {
        o.LJIIIZ(list, "list");
        String str = LJ;
        if (str == null) {
            return;
        }
        ((LinkedHashMap) LJII).clear();
        for (Effect effect : list) {
            LJII.put(effect.getEffectId(), new K3N(str, effect.getDoc_id()));
        }
    }

    @Override // X.InterfaceC44306HaA
    public final void LJ(String propPageEnterMethodValue) {
        o.LJIIIZ(propPageEnterMethodValue, "propPageEnterMethodValue");
        LJIILJJIL = propPageEnterMethodValue;
    }

    @Override // X.InterfaceC44306HaA
    public final void LJFF(K3M k3m) {
        String str;
        String str2 = LIZJ;
        if (str2 == null || str2.length() == 0 || (str = k3m.LIZ) == null || str.length() == 0) {
            return;
        }
        K3J k3j = new K3J();
        LJJI(k3j, k3m);
        k3j.LJIILIIL();
    }

    @Override // X.InterfaceC44306HaA
    public final void LJI(String propPageEnterFromValue) {
        o.LJIIIZ(propPageEnterFromValue, "propPageEnterFromValue");
        LJIILIIL = propPageEnterFromValue;
    }

    @Override // X.InterfaceC44306HaA
    public final void LJII(boolean z) {
        LJIILL = z;
    }

    @Override // X.InterfaceC44306HaA
    public final java.util.Map<String, String> LJIIIIZZ(String str) {
        int i;
        OSZ osz;
        String str2;
        Object obj;
        if (str == null) {
            return null;
        }
        HashMap<String, String> hashMap = LJIIJJI;
        String str3 = "search_result";
        if (LJJIFFI(str, hashMap)) {
            OSZ[] oszArr = new OSZ[4];
            String str4 = hashMap.get("search_id");
            if (str4 == null) {
                str4 = "";
            }
            oszArr[0] = new OSZ("prop_search_id", str4);
            String str5 = hashMap.get("search_result_id");
            if (str5 == null) {
                str5 = "";
            }
            oszArr[1] = new OSZ("prop_search_result_id", str5);
            String str6 = hashMap.get("list_item_id");
            if (str6 == null) {
                str6 = "";
            }
            oszArr[2] = new OSZ("prop_search_list_item_id", str6);
            if (ORZ.LJLJJI(hashMap.get("search_type"), LIZIZ)) {
                obj = "search_result";
            } else {
                obj = "general_search";
            }
            OSZ osz2 = new OSZ("prop_search_method", obj);
            i = 3;
            oszArr[3] = osz2;
            java.util.Map<String, String> LJJL = C113554cx.LJJL(oszArr);
            if (LJJL != null) {
                return LJJL;
            }
        } else {
            i = 3;
        }
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ2 = C50654JuM.LIZIZ();
        if (LJJIFFI(str, LIZIZ2)) {
            OSZ[] oszArr2 = new OSZ[i];
            Object obj2 = LIZIZ2.get("search_id");
            if (obj2 == null) {
                obj2 = "";
            }
            oszArr2[0] = new OSZ("prop_search_id", obj2);
            Object obj3 = LIZIZ2.get("search_result_id");
            if (obj3 == null) {
                obj3 = "";
            }
            oszArr2[1] = new OSZ("prop_search_result_id", obj3);
            if (!ORZ.LJLJJI(LIZIZ2.get("search_type"), LIZIZ)) {
                str3 = "general_search";
            }
            oszArr2[2] = new OSZ("prop_search_method", str3);
            HashMap hashMap2 = new HashMap(C113554cx.LJJL(oszArr2));
            if (o.LJ(LIZIZ2.get("search_enter_position"), "hot_user_video")) {
                Object obj4 = LIZIZ2.get("group_id");
                if (obj4 == null) {
                    obj4 = "";
                }
                hashMap2.put("prop_search_list_item_id", obj4);
                return hashMap2;
            }
            return hashMap2;
        }
        java.util.Map<String, K3N> map = LJI;
        K3N k3n = (K3N) ((LinkedHashMap) map).get(str);
        if (k3n != null) {
            osz = new OSZ(k3n.LIZ, k3n.LIZIZ);
        } else {
            K3N k3n2 = (K3N) ((LinkedHashMap) LJII).get(str);
            if (k3n2 != null) {
                osz = new OSZ(k3n2.LIZ, k3n2.LIZIZ);
            } else {
                osz = new OSZ(LJ, ((LinkedHashMap) LJIIIZ).get(str));
                if (!LJIIJ || !LJIIIIZZ.contains(str)) {
                    return null;
                }
            }
        }
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        OSZ[] oszArr3 = new OSZ[5];
        String str7 = LIZJ;
        if (str7 == null) {
            str7 = "";
        }
        oszArr3[0] = new OSZ("prop_search_session_id", str7);
        if (first == null) {
            first = "";
        }
        oszArr3[1] = new OSZ("prop_search_id", first);
        oszArr3[2] = new OSZ("prop_id", str);
        if (second == null) {
            second = "";
        }
        oszArr3[3] = new OSZ("prop_search_result_id", second);
        if (map.containsKey(str)) {
            str2 = "search";
        } else {
            str2 = "recommend";
        }
        oszArr3[4] = new OSZ("prop_search_method", str2);
        return C113554cx.LJJL(oszArr3);
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIIIZ(K3M k3m) {
        String str;
        String str2 = LIZJ;
        if (str2 == null || str2.length() == 0 || (str = k3m.LIZ) == null || str.length() == 0) {
            return;
        }
        K3I k3i = new K3I();
        LJJI(k3i, k3m);
        k3i.LJIILIIL();
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIIL(List<? extends Effect> effectList) {
        o.LJIIIZ(effectList, "effectList");
        LJIIIIZZ.clear();
        ((LinkedHashMap) LJIIIZ).clear();
        for (Effect effect : effectList) {
            LJIIIIZZ.add(effect.getEffectId());
            LJIIIZ.put(effect.getEffectId(), effect.getDoc_id());
        }
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIILIIL(boolean z) {
        LJIILLIIL = z;
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIIZILJ(String str) {
        if (str == null) {
            return;
        }
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("prop_id", str));
        c50654JuM.getClass();
        C50654JuM.LIZJ(LJJIIZI, true);
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIJI(SearchEffectModel searchEffectModel) {
        String searchSessionId;
        if (searchEffectModel == null || (searchSessionId = searchEffectModel.getSearch_id()) == null || searchSessionId.length() == 0) {
            return;
        }
        LJ = searchSessionId;
        LJIIJ = searchEffectModel.getEffectList().isEmpty();
        for (Effect effect : searchEffectModel.getEffectList()) {
            LJI.put(effect.getEffectId(), new K3N(searchSessionId, effect.getDoc_id()));
        }
        if (LIZLLL) {
            LIZLLL = false;
            LIZJ = searchSessionId;
            C87256YMi.LIZ.getClass();
            o.LJIIIZ(searchSessionId, "searchSessionId");
            C17N.LJJJJLL().kO().LIZ(new K3P(searchSessionId));
        } else if (LIZJ == null) {
            LIZJ = searchSessionId;
            C87256YMi.LIZ.getClass();
            o.LJIIIZ(searchSessionId, "searchSessionId");
            C17N.LJJJJLL().kO().LIZ(new K3P(searchSessionId));
        }
        C87256YMi c87256YMi = C87256YMi.LIZ;
        LastSearch lastSearch = new LastSearch(LJFF, searchSessionId, null, null, Long.valueOf(System.currentTimeMillis()));
        c87256YMi.getClass();
        C17N.LJJJJLL().kO().LIZ(new C50627Jtv(lastSearch));
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIL(boolean z) {
        LJIIZILJ = z;
    }

    @Override // X.InterfaceC44306HaA
    public final void LJJ(String str) {
        LJFF = str;
        if (str == null || str.length() == 0) {
            LIZJ = null;
        }
    }

    public static void LJJI(JNN jnn, K3M k3m) {
        jnn.LJIIZILJ("effect_session_id", LIZJ);
        String str = k3m.LIZ;
        if (str == null || !(!o.LJ(str, CardStruct.IStatusCode.DEFAULT))) {
            str = LJ;
        }
        jnn.LJIIZILJ("search_id", str);
        jnn.LJIJI("prop_panel_search");
        jnn.LJIIZILJ("search_keyword", LJFF);
        jnn.LJIJ("search_result_id", k3m.LIZJ);
        jnn.LJIIZILJ("prop_id", k3m.LIZIZ);
        jnn.LJIIZILJ("token_type", "prop_card");
        jnn.LJIIZILJ("is_aladdin", String.valueOf((Object) 0));
        jnn.LJJI(Integer.valueOf(k3m.LIZLLL));
        jnn.LJIIZILJ("creation_id", k3m.LJ);
        jnn.LJIIZILJ("search_method", k3m.LJFF);
    }

    public static boolean LJJIFFI(String str, java.util.Map map) {
        if (str == null) {
            return false;
        }
        Object obj = map.get("prop_id");
        if (!o.LJ(obj, str) && !o.LJ(obj, LJIIL.get(str))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC44306HaA
    public final void LJIILJJIL(String str, String str2) {
        if (str != null && str2 != null) {
            LJIIL.put(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC44306HaA
    public final java.util.Map<String, String> LJIJJ(String str, String str2) {
        String str3;
        List<String> LJLJJL;
        K3O k3o;
        if (str == null) {
            return C113554cx.LJJJLIIL();
        }
        JSONObject jSONObject = new JSONObject();
        String str4 = "";
        if (str2 != null && (LJLJJL = ORZ.LJLJJL(s.LJLJJL(str2, new String[]{","}, 0, 6))) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : LJLJJL) {
                HashMap<String, String> hashMap = LJIIJJI;
                if (LJJIFFI(str5, hashMap)) {
                    k3o = new K3O(hashMap.get("search_id"), hashMap.get("search_result_id"), hashMap.get("list_item_id"));
                } else {
                    C50653JuL.LJLILLLLZI.getClass();
                    HashMap hashMap2 = new HashMap(C50654JuM.LIZIZ());
                    String str6 = null;
                    if (LJJIFFI(str5, hashMap2)) {
                        String str7 = (String) hashMap2.get("search_id");
                        String str8 = (String) hashMap2.get("search_result_id");
                        if (o.LJ(hashMap2.get("search_enter_position"), "hot_user_video")) {
                            str6 = (String) hashMap2.get("group_id");
                        }
                        k3o = new K3O(str7, str8, str6);
                    } else {
                        K3N k3n = (K3N) ((LinkedHashMap) LJI).get(str5);
                        if (k3n != null) {
                            String str9 = k3n.LIZ;
                            String str10 = k3n.LIZIZ;
                            if (str10 == null) {
                                str10 = "";
                            }
                            k3o = new K3O(str9, str10, null);
                        }
                    }
                }
                arrayList.add(k3o);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                K3O k3o2 = (K3O) next;
                if (C78857UxB.LJJJIL(k3o2.LIZ) && C78857UxB.LJJJIL(k3o2.LIZIZ)) {
                    arrayList2.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                String str11 = ((K3O) next2).LIZ;
                Object obj = linkedHashMap.get(str11);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str11, obj);
                }
                ((List) obj).add(next2);
            }
            java.util.Set<Map.Entry> entrySet = linkedHashMap.entrySet();
            if (entrySet != null) {
                for (Map.Entry entry : entrySet) {
                    String str12 = (String) entry.getKey();
                    if (str12 != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (K3O k3o3 : (Iterable) entry.getValue()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("prop_search_result_id", k3o3.LIZIZ);
                            if (C78685UuP.LJJJZ(k3o3.LIZJ)) {
                                jSONObject2.put("prop_list_item_id", k3o3.LIZJ);
                            }
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put(str12, jSONArray);
                    }
                }
            }
        }
        String jSONObject3 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject3, "propSearchInfo.toString()");
        OSZ[] oszArr = new OSZ[2];
        if (jSONObject.length() == 0) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        oszArr[0] = new OSZ("has_search", str3);
        oszArr[1] = new OSZ("creation_id", str);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (jSONObject.length() != 0) {
            LJJLIIIIJ.put("prop_search_info", jSONObject3);
        }
        C50653JuL.LJLILLLLZI.getClass();
        Object obj2 = C50654JuM.LIZIZ().get("is_inner");
        if (obj2 == null) {
            obj2 = "";
        }
        LJJLIIIIJ.put("is_inner", obj2);
        Object obj3 = C50654JuM.LIZIZ().get("inner_search_id");
        if (obj3 != 0) {
            str4 = obj3;
        }
        LJJLIIIIJ.put("inner_search_id", str4);
        return LJJLIIIIJ;
    }

    @Override // X.InterfaceC44306HaA
    public final void LIZLLL(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab_name", "search");
        c188727au.LJIIIZ("enter_from", "video_shoot_page");
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("shoot_tab_name", str3);
        FMX.LJIIL("click_prop_search_frame", c188727au.LIZ);
    }
}
