package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi;

/* renamed from: X.9V5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9V5 extends AbstractC65781Prl implements InterfaceC65784Pro<HasCommentDesApi.Api> {
    public static final C9V5 LJLIL = new C9V5();

    public C9V5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final HasCommentDesApi.Api invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(HasCommentDesApi.Api.class);
    }
}
