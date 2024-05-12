package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyApi;

/* loaded from: classes7.dex */
public final class EO1 extends AbstractC65781Prl implements InterfaceC65784Pro<SurveyApi.Api> {
    public static final EO1 LJLIL = new EO1();

    public EO1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SurveyApi.Api invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_API", LIZLLL, str).LIZ.LIZ(SurveyApi.Api.class);
    }
}
