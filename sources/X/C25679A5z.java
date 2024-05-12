package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.api.PaidSeriesLiveApi;

/* renamed from: X.A5z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25679A5z extends AbstractC65781Prl implements InterfaceC65784Pro<PaidSeriesLiveApi> {
    public static final C25679A5z LJLIL = new C25679A5z();

    public C25679A5z() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.api.PaidSeriesLiveApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PaidSeriesLiveApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PaidSeriesLiveApi.class);
    }
}
