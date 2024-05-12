package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.common.repo.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;

/* loaded from: classes9.dex */
public final class JT2 extends AbstractC65781Prl implements InterfaceC65784Pro<SearchContinuousLoadingApi> {
    public static final JT2 LJLIL = new JT2();

    public JT2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.search.common.repo.SearchContinuousLoadingApi] */
    @Override // X.InterfaceC65784Pro
    public final SearchContinuousLoadingApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = SearchApiNew.LIZ;
        return C770830u.LIZJ(str, "SearchApiNew.SEARCH_HOST", LIZLLL, str).LIZ.LIZ(SearchContinuousLoadingApi.class);
    }
}
