package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;

/* renamed from: X.30W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30W extends AbstractC65781Prl implements InterfaceC65784Pro<TikTokImApi> {
    public static final C30W LJLIL = new C30W();

    public C30W() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi] */
    @Override // X.InterfaceC65784Pro
    public final TikTokImApi invoke() {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(C30Y.LIZJ);
        LIZ.LJIIIZ = 3;
        return LIZ.LJFF().LIZ.LIZ(TikTokImApi.class);
    }
}
