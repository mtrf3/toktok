package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.LAo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53826LAo extends AbstractC65781Prl implements InterfaceC65784Pro<SuggestWordsApi.SuggestApi> {
    public static final C53826LAo LJLIL = new C53826LAo();

    public C53826LAo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi$SuggestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SuggestWordsApi.SuggestApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(SuggestWordsApi.SuggestApi.class);
    }
}
