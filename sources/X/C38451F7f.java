package X;

import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.ABApi;

/* renamed from: X.F7f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38451F7f extends AbstractC65781Prl implements InterfaceC65784Pro<ABApi> {
    public static final C38451F7f LJLIL = new C38451F7f();

    public C38451F7f() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.setting.api.ABApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ABApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(ABApi.class);
    }
}
