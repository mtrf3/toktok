package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.opt.IBackendParamsFetchApi;

/* loaded from: classes7.dex */
public final class EOG extends AbstractC65781Prl implements InterfaceC65784Pro<IBackendParamsFetchApi> {
    public static final EOG LJLIL = new EOG();

    public EOG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.opt.IBackendParamsFetchApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IBackendParamsFetchApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IBackendParamsFetchApi.class);
    }
}
