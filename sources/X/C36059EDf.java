package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyApi;

/* renamed from: X.EDf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36059EDf extends AbstractC65781Prl implements InterfaceC65784Pro<RomaGoofyApi> {
    public static final C36059EDf LJLIL = new C36059EDf();

    public C36059EDf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaGoofyApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RomaGoofyApi invoke() {
        return RetrofitFactory.LIZLLL().create(EDY.LIZ().getFetch().getCdnHost()).create(RomaGoofyApi.class);
    }
}
