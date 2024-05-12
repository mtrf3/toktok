package X;

import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes5.dex */
public final class AF4 extends AbstractC65781Prl implements InterfaceC65784Pro<LanguageApi> {
    public static final AF4 LJLIL = new AF4();

    public AF4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi] */
    @Override // X.InterfaceC65784Pro
    public final LanguageApi invoke() {
        LanguageApi.LIZ.getClass();
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(LanguageApi.class);
    }
}
