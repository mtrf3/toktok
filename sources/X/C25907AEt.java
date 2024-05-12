package X;

import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingApi;
import kotlin.jvm.internal.o;

/* renamed from: X.AEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25907AEt {
    public final InterfaceC25906AEs LIZ;
    public final PreferredLanguageSettingApi LIZIZ;

    public C25907AEt(C25900AEm c25900AEm) {
        this.LIZ = c25900AEm;
        PreferredLanguageSettingApi preferredLanguageSettingApi = (PreferredLanguageSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(PreferredLanguageSettingApi.class);
        o.LJIIIIZZ(preferredLanguageSettingApi, "create()");
        this.LIZIZ = preferredLanguageSettingApi;
    }
}
