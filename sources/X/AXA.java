package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;

/* loaded from: classes5.dex */
public final class AXA extends AbstractC65781Prl implements InterfaceC65784Pro<SearchSugApi.Api> {
    public static final AXA LJLIL = new AXA();

    public AXA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SearchSugApi.Api invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_API", LIZLLL, str).LIZ.LIZ(SearchSugApi.Api.class);
    }
}
