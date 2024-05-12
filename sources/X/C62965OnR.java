package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;

/* renamed from: X.OnR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62965OnR extends AbstractC65781Prl implements InterfaceC65784Pro<PNSAgeGateApi> {
    public static final C62965OnR LJLIL = new C62965OnR();

    public C62965OnR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi] */
    @Override // X.InterfaceC65784Pro
    public final PNSAgeGateApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PNSAgeGateApi.class);
    }
}
