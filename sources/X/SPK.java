package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyVideoRestrictionApi;

/* loaded from: classes13.dex */
public final class SPK extends AbstractC65781Prl implements InterfaceC65784Pro<PrivacyVideoRestrictionApi.API> {
    public static final SPK LJLIL = new SPK();

    public SPK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyVideoRestrictionApi$API] */
    @Override // X.InterfaceC65784Pro
    public final PrivacyVideoRestrictionApi.API invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PrivacyVideoRestrictionApi.API.class);
    }
}
