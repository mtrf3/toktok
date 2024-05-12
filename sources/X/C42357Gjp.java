package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyAPI;

/* renamed from: X.Gjp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42357Gjp extends AbstractC65781Prl implements InterfaceC65784Pro<SearchAidSurveyAPI.API> {
    public static final C42357Gjp LJLIL = new C42357Gjp();

    public C42357Gjp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyAPI$API] */
    @Override // X.InterfaceC65784Pro
    public final SearchAidSurveyAPI.API invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(SearchAidSurveyAPI.API.class);
    }
}
