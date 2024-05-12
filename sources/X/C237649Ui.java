package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;

/* renamed from: X.9Ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237649Ui extends AbstractC65781Prl implements InterfaceC65784Pro<FeedPromptApi> {
    public static final C237649Ui LJLIL = new C237649Ui();

    public C237649Ui() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FeedPromptApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(FeedPromptApi.class);
    }
}
