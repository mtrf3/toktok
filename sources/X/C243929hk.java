package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.auth.MusicAuthorizationApi;

/* renamed from: X.9hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243929hk extends AbstractC65781Prl implements InterfaceC65784Pro<MusicAuthorizationApi.MusicAuthorizationOperatorApi> {
    public static final C243929hk LJLIL = new C243929hk();

    public C243929hk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.auth.MusicAuthorizationApi$MusicAuthorizationOperatorApi] */
    @Override // X.InterfaceC65784Pro
    public final MusicAuthorizationApi.MusicAuthorizationOperatorApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, MusicAuthorizationApi.MusicAuthorizationOperatorApi.class);
    }
}
