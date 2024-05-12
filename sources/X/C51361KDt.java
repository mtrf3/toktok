package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import org.json.JSONObject;

/* renamed from: X.KDt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51361KDt extends C0CJ {
    public final /* synthetic */ EcSearchResultContainerAssem LJLIL;
    public final /* synthetic */ SearchResultParam LJLILLLLZI;

    @Override // X.C0CJ
    public final void LIZ(int i) {
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        String str;
        KAK LIZ;
        if (i != this.LJLIL.LJLLILLLL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", System.currentTimeMillis() - this.LJLIL.LJLJLLL);
                jSONObject.put("enter_method", "switch_tab");
                jSONObject.put("next_tab", C51214K8c.LJ(i));
                jSONObject.put("search_entrance", this.LJLILLLLZI.getSearchEnterParam().getEnterSearchFrom());
                jSONObject.put("search_id", SearchServiceImpl.LLLZI().LIZ());
                jSONObject.put("search_keyword", this.LJLILLLLZI.getKeyword());
                C51360KDs c51360KDs = this.LJLIL.H3().LJLILLLLZI;
                if (c51360KDs != null && (LIZ = c51360KDs.LIZ(this.LJLIL.LJLLILLLL)) != null) {
                    str = LIZ.getTabName();
                } else {
                    str = null;
                }
                jSONObject.put("current_tab", str);
                C48658J7u.LIZIZ("rd_ec_search_switch_tab_finish", jSONObject);
            } catch (Exception unused) {
            }
        }
        this.LJLIL.LJLJLLL = System.currentTimeMillis();
        this.LJLIL.LJLLILLLL = i;
    }

    public C51361KDt(EcSearchResultContainerAssem ecSearchResultContainerAssem, SearchResultParam searchResultParam) {
        this.LJLIL = ecSearchResultContainerAssem;
        this.LJLILLLLZI = searchResultParam;
    }
}
