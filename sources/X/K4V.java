package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class K4V extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final K4V LJLIL = new K4V();

    public K4V() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SearchSugResponse searchSugResponse;
        List<SearchSugEntity> list;
        if (!K4Y.LIZJ || K4Y.LIZIZ()) {
            System.currentTimeMillis();
            String str = "";
            if (!K4Y.LIZIZ()) {
                str = ((Keva) K4Y.LIZLLL.getValue()).getString("cache_response", "");
                o.LJIIIIZZ(str, "cacheRepo.getString(CACHE_RESPONSE_KEY, \"\")");
            }
            if (str.length() > 0) {
                Integer num = null;
                try {
                    searchSugResponse = (SearchSugResponse) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, SearchSugResponse.class);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                    searchSugResponse = null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("get cache from keva:");
                if (searchSugResponse != null && (list = searchSugResponse.sugList) != null) {
                    num = Integer.valueOf(list.size());
                }
                LIZ.append(num);
                X1D.LIZIZ(LIZ);
                K4Y.LIZ(searchSugResponse);
            } else {
                ((SearchSugApi.Api) SearchSugApi.LIZ.getValue()).fetchSugCache().LIZLLL(C51185K6z.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
