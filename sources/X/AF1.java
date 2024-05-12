package X;

import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AF1 {
    public final C73318Sq2 LIZ = new C73318Sq2();
    public final LanguageApi LIZIZ;
    public AF2 LIZJ;

    public AF1() {
        LanguageApi.LIZ.getClass();
        this.LIZIZ = (LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(LanguageApi.class);
    }

    public final void LIZ(ContentLanguage contentLanguage, int i) {
        o.LJIIIZ(contentLanguage, "contentLanguage");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (i == 0) {
                ContentLanguageServiceImpl.LJIIJJI().LIZIZ(contentLanguage.getLanguageCode());
            } else {
                ContentLanguageServiceImpl.LJIIJJI().LIZLLL(contentLanguage);
            }
            AF2 af2 = this.LIZJ;
            o.LJI(af2);
            af2.LLJJ();
            return;
        }
        LanguageApi languageApi = this.LIZIZ;
        o.LJI(languageApi);
        AbstractC73672Svk<BaseResponse> contentLanguage2 = languageApi.setContentLanguage("content_language", contentLanguage.getLanguageCode(), i);
        if (contentLanguage2 != null) {
            contentLanguage2.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(this, 16));
        }
    }
}
