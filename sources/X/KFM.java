package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ab.EcSearchShopResultPreloadConfigModel;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KFM {
    public static boolean LJ(SearchResultParam searchResultParam, int i) {
        String str;
        KAK targetTab;
        if (searchResultParam.getSearchEnterParam() != null && KB1.LJII(searchResultParam.getSearchEnterParam().getEcSearchEntranceValue())) {
            C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null && (targetTab = searchEnterParam.getTargetTab()) != null) {
                str = targetTab.getTabName();
            } else {
                str = null;
            }
            if (i < 0 && o.LJ(str, KAK.SHOP.getTabName()) && searchResultParam.getSearchEnterParam().getEcSearchEntranceValue() != EnumC51280KAq.ORDER.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static void LJI(SearchResultParam searchResultParam, boolean z) {
        String str;
        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
        searchResultParam.setIsPreloadShopResult(true);
        Z9N z9n = Z9N.LIZIZ;
        String LIZ = z9n.LIZ();
        if (z) {
            str = C51233K8v.LIZ().LIZIZ();
        } else {
            KG6 LLLLLIL = z9n.LLLLLIL();
            if (LLLLLIL != null) {
                str = LLLLLIL.LIZ();
            } else {
                str = null;
            }
        }
        KFN LIZIZ = LIZIZ(searchResultParam, LIZ, str);
        Bundle bundle = new Bundle();
        bundle.putSerializable("ec_search_request_param", LIZIZ);
        EcSearchShopResultPreload.preloadSearchRequestParamCacheAndTime = new OSZ<>(LIZIZ, Long.valueOf(System.currentTimeMillis()));
        C74782wc.LIZ().LIZ(bundle, EcSearchShopResultPreload.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.KFN LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam r39, java.lang.String r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFM.LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam, java.lang.String, java.lang.String):X.KFN");
    }

    public static KFN LIZLLL(SearchResultParam searchResultParam, String str, String str2) {
        Long l;
        KFN kfn;
        OSZ<KFN, Long> osz = EcSearchShopResultPreload.preloadSearchRequestParamCacheAndTime;
        if (osz != null) {
            l = osz.getSecond();
        } else {
            l = null;
        }
        OSZ<KFN, Long> osz2 = EcSearchShopResultPreload.preloadSearchRequestParamCacheAndTime;
        if (osz2 != null) {
            kfn = osz2.getFirst();
        } else {
            kfn = null;
        }
        EcSearchShopResultPreload.preloadSearchRequestParamCacheAndTime = null;
        long currentTimeMillis = System.currentTimeMillis();
        KFN LIZIZ = LIZIZ(searchResultParam, str, str2);
        if (kfn != null && l != null && l.longValue() + 3000 < currentTimeMillis && kfn.isSame(LIZIZ) && searchResultParam.getIsPreloadShopResult()) {
            return kfn;
        }
        return LIZIZ;
    }

    public static void LIZ(StringBuilder sb, String str, String str2, String str3) {
        if (!o.LJ(str3, str2)) {
            YE1.LIZLLL(sb, str, "_", str2, "_");
            sb.append(str3);
            sb.append("_");
        }
    }

    public static void LJFF(JSONObject jSONObject, KFN kfn, boolean z, Integer num) {
        String LIZIZ;
        Object obj = num;
        if (kfn.getTrafficSourceList() == null) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(kfn.getTrafficSourceList());
            LIZ.append(']');
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            try {
                KFM kfm = EcSearchShopResultPreload.Companion;
                try {
                    String optString = jSONObject.optString("keyword");
                    try {
                        String keyword = kfn.getKeyword();
                        kfm.getClass();
                        LIZ(sb, "keyword", optString, keyword);
                        LIZ(sb, "enter_from", jSONObject.optString("enter_from"), kfn.getEnterFrom());
                        LIZ(sb, "source", jSONObject.optString("source"), kfn.getSource());
                        LIZ(sb, "search_channel", jSONObject.optString("search_channel"), kfn.getSearchChannel());
                        LIZ(sb, "traffic_source_list", jSONObject.optString("traffic_source_list"), LIZIZ);
                        LIZ(sb, "tag_text", jSONObject.optString("tag_text"), kfn.getSugTagText());
                        LIZ(sb, "search_source", jSONObject.optString("search_source"), kfn.getSearchSource());
                        LIZ(sb, "query_correct_type", String.valueOf(jSONObject.optInt("query_correct_type")), String.valueOf(kfn.getCorrectType()));
                        LIZ(sb, "search_context", jSONObject.optString("search_context"), kfn.getSearchContext());
                        LIZ(sb, "sug_type", jSONObject.optString("sug_type"), kfn.getSugType());
                        LIZ(sb, "last_search_id", jSONObject.optString("last_search_id"), kfn.getLastSearchId());
                        try {
                            try {
                                LIZ(sb, "sug_creator_id", jSONObject.optString("sug_creator_id"), kfn.getSugCreatorId());
                                try {
                                    try {
                                        LIZ(sb, "sug_shop_id", jSONObject.optString("sug_shop_id"), kfn.getSugShopId());
                                        try {
                                            try {
                                                LIZ(sb, "attach_products", jSONObject.optString("attach_products"), kfn.getAttachProducts());
                                                try {
                                                    try {
                                                        LIZ(sb, "sug_query_state", jSONObject.optString("sug_query_state"), kfn.getSugQueryState());
                                                        try {
                                                            try {
                                                                LIZ(sb, "cmpl_enc", jSONObject.optString("cmpl_enc"), kfn.getCmplEnc());
                                                                try {
                                                                    try {
                                                                        LIZ(sb, "is_filter_search", String.valueOf(jSONObject.optInt("is_filter_search")), String.valueOf(kfn.isFilterSearch()));
                                                                        JSONObject jSONObject2 = new JSONObject();
                                                                        try {
                                                                            jSONObject2.put("preload_different_param_info", sb.toString());
                                                                            jSONObject2.put("enter_method", kfn.getSearchSource());
                                                                            jSONObject2.put("enter_from", kfn.getEnterFrom());
                                                                            if (obj == null) {
                                                                                obj = "unknown";
                                                                            }
                                                                            jSONObject2.put("root_enter_from_type", obj);
                                                                            C48658J7u.LIZIZ("rd_ec_search_preload", jSONObject2);
                                                                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                                            jSONObject.put("keyword", kfn.getKeyword());
                                                                            jSONObject.put("enter_from", kfn.getEnterFrom());
                                                                            jSONObject.put("source", kfn.getSource());
                                                                            jSONObject.put("search_channel", kfn.getSearchChannel());
                                                                            jSONObject.put("traffic_source_list", LIZIZ);
                                                                            jSONObject.put("tag_text", kfn.getSugTagText());
                                                                            jSONObject.put("search_source", kfn.getSearchSource());
                                                                            jSONObject.put("query_correct_type", kfn.getCorrectType());
                                                                            jSONObject.put("search_context", kfn.getSearchContext());
                                                                            jSONObject.put("last_search_id", kfn.getLastSearchId());
                                                                            jSONObject.put("sug_type", kfn.getSugType());
                                                                            jSONObject.put("sug_creator_id", kfn.getSugCreatorId());
                                                                            jSONObject.put("sug_shop_id", kfn.getSugShopId());
                                                                            jSONObject.put("attach_products", kfn.getAttachProducts());
                                                                            jSONObject.put("sug_query_state", kfn.getSugQueryState());
                                                                            jSONObject.put("cmpl_enc", kfn.getCmplEnc());
                                                                            jSONObject.put("is_filter_search", kfn.isFilterSearch());
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                    }
                } catch (Throwable th15) {
                    th = th15;
                }
            } catch (Throwable th16) {
                th = th16;
            }
        }
        jSONObject.put("keyword", kfn.getKeyword());
        jSONObject.put("enter_from", kfn.getEnterFrom());
        jSONObject.put("source", kfn.getSource());
        jSONObject.put("search_channel", kfn.getSearchChannel());
        jSONObject.put("traffic_source_list", LIZIZ);
        jSONObject.put("tag_text", kfn.getSugTagText());
        jSONObject.put("search_source", kfn.getSearchSource());
        jSONObject.put("query_correct_type", kfn.getCorrectType());
        jSONObject.put("search_context", kfn.getSearchContext());
        jSONObject.put("last_search_id", kfn.getLastSearchId());
        jSONObject.put("sug_type", kfn.getSugType());
        jSONObject.put("sug_creator_id", kfn.getSugCreatorId());
        jSONObject.put("sug_shop_id", kfn.getSugShopId());
        jSONObject.put("attach_products", kfn.getAttachProducts());
        jSONObject.put("sug_query_state", kfn.getSugQueryState());
        jSONObject.put("cmpl_enc", kfn.getCmplEnc());
        jSONObject.put("is_filter_search", kfn.isFilterSearch());
    }

    public static void LIZJ(SearchResultParam searchResultParam, boolean z, boolean z2, int i, int i2) {
        String str;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        try {
            if (!LJ(searchResultParam, i2)) {
                return;
            }
            C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
            if ((searchEnterParam != null && searchEnterParam.getEcSearchEntranceValue() == EnumC51280KAq.FASHION.getValue()) || !C48203Ivv.LJ(EF7.LIZIZ())) {
                return;
            }
            EcSearchShopResultPreloadConfigModel ecSearchShopResultPreloadConfigModel = (EcSearchShopResultPreloadConfigModel) KF1.LIZIZ.getValue();
            if (z2) {
                C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam2 != null) {
                    str = searchEnterParam2.getEnterSearchFrom();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "homepage_mall") && ecSearchShopResultPreloadConfigModel.outsideEnterMethodList.contains(searchResultParam.getEnterMethod())) {
                    C35195Drb.LIZ.getClass();
                    if (!((Boolean) C35195Drb.LIZIZ.getValue()).booleanValue()) {
                        return;
                    }
                    LJI(searchResultParam, z);
                    return;
                }
                return;
            }
            if (ecSearchShopResultPreloadConfigModel.insideEnterMethodList.contains(searchResultParam.getEnterMethod())) {
                C35195Drb.LIZ.getClass();
                if (!((Boolean) C35195Drb.LIZIZ.getValue()).booleanValue()) {
                    return;
                }
                LJI(searchResultParam, z);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }
}
