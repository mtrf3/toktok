package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.legacy.api.SearchSuggestWordsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.EMr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36305EMr extends AbstractC65781Prl implements InterfaceC65784Pro<SearchSuggestWordsApi.SuggestApi> {
    public static final C36305EMr LJLIL = new C36305EMr();

    public C36305EMr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.legacy.api.SearchSuggestWordsApi$SuggestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SearchSuggestWordsApi.SuggestApi invoke() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        return createIRetrofitServicebyMonsterPlugin.createNewRetrofit(X1D.LIZIZ(LIZ)).create(SearchSuggestWordsApi.SuggestApi.class);
    }
}
