package X;

import com.ss.android.ugc.aweme.feed.interest.InterestApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.LAk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53822LAk extends AbstractC65781Prl implements InterfaceC65784Pro<InterestApi> {
    public static final C53822LAk LJLIL = new C53822LAk();

    public C53822LAk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.feed.interest.InterestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final InterestApi invoke() {
        InterestApi.LIZ.getClass();
        ?? create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(InterestApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…(InterestApi::class.java)");
        return create;
    }
}
