package X;

import com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes11.dex */
public final class OVW extends AbstractC65781Prl implements InterfaceC65784Pro<CommerceSettingsApi.IApi> {
    public static final OVW LJLIL = new OVW();

    public OVW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$IApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CommerceSettingsApi.IApi invoke() {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(CommerceSettingsApi.IApi.class);
    }
}
