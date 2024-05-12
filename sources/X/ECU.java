package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.RecommendApi;

/* loaded from: classes7.dex */
public final class ECU extends AbstractC65781Prl implements InterfaceC65784Pro<RecommendApi> {
    public static final ECU LJLIL = new ECU();

    public ECU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.RecommendApi] */
    @Override // X.InterfaceC65784Pro
    public final RecommendApi invoke() {
        return C40084FoG.LIZIZ("https://oec-api.tiktokv.com/").LIZ.LIZ(RecommendApi.class);
    }
}
