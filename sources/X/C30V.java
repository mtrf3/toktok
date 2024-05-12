package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;

/* renamed from: X.30V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30V extends AbstractC65781Prl implements InterfaceC65784Pro<TikTokImApi> {
    public static final C30V LJLIL = new C30V();

    public C30V() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi] */
    @Override // X.InterfaceC65784Pro
    public final TikTokImApi invoke() {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(C30Y.LIZIZ);
        LIZ.LJIIIZ = 1;
        return LIZ.LJFF().LIZ.LIZ(TikTokImApi.class);
    }
}
