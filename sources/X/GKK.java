package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi;

/* loaded from: classes8.dex */
public final class GKK extends AbstractC65781Prl implements InterfaceC65784Pro<CyberbullyingApi> {
    public static final GKK LJLIL = new GKK();

    public GKK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi] */
    @Override // X.InterfaceC65784Pro
    public final CyberbullyingApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CyberbullyingApi.class);
    }
}
