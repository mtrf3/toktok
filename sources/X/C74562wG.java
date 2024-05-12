package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessageAPI;

/* renamed from: X.2wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74562wG extends AbstractC65781Prl implements InterfaceC65784Pro<SellerMessageAPI> {
    public static final C74562wG LJLIL = new C74562wG();

    public C74562wG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessageAPI, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SellerMessageAPI invoke() {
        return RetrofitFactory.LIZLLL().create(C71058Rug.LIZ()).create(SellerMessageAPI.class);
    }
}
