package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.api.FilterKeywordsApi;

/* renamed from: X.9Sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237289Sy extends AbstractC65781Prl implements InterfaceC65784Pro<FilterKeywordsApi.API> {
    public static final C237289Sy LJLIL = new C237289Sy();

    public C237289Sy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.compliance.business.filtervideo.api.FilterKeywordsApi$API, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FilterKeywordsApi.API invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(FilterKeywordsApi.API.class);
    }
}
