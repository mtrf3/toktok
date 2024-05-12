package X;

import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.ECi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36036ECi {
    public final C51367KDz LIZ;

    public final KFN LIZ(SearchResultParam searchResultParam) {
        List<Object> list;
        ECSearchEntranceData ecSearchEntranceData;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        JSONObject LIZ = this.LIZ.LIZ(searchResultParam);
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        String optString = LIZ.optString("keyword");
        int optInt = LIZ.optInt("query_correct_type");
        String optString2 = LIZ.optString("enter_from");
        optString2.toString();
        String optString3 = LIZ.optString("search_source");
        String optString4 = LIZ.optString("last_search_id");
        String optString5 = LIZ.optString("tag_text");
        String optString6 = LIZ.optString("sug_type");
        String optString7 = LIZ.optString("sug_query_state");
        String optString8 = LIZ.optString("attach_products");
        String optString9 = LIZ.optString("traffic_source_list");
        if (optString9 == null) {
            optString9 = "[]";
        }
        JSONArray LJJII = T2R.LJJII(optString9);
        Integer num = null;
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
        } else {
            list = null;
        }
        String str = "";
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                String obj = it.next().toString();
                if (str.length() == 0) {
                    str = obj;
                } else {
                    str = C00F.LIZIZ(str, ',', obj);
                }
            }
        }
        String optString10 = LIZ.optString("sug_creator_id");
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
            num = Integer.valueOf(ecSearchEntranceData.getRootEnterFromType());
        }
        String LIZIZ = KFS.LIZIZ(num);
        String LJIIIIZZ = LJJIJL.LJIIIIZZ("ec_search_session_id");
        String LJIIIIZZ2 = LJJIJL.LJIIIIZZ("search_session_id");
        o.LJIIIIZZ(optString, "optString(\"keyword\")");
        o.LJIIIIZZ(optString3, "optString(\"search_source\")");
        KFN kfn = new KFN(optString, optString3, null, 0, optInt, "", optString4, 0L, 6, optString2, null, optString5, optString6, optString7, optString10, optString8, str, null, null, LJIIIIZZ, null, 0, null, LIZIZ, LJIIIIZZ2, 7734276, null);
        kfn.setSearchContext(LIZ.optString("search_context"));
        return kfn;
    }

    public C36036ECi(KE0 ke0, KEP kep) {
        this.LIZ = new C51367KDz(ke0, kep);
    }
}
