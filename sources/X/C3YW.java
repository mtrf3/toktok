package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.FamiliarApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.3YW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YW extends AbstractC65781Prl implements InterfaceC65784Pro<FamiliarApi> {
    public static final C3YW LJLIL = new C3YW();

    public C3YW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.FamiliarApi] */
    @Override // X.InterfaceC65784Pro
    public final FamiliarApi invoke() {
        IRetrofit createNewRetrofit;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null && (createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C30Y.LIZ)) != null) {
            return createNewRetrofit.create(FamiliarApi.class);
        }
        return null;
    }
}
