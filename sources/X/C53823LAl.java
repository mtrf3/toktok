package X;

import com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.LAl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53823LAl extends AbstractC65781Prl implements InterfaceC65784Pro<EcSuggestWordsApi.SuggestApi> {
    public static final C53823LAl LJLIL = new C53823LAl();

    public C53823LAl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi$SuggestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EcSuggestWordsApi.SuggestApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(EcSuggestWordsApi.SuggestApi.class);
    }
}
