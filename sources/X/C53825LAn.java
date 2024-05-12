package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.HistoryWordsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.LAn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53825LAn extends AbstractC65781Prl implements InterfaceC65784Pro<HistoryWordsApi.InterfaceC0029HistoryWordsApi> {
    public static final C53825LAn LJLIL = new C53825LAn();

    public C53825LAn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.HistoryWordsApi$HistoryWordsApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final HistoryWordsApi.InterfaceC0029HistoryWordsApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(HistoryWordsApi.InterfaceC0029HistoryWordsApi.class);
    }
}
