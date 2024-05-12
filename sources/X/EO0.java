package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugApi;

/* loaded from: classes7.dex */
public final class EO0 extends AbstractC65781Prl implements InterfaceC65784Pro<EcSearchSugApi.Api> {
    public static final EO0 LJLIL = new EO0();

    public EO0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EcSearchSugApi.Api invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_API", LIZLLL, str).LIZ.LIZ(EcSearchSugApi.Api.class);
    }
}
