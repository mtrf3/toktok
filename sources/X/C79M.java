package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.comment.likelist.api.LikeApi;

/* renamed from: X.79M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79M extends AbstractC65781Prl implements InterfaceC65784Pro<LikeApi.Api> {
    public static final C79M LJLIL = new C79M();

    public C79M() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.comment.likelist.api.LikeApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LikeApi.Api invoke() {
        return RetrofitFactory.LIZLLL().create(LikeApi.LIZ).create(LikeApi.Api.class);
    }
}
