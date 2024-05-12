package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;

/* renamed from: X.JkN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50035JkN extends AbstractC65781Prl implements InterfaceC65784Pro<SearchApi.RealApi> {
    public static final C50035JkN LJLIL = new C50035JkN();

    public C50035JkN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi$RealApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SearchApi.RealApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = SearchApi.LIZ;
        return C770830u.LIZJ(str, "SEARCH_HOST", LIZLLL, str).LIZ.LIZ(SearchApi.RealApi.class);
    }
}
