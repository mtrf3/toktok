package X;

import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.KDz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51367KDz {
    public Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C51367KDz(C68110QoE c68110QoE) {
        this.LIZIZ = c68110QoE;
    }

    public final JSONObject LIZ(SearchResultParam searchResultParam) {
        String str;
        String productList;
        InterfaceC51365KDx LIZ;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keyword", searchResultParam.getKeyword());
            KE0 ke0 = (KE0) this.LIZ;
            String str2 = null;
            if (ke0 != null) {
                str = ke0.LJIILJJIL();
            } else {
                str = null;
            }
            jSONObject.put("enter_from", str);
            jSONObject.put("query_correct_type", 1);
            jSONObject.put("search_source", searchResultParam.getEnterMethod());
            jSONObject.put("last_search_id", SearchServiceImpl.LLLZI().LIZ());
            KEP kep = (KEP) this.LIZIZ;
            if (kep != null && (LIZ = kep.LIZ()) != null) {
                str2 = LIZ.LJIILJJIL();
            }
            jSONObject.put("search_context", str2);
            jSONObject.put("tag_text", searchResultParam.getSugHint());
            jSONObject.put("sug_type", searchResultParam.getSugType());
            C35613DyL attachProductsInfo = searchResultParam.getAttachProductsInfo();
            if (attachProductsInfo != null && (productList = attachProductsInfo.getProductList()) != null) {
                jSONObject.put("attach_products", productList);
            }
            jSONObject.put("sug_creator_id", searchResultParam.getSugUserId());
            jSONObject.put("traffic_source_list", C51240K9c.LIZ(searchResultParam.getSearchEnterParam()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public /* synthetic */ C51367KDz(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
