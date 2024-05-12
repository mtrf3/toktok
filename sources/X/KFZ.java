package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;

/* loaded from: classes9.dex */
public final class KFZ extends AbstractC65781Prl implements InterfaceC65784Pro<EcSearchApi.RealApi> {
    public static final KFZ LJLIL = new KFZ();

    public KFZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi$RealApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EcSearchApi.RealApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EcSearchApi.LIZ;
        return C770830u.LIZJ(str, "SEARCH_HOST", LIZLLL, str).LIZ.LIZ(EcSearchApi.RealApi.class);
    }
}
