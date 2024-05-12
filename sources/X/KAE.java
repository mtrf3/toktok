package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KAE implements InterfaceC51113K4f {
    public final /* synthetic */ C51254K9q LIZ;

    @Override // X.InterfaceC51113K4f
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC51113K4f
    public final HashMap<String, Long> LIZIZ() {
        return new HashMap<>();
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LIZJ() {
        return !this.LIZ.LIZ.B3();
    }

    @Override // X.InterfaceC51113K4f
    public final boolean LJ() {
        return !this.LIZ.LIZ.B3();
    }

    public KAE(C51254K9q c51254K9q) {
        this.LIZ = c51254K9q;
    }

    @Override // X.InterfaceC51113K4f
    public final void LIZ(SearchResultParam searchResultParam) {
        String str;
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "startOpenSearchAdapter");
        LIZJ.put("enter_method", searchResultParam.getEnterMethod());
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            str = searchEnterParam.getEnterSearchFrom();
        } else {
            str = null;
        }
        LIZJ.put("enter_from", str);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
        this.LIZ.LIZ.LJJIL(searchResultParam);
    }
}
