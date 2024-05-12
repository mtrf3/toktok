package X;

import com.ss.android.ugc.aweme.legacy.network.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.LAm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53824LAm extends AbstractC65781Prl implements InterfaceC65784Pro<SuggestWordsApi.SuggestApi> {
    public static final C53824LAm LJLIL = new C53824LAm();

    public C53824LAm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.legacy.network.api.SuggestWordsApi$SuggestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SuggestWordsApi.SuggestApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(SuggestWordsApi.SuggestApi.class);
    }
}
